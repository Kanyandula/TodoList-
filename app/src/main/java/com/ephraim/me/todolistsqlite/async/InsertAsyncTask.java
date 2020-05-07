package com.ephraim.me.todolistsqlite.async;

import android.os.AsyncTask;
import android.util.Log;

import com.ephraim.me.todolistsqlite.models.Note;
import com.ephraim.me.todolistsqlite.persistence.NoteDao;

public class InsertAsyncTask extends AsyncTask<Note, Void, Void> {
    private  static  final String TAG ="Insert Async Task";

    private NoteDao mNoteDao;

    public InsertAsyncTask(NoteDao dao) {
        mNoteDao = dao;
    }

    @Override
    protected Void doInBackground(Note... notes) {

        Log.d(TAG,"doing background: thread:" + Thread.currentThread().getName());
        mNoteDao.insertNotes(notes);
        return null;
    }
}
