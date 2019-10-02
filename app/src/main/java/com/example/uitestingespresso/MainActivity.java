package com.example.uitestingespresso;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    
    EditText et_username, et_password;
    Button btn_login;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        et_username = findViewById(R.id.et_username);
        et_password = findViewById(R.id.et_password);
        
        btn_login = findViewById(R.id.btn_login);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login();
            }
        });
    }
    
    private void login() {
        String username = et_username.getText().toString();
        String password = et_password.getText().toString();
        
        if (username.equals("testuser") && password.equals("test123")) {
            startActivity(new Intent(MainActivity.this, WelcomeActivity.class));
        }
    }
}
