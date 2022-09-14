package com.example.keyboardsamples;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button_main).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showText();
            }
        });
    }


    public void showText() {
        // Associate editText with the editText_main EditText element.
        EditText editText = (EditText) findViewById(R.id.editText_main);
        if (editText != null) {
            // Assign showString to the text that was entered.
            String showString = editText.getText().toString();
            // Make the Toast message with showString.
            Toast.makeText(this, showString, Toast.LENGTH_SHORT).show();
        }
    }


}