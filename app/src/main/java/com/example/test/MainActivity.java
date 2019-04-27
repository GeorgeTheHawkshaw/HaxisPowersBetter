package com.example.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void buttonOne(View view){
        b1 button = b1.makeText(this, "IT WORKED", b1.LENGTH_SHORT);
        b1.show();
    }
    public void test(View view){
        TextView countView = (TextView)findViewById(R.id.textView);

        String countString = countView.getText().toString();

        Integer count = Integet.parseInt(countString);
        count++;

        countView.setText(count.toString);
    }
}
