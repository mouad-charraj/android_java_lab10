package com.example.lab10;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout drawer_mouad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Setup de la toolbar perso
        Toolbar toolbar_mouad = findViewById(R.id.toolbar_mouad);
        setSupportActionBar(toolbar_mouad);

        // Init du drawer et du menu
        drawer_mouad = findViewById(R.id.drawer_layout_mouad);
        NavigationView navigationView_mouad = findViewById(R.id.nav_view_mouad);
        navigationView_mouad.setNavigationItemSelectedListener(this);

        // Liaison du bouton burger avec la barre d'action
        ActionBarDrawerToggle toggle_mouad = new ActionBarDrawerToggle(
                this, drawer_mouad, toolbar_mouad, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer_mouad.addDrawerListener(toggle_mouad);
        toggle_mouad.syncState();

        // Chargement de l'accueil par défaut (Frag 1)
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.contenu_mouad, new BlankFragment())
                    .commit();
            navigationView_mouad.setCheckedItem(R.id.nav_fragment1_mouad);
            if (getSupportActionBar() != null) {
                getSupportActionBar().setTitle("Accueil (Mouad)");
            }
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id_mouad = item.getItemId();

        // Switch entre les sections via le menu latéral
        if (id_mouad == R.id.nav_fragment1_mouad) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.contenu_mouad, new BlankFragment())
                    .commit();
            if (getSupportActionBar() != null) getSupportActionBar().setTitle("Fragment 1 (Mouad)");
        } else if (id_mouad == R.id.nav_fragment2_mouad) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.contenu_mouad, new BlankFragment2())
                    .commit();
            if (getSupportActionBar() != null) getSupportActionBar().setTitle("Fragment 2 (Mouad)");
        } else if (id_mouad == R.id.nav_list_mouad) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.contenu_mouad, new FragmentList())
                    .commit();
            if (getSupportActionBar() != null) getSupportActionBar().setTitle("Liste - Mouad");
        }

        drawer_mouad.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onBackPressed() {
        // Ferme le menu s'il est ouvert avant de quitter
        if (drawer_mouad.isDrawerOpen(GravityCompat.START)) {
            drawer_mouad.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
}
// réalisé par CHARRAJ Mouad aka ZERO-XR7
