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
import android.content.Intent;
import android.widget.Toast;
import android.app.Activity;


public class MainActivity extends Activity implements
AdapterView.OnItemSelectedListener {
    List<String> appliance_names = new ArrayList<String>();
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Spinner spin = (Spinner) findViewById(R.id.spinner2);

        Button b1 = (Button)findViewById(R.id.button3);
        final EditText etEnter = (EditText)findViewById(R.id.etEnter);
        spin.setOnItemSelectedListener(this);

        appliance_names.add("Microwave Oven");
        appliance_names.add("Air Conditioner");
        appliance_names.add("Washing machine");
        appliance_names.add("Drying machine");
        appliance_names.add("Fireplace");
        appliance_names.add("Refrigerators");
        appliance_names.add("Vacuum cleaner");
        appliance_names.add("Electric Water heater");
        appliance_names.add("Window Fan");
        appliance_names.add("ceiling fan");
        appliance_names.add("Dishwasher");
        appliance_names.add("Hair dryer");
        appliance_names.add("Icebox");
        appliance_names.add("Humidifier");
        appliance_names.add("Clothes iron");
        appliance_names.add("Oven");
        appliance_names.add("Sewing machine");
        appliance_names.add("Stove");
        appliance_names.add("Vacuum cleaner");
        appliance_names.add("Television");


        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, appliance_names);

        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(dataAdapter);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView txt = (TextView) findViewById(R.id.textView2);
                txt.setText(spin.getSelectedItem().toString() + ": " + etEnter.getText().toString() + " Watts");
            }
        });
        }

        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            // On selecting a spinner item
            String item = parent.getItemAtPosition(position).toString();


            // Showing selected spinner item
            Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();

        }
        public void Appliance_Selected(View view){

        }
        public void onNothingSelected(AdapterView<?> arg0) {
            // TODO Auto-generated method stub

        }
        public void test(View view){
            TextView countView = (TextView) findViewById(R.id.textView);

            String countString = countView.getText().toString();

            Integer count = Integer.parseInt(countString);
            count++;

            countView.setText(Integer.toString(count));
        }

    //public void getIT(View view){
        //EditText content = (EditText)findViewById(R.id.EditText_1);

        //String result = content.getText().toString();
        //appliance_names.add(result);



        //Spinner spin = (Spinner) findViewById(R.id.spinner2);


        //TextView text = (TextView)findViewById(R.id.textView2);
        //text.setText(result);
}

