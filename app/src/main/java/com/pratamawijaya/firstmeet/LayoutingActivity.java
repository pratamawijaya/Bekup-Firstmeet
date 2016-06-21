package com.pratamawijaya.firstmeet;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class LayoutingActivity extends AppCompatActivity {

  private static final String TAG = "LayoutingActivity";

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_layouting_linearlayout);

    Log.d(TAG, "onCreate: ");

     }

  @Override protected void onStart() {
    super.onStart();
    Log.d(TAG, "onStart: ");
    // turn on location detection
  }

  @Override protected void onResume() {
    super.onResume();
    Log.d(TAG, "onResume: ");
  }

  @Override protected void onStop() {
    super.onStop();
    Log.d(TAG, "onStop: ");
    // turn of location detection
  }

  @Override protected void onPause() {
    super.onPause();
    Log.d(TAG, "onPause: ");
  }

  @Override protected void onDestroy() {
    super.onDestroy();
    Log.d(TAG, "onDestroy: ");
  }
}
