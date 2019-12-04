package com.example.secondproject.Fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.secondproject.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class StringReverseFragment extends Fragment implements View.OnClickListener {
    private Button btnreverse;
    private EditText etstring;

    public StringReverseFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_string_reverse, container, false);
        btnreverse=view.findViewById(R.id.btnreverse);
        etstring=view.findViewById(R.id.string);
        btnreverse.setOnClickListener(this);

    return view;
    }

    @Override
    public void onClick(View v) {
        String string=etstring.getText().toString();
        String result="";
        for(int i=string.length()-1; i>=0; i--) {
            result = result + string.charAt(i);
        }
        Toast.makeText(getActivity(),"Reversed string is:"+result,Toast.LENGTH_SHORT).show();
        StringBuffer buffer = new StringBuffer(string);
        System.out.println(buffer.reverse());
    }
}
