package com.example.dialogandfragment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class FragmentTask extends AppCompatActivity implements FirstFragment.FirstFragmentListener {

    private FirstFragment firstfragment;
    private SecondFragment secondfragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_task);
        firstfragment = new FirstFragment();
        secondfragment = new SecondFragment();

        getSupportFragmentManager().beginTransaction().add(R.id.fragment2, secondfragment)
                .commit();
    }

    @Override
    public void SendText(String input) {
        secondfragment.updateTextView(input);
    }
}
