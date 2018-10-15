package com.medina.daniel.ubicarmec_taller2;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class Pasados extends Fragment {


    public Pasados() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_pasados, container, false);
        CardView cardView=(CardView)rootView.findViewById(R.id.card_pasado);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(),Trabajo_pasado.class);
                startActivity(intent);
            }
        });
        return rootView;
    }
}


