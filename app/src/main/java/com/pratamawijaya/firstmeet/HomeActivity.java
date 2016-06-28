package com.pratamawijaya.firstmeet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import com.pratamawijaya.firstmeet.utility.PreferencesUtil;

public class HomeActivity extends AppCompatActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_home);

    String username = PreferencesUtil.readStringData(this, PreferencesUtil.KEY_USER_NAME, "");

    Toast.makeText(HomeActivity.this, "" + username, Toast.LENGTH_SHORT).show();
  }
}
