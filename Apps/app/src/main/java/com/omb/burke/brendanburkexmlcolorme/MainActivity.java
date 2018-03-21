package com.omb.burke.brendanburkexmlcolorme;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button redButton;
    private Button blueButton;
    private Button greenButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        redButton = (Button)findViewById(R.id.red_btn);
        greenButton = (Button)findViewById(R.id.green_btn);
        blueButton = (Button)findViewById(R.id.blue_btn);


        redButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                changeButtonColor(v);
            }
        });

        greenButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                changeButtonColor(v);
            }
        });

        blueButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                changeButtonColor(v);
            }
        });
    }// end onCreate



    public void changeButtonColor(View view){
        switch (view.getId()){
            case R.id.red_btn:
                redButton.setBackgroundColor(Color.RED);
                Toast.makeText(MainActivity.this, "RED",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.green_btn:
                greenButton.setBackgroundColor(Color.GREEN);
                Toast.makeText(MainActivity.this, "GREEN",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.blue_btn:
                blueButton.setBackgroundColor(Color.BLUE);
                Toast.makeText(MainActivity.this, "BLUE",
                        Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
    }// end changeButtonColor

}
