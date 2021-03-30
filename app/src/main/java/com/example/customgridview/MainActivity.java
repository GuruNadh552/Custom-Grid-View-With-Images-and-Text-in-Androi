package com.example.customgridview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {
    GridView gridView;
    int arr_img[] = {R.drawable.character,
            R.drawable.characterm,
            R.drawable.cyclops,
            R.drawable.knight,
            R.drawable.mutant,
            R.drawable.mutantm,
            R.drawable.ninja,
            R.drawable.superhero,
            R.drawable.superheroo};
    String arr_name[] = {"A","B","C","D","E","F","G","H","I"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView = findViewById(R.id.GView);

       CustomAdapter customadapter = new CustomAdapter(getApplicationContext(),arr_img,arr_name);
        gridView.setAdapter(customadapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(MainActivity.this,imageviewwww.class);
                i.putExtra("imageurl",arr_img[position]);
                i.putExtra("imageid",arr_name[position]);
                startActivity(i);
            }
        });
    }
}