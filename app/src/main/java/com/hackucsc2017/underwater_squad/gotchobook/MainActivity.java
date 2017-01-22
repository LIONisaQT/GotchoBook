package com.hackucsc2017.underwater_squad.gotchobook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {
    GridView grid;
    String[] names = {
            "Austin",
            "Austin",
            "Austin",
            "Austin"
    };
    int[] imageId = {
            R.drawable.austin,
            R.drawable.austin,
            R.drawable.austin,
            R.drawable.austin
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridSetup();
    }

    public void gridSetup() {
        CustomGrid adapter = new CustomGrid(MainActivity.this, names, imageId);
        grid = (GridView)findViewById(R.id.grid);
        grid.setAdapter(adapter);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                goToAustin();
            }
        });
    }

    public void goToAustin() {
        Intent intent = new Intent(MainActivity.this, ChildView.class);
        startActivity(intent);
    }
}
