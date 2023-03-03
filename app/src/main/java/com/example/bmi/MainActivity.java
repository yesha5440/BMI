package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText weight,height;

    Button submit;

    TextView result;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        weight = findViewById(R.id.weight);
        height = findViewById(R.id.height);
        submit = findViewById(R.id.submit);
        result = findViewById(R.id.result);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float w = Float.parseFloat(weight.getText().toString());
                float h = Float.parseFloat(height.getText().toString());

                result.setText("Ans = "+w/((h/100)*(h/100)));
            }
        });
    }
}
