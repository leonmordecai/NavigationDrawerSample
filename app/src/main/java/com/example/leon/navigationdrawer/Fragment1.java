package com.example.leon.navigationdrawer;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;


public class Fragment1 extends android.support.v4.app.Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment1, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        final RelativeLayout r1 = getActivity().findViewById(R.id.background1);
        final Button showToast = getActivity().findViewById(R.id.toastbt1);

        final Button changeBG1 =  getActivity().findViewById(R.id.changebg1);
        changeBG1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                r1.setBackgroundColor(Color.RED);
                changeBG1.setTextColor(Color.WHITE);
                showToast.setTextColor(Color.WHITE);
            }
        });

        showToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "You clicked the button Show Toast!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
