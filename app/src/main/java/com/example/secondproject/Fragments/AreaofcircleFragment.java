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
public class AreaofcircleFragment extends Fragment implements  View.OnClickListener{
    private Button btnarea;
    private EditText etradius;


    public AreaofcircleFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_areaofcircle, container, false);
    btnarea=view.findViewById(R.id.btnarea);
    etradius=view.findViewById(R.id.radius);
    btnarea.setOnClickListener(this);
        return view;

    }

    @Override
    public void onClick(View v) {
        int radius=Integer.parseInt(etradius.getText().toString());
        int area=(22*radius*radius)/7;
        Toast.makeText(getActivity(),"Area of circle is:"+area,Toast.LENGTH_SHORT).show();

    }
}
