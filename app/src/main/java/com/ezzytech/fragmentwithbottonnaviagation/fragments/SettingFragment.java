package com.ezzytech.fragmentwithbottonnaviagation.fragments;


import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;
import com.ezzytech.fragmentwithbottonnaviagation.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.smarteist.autoimageslider.SliderView;

import java.nio.FloatBuffer;
import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class SettingFragment extends Fragment {

    private Button button1, button2;
    private TextView textView;
    private Context context;
    private String string;
    private int x;


    public SettingFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        this.context = context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_setting, container, false);
        //  int images[]={R.drawable.ct,R.drawable.adt,R.drawable.crtt};
        button1 = view.findViewById(R.id.button1);
        button2 = view.findViewById(R.id.button2);
        textView = view.findViewById(R.id.textview2);

        init();

        return view;
    }

    private void init() {
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                string = textView.getText().toString();
                x=Integer.valueOf(string);
                if (x == 17) {
                    Toast.makeText(context, "You cannot take more then 17 credit in this semester.", Toast.LENGTH_SHORT).show();
//                    textView.setText(x);
                }
                else {
                    x++;
                    textView.setText(x+"");
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                string = textView.getText().toString();
                x=Integer.valueOf(string);
                if (x == 13) {
                    Toast.makeText(context, "You must take more then 13 credit in this semester.", Toast.LENGTH_SHORT).show();
//                    textView.setText(x);
                }
                else {
                    x--;
                    textView.setText(x+"");
                }

            }
        });
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


    }
}

