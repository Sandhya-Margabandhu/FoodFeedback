package com.example.foodfeedback;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle; import android.view.View; import android.widget.RatingBar;

import com.google.android.material.snackbar.Snackbar;

public class Main3Activity extends AppCompatActivity
{
    RatingBar r;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        r = (RatingBar) findViewById(R.id.ratings);
    }

    public void submitClicked(View view)
    {
        Snackbar snackbar = Snackbar.make(view, "Thanks! You have given "+r.getRating()+" Stars To Us", Snackbar.LENGTH_LONG);         snackbar.show();
    }
}
