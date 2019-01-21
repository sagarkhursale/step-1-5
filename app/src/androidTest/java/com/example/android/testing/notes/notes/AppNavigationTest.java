package com.example.android.testing.notes.notes;

import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.support.v4.widget.DrawerLayout;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.fail;

/**
 * Tests for the {@link DrawerLayout} layout component in {@link NotesActivity} which manages
 * navigation within the app.
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class AppNavigationTest {

    /**
     * {@link ActivityTestRule} is a JUnit {@link Rule @Rule} to launch your activity under test.
     *
     * <p>
     * Rules are interceptors which are executed for each test method and are important building
     * blocks of Junit tests.
     */
    @Rule
    public ActivityTestRule<NotesActivity> mActivityTestRule =
            new ActivityTestRule<>(NotesActivity.class);

    @Test
    public void clickOnStatisticsNavigationItem_ShowsStatisticsScreen() {
        fail("Implement step 9");
//        // Open Drawer to click on navigation.
//        onView(withId(R.id.drawer_layout))
//                .check(matches(isClosed(Gravity.LEFT))) // Left Drawer should be closed.
//                .perform(open()); // Open Drawer
//
//        // Start statistics screen.
//        onView(withId(R.id.nav_view))
//                .perform(navigateTo(R.id.statistics_navigation_menu_item));
//
//        // Check that statistics Activity was opened.
//        String expectedNoStatisticsText = InstrumentationRegistry.getTargetContext()
//                .getString(R.string.no_statistics_available);
//        onView(withId(R.id.no_statistics)).check(matches(withText(expectedNoStatisticsText)));
    }

    @Test
    public void clickOnAndroidHomeIcon_OpensNavigation() {
        fail("Implement step 9");
//        // Check that left drawer is closed at startup
//        onView(withId(R.id.drawer_layout))
//                .check(matches(isClosed(Gravity.LEFT))); // Left Drawer should be closed.
//
//        // Open Drawer
//        String navigateUpDesc = mActivityTestRule.getActivity()
//                .getString(android.support.v7.appcompat.R.string.abc_action_bar_up_description);
//        onView(withContentDescription(navigateUpDesc)).perform(click());
//
//        // Check if drawer is open
//        onView(withId(R.id.drawer_layout))
//                .check(matches(isOpen(Gravity.LEFT))); // Left drawer is open open.
    }

}