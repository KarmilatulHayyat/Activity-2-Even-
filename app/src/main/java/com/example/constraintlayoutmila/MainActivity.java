//ActivityEven
package com.example.constraintlayoutmila;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edEmail,edPassword;
    Button btnLogin;
    String nama,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = findViewById(R.id.btSignIn);
        edEmail    = findViewById(R.id.edEmail);
        edPassword = findViewById(R.id.edPassword);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nama     = edEmail.getText().toString();
                password = edPassword.getText().toString();

                if (nama.equals("mila") && password.equals("1234")){
                    Toast t = Toast.makeText(getApplicationContext()
                            ,"login Kamu Berhasil",Toast.LENGTH_LONG);
                    t.show();
                }
                else if(nama.equals("mila") && !password.equals("1234")){
                    Toast t = Toast.makeText(getApplicationContext()
                            ,"Password Anda Salah",Toast.LENGTH_LONG);
                    t.show();
                }
                else if(!nama.equals("mila") && password.equals("1234")){
                    Toast t = Toast.makeText(getApplicationContext()
                            ,"Email Anda Salah",Toast.LENGTH_LONG);
                    t.show();
                }
                else{
                    Toast t = Toast.makeText(getApplicationContext()
                            ,"Email dan Password Anda Salah",Toast.LENGTH_LONG);
                    t.show();
                }

            }
        });
    }
}