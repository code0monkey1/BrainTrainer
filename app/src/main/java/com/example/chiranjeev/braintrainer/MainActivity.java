package com.example.chiranjeev.braintrainer;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private int correctAnswers;
    private int totalAnswers;
    private int maxNumber;
    private int minNumber;
    private TextView result;
    private CountDownTimer countDownTimer;
    TextView timeLeft;
    Button start;
    private int[] grid;
    private boolean gameInProgress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //generate the result of  2 random digits
        // one pair of those 2 digits forms the question
        // produce 4 such results
        // ensure the results are not repeated in the grid
        // put the values in the respective boxes in the text View
        // if on clicking the boxes , the result is same as the result desired
        // then increment correct answer , definitely increment totalAnswers every time

    }


}
