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
public class SumFragment extends Fragment implements  View.OnClickListener{
    private Button btnadd;
    private EditText etfirst,etsecond;


    public SumFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_sum, container, false);
        etfirst=view.findViewById(R.id.first);
        etsecond=view.findViewById(R.id.second);
        btnadd=view.findViewById(R.id.btncalculate);
        btnadd.setOnClickListener(this);

return view;
    }

    @Override
    public void onClick(View v) {
        int first=Integer.parseInt(etfirst.getText().toString());
        int second=Integer.parseInt(etsecond.getText().toString());
        int add=first+second;
        Toast.makeText(getActivity(),"Sum is:"+add,Toast.LENGTH_SHORT).show();
    }
}
