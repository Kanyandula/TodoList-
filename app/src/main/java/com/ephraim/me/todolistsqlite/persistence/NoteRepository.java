package com.ephraim.me.todolistsqlite.persistence;

import android.content.Context;

import androidx.lifecycle.LiveData;

import com.ephraim.me.todolistsqlite.async.DeleteAsyncTask;
import com.ephraim.me.todolistsqlite.async.InsertAsyncTask;
import com.ephraim.me.todolistsqlite.async.UpdateAsyncTask;
import com.ephraim.me.todolistsqlite.models.Note;

import java.util.List;

public class NoteRepository {

    private NoteDatabase mNoteDatabase;

    public NoteRepository(Context context) {
        mNoteDatabase = NoteDatabase.getInstance(context);
    }

    public void insertNoteTask(Note note){
        new InsertAsyncTask(mNoteDatabase.getNoteDao()).execute(note);
    }

    public void updateNoteTask(Note note){
      new UpdateAsyncTask(mNoteDatabase.getNoteDao()).execute(note);
    }

    public LiveData<List<Note>> retrieveNotesTask() {
        return mNoteDatabase.getNoteDao().getNotes();
    }

    public void deleteNoteTask(Note note){
        new DeleteAsyncTask(mNoteDatabase.getNoteDao()).execute(note);

    }
}






