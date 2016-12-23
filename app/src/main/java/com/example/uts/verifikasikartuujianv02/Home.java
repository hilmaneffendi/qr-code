package com.example.uts.verifikasikartuujianv02;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by MOGU MOGU on 19/06/2016.
 */
public class Home extends AppCompatActivity implements View.OnClickListener {
    Button btnInput, btnList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        btnInput = (Button)findViewById(R.id.btn_input);
        btnList = (Button)findViewById(R.id.btn_list);

        btnInput.setOnClickListener(this);
        btnList.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        if(v == btnInput){
            startActivity(new Intent(this,ScanActivity.class));
        }

    }
}
