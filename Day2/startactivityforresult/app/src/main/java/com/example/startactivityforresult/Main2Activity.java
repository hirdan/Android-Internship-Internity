package com.example.startactivityforresult;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    EditText etname;
    EditText etage;
    EditText etemail;
    EditText etphone;
    Button btns;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        etname = findViewById(R.id.etname);
        etage = findViewById(R.id.etage);
        etemail = findViewById(R.id.etemail);
        etphone = findViewById(R.id.etphone);
        btns = findViewById(R.id.btns);
        btns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String name = etname.getText().toString().trim();
                String age = etage.getText().toString().trim();
                String email = etemail.getText().toString().trim();
                String phone = etphone.getText().toString().trim();

                Intent resultIntent = new Intent();

                if (name.isEmpty() || age.isEmpty() || email.isEmpty() || phone.isEmpty()) {
                    String response="Something went wrong, you didn't enter all the fields!\n";
                    resultIntent.putExtra("response",response);
                    setResult(RESULT_CANCELED, resultIntent);
                    finish();
                } else {


                    String result = "Name: " + name + "\n" + "Age: " + age + "\n" + "Email: " + email + "\n" + "Phone Number: " + phone + "\n";

                    resultIntent.putExtra("result", result);
                    setResult(RESULT_OK, resultIntent);
                    finish();
                }

            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(getApplicationContext(),"Life Cycle Event: In onStart()",Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(getApplicationContext(),"Life Cycle Event: In onResume()",Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(getApplicationContext(),"Life Cycle Event: In onPause()",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(getApplicationContext(),"Life Cycle Event: In onStop()",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext(),"Life Cycle Event: In onDestroy()",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(getApplicationContext(),"Life Cycle Event: In onRestart()",Toast.LENGTH_SHORT).show();
    }
}
