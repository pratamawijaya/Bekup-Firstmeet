package com.pratamawijaya.firstmeet;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

  //1. declare view
  private Button btnLogin;
  private EditText etUsername;
  private EditText etPassword;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_login);

    // 2. inisiasi
    btnLogin = (Button) findViewById(R.id.btn_login);
    etUsername = (EditText) findViewById(R.id.input_username);
    etPassword = (EditText) findViewById(R.id.input_password);

    btnLogin.setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View v) {

        // 1. get data username and password
        final String username = etUsername.getText().toString();
        final String password = etPassword.getText().toString();
        // 2. jika username adalah root dan pasword adalah toor jalankan 4
        if (username.equals("root") && password.equals("toor")) {
          // 4. tampilkan login berhasil
          Toast.makeText(LoginActivity.this, "Login Berhasil", Toast.LENGTH_SHORT).show();
        } else {
          // 5. tampilkan login gagal
          Toast.makeText(LoginActivity.this, "Login Gagal", Toast.LENGTH_SHORT).show();
        }
        // 3. jika username bukan root dan password bukan toor jalankan 5

      }
    });
  }
}
