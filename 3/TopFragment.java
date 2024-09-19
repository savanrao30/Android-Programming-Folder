package com.jfdimarzio.hw3by2784780;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.fragment.app.Fragment;

public class TopFragment  extends Fragment {

    private EditText mTextView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.top_fragment, container, false);
        mTextView = v.findViewById(R.id.textview);
        return v;
    }

    // This is a public method that the Activity can use to communicate
    // directly with this Fragment
    public void youveGotMail(String message) {
        mTextView.setText(message);
    }
}
