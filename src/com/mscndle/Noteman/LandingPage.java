package com.mscndle.Noteman;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;

public class LandingPage extends SingleFragmentActivity {

    public Fragment createFragment() {
        return new LandingPageFragment();
    }
}
