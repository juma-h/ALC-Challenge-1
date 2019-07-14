package com.example.trial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            setContentView(R.layout.activity_main3);
        } catch (Exception e) {
            Toast.makeText(this, e.toString(),
                    Toast.LENGTH_LONG).show();
        }
    }

}
