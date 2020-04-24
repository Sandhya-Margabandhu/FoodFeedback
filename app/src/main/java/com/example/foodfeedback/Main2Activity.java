package com.example.foodfeedback;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    EditText item;
    CheckBox checkBox_1,checkBox_2,checkBox_3,checkBox_4;
    RadioButton option_1,option_2,option_3,option_4;
    Button order;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        checkBox_1 = (CheckBox) findViewById(R.id.checkbox1);
        checkBox_2 = (CheckBox) findViewById(R.id.checkbox2);
        checkBox_3 = (CheckBox) findViewById(R.id.checkbox3);
        checkBox_4 = (CheckBox) findViewById(R.id.checkbox4);
        option_1 = (RadioButton) findViewById(R.id.option1);
        option_2 = (RadioButton) findViewById(R.id.option2);
        option_3 = (RadioButton) findViewById(R.id.option3);
        option_4 = (RadioButton) findViewById(R.id.option4);
        order = (Button) findViewById(R.id.order);
    }
    public void ClickEvent(View view)
    {

        Intent i = new Intent(this, Main3Activity.class);
        startActivity(i);
        Toast toast=Toast.makeText(getApplicationContext(),"All Selections Done Successfully",Toast.LENGTH_SHORT);
        toast.show();
        finish();
    }
}
