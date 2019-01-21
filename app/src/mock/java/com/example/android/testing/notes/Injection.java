package com.example.android.testing.notes;

import com.example.android.testing.notes.data.FakeNotesServiceApiImpl;
import com.example.android.testing.notes.data.NoteRepositories;
import com.example.android.testing.notes.data.NotesRepository;
import com.example.android.testing.notes.util.FakeImageFileImpl;
import com.example.android.testing.notes.util.ImageFile;


/**
 * Enables injection of mock implementations for {@link ImageFile} and
 * {@link NotesRepository} at compile time. This is useful for testing, since it allows us to use
 * a fake instance of the class to isolate the dependencies and run a test hermetically.
 */
public class Injection {

    public static ImageFile provideImageFile() {
        return new FakeImageFileImpl();
    }

    public static NotesRepository provideNotesRepository() {
        return NoteRepositories.getInMemoryRepoInstance(new FakeNotesServiceApiImpl());
    }
}
