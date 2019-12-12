package com.sabin.esoftwarica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Objects;

public class LoginActivity extends AppCompatActivity {
    private EditText usrname, pass;

    private Button login, singup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        usrname = findViewById(R.id.etuname);
        pass = findViewById(R.id.etpass);
        login = findViewById(R.id.btnlogin);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(usrname.getText())) {
                    usrname.setError("Please enter user name");
                    usrname.requestFocus();
                    return;
                } else if (TextUtils.isEmpty(pass.getText())) {
                    pass.setError("Please enter valid Password");
                    pass.requestFocus();
                    return;
                }

                String Uname, psw;

                Uname = usrname.getText().toString();
                psw = pass.getText().toString();

                if (Objects.equals(Uname, "softwarica") && Objects.equals(psw, "coventry")) {
                    Toast.makeText(getApplicationContext(),
                            "Redirecting...", Toast.LENGTH_SHORT).show();

                    Intent dashboard = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(dashboard);
                }
                else {
                    Toast.makeText(LoginActivity.this, "User and Password is not correct",
                            Toast.LENGTH_LONG).show();

                    usrname.setText("");
                    pass.setText("");
                    usrname.setVisibility(View.VISIBLE);
                    usrname.setBackgroundColor(Color.RED);
                    pass.setBackgroundColor(Color.RED);

                }
            }
        });
    }
}
