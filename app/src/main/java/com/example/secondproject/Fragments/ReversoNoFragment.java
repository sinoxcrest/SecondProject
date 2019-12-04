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
public class ReversoNoFragment extends Fragment implements View.OnClickListener {
    private Button btnreverse;
    private EditText etnumber;


    public ReversoNoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_reverso_no, container, false);
    btnreverse=view.findViewById(R.id.btnreverseno);
    etnumber=view.findViewById(R.id.number);
    btnreverse.setOnClickListener(this);
        return view;
    }

    @Override

    public void onClick(View v) {
int num=Integer.parseInt(etnumber.getText().toString());
int rev=0;
while(num!=0){
    int digit=num%10;
    rev=rev*10+digit;
num/=10;
}
        Toast.makeText(getActivity(),"Reversed number is:"+rev,Toast.LENGTH_SHORT).show();
    }
}
