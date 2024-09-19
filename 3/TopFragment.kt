package com.jfdimarzio.hw3by2784780

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.fragment.app.Fragment

class TopFragment : Fragment() {

    private var mTextView: EditText? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v = inflater.inflate(R.layout.top_fragment, container, false)
        mTextView = v.findViewById(R.id.textview)
        return v
    }

    // Public method that the Activity can use to communicate directly with this Fragment
    fun youveGotMail(message: String) {
        mTextView?.setText(message)
    }
}
