package com.example.test;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Spinner;
import java.util.*;
import android.widget.ArrayAdapter;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    List<String> appliance_names = new ArrayList<String>();
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

        String result = content.getText().toString();
        appliance_names.add(result);

        final Spinner spin = (Spinner) findViewById(R.id.spinner2);
        spin.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) this);

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, appliance_names);

        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(dataAdapter);


        //Spinner spin = (Spinner) findViewById(R.id.spinner2);


        //TextView text = (TextView)findViewById(R.id.textView2);
        //text.setText(result);
    }

}
