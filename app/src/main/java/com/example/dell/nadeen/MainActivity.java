package com.example.dell.nadeen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
private Button B1,B2 ;
    EditText id , username , password ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        id = (EditText) findViewById(R.id.ID);
        username = (EditText) findViewById(R.id.editText);
        password = (EditText) findViewById(R.id.Pass);
        B1= (Button) findViewById(R.id.button1);
        B2= (Button) findViewById(R.id.button2);


        B1.setOnClickListener(new View.OnClickListener() { //3shan y7sl event
            @Override
            public void onClick(View v) {
                User user = new User();
                user.setUsername(username.getText().toString());
                user.setPassword(password.getText().toString());
                user.setId(id.getText().toString());
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("user",user);
                startActivity(intent);


            }
        }
        );
        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Main3Activity.class);
                startActivity(intent);

            }
        });
    }
}
