package com.mscndle.Noteman.Activities;

import android.app.Fragment;
import com.mscndle.Noteman.Fragments.LandingPageFragment;

public class LandingPageActivity extends SingleFragmentActivity {

    public Fragment createFragment() {
        return new LandingPageFragment();
    }
}
