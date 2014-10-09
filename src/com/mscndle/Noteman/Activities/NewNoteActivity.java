package com.mscndle.Noteman.Activities;

import android.app.Fragment;
import com.mscndle.Noteman.Fragments.NoteFragment;

public class NewNoteActivity extends SingleFragmentActivity {

    public Fragment createFragment() {
        return new NoteFragment();
    }
}
