package com.example.fle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onBtnClick(View view){
        TextView txtFn = findViewById(R.id.textViewId);
        //txtFn.setText("Hello");
        TextView edTxEmail= findViewById(R.id.textView2);
        EditText edTxEmailEd = findViewById(R.id.emailText);
        edTxEmail.setText(edTxEmailEd.getText().toString());
        EditText edtText = findViewById(R.id.editTextTextPersonName);
        txtFn.setText(edtText.getText().toString());


    }
}