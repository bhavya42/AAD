package com.example.addition;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText first = (EditText)findViewById(R.id.firstNum);
        final EditText second = (EditText)findViewById(R.id.secondNum);
        Button Addition = (Button)findViewById(R.id.addBtn);
        Addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(first.getText().toString().isEmpty() || second.getText().toString().isEmpty())
                {
                    Toast.makeText(getApplicationContext(), "Fill all the fields", Toast.LENGTH_SHORT).show();
                }
                else {
                    int firstnum = Integer.parseInt(first.getText().toString());
                    int secondnum = Integer.parseInt(second.getText().toString());
                    Toast.makeText(getApplicationContext(), "Addition of given two numbers is = " + (firstnum + secondnum), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
