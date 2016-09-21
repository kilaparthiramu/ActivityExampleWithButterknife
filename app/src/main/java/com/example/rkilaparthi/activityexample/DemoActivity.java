package com.example.rkilaparthi.activityexample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by rkilaparthi on 9/21/2016.
 */
public class DemoActivity extends Activity {
   @Bind(R.id.txt_final_result)TextView fresult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.demo);
        ButterKnife.bind(this);
        Intent i=getIntent();
        String s4=i.getStringExtra("final_result");
        fresult.setText(""+s4);
    }
}
