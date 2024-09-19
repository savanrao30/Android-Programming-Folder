package com.jfdimarzio.hw3by2784780;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements BottomFragment.OnGreenFragmentListener {

    private static final String BLUE_TAG = "blue";
    private static final String GREEN_TAG = "green";
    TopFragment mBlueFragment;
    BottomFragment mGreenFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // add fragments
        FragmentManager fragmentManager = getSupportFragmentManager();

        mBlueFragment = (TopFragment) fragmentManager.findFragmentByTag(BLUE_TAG);
        if (mBlueFragment == null) {
            mBlueFragment = new TopFragment();
            fragmentManager.beginTransaction().add(R.id.blue_fragment_container, mBlueFragment, BLUE_TAG).commit();
        }

        mGreenFragment = (BottomFragment) fragmentManager.findFragmentByTag(GREEN_TAG);
        if (mGreenFragment == null) {
            mGreenFragment = new BottomFragment();
            fragmentManager.beginTransaction().add(R.id.green_fragment_container, mGreenFragment, GREEN_TAG).commit();
        }
    }

    // The Activity handles receiving a message from one Fragment
    // and passing it on to the other Fragment
    @Override
    public void messageFromGreenFragment(String message) {
        mBlueFragment.youveGotMail(message);
    }
}
