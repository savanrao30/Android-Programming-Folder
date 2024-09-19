package com.jfdimarzio.hw3by2784780;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class BottomFragment extends Fragment implements View.OnClickListener {

    private OnGreenFragmentListener mCallback;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.bottom_fragment, container, false);

        Button button_1 = v.findViewById(R.id.button_1);
        button_1.setOnClickListener(this);

        Button button_2 = v.findViewById(R.id.button_2);
        button_2.setOnClickListener(this);

        Button button_3 = v.findViewById(R.id.button_3);
        button_3.setOnClickListener(this);

        Button button_4 = v.findViewById(R.id.button_4);
        button_4.setOnClickListener(this);

        Button button_5 = v.findViewById(R.id.button_5);
        button_5.setOnClickListener(this);

        Button button_6 = v.findViewById(R.id.button_6);
        button_6.setOnClickListener(this);

        Button button_7 = v.findViewById(R.id.button_7);
        button_7.setOnClickListener(this);

        Button button_8 = v.findViewById(R.id.button_8);
        button_8.setOnClickListener(this);

        Button button_9 = v.findViewById(R.id.button_9);
        button_9.setOnClickListener(this);

        Button button_0 = v.findViewById(R.id.button_0);
        button_0.setOnClickListener(this);


        Button button = v.findViewById(R.id.button_A);
        button.setOnClickListener(this);
        Button buttonB = v.findViewById(R.id.button_B);
        buttonB.setOnClickListener(this);
        Button buttonC = v.findViewById(R.id.button_C);
        buttonC.setOnClickListener(this);
        Button button_D = v.findViewById(R.id.button_D);
        button_D.setOnClickListener(this);
        Button button_E = v.findViewById(R.id.button_E);
        button_E.setOnClickListener(this);
        Button button_F = v.findViewById(R.id.button_F);
        button_F.setOnClickListener(this);
        Button button_G = v.findViewById(R.id.button_G);
        button_G.setOnClickListener(this);
        Button button_H = v.findViewById(R.id.button_H);
        button_H.setOnClickListener(this);
        Button button_I = v.findViewById(R.id.button_I);
        button_I.setOnClickListener(this);
        Button button_J = v.findViewById(R.id.button_J);
        button_J.setOnClickListener(this);
        Button button_K = v.findViewById(R.id.button_K);
        button_K.setOnClickListener(this);
        Button button_L = v.findViewById(R.id.button_L);
        button_L.setOnClickListener(this);
        Button button_M = v.findViewById(R.id.button_M);
        button_M.setOnClickListener(this);
        Button button_N = v.findViewById(R.id.button_N);
        button_J.setOnClickListener(this);
        Button button_O = v.findViewById(R.id.button_O);
        button_O.setOnClickListener(this);
        Button button_P = v.findViewById(R.id.button_P);
        button_P.setOnClickListener(this);

        Button button_symbol1 = v.findViewById(R.id.button_symbol1);
        button_symbol1.setOnClickListener(this);

        Button button_symbol2 = v.findViewById(R.id.button_symbol2);
        button_symbol2.setOnClickListener(this);

        Button button_symbol3 = v.findViewById(R.id.button_symbol3);
        button_symbol3.setOnClickListener(this);

        Button button_symbol4 = v.findViewById(R.id.button_symbol4);
        button_symbol4.setOnClickListener(this);

        Button button_symbol5 = v.findViewById(R.id.button_symbol5);
        button_symbol5.setOnClickListener(this);

        Button button_symbol6 = v.findViewById(R.id.button_symbol6);
        button_symbol6.setOnClickListener(this);

        Button button_symbol7 = v.findViewById(R.id.button_symbol7);
        button_symbol7.setOnClickListener(this);

        Button button_symbol8 = v.findViewById(R.id.button_symbol8);
        button_symbol8.setOnClickListener(this);




        return v;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){


            case R.id.button_1:
                TextView button_1 = (TextView)getActivity().findViewById(R.id.button_1);
                EditText statusarea_1 = (EditText) getActivity().findViewById(R.id.textview);
                statusarea_1.append(button_1.getText());
                break;
            case R.id.button_2:
                TextView button_2 = (TextView)getActivity().findViewById(R.id.button_2);
                EditText statusarea_button_2 = (EditText) getActivity().findViewById(R.id.textview);
                statusarea_button_2.append(button_2.getText());
                // statusarea1.setText(lbl1.getText());
                break;
            case R.id.button_3:
                TextView button_3 = (TextView)getActivity().findViewById(R.id.button_3);
                EditText statusarea2_button_3 = (EditText) getActivity().findViewById(R.id.textview);
                statusarea2_button_3.append(button_3.getText());
                break;
            case R.id.button_4:
                TextView button_4 = (TextView)getActivity().findViewById(R.id.button_4);
                EditText statusarea_button_4 = (EditText) getActivity().findViewById(R.id.textview);
                statusarea_button_4.append(button_4.getText());
                break;
            case R.id.button_5:
                TextView button_5 = (TextView)getActivity().findViewById(R.id.button_5);
                EditText statusarea_button_5 = (EditText) getActivity().findViewById(R.id.textview);
                statusarea_button_5.append(button_5.getText());
                // statusarea1.setText(lbl1.getText());
                break;
            case R.id.button_6:
                TextView button_6 = (TextView)getActivity().findViewById(R.id.button_6);
                EditText statusarea2_button_6 = (EditText) getActivity().findViewById(R.id.textview);
                statusarea2_button_6.append(button_6.getText());
                break;
            case R.id.button_7:
                TextView button_7 = (TextView)getActivity().findViewById(R.id.button_7);
                EditText statusarea2_button_7 = (EditText) getActivity().findViewById(R.id.textview);
                statusarea2_button_7.append(button_7.getText());
                break;
            case R.id.button_8:
                TextView button_8 = (TextView)getActivity().findViewById(R.id.button_8);
                EditText statusarea_button_8 = (EditText) getActivity().findViewById(R.id.textview);
                statusarea_button_8.append(button_8.getText());
                break;
            case R.id.button_9:
                TextView button_9 = (TextView)getActivity().findViewById(R.id.button_9);
                EditText statusarea_button_9 = (EditText) getActivity().findViewById(R.id.textview);
                statusarea_button_9.append(button_9.getText());
                // statusarea1.setText(lbl1.getText());
                break;
            case R.id.button_0:
                TextView button_0 = (TextView)getActivity().findViewById(R.id.button_0);
                EditText statusarea2_button_0= (EditText) getActivity().findViewById(R.id.textview);
                statusarea2_button_0.append(button_0.getText());
                break;

            case R.id.button_A:
                TextView lbl = (TextView)getActivity().findViewById(R.id.button_A);
                EditText statusarea = (EditText) getActivity().findViewById(R.id.textview);
                statusarea.append(lbl.getText());
                break;
            case R.id.button_B:
                TextView lbl1 = (TextView)getActivity().findViewById(R.id.button_B);
                EditText statusarea1 = (EditText) getActivity().findViewById(R.id.textview);
                statusarea1.append(lbl1.getText());
                // statusarea1.setText(lbl1.getText());
                break;
            case R.id.button_C:
                TextView lbl2 = (TextView)getActivity().findViewById(R.id.button_C);
                EditText statusarea2 = (EditText) getActivity().findViewById(R.id.textview);
                statusarea2.append(lbl2.getText());
                break;
            case R.id.button_D:
                TextView button_D = (TextView)getActivity().findViewById(R.id.button_D);
                EditText statusarea_button_D = (EditText) getActivity().findViewById(R.id.textview);
                statusarea_button_D.append(button_D.getText());
                break;
            case R.id.button_E:
                TextView button_E = (TextView)getActivity().findViewById(R.id.button_E);
                EditText statusarea1_button_E = (EditText) getActivity().findViewById(R.id.textview);
                statusarea1_button_E.append(button_E.getText());
                // statusarea1.setText(lbl1.getText());
                break;
            case R.id.button_F:
                TextView button_F = (TextView)getActivity().findViewById(R.id.button_F);
                EditText statusarea2_button_F = (EditText) getActivity().findViewById(R.id.textview);
                statusarea2_button_F.append(button_F.getText());
                break;
            case R.id.button_G:
                TextView button_G = (TextView)getActivity().findViewById(R.id.button_G);
                EditText statusarea_button_G = (EditText) getActivity().findViewById(R.id.textview);
                statusarea_button_G.append(button_G.getText());
                break;
            case R.id.button_H:
                TextView button_H = (TextView)getActivity().findViewById(R.id.button_H);
                EditText statusarea1_button_H = (EditText) getActivity().findViewById(R.id.textview);
                statusarea1_button_H.append(button_H.getText());
                // statusarea1.setText(lbl1.getText());
                break;
            case R.id.button_I:
                TextView button_I = (TextView)getActivity().findViewById(R.id.button_I);
                EditText statusarea2_button_I = (EditText) getActivity().findViewById(R.id.textview);
                statusarea2_button_I.append(button_I.getText());
                break;
            case R.id.button_J:
                TextView button_J = (TextView)getActivity().findViewById(R.id.button_J);
                EditText statusarea_button_J = (EditText) getActivity().findViewById(R.id.textview);
                statusarea_button_J.append(button_J.getText());
                break;
            case R.id.button_K:
                TextView button_K = (TextView)getActivity().findViewById(R.id.button_K);
                EditText statusarea1_button_K = (EditText) getActivity().findViewById(R.id.textview);
                statusarea1_button_K.append(button_K.getText());
                // statusarea1.setText(lbl1.getText());
                break;
            case R.id.button_L:
                TextView button_L = (TextView)getActivity().findViewById(R.id.button_L);
                EditText statusarea2_button_L = (EditText) getActivity().findViewById(R.id.textview);
                statusarea2_button_L.append(button_L.getText());
                break;
            case R.id.button_M:
                TextView button_M = (TextView)getActivity().findViewById(R.id.button_I);
                EditText statusarea2_button_M = (EditText) getActivity().findViewById(R.id.textview);
                statusarea2_button_M.append(button_M.getText());
                break;
            case R.id.button_N:
                TextView button_N = (TextView)getActivity().findViewById(R.id.button_J);
                EditText statusarea_button_N = (EditText) getActivity().findViewById(R.id.textview);
                statusarea_button_N.append(button_N.getText());
                break;
            case R.id.button_O:
                TextView button_O = (TextView)getActivity().findViewById(R.id.button_K);
                EditText statusarea1_button_O = (EditText) getActivity().findViewById(R.id.textview);
                statusarea1_button_O.append(button_O.getText());
                // statusarea1.setText(lbl1.getText());
                break;
            case R.id.button_P:
                TextView button_P = (TextView)getActivity().findViewById(R.id.button_P);
                EditText statusarea2_button_P = (EditText) getActivity().findViewById(R.id.textview);
                statusarea2_button_P.append(button_P.getText());
                break;

            case R.id.button_symbol1:
                TextView button_symbol1 = (TextView)getActivity().findViewById(R.id.button_symbol1);
                EditText statusarea_button_symbol1 = (EditText) getActivity().findViewById(R.id.textview);
                statusarea_button_symbol1.append(button_symbol1.getText());
                break;
            case R.id.button_symbol2:
                TextView button_symbol2 = (TextView)getActivity().findViewById(R.id.button_symbol2);
                EditText statusare_button_symbol2 = (EditText) getActivity().findViewById(R.id.textview);
                statusare_button_symbol2.append(button_symbol2.getText());
                // statusarea1.setText(lbl1.getText());
                break;
            case R.id.button_symbol3:
                TextView button_symbol3 = (TextView)getActivity().findViewById(R.id.button_symbol3);
                EditText statusarea2_button_symbol3 = (EditText) getActivity().findViewById(R.id.textview);
                statusarea2_button_symbol3.append(button_symbol3.getText());
                break;
            case R.id.button_symbol4:
                TextView button_symbol4 = (TextView)getActivity().findViewById(R.id.button_symbol4);
                EditText statusarea_button_symbol4 = (EditText) getActivity().findViewById(R.id.textview);
                statusarea_button_symbol4.append(button_symbol4.getText());
                break;
            case R.id.button_symbol5:
                TextView button_symbol5 = (TextView)getActivity().findViewById(R.id.button_symbol5);
                EditText statusarea_button_symbol5 = (EditText) getActivity().findViewById(R.id.textview);
                statusarea_button_symbol5.append(button_symbol5.getText());
                // statusarea1.setText(lbl1.getText());
                break;
            case R.id.button_symbol6:
                TextView button_symbol6 = (TextView)getActivity().findViewById(R.id.button_symbol6);
                EditText statusarea2_button_symbol6 = (EditText) getActivity().findViewById(R.id.textview);
                statusarea2_button_symbol6.append(button_symbol6.getText());
                break;
            case R.id.button_symbol7:
                TextView button_symbol7 = (TextView)getActivity().findViewById(R.id.button_symbol7);
                EditText statusarea2_button_symbol7 = (EditText) getActivity().findViewById(R.id.textview);
                statusarea2_button_symbol7.append(button_symbol7.getText());
                break;
            case R.id.button_symbol8:
                TextView button_symbol8 = (TextView)getActivity().findViewById(R.id.button_symbol8);
                EditText statusarea_button_symbol8 = (EditText) getActivity().findViewById(R.id.textview);
                statusarea_button_symbol8.append(button_symbol8.getText());
                break;
        }
    }

    // This is the interface that the Activity will implement
    // so that this Fragment can communicate with the Activity.
    public interface OnGreenFragmentListener {
        void messageFromGreenFragment(String text);
    }

    // This method insures that the Activity has actually implemented our
    // listener and that it isn't null.
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnGreenFragmentListener) {
            mCallback = (OnGreenFragmentListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnGreenFragmentListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mCallback = null;
    }
}
