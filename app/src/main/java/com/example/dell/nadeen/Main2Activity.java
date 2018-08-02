package com.example.dell.nadeen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    Intent intent;

    TextView tvU , tvP , tvI;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tvU = (TextView) findViewById(R.id.textView3);
        tvP = (TextView) findViewById(R.id.textView2);
        tvI = (TextView) findViewById(R.id.textView);
        intent=getIntent();

        User user = (User) intent.getSerializableExtra("user");
      tvU.setText(tvU.getText()+user.getUsername());
      tvP.setText(tvP.getText()+user.getPassword());
      tvI.setText(tvI.getText()+user.getId());



    }
}
