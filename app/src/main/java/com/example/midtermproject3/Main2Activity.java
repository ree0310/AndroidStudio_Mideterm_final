package com.example.midtermproject3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    private static RadioGroup rg_class;
    private static RadioButton radio_class;
    private static Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        onClickListenerButton();

        Log.i("Debug", "Hello this is second Activity");

        // 메뉴 드랍다운(spinner사용) 추가 코드
        Spinner s = (Spinner)findViewById(R.id.spinner);

        s.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id){
                Toast.makeText(Main2Activity.this, parent.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
            }
            public void onNothingSelected(AdapterView<?> parent){

            }
        });


    }

    // 라디오 버튼 레이아웃 코드
    public void onClickListenerButton(){
        rg_class = (RadioGroup)findViewById(R.id.rg_class);
        submit = (Button)findViewById(R.id.submit);

        submit.setOnClickListener(
                new View.OnClickListener(){

                    public void onClick(View v){
                        int selected_id = rg_class.getCheckedRadioButtonId();
                        radio_class = (RadioButton)findViewById(selected_id);
                        Toast.makeText(Main2Activity.this, radio_class.getText().toString(), Toast.LENGTH_SHORT).show();
                    }
                }
        );

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