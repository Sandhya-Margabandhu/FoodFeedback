package com.example.foodfeedback;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username,password;
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        login = (Button) findViewById(R.id.login);
    }
    public void loginClick(View view)
    {
        String u;
        Intent i = new Intent(this, Main2Activity.class);
        u = username.getText().toString();
        startActivity(i);
        Toast toast=Toast.makeText(getApplicationContext(),"Logged in, Successfully!"+u,Toast.LENGTH_SHORT);
        toast.show();
        finish();
    }

}
