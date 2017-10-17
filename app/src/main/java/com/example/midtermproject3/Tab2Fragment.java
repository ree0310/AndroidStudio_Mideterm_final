package com.example.midtermproject3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


public class Tab2Fragment extends Fragment {
    private static final String TAG = "Tab2Fragment";

    private Button btnTEST;


    // Activity로 이동하는 코드
    public void goTo3(View v){
        Intent i = new Intent(getContext(), Main3Activity.class);
        startActivity(i);
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tab2,container,false);
        btnTEST = (Button)view.findViewById(R.id.btnTEST2);

        btnTEST.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Activity로 이동하는 코드
                Intent i = new Intent(getContext(), Main3Activity.class);
                startActivity(i);
                Toast.makeText(getActivity(), "Testing Scene Button", Toast.LENGTH_SHORT).show();
            };

        });

        return view;
    }


}
