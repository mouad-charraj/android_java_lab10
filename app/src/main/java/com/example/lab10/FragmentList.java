package com.example.lab10;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.ListFragment;

public class FragmentList extends ListFragment {

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Données de test pour la démo
        String[] data_mouad = {
            "Elément 1 (Mouad)", "Elément 2 (Mouad)", "Elément 3 (Mouad)", 
            "Elément 4 (Mouad)", "Elément 5 (Mouad)", "Elément 6 (Mouad)", 
            "Elément 7 (Mouad)", "Elément 8 (Mouad)", "Elément 9 (Mouad)", 
            "Elément 10 (Mouad)"
        };

        // Création de l'adapter pour remplir la liste
        ArrayAdapter<String> adapter_mouad = new ArrayAdapter<>(
                requireContext(),
                android.R.layout.simple_list_item_1,
                data_mouad
        );
        
        setListAdapter(adapter_mouad);
    }
}
// réalisé par CHARRAJ Mouad aka ZERO-XR7
