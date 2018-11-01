package com.example.hp.passingobject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MyActivity extends AppCompatActivity {
TextView s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        Student student=(Student) getIntent().getSerializableExtra("Student");


        s = findViewById(R.id.s);
        s.setText(student.toString());
    }
}
