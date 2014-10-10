package com.mscndle.Noteman.Fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import com.mscndle.Noteman.R;

//
//  Instantiates a new note
//  This class is instantiated whenever an existing note is opened
//  or a new note is created
//
public class NoteFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //This could be a brand new note or a note opened for editing
        //Would it be possible to handle both cases here?

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);



        View v = inflater.inflate(R.layout.note_fragment, null);
        return v;
    }
}
