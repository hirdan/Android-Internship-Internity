package com.example.dialogandfragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class SecondFragment extends Fragment {
    private TextView tvFragmentResults;

    public SecondFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
//         Inflate the layout for this fragment
        View k = inflater.inflate(R.layout.activity_second_fragment, container, false);
        tvFragmentResults=k.findViewById(R.id.tvFragmentResults);
        tvFragmentResults=k.findViewById(R.id.tvFragmentResults);

        return k;
    }


    public void updateTextView(String input){

        tvFragmentResults.setText(input);
    }

}
