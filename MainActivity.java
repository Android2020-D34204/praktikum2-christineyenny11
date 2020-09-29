package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    EditText num1, num2;
    String[] add = {"+", "-", "/", "*"};
    Button hitung;
    double hasill;
    String add1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText)findViewById(R.id.num1);
        num2 = (EditText)findViewById(R.id.num2);


    }
    public void Hitung(View view){
        if (num1.getText().toString().length()==0 || num2.getText().toString().length()==0) {
            Toast.makeText(this, "OPERASI ARITMATIKA TIDAK SESUAI KETENTUAN", Toast.LENGTH_SHORT).show();
        }
        else {
            switch (add1){
                case " + ";
                hasill = Double.valueOf(num1.getText().toString()) + Double.valueOf(num2.getText().toString());
                break;
                case " - ";
                    hasill = Double.valueOf(num1.getText().toString()) - Double.valueOf(num2.getText().toString());
                    break;
                case " / ";
                    hasill = Double.valueOf(num1.getText().toString()) / Double.valueOf(num2.getText().toString());
                    break;
                case " * ";
                    hasill = Double.valueOf(num1.getText().toString()) * Double.valueOf(num2.getText().toString());
                    break;
            }

}
    }
}