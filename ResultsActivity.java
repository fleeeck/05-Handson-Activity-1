package com.dayrit.buttonswap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class ResultsActivity extends AppCompatActivity {

    Intent resultsActivityIntent;
    TextView resultsText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        resultsActivityIntent = getIntent();
        resultsText = (TextView) findViewById(R.id.resultsText);
    }

    @Override
    protected void onStart() {
        super.onStart();
        if(resultsActivityIntent.getBooleanExtra("isTheSame", false)) {
            resultsText.setText("SAME");
        } else {
            resultsText.setText("NOT THE SAME");
        }
    }
}