package com.pratamawijaya.firstmeet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

  RadioButton rbMale;
  RadioButton rbFemale;
  EditText etUsername;
  Spinner spProvince;

  String gender;
  String username;
  private ArrayAdapter<String> spAdapter;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    rbMale = (RadioButton) findViewById(R.id.rb_male);
    rbFemale = (RadioButton) findViewById(R.id.rb_female);
    etUsername = (EditText) findViewById(R.id.et_username);
    spProvince = (Spinner) findViewById(R.id.sp_province);

    List<String> listString = new ArrayList<>();
    listString.add("APa");
    listString.add("APa");
    listString.add("APa");

    spAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listString);
    spProvince.setAdapter(spAdapter);

    String data = listString.get(spProvince.getSelectedItemPosition());

    username = etUsername.getText().toString();

    if (rbMale.isChecked()) {
      gender = "Pria";
    } else {
      gender = "Wanita";
    }
  }
}
