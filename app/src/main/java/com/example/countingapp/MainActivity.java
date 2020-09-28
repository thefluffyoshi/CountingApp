package com.example.countingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("info", "-------This message is in the log------");
        Log.e("error", "---that's an error----");
        Log.w("warning", "-----this is a warning-----");
        Log.wtf("What a terrible failure", "-----This is bad-----");

        Toast.makeText(this, "Your toast is ready!", Toast.LENGTH_LONG).show();
    }

    public void onClickFirstButton(View view)
    {
        Toast.makeText(this, "You clicked the first button", Toast.LENGTH_LONG).show();
    }

    public void onClickSecondButton(View view)
    {
        Toast.makeText(this, "You clicked the second button", Toast.LENGTH_LONG).show();
    }

    public void onClickGoToScrnTwo (View view)
    {
        startActivity(new Intent(MainActivity.this, Screen2.class));
    }
}