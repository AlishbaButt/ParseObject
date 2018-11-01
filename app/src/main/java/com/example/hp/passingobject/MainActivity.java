package com.example.hp.passingobject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity{


    Button btn;
    EditText etName, etID, etFather;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn=findViewById(R.id.register);

        etName = findViewById(R.id.et_name);
        etID= findViewById(R.id.et_ID);
        etFather= findViewById(R.id.et_FatherName);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intent=new Intent(MainActivity.this, MyActivity.class);
               Student student = new Student();
               student.setName(etName.getText().toString());
               student.setId(Integer.parseInt(etID.getText().toString()));
               student.setFatherName(etFather.getText().toString());
               intent.putExtra("Student",student);
               startActivity(intent);

            }
        });


    }
}
