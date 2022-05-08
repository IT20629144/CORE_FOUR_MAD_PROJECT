package com.example.fastfoodie;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class SelectPaymentMethod extends AppCompatActivity {

    RadioButton radioButton1;
    RadioButton radioButton2;
    Button button1;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_payment_method);

        radioButton1 = (RadioButton)findViewById(R.id.radioButton1);
        radioButton2 = (RadioButton)findViewById(R.id.radioButton2);
        button1 = (Button)findViewById(R.id.addnew);
        button2 = (Button)findViewById(R.id.next);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SelectPaymentMethod.this, CustomerAccountCard.class);
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if (radioButton1.isChecked() || radioButton2.isChecked()){
                   Intent intent = new Intent(SelectPaymentMethod.this, OrderData.class);
                   startActivity(intent);
               }
            }
        });
    }
}