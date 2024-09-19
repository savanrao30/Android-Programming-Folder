package com.jfdimarzio.hw3by2784780

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import android.os.Bundle

class MainActivity : AppCompatActivity(), BottomFragment.OnGreenFragmentListener {

    companion object {
        private const val BLUE_TAG = "blue"
        private const val GREEN_TAG = "green"
    }

    private var mBlueFragment: TopFragment? = null
    private var mGreenFragment: BottomFragment? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Add fragments
        val fragmentManager = supportFragmentManager

        mBlueFragment = fragmentManager.findFragmentByTag(BLUE_TAG) as? TopFragment
        if (mBlueFragment == null) {
            mBlueFragment = TopFragment()
            fragmentManager.beginTransaction()
                .add(R.id.blue_fragment_container, mBlueFragment!!, BLUE_TAG)
                .commit()
        }

        mGreenFragment = fragmentManager.findFragmentByTag(GREEN_TAG) as? BottomFragment
        if (mGreenFragment == null) {
            mGreenFragment = BottomFragment()
            fragmentManager.beginTransaction()
                .add(R.id.green_fragment_container, mGreenFragment!!, GREEN_TAG)
                .commit()
        }
    }

    // The Activity handles receiving a message from one Fragment
    // and passing it on to the other Fragment
    override fun messageFromGreenFragment(message: String) {
        mBlueFragment?.youveGotMail(message)
    }
}
