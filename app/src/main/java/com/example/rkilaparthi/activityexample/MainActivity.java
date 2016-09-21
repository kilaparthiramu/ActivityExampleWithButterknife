package com.example.rkilaparthi.activityexample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @Bind(R.id.txt_display)TextView result;
    @Bind(R.id.edt_fname) EditText fname;
    @Bind(R.id.edt_lname) EditText lname;
    @Bind(R.id.btn_submit_1) Button submit_1;
    @Bind(R.id.btn_submit_2) Button submit_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(MainActivity.this);
        submit_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, SampleActivity.class);
                i.putExtra("fname", fname.getText().toString());
                i.putExtra("lname", lname.getText().toString());
                startActivityForResult(i, 2);
            }
        });
        submit_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,DemoActivity.class);
                i.putExtra("final_result",result.getText().toString());
                startActivity(i);

            }
        });
    }
    protected void onActivityResult(int requestCode,int responseCode,Intent data) {
        super.onActivityResult(requestCode, responseCode, data);
        if (requestCode == 2) {
            String s3 = data.getStringExtra("mname");
            result.setText("" + s3);

        }
    }
}
