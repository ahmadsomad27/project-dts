package com.somad.pariwisata;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LogIn extends AppCompatActivity {

    private Button login;
    private EditText username, password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        final EditText username = findViewById(R.id.input_username);
        final EditText password = findViewById(R.id.input_password);
        Button login = findViewById(R.id.button_login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String uname = username.getText().toString();
                String pass = password.getText().toString();

                if(uname.equals("ahmad") && pass.equals("12345")){
                    Toast.makeText(getApplicationContext(), "Username dan Password Benar", Toast.LENGTH_LONG).show();
                    Intent i = new Intent(LogIn.this, Menu.class);
                    startActivity(i);
                }else{
                    Toast.makeText(getApplicationContext(),"Username dan Password salah", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}
