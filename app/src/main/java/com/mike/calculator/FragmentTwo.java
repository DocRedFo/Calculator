package com.mike.calculator;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

public class FragmentTwo extends Fragment {

    Button One, Two, Three, Four, Five, Six, Seven, Eight, Nine, Zero, Plus, Dev, Mult, Minus, Equally, ScobOpen, ScobClose;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        One = One.findViewById(R.id.button14);
        Two = Two.findViewById(R.id.button15);
        Three = Three.findViewById(R.id.button16);
        Four = Four.findViewById(R.id.button10);
        Five = Five.findViewById(R.id.button9);
        Six = Six.findViewById(R.id.button8);
        Seven = Seven.findViewById(R.id.button7);
        Eight = Eight.findViewById(R.id.button6);
        Nine = Nine.findViewById(R.id.button5);
        Zero = Zero.findViewById(R.id.button19);
        Plus = Plus.findViewById(R.id.button17);
        Dev = Dev.findViewById(R.id.button13);
        Mult = Mult.findViewById(R.id.button12);
        Minus = Minus.findViewById(R.id.button11);
        Equally = Equally.findViewById(R.id.button18);
        ScobOpen = ScobOpen.findViewById(R.id.button20);
        ScobClose = ScobClose.findViewById(R.id.button21);

        One.setOnClickListener(listener);
        Two.setOnClickListener(listener);
        Three.setOnClickListener(listener);
        Four.setOnClickListener(listener);
        Five.setOnClickListener(listener);
        Six.setOnClickListener(listener);
        Seven.setOnClickListener(listener);
        Eight.setOnClickListener(listener);
        Nine.setOnClickListener(listener);
        Zero.setOnClickListener(listener);
        Plus.setOnClickListener(listener);
        Dev.setOnClickListener(listener);
        Mult.setOnClickListener(listener);
        Minus.setOnClickListener(listener);
        Equally.setOnClickListener(listener);
        ScobClose.setOnClickListener(listener);
        ScobOpen.setOnClickListener(listener);

    }

    View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String edittext = "";
            int id = v.getId();
            edittext = com.mike.calculator.Fragment.calculator.getText().toString();
            switch (id){
                case R.id.button14:
                    com.mike.calculator.Fragment.calculator.setText(edittext + "1");
                    break;
                case R.id.button15:
                    com.mike.calculator.Fragment.calculator.setText(edittext + "2");
                    break;
                case R.id.button16:
                    com.mike.calculator.Fragment.calculator.setText(edittext + "3");
                    break;
                case R.id.button10:
                    com.mike.calculator.Fragment.calculator.setText(edittext + "4");
                    break;
                case R.id.button9:
                    com.mike.calculator.Fragment.calculator.setText(edittext + "5");
                    break;
                case R.id.button8:
                    com.mike.calculator.Fragment.calculator.setText(edittext + "6");
                    break;
                case R.id.button7:
                    com.mike.calculator.Fragment.calculator.setText(edittext + "7");
                    break;
                case R.id.button6:
                    com.mike.calculator.Fragment.calculator.setText(edittext + "8");
                    break;
                case R.id.button5:
                    com.mike.calculator.Fragment.calculator.setText(edittext + "9");
                    break;
                case R.id.button19:
                    com.mike.calculator.Fragment.calculator.setText(edittext + "0");
                    break;
                case R.id.button17:
                    com.mike.calculator.Fragment.calculator.setText(edittext + "+");
                    break;
                case R.id.button13:
                    com.mike.calculator.Fragment.calculator.setText(edittext + "/");
                    break;
                case R.id.button12:
                    com.mike.calculator.Fragment.calculator.setText(edittext + "*");
                    break;
                case R.id.button11:
                    com.mike.calculator.Fragment.calculator.setText(edittext + "-");
                    break;
                case R.id.button18:
                    double result = Double.parseDouble(edittext);
                    com.mike.calculator.Fragment.calculator.setText(Double.toString(result));
                    break;
                case R.id.button20:
                    com.mike.calculator.Fragment.calculator.setText(edittext + "(");
                    break;
                case R.id.button21:
                    com.mike.calculator.Fragment.calculator.setText(edittext + ")");
                    break;
            }
        }
    };

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment2, container, false);
    }
}
