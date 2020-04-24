package com.bryanpoh.demoradiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Get the RadioGroup Object
                RadioGroup rg = findViewById(R.id.radioGroup1);

                // Get ID of selected radio
                int selectedButtonId = rg.getCheckedRadioButtonId();

                // Get radio button object from id
                RadioButton rb = findViewById(selectedButtonId);

                // Show toast with text value from selected radio
                Toast.makeText(MainActivity.this, rb.getText(), Toast.LENGTH_LONG).show();
            }
        });
    }
}
