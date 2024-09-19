package com.jfdimarzio.hw3by2784780

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment

class BottomFragment : Fragment(), View.OnClickListener {

    private var mCallback: OnGreenFragmentListener? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v = inflater.inflate(R.layout.bottom_fragment, container, false)

        val buttons = listOf(
            R.id.button_1, R.id.button_2, R.id.button_3, R.id.button_4,
            R.id.button_5, R.id.button_6, R.id.button_7, R.id.button_8,
            R.id.button_9, R.id.button_0, R.id.button_A, R.id.button_B,
            R.id.button_C, R.id.button_D, R.id.button_E, R.id.button_F,
            R.id.button_G, R.id.button_H, R.id.button_I, R.id.button_J,
            R.id.button_K, R.id.button_L, R.id.button_M, R.id.button_N,
            R.id.button_O, R.id.button_P, R.id.button_symbol1, R.id.button_symbol2,
            R.id.button_symbol3, R.id.button_symbol4, R.id.button_symbol5,
            R.id.button_symbol6, R.id.button_symbol7, R.id.button_symbol8
        )

        for (buttonId in buttons) {
            val button = v.findViewById<Button>(buttonId)
            button.setOnClickListener(this)
        }

        return v
    }

    override fun onClick(view: View) {
        val textView = view as? TextView
        val statusArea = activity?.findViewById<EditText>(R.id.textview)
        textView?.text?.let { statusArea?.append(it) }
    }

    interface OnGreenFragmentListener {
        fun messageFromGreenFragment(text: String)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is OnGreenFragmentListener) {
            mCallback = context
        } else {
            throw RuntimeException("$context must implement OnGreenFragmentListener")
        }
    }

    override fun onDetach() {
        super.onDetach()
        mCallback = null
    }
}
