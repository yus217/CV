package com.example.yuecheng.cv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    public static String a = "Lehigh University, Bethlehem BS in CHE and CS";
    public static String b = "Java, Matlab, Aspen";
    public static String c = "Dance, Music, Running";
    public static String d = "Unit Operation Lab 2015 fall - 2016 Spring";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void tbtnFunction1(View view) {
        ToggleButton tbt = (ToggleButton) findViewById(R.id.toggleButton1);
        TextView txv = (TextView) findViewById(R.id.TextView);
        TextView txv1 = (TextView) findViewById(R.id.textView1);


        if (tbt.getText().equals("education")) {
            txv1.setText(a);
        } else {
            txv1.setText("N/A");
        }
    }

    public void tbtnFunction2(View view) {
        ToggleButton tbt = (ToggleButton) findViewById(R.id.toggleButton2);
        TextView txv = (TextView) findViewById(R.id.TextView);
        TextView txv2 = (TextView) findViewById(R.id.textView2);


        if (tbt.getText().equals("skills")) {
            txv2.setText(b);
        } else {
            txv2.setText("N/A");
        }
    }

    public void tbtnFunction3(View view) {
        ToggleButton tbt = (ToggleButton) findViewById(R.id.toggleButton3);
        TextView txv = (TextView) findViewById(R.id.TextView);
        TextView txv3 = (TextView) findViewById(R.id.textView3);


        if (tbt.getText().equals("hobbies")) {
            txv3.setText(c);
        } else {
            txv3.setText("N/A");
        }
    }

    public void tbtnFunction4(View view) {
        ToggleButton tbt = (ToggleButton) findViewById(R.id.toggleButton4);
        TextView txv = (TextView) findViewById(R.id.TextView);
        TextView txv4 = (TextView) findViewById(R.id.textView4);


        if (tbt.getText().equals("professional")) {
            txv4.setText(d);
        } else {
            txv4.setText("N/A");
        }
    }

    public void btnFunction(View view){

        TextView txv1 = (TextView) findViewById(R.id.textView1);
        TextView txv2 = (TextView) findViewById(R.id.textView2);
        TextView txv3 = (TextView) findViewById(R.id.textView3);
        TextView txv4 = (TextView) findViewById(R.id.textView4);
        EditText edt1 = (EditText)findViewById(R.id.editText1);
        EditText edt2 = (EditText)findViewById(R.id.editText2);

        a += (edt2.getText());
        if ((edt1.getText().toString()).equals("education")){

            txv1.setText(a);

        }
        b += (edt2.getText());
        if ((edt1.getText().toString()).equals("skills")){

            txv2.setText(b);

        }
        c += (edt2.getText());
        if ((edt1.getText().toString()).equals("hobbies")){

            txv3.setText(c);
        }
        d += (edt2.getText());
        if ((edt1.getText().toString()).equals("professional")){

            txv4.setText(d);
        }

    }



}





















