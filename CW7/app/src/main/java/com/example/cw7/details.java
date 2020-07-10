package com.example.cw7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Bundle b = getIntent().getExtras();
        Pokemon p = (Pokemon) b.getSerializable("pokemon");

        TextView name = findViewById(R.id.NameTV);
        TextView attack = findViewById(R.id.Attack);
        TextView defence = findViewById(R.id.Defence);
        TextView total = findViewById(R.id.TotalTV);
        ImageView pic = findViewById(R.id.Pic);
        TextView type = findViewById(R.id.TypeTV);
        TextView Link = findViewById(R.id.PokedexTV);


        name.setText(p.getName());
        attack.setText("Attack: " +p.getAttack() + "");
        defence.setText( "Defence: " +p.getDefence() + "");
        total.setText("Total: " +p.getTotal() + "");
        type.setText("Type: "+ p.getType());
        pic.setImageResource(p.getImage());


        Link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent link = new Intent(Intent.ACTION_SENDTO);
            }
        });








    }
}