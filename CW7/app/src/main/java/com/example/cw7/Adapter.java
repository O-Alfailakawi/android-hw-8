package com.example.cw7;

import android.content.Context;
import android.content.Intent;
import android.icu.text.Transliterator;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.io.Serializable;
import java.util.ArrayList;


public class Adapter extends RecyclerView.Adapter {
    ArrayList<Pokemon> pArray;
    Context c;


    public Adapter(ArrayList<Pokemon> pArray, Context c) {
        this.pArray = pArray;
        this.c = c;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.pokemon_banner, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {
        ((ViewHolder) holder).img.setImageResource(pArray.get(position).getImage());
        ((ViewHolder) holder).PokemonName.setText(pArray.get(position).getName());
        ((ViewHolder) holder).PokemonTotal.setText(pArray.get(position).getTotal() + "");
        ((ViewHolder) holder).view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(c, details.class);
                i.putExtra("pokemon", pArray.get(position));
                c.startActivity(i);
            }
        });

        ((ViewHolder) holder).delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pArray.remove(position);
                //this code line refreshes the page
                notifyDataSetChanged();

            }
        });


    }


    @Override
    public int getItemCount() {
        return pArray.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView img;
        public TextView PokemonName;
        public TextView PokemonTotal;
        public ImageView delete;
        public View view;
        public TextView Link;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            view = itemView;
            PokemonName = itemView.findViewById(R.id.EmptyName);
            PokemonTotal = itemView.findViewById(R.id.EmptyTotal);
            img = itemView.findViewById(R.id.imageView2);
            delete = itemView.findViewById(R.id.imageView3);
            Link = itemView.findViewById(R.id.PokedexTV);


        }


    }

}
