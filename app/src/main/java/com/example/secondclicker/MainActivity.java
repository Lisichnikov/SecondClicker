package com.example.secondclicker;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Integer counter = 0;
    private Integer counterbutton = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (counter < 10) {
            findViewById(R.id.button).setEnabled(false);
        }
    }

    public void onClickBtnAddDex(View view) {
        counter = counter + counterbutton;
        TextView counterView = findViewById(R.id.txt_counter);
        counterView.setText(counter.toString());
        if (counter < 10) {
            findViewById(R.id.button).setEnabled(false);
        } else {
            findViewById(R.id.button).setEnabled(true);
        }
    }

    public void onClickBtn2AddDex(View view) {
        counter = counter - 10;
        counterbutton++;
        TextView counterView = findViewById(R.id.txt_counter);
        counterView.setText(counter.toString());
        if (counter < 10) {
            findViewById(R.id.button).setEnabled(false);
        }
    }
}