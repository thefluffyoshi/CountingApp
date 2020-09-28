package com.example.countingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int num1 = 0;
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
        num1++;
        TextView introTV = (TextView) findViewById(R.id.introTV); // name of the TV to be updated
        introTV.setText("You now have " + num1 + " fishes");
        //Toast.makeText(this, "You clicked the first button", Toast.LENGTH_LONG).show();
    }

    public void onClickSecondButton(View view)
    {
        num1--;
        //Toast.makeText(this, "You clicked the second button", Toast.LENGTH_LONG).show();
    }

    public void onClickGoToScrnTwo (View view)
    {
        startActivity(new Intent(MainActivity.this, Screen2.class));
    }

//    public void openDialogue(View view)
//    {
//        AlertDialog.Builder builder = AlertDialog.Builder(this);
//        builder.setMessage("Confirm reset count");
//        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialogInterface, int i) {
//                Toast.makeText(MainActivity.this, "Yessir!", Toast.LENGTH_LONG).show();
//            }
//        })
//    }
}