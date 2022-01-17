package com.transferdatafromfragmenttoanotherfragmentdemo;

import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentA extends Fragment implements View.OnClickListener{
    EditText editText1;
    EditText editText2;
    Button buttonOk;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = getLayoutInflater().inflate(R.layout.a_fragment, container, false);

        editText1 = view.findViewById(R.id.editTextFragmentId);
        editText2 = view.findViewById(R.id.editText2FragmentId);
        buttonOk = view.findViewById(R.id.buttonFragmentAId);

        buttonOk.setOnClickListener(this);



        return view;

    }

    @Override
    public void onClick(View view) {
        if (editText1.getText().toString() != null && editText2.getText().toString() != null){
            Bundle mDataBundle = new Bundle();
            mDataBundle.putString("messageData", editText1.getText().toString());
            mDataBundle.putInt("numberData", Integer.parseInt(editText2.getText().toString()));

            FragmentB fragmentB = new FragmentB();
            fragmentB.setArguments(mDataBundle);

            getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.main_container, fragmentB).commit();
        }

    }
}
