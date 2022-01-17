package com.transferdatafromfragmenttoanotherfragmentdemo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentB extends Fragment  {

    TextView messageTextView;
    TextView numberTextView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = getLayoutInflater().inflate(R.layout.b_fragment, container, false);
        messageTextView = view.findViewById(R.id.messageTextView);
        numberTextView = view.findViewById(R.id.numberTextView);

        String messageData = getArguments().getString("messageData");
        Integer numberData = getArguments().getInt("numberData");

        messageTextView.setText(messageData);
        numberTextView.setText(numberData.toString());


        return view;
    }
}
