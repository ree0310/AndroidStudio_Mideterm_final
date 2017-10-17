package com.example.midtermproject3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        Log.i("Debug", "Hello this is fourth Activity");
    }


    // toast 코드
    public void copy (View view) {
        Toast toast = Toast.makeText(getApplicationContext(), "You pressed the click button.", Toast.LENGTH_SHORT);
        toast.show();

        EditText aa = (EditText) findViewById(R.id.editText);
        //aa.getText();

        TextView bb = (TextView) findViewById(R.id.textView4);
        bb.setText(aa.getText());
    }


    public void goTo1(View v){
        Intent i = new Intent(this, TabLayoutActivity.class);
        startActivity(i);
    }


    public void goTo2(View v){
        Intent i = new Intent(this, Main2Activity.class);
        startActivity(i);
    }


    public void goTo3(View v){
        Intent i = new Intent(this, Main3Activity.class);
        startActivity(i);
    }


    public void goTo4(View v){
        Intent i = new Intent(this, Main4Activity.class);
        startActivity(i);
    }


}
