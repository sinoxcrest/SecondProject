package com.example.secondproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.secondproject.Fragments.AreaofcircleFragment;
import com.example.secondproject.Fragments.AutomorphicNoFragment;
import com.example.secondproject.Fragments.PaladineNoFragment;
import com.example.secondproject.Fragments.ReversoNoFragment;
import com.example.secondproject.Fragments.StringReverseFragment;
import com.example.secondproject.Fragments.SumFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btn1,btn2,btn3,btn4,btn5,btn6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
       btn1.setOnClickListener(this);
       btn2.setOnClickListener(this);
       btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        if(btn1.isPressed()) {

            SumFragment sumFragment = new SumFragment();
            fragmentTransaction.replace(R.id.fragmentContainer, sumFragment);
            fragmentTransaction.commit();
        }else if(btn2.isPressed()) {
            AreaofcircleFragment areaofcircleFragment = new AreaofcircleFragment();
            fragmentTransaction.replace(R.id.fragmentContainer, areaofcircleFragment);
            fragmentTransaction.commit();
        }else if(btn3.isPressed()) {
            ReversoNoFragment reversoNoFragment=new ReversoNoFragment();
            fragmentTransaction.replace(R.id.fragmentContainer, reversoNoFragment);
            fragmentTransaction.commit();
        }else if(btn4.isPressed()) {
            PaladineNoFragment paladineNoFragment=new PaladineNoFragment();
            fragmentTransaction.replace(R.id.fragmentContainer, paladineNoFragment);
            fragmentTransaction.commit();
        }else if(btn5.isPressed()) {
            AutomorphicNoFragment automorphicNoFragment=new AutomorphicNoFragment();
            fragmentTransaction.replace(R.id.fragmentContainer, automorphicNoFragment);
            fragmentTransaction.commit();
        }else if(btn6.isPressed()) {
            StringReverseFragment stringReverseFragment=new StringReverseFragment();
            fragmentTransaction.replace(R.id.fragmentContainer, stringReverseFragment);
            fragmentTransaction.commit();
        }
        }
}
