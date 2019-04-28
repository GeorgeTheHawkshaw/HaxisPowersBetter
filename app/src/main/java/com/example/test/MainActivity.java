package com.example.test;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void buttonOne(View view){
        Toast b1 = Toast.makeText(this, "IT WORKED", Toast.LENGTH_SHORT);
        b1.show();
    }
    public void test(View view){
        TextView countView = (TextView) findViewById(R.id.textView);

        String countString = countView.getText().toString();

        Integer count = Integer.parseInt(countString);
        count++;

        countView.setText(Integer.toString(count));
    }
    public void getIT(View view){
        EditText content = (EditText)findViewById(R.id.EditText_1);
        TextView text = (TextView)findViewById(R.id.textView2);
        String result = content.getText().toString();
        text.setText(result);
    }
}
