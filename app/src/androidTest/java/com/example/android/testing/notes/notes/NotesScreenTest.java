package com.example.android.testing.notes.notes;

import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.core.internal.deps.guava.base.Preconditions.checkArgument;
import static android.support.test.espresso.matcher.ViewMatchers.isAssignableFrom;
import static android.support.test.espresso.matcher.ViewMatchers.isDescendantOfA;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static org.junit.Assert.fail;


/**
 * Tests for the notes screen, the main screen which contains a grid of all notes.
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class NotesScreenTest {

    /**
     * A custom {@link Matcher} which matches an item in a {@link RecyclerView} by its text.
     *
     * <p>
     * View constraints:
     * <ul>
     * <li>View must be a child of a {@link RecyclerView}
     * <ul>
     *
     * @param itemText the text to match
     * @return Matcher that matches text in the given view
     */
    private Matcher<View> withItemText(final String itemText) {
        checkArgument(!TextUtils.isEmpty(itemText), "itemText cannot be null or empty");
        return new TypeSafeMatcher<View>() {
            @Override
            public boolean matchesSafely(View item) {
                return allOf(
                        isDescendantOfA(isAssignableFrom(RecyclerView.class)),
                        withText(itemText)).matches(item);
            }

            @Override
            public void describeTo(Description description) {
                description.appendText("is isDescendantOfA RV with text " + itemText);
            }
        };
    }

    /**
     * {@link ActivityTestRule} is a JUnit {@link Rule @Rule} to launch your activity under test.
     *
     * <p>
     * Rules are interceptors which are executed for each test method and are important building
     * blocks of Junit tests.
     */
    @Rule
    public ActivityTestRule<NotesActivity> mNotesActivityTestRule =
            new ActivityTestRule<>(NotesActivity.class);

    @Test
    public void clickAddNoteButton_opensAddNoteUi() throws Exception {
        fail("Implement step 7");
//        // Click on the add note button
//        onView(withId(R.id.fab_add_notes)).perform(click());
//
//        // Check if the add note screen is displayed
//        onView(withId(R.id.add_note_title)).check(matches(isDisplayed()));
    }

    @Test
    public void addNoteToNotesList() throws Exception {
        fail("Implement step 7");
//        String newNoteTitle = "Espresso";
//        String newNoteDescription = "UI testing for Android";
//
//        // Click on the add note button
//        onView(withId(R.id.fab_add_notes)).perform(click());
//
//        // Add note title and description
//        // Type new note title
//        onView(withId(R.id.add_note_title)).perform(typeText(newNoteTitle), closeSoftKeyboard());
//        onView(withId(R.id.add_note_description)).perform(typeText(newNoteDescription),
//                closeSoftKeyboard()); // Type new note description and close the keyboard
//
//        // Save the note
//        onView(withId(R.id.fab_add_notes)).perform(click());
//
//        // Scroll notes list to added note, by finding its description
//        onView(withId(R.id.notes_list)).perform(
//                scrollTo(hasDescendant(withText(newNoteDescription))));
//
//        // Verify note is displayed on screen
//        onView(withItemText(newNoteDescription)).check(matches(isDisplayed()));
    }

}