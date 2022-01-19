package com.example.helloworld;

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

        // Create a button that allows the user to change text color
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // change text color
                ((TextView) findViewById(R.id.text)).setTextColor(getResources().getColor(R.color.yellow));
            }
        });

        // change background color
        findViewById(R.id.changeBackgroundButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.mauve_purple));
            }
        });

        // Change the text content
        findViewById(R.id.changeTextButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((TextView) findViewById(R.id.text)).setText("Android is Awesome!");
            }
        });

        // user can tap on background and set everything back to default
        findViewById(R.id.parent).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 1. reset text -> Hello from AnMei!
                ((TextView) findViewById(R.id.text)).setText("Hello from AnMei!");
                // 2. reset text color -> black
                ((TextView) findViewById(R.id.text)).setTextColor(getResources().getColor(R.color.black));
                // 3. reset background color -> (main_green)
                findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.main_green));
            }
        });

        // change default text to custom text
        findViewById(R.id.changeCustomTextButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // change textview to what is in edit text view
                String userEnteredText = ((EditText) findViewById(R.id.editText)).getText().toString();
                // if text field empty fill with default string
                if (userEnteredText.isEmpty()) {
                    ((TextView) findViewById(R.id.text)).setText("Enter your own text!");
                } else {
                    ((TextView) findViewById(R.id.text)).setText(userEnteredText);
                }
            }
        });

    }
}