package com.example.cw7;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Pokemon> MyPokemons = new ArrayList<>();

        Pokemon P1 = new Pokemon("Bulbasaur",R.drawable.bulbasuar,49,49,318, "Grass","https://bulbapedia.bulbagarden.net/wiki/Bulbasaur_(Pok%C3%A9mon)");
        Pokemon P2 = new Pokemon("Charmander",R.drawable.charmander,52,43,309, "Fire","https://bulbapedia.bulbagarden.net/wiki/Charmander_(Pok%C3%A9mon)");
        Pokemon P3 = new Pokemon("Squirtle",R.drawable.squirtle,48,65,314, "Water","https://bulbapedia.bulbagarden.net/wiki/Squirtle_(Pok%C3%A9mon)");
        Pokemon P4 = new Pokemon("Pikachu",R.drawable.pikachu,48,65,314, "Electric","https://bulbapedia.bulbagarden.net/wiki/Pikachu_(Pok%C3%A9mon)");
        Pokemon P5 = new Pokemon("Pinsir",R.drawable.pinsir,125,100,500, "Bug","https://bulbapedia.bulbagarden.net/wiki/Pinsir_(Pok%C3%A9mon)");
        Pokemon P6 = new Pokemon("Arbok",R.drawable.arbok,85,69,438, "Poison","https://bulbapedia.bulbagarden.net/wiki/Arbok_(Pok%C3%A9mon)");
        Pokemon P7 = new Pokemon("Dragonair",R.drawable.dragonair,84,65,420, "Dragon","https://bulbapedia.bulbagarden.net/wiki/Dragonair_(Pok%C3%A9mon)");
        Pokemon P8 = new Pokemon("Machamp",R.drawable.machamp,130,80,505, "Fighting","https://bulbapedia.bulbagarden.net/wiki/Machamp_(Pok%C3%A9mon)");
        Pokemon P9 = new Pokemon("Marowak",R.drawable.marowak,80,110,425, "Ground","https://bulbapedia.bulbagarden.net/wiki/Marowak_(Pok%C3%A9mon)");
        Pokemon P10 = new Pokemon("Snorlax",R.drawable.snorlax,110,65,540, "Normal","https://bulbapedia.bulbagarden.net/wiki/Snorlax_(Pok%C3%A9mon)");
        Pokemon P11 = new Pokemon("Mewtwo",R.drawable.mewtwo,110,90,680, "Psychic","https://bulbapedia.bulbagarden.net/wiki/Mewtwo_(Pok%C3%A9mon)");


        MyPokemons.add(P1);
        MyPokemons.add(P2);
        MyPokemons.add(P3);
        MyPokemons.add(P4);
        MyPokemons.add(P5);
        MyPokemons.add(P6);
        MyPokemons.add(P7);
        MyPokemons.add(P8);
        MyPokemons.add(P9);
        MyPokemons.add(P10);
        MyPokemons.add(P11);

        RecyclerView rv = findViewById(R.id.recyclerView);

        rv.setHasFixedSize(true);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        rv.setLayoutManager(lm);


        Adapter adapter = new Adapter(MyPokemons, this);
        rv.setAdapter(adapter);


        //this line adds a divider between RecyclerView items
        // (rv is the name of the RecyclerView)
        // (lm is the name of the Linear Layout Manager)
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(rv.getContext(),
                ((LinearLayoutManager) lm).getOrientation());
        rv.addItemDecoration(dividerItemDecoration);






    }

}