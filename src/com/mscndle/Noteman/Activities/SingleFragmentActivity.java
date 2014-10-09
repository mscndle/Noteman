package com.mscndle.Noteman.Activities;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import com.mscndle.Noteman.R;

/**
 * This class will be extended by all the other activity classes
 */
public abstract class SingleFragmentActivity extends Activity {

    // To be implemented by each class extending this activity
    protected abstract Fragment createFragment();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);
        FragmentManager fm = getFragmentManager();

        // attempt to get fragment from container
        Fragment fragment = fm.findFragmentById(R.id.fragmentContainer);

        // create a new one if it doesn't exist
        if (fragment == null) {
            fragment = createFragment();
            fm.beginTransaction().add(R.id.fragmentContainer, fragment).commit();
        }
    }
}
