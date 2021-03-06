package com.example.courtcounter;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    int scoreboard_a = 0;
    int scoreboard_b = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pointers3a(View view) {
        scoreboard_a = scoreboard_a + 3;
        TextView tx = findViewById(R.id.tv_sb_a);
        tx.setText(String.valueOf(scoreboard_a));
    }

    public void pointers2a(View view) {
        scoreboard_a = scoreboard_a + 2;
        TextView tx = findViewById(R.id.tv_sb_a);
        tx.setText(String.valueOf(scoreboard_a));

    }

    public void freeThrow_a(View view) {
        scoreboard_a++;
        TextView tx = findViewById(R.id.tv_sb_a);
        tx.setText(String.valueOf(scoreboard_a));
    }

    public void pointers3b(View view) {
        scoreboard_b = scoreboard_b + 3;
        TextView tx = findViewById(R.id.tv_sb_b);
        tx.setText(String.valueOf(scoreboard_b));
    }
    public void pointers2b(View view) {
        scoreboard_b = scoreboard_b + 2;
        TextView tx = findViewById(R.id.tv_sb_b);
        tx.setText(String.valueOf(scoreboard_b));
    }

    public void freeThrow_b(View view) {
        scoreboard_b = scoreboard_b + 1;
        TextView tx = findViewById(R.id.tv_sb_b);
        tx.setText(String.valueOf(scoreboard_b));
    }

    public void reset(View view) {
        scoreboard_a=0;
        scoreboard_b =0;

        TextView tx_a = findViewById(R.id.tv_sb_a);
        tx_a.setText(String.valueOf(scoreboard_a));
        TextView tx_b = findViewById(R.id.tv_sb_b);
        tx_b.setText(String.valueOf(scoreboard_b));

    }

}
