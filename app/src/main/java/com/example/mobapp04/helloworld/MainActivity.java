package com.example.mobapp04.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int counter;
    private Button counterBtn, decreaseBtn;
    private TextView tvTitle;

    //innerclass gebruiken om een interface te implementeren
    //onClick = > wat gaan we doen als er op de knop geklikt wordt?
    private View.OnClickListener myCounterListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            counter++;
            tvTitle.setText(String.valueOf(counter));
        }
    };

    private View.OnClickListener myDecreaseListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            tvTitle.setText(String.valueOf(--counter));
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        counter = 0;
        //verwijzingen naar wat er in het scherm zit
        counterBtn = findViewById(R.id.btn_counter);
        tvTitle = findViewById(R.id.tv_title);
        decreaseBtn = findViewById(R.id.btn_decrease);

        //functie toevoegen aan knop/tv
        counterBtn.setOnClickListener(myCounterListener);
        decreaseBtn.setOnClickListener(myDecreaseListener);
    }
}


