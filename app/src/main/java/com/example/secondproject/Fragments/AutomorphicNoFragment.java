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

import java.util.Scanner;

/**
 * A simple {@link Fragment} subclass.
 */
public class AutomorphicNoFragment extends Fragment implements View.OnClickListener {

    private Button btnautomorphic;
    private EditText etnumber;
    public AutomorphicNoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_automorphic_no, container, false);
btnautomorphic=view.findViewById(R.id.btnautomorphic);
etnumber=view.findViewById(R.id.automorphic);
btnautomorphic.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {

        int num = Integer.parseInt(etnumber.getText().toString());

        int c=0, sqr = num*num;
        int temp =num;  //copying num

        //countint digits of num
        while(temp>0){
            c++;
            temp=temp/10;
        }

        int lastSquareDigits = (int) (sqr%(Math.pow(10,c)));

        if(num == lastSquareDigits) {
            Toast.makeText(getActivity(), "It is Automorphic Number", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(getActivity(),"It is not Automorphic Number",Toast.LENGTH_SHORT).show();
    }
    }
}

