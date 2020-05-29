package com.example.dialogandfragment;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class FirstFragment extends Fragment {
    private FirstFragmentListener listener;
    private EditText etInput;
    private Button btnFrag;

    public FirstFragment() {
        // Required empty public constructor
    }

    public interface FirstFragmentListener {
        void SendText(String input);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View vi = inflater.inflate(R.layout.activity_first_fragment, container, false);
        etInput = vi.findViewById(R.id.etInput);
        btnFrag = vi.findViewById(R.id.btnFrag);


        btnFrag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = etInput.getText().toString().trim();

                listener.SendText(input);

            }
        });

        return vi;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if(context instanceof  FirstFragmentListener){
            listener = (FirstFragmentListener) context;
        } else {
            throw new RuntimeException(context.toString() + " must implement FirstFragmentListener" );
        }

    }

    @Override
    public void onDetach() {
        super.onDetach();
        listener = null;
    }
}
