package com.softvally.a5waystodevelopthemindforsuccess;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    Adapter myAdapter;


    String[] country;

    int[] images = {R.drawable.mind,
            R.drawable.mind,
            R.drawable.mind,
            R.drawable.mind,
            R.drawable.mind,
            R.drawable.mind,
            R.drawable.mind







    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycle_reality);


        getSupportActionBar().hide();


        country = getResources().getStringArray(R.array.country_name);

        //desc=getResources().getStringArray(R.array.country_desc);


        myAdapter = new Adapter(this, images, country);
        recyclerView.setAdapter(myAdapter);
        GridLayoutManager grid = new GridLayoutManager(MainActivity.this, 2, GridLayoutManager.VERTICAL, false);
        //    recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(grid);
        myAdapter.setOnItemClickListener(new Adapter.ClickListener() {
            @Override
            public void onItemClick(int position, View v) {

                // Toast.makeText(getApplicationContext(), "onclick:" + position, Toast.LENGTH_LONG).show();

                if (position == 0) {
                    Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                    startActivity(intent);

                }

                if (position == 1) {
                    Intent intent = new Intent(MainActivity.this, Main3Activity.class);
                    startActivity(intent);

                }

                if (position == 2) {
                    Intent intent = new Intent(MainActivity.this, Main4Activity.class);
                    startActivity(intent);

                }
                if (position == 3) {
                    Intent intent = new Intent(MainActivity.this, Main5Activity.class);
                    startActivity(intent);

                }

                if (position == 4) {
                    Intent intent = new Intent(MainActivity.this, Main6Activity.class);
                    startActivity(intent);

                }

                if (position == 5) {
                    Intent intent = new Intent(MainActivity.this, Main7Activity.class);
                    startActivity(intent);

                }

                if (position == 6) {
                    Intent intent = new Intent(MainActivity.this, Main8Activity.class);
                    startActivity(intent);

                }


            }
        });


    }
}
