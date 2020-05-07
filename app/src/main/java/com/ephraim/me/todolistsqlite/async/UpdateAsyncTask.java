package com.ephraim.me.todolistsqlite.async;

import android.os.AsyncTask;

import com.ephraim.me.todolistsqlite.models.Note;
import com.ephraim.me.todolistsqlite.persistence.NoteDao;

public class UpdateAsyncTask extends AsyncTask<Note, Void, Void> {

    private NoteDao mNoteDao;

    public UpdateAsyncTask(NoteDao dao) {
        mNoteDao = dao;
    }

    @Override
    protected Void doInBackground(Note... notes) {
        mNoteDao.updateNotes(notes);
        return null;
    }


}