package com.example.dialogandfragment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements DialogBox.DialogListener {

    TextView tvResult;
    Button btnClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("Life Cycle Event: ", "In onCreate()");

        tvResult = findViewById(R.id.tvResult);
        btnClick = findViewById(R.id.btnClick);

        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialog();
            }
        });

    }

    public void openDialog(){
        DialogBox exampleDialog = new DialogBox();
        exampleDialog.show(getSupportFragmentManager(), "example dialog");
    }

    @Override
    public void applyTexts(String input) {
        tvResult.setText(input);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Life Cycle Event: ", "In onStart()");



    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Life Cycle Event: ", "In onResume()");


    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d("Life Cycle Event: ", "In onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d("Life Cycle Event: ", "In onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d("Life Cycle Event: ", "In onDestroy()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.d("Life Cycle Event: ", "In onRestart() ");
    }
}