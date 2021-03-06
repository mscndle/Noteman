package com.mscndle.Noteman.Fragments;

import android.app.Fragment;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.mscndle.Noteman.Activities.NoteActivity;
import com.mscndle.Noteman.Data.Note;
import com.mscndle.Noteman.Data.NotesList;
import com.mscndle.Noteman.R;

import java.util.ArrayList;

public class LandingPageFragment extends Fragment {

    private static final String TAG = "LandingPageFragment";
    private ArrayList<Note> mNotesList;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //getActivity().setTitle("Minimal digital notes");
        //getActivity().setTitleColor(Color.BLACK);
        getActivity().getActionBar().setBackgroundDrawable(new ColorDrawable(Color.WHITE));
        mNotesList = NotesList.get(getActivity()).getNotes();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View v = inflater.inflate(R.layout.fragment_landing, null);


        Button createNote = (Button) v.findViewById(R.id.new_note_button);
        createNote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newNote = new Intent(getActivity(), NoteActivity.class);
                startActivity(newNote);
            }
        });


        return v;
    }

    @Override
    public void onResume() {
        super.onResume();
    }
}
