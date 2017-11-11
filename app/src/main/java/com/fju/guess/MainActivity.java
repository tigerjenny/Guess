package com.fju.guess;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int ran_num = new Random().nextInt(10)+1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txNum = (TextView) findViewById(R.id.ran_num);
        txNum.setText(Integer.toString(ran_num));
    }
    public void guess(View view){

        TextView txMes = (TextView) findViewById(R.id.mes);

        EditText edNumber = (EditText) findViewById(R.id.ed_number);
        int num = Integer.parseInt(edNumber.getText().toString());
            if(num > ran_num) {
               Toast.makeText(this,R.string.big,Toast.LENGTH_LONG).show();
                //txMes.setText(R.string.big);
            }
             else if (num < ran_num) {
                //txMes.setText(R.string.small);
                Toast.makeText(this,R.string.small,Toast.LENGTH_LONG).show();
            }
            else {
                //txMes.setText(R.string.equial);
                new AlertDialog.Builder(this)
                        .setTitle(R.string.Message)
                        .setMessage(R.string.equial)
                        .setPositiveButton(R.string.OK,null)
                        .show();
            }


    }
}
