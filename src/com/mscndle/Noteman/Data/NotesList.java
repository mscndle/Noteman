package com.mscndle.Noteman.Data;

import android.content.Context;

import java.util.ArrayList;
import java.util.UUID;

//
//  Data structure to store the user's notebook
//  Using a singleton since it will be instantiated only once
//
public class NotesList {

    private static NotesList sNotesList;
    private Context mAppContext;
    private ArrayList<Note> mNotesList;

    //  private constructor for singleton
    private NotesList(Context appContext) {
        mAppContext = appContext;
        mNotesList = new ArrayList<Note>();
    }

    //
    //  Checks if an object already exits, if not, uses the Application Context
    //  to create another one
    //
    public static NotesList get(Context c) {
        if (sNotesList == null) {
            sNotesList = new NotesList(c.getApplicationContext());
        }
        return sNotesList;
    }

    public ArrayList<Note> getNotes() {
        return mNotesList;
    }

    public Note getNote(UUID id) {
        for (Note n : mNotesList) {
            if (n.getmId().equals(id)) {
                return n;
            }
        }
        return null;
    }
}
