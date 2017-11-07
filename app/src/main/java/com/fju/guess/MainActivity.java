package com.fju.guess;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int n = new Random().nextInt(10)+1;
        TextView txNum = (TextView) findViewById(R.id.ran_num);
        txNum.setText(Integer.toString(n));
    }
    public void guess(View view){
        int n = new Random().nextInt(10)+1;
        TextView txNum = (TextView) findViewById(R.id.ran_num);
        txNum.setText(Integer.toString(n));

        EditText edNumber = (EditText) findViewById(R.id.ed_number);
        int num = Integer.parseInt(edNumber.getText().toString());
            if(num > n) {
                txNum.setText(R.string.big);
            }
             else if (num < n) {
                getString(R.string.small);
            }
            else {
                getString(R.string.equial);
            }


    }
}
