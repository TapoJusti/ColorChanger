package com.tapojusti.www.colorchanger;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private Button btnRed;
    private Button btnGreen;
    private Button btnBlue;
    private Button btnBackground;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.text);
        btnBlue = (Button) findViewById(R.id.btnBlue);
        btnRed = (Button) findViewById(R.id.btnRed);
        btnGreen = (Button) findViewById(R.id.btnGreen);
        btnBackground = (Button) findViewById(R.id.btnBackground);

        btnBackground.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
//                textView.setBackgrounndColor(getResources().getColor(R.color.blue));
            }

        }


        );
    }
}
