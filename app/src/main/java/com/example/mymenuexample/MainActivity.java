package com.example.mymenuexample;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



      CheckBox pizza,broast,chickenroll,alloparatha,chickenkarahi,muttonkarahi,colddrink,icecream;
      Button order;
    int total=0;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pizza=(CheckBox) findViewById(R.id.pizza);
        broast =(CheckBox)findViewById(R.id.broast);
        chickenroll =(CheckBox)findViewById(R.id.chickenroll);
        alloparatha =(CheckBox)findViewById(R.id.alloparatha);
        chickenkarahi =(CheckBox)findViewById(R.id.chickenkarahi);
        muttonkarahi =(CheckBox)findViewById(R.id.muttonkarahi);
        colddrink =(CheckBox)findViewById(R.id.colddrink);
        icecream =(CheckBox)findViewById(R.id.icecream);


        order=(Button) findViewById(R.id.button);

         StringBuilder res=new StringBuilder();
        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                total=0;



                if(pizza.isChecked()){
                    res.append(pizza.getText().toString()+"\n");
                    total +=400;
                }
                if(broast.isChecked()){
                    res.append(broast.getText().toString()+"\n");
                    total +=300;
                }
                if(chickenroll.isChecked()){
                    res.append(chickenroll.getText().toString()+"\n");
                    total +=250;
                }
                if(alloparatha.isChecked()){
                    res.append(alloparatha.getText().toString()+"\n");
                    total +=200;
                }
                if(chickenkarahi.isChecked()){
                    res.append(chickenkarahi.getText().toString()+"\n");
                    total +=1600;
                }
                if(muttonkarahi.isChecked()){
                    res.append(muttonkarahi.getText().toString()+"\n");
                    total +=3000;
                }
                if(colddrink.isChecked()){
                    res.append(colddrink.getText().toString()+"\n");
                    total +=300;
                }
                if(icecream.isChecked()){
                    res.append(icecream.getText().toString()+"\n");
                    total +=400;
                }


                Toast.makeText(MainActivity.this, res+"\n Total Value"+total, Toast.LENGTH_SHORT).show();

            }
        });



    }
}