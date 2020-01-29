package com.ezzytech.fragmentwithbottonnaviagation.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ViewFlipper;

import com.smarteist.autoimageslider.IndicatorAnimations;
import com.smarteist.autoimageslider.SliderView;
import android.view.View;

import androidx.annotation.ContentView;
import androidx.fragment.app.Fragment;
import com.ezzytech.fragmentwithbottonnaviagation.R;
/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {




    public HomeFragment() {
        // Required empty public constructor
    }
     private SliderView sliderView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_home, container, false);
        View innerView = view.findViewById(R.id.imagview1);
//        View pic1 =  inflater.inflate(R.drawable.pic1,true);

//        sliderView.setIndicatorAnimation(IndicatorAnimations.FILL);
//        sliderView.setScrollTimeInSec(2);

//        init();
        return view;
    }
//    public void init() {
//        for (int i=1; i<3; i++){
//            SliderView sliderView= new SliderView(this);
//            switch (i){
//                case 0:
//                    sliderView.findViewById(R.id.)
//
//
//            }
//
//        }



    }



