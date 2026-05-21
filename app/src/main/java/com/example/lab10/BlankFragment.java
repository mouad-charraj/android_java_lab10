package com.example.lab10;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class BlankFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Chargement du layout pour le premier fragment
        return inflater.inflate(R.layout.fragment_blank, container, false);
    }
}
// réalisé par CHARRAJ Mouad aka ZERO-XR7
