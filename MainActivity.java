package com.dayrit.buttonswap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnCheck, btnSwap;
    EditText entry1, entry2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCheck = (Button) findViewById(R.id.btnCheck);
        btnSwap = (Button) findViewById(R.id.btnSwap);

        entry1 = (EditText) findViewById(R.id.etEntry1);
        entry2 = (EditText) findViewById(R.id.etEntry2);
    }

    @Override
    protected void onStart() {
        super.onStart();

        btnCheck.setOnClickListener(this);
        btnSwap.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.btnCheck) {
            Intent resultsActivityIntent = new Intent(MainActivity.this, ResultsActivity.class);

            resultsActivityIntent.putExtra("isTheSame", entry1.getText().toString().equals(entry2.getText().toString()));

            startActivity(resultsActivityIntent);
        }

        if(view.getId() == R.id.btnSwap) {
            String old = entry1.getText().toString();

            entry1.setText(entry2.getText().toString());
            entry2.setText(old);
        }
    }
}