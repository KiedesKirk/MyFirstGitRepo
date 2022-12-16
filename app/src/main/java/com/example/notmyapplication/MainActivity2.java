package com.example.notmyapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Button button;
        
        setContentView(R.layout.activity_main2);
        button = findViewById(R.id.selectButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                functions();
            }
        });
    }
    public void functions(){
        RadioGroup radioGroup = findViewById(R.id.radioG);
        
        RadioButton rb1 =findViewById(R.id.radioButton1);
        RadioButton rb2 =findViewById(R.id.radioButton2);
        RadioButton rb3 =findViewById(R.id.radioButton3);
        RadioButton rb4 =findViewById(R.id.radioButton4);
        RadioButton rb5 =findViewById(R.id.radioButton5);
        int getID = radioGroup.getCheckedRadioButtonId();
        String output = "";

        if(getID == rb1.getId()){
            output="You're okay";
        }if(getID == rb2.getId()){
            output="You're kinda okay";
        }if(getID == rb3.getId()){
            output="I would be worried if I were you";
        }if(getID == rb4.getId()){
            output="You need help with someone";
        }if(getID == rb5.getId()){
            output="You need to consult with your doctor";
        }
        Toast toast = Toast.makeText(this, output, Toast.LENGTH_LONG);
        toast.show();
    }
}