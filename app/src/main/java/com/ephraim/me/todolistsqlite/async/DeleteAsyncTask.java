package com.ephraim.me.todolistsqlite.async;

import android.os.AsyncTask;

import com.ephraim.me.todolistsqlite.models.Note;
import com.ephraim.me.todolistsqlite.persistence.NoteDao;

public class DeleteAsyncTask extends AsyncTask<Note, Void, Void> {

    private NoteDao mNoteDao;

    public DeleteAsyncTask(NoteDao dao) {
        mNoteDao = dao;
    }

    @Override
    protected Void doInBackground(Note... notes) {
        mNoteDao.delete(notes);
        return null;
    }

}