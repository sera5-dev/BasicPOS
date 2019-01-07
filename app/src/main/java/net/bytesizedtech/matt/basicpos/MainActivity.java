package net.bytesizedtech.matt.basicpos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView display = findViewById(R.id.display);
    double runningTotal = 0;
    ArrayList<Double> prices = new ArrayList<Double>(15){
        {
            add(1.21);
            add(2.20);
            add(3.10);
            add(2.75);
            add(8.75);
            add(5.00);
            add(1.00);
            add(3.00);
            add(2.21);
            add(3.32);
            add(5.75);
            add(15.00);
            add(25.00);
            add(12.42);
            add(9.12);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = findViewById(R.id.button1);
        button1.setOnClickListener(this);
        Button button2 = findViewById(R.id.button1);
        button2.setOnClickListener(this);
        Button button3 = findViewById(R.id.button1);
        button3.setOnClickListener(this);
        Button button4 = findViewById(R.id.button1);
        button4.setOnClickListener(this);
        Button button5 = findViewById(R.id.button1);
        button5.setOnClickListener(this);
        Button button6 = findViewById(R.id.button1);
        button6.setOnClickListener(this);
        Button button7 = findViewById(R.id.button1);
        button7.setOnClickListener(this);
        Button button8 = findViewById(R.id.button1);
        button8.setOnClickListener(this);
        Button button9 = findViewById(R.id.button1);
        button9.setOnClickListener(this);
        Button button10 = findViewById(R.id.button1);
        button10.setOnClickListener(this);
        Button button11 = findViewById(R.id.button1);
        button11.setOnClickListener(this);
        Button button12 = findViewById(R.id.button1);
        button12.setOnClickListener(this);
        Button button13 = findViewById(R.id.button1);
        button13.setOnClickListener(this);
        Button button14 = findViewById(R.id.button1);
        button14.setOnClickListener(this);
        Button button15 = findViewById(R.id.button1);
        button15.setOnClickListener(this);
        Button buttonClear = findViewById(R.id.buttonClear);
        buttonClear.setOnClickListener(this);




    }
    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.button1:
                runningTotal = runningTotal + prices.get(1);
                updateDisplay();
                break;

            case R.id.button2:
                runningTotal = runningTotal + prices.get(2);
                updateDisplay();
                break;

            case R.id.button3:
                runningTotal = runningTotal + prices.get(3);
                updateDisplay();
                break;

            case R.id.button4:
                runningTotal = runningTotal + prices.get(4);
                updateDisplay();
                break;

            case R.id.button5:
                runningTotal = runningTotal + prices.get(5);
                updateDisplay();
                break;

            case R.id.button6:
                runningTotal = runningTotal + prices.get(6);
                updateDisplay();
                break;

            case R.id.button7:
                runningTotal = runningTotal + prices.get(7);
                updateDisplay();
                break;

            case R.id.button8:
                runningTotal = runningTotal + prices.get(8);
                updateDisplay();
                break;

            case R.id.button9:
                runningTotal = runningTotal + prices.get(9);
                updateDisplay();
                break;

            case R.id.button10:
                runningTotal = runningTotal + prices.get(10);
                updateDisplay();
                break;

            case R.id.button11:
                runningTotal = runningTotal + prices.get(11);
                updateDisplay();
                break;

            case R.id.button12:
                runningTotal = runningTotal + prices.get(12);
                updateDisplay();
                break;

            case R.id.button13:
                runningTotal = runningTotal + prices.get(13);
                updateDisplay();
                break;

            case R.id.button14:
                runningTotal = runningTotal + prices.get(14);
                updateDisplay();
                break;

            case R.id.button15:
                runningTotal = runningTotal + prices.get(15);
                updateDisplay();
                break;

            case R.id.buttonClear:
                runningTotal = 0.0;
                updateDisplay();
                break;




        }
    }
    private void updateDisplay() {
        display.setText(Double.toString(runningTotal));
    }
}
