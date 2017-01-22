package com.hackucsc2017.underwater_squad.gotchobook;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

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

    public void goToAustin() {
        Intent intent = new Intent(MainActivity.this, ChildView.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomGrid adapter = new CustomGrid(MainActivity.this, names, imageId);
        grid=(GridView)findViewById(R.id.grid);
        grid.setAdapter(adapter);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                goToAustin();
            }
        });
    }
}
