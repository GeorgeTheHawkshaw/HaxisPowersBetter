package com.example.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView  textView=(TextView) findViewById(R.id.textView2);
        Bundle bundle=getIntent().getExtras();
        String data=bundle.get("data").toString();
        textView.setText(data);
    }
}
