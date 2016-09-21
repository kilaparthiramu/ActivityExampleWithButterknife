package com.example.rkilaparthi.activityexample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by rkilaparthi on 9/21/2016.
 */
public class SampleActivity extends Activity {
    @Bind(R.id.txt_result)TextView result;
    @Bind(R.id.edt_mname)EditText mname;
    @Bind(R.id.btn_click_me)Button clickMe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sample);
        ButterKnife.bind(this);
        Intent i=getIntent();
        String s1=i.getStringExtra("fname");
        String s2=i.getStringExtra("lname");
        result.setText(s1+""+s2);
        clickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent();
                i.putExtra("mname",mname.getText().toString());
                setResult(2,i);
                finish();
            }
        });
    }
}
