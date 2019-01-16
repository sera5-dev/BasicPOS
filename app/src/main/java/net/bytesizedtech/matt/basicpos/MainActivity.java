package net.bytesizedtech.matt.basicpos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView display;
    TextView displayChange;
    EditText amountPaid;
    Double runningTotal;
    public Button button1;
    public Button button2;
    public Button button3;
    public Button button4;
    public Button button5;
    public Button button6;
    public Button button7;
    public Button button8;
    public Button button9;
    public Button button10;
    public Button button11;
    public Button button12;
    public Button button13;
    public Button button14;
    public Button button15;
    public static ArrayList<Double> prices = new ArrayList<Double>(15){
        {
            for (int i = 0; i < 15; i++) {
                add(0.0);
            }
        }
    };
    public static ArrayList<String> buttonLabels = new ArrayList<String>(15) {
        {
            for (int i = 0; i < 15; i++) {
                add("");
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonClear = findViewById(R.id.buttonClear);
        buttonClear.setOnClickListener(this);
        Button buttonEditItems = findViewById(R.id.buttonEditItems);
        buttonEditItems.setOnClickListener(this);
        display = findViewById(R.id.display);
        displayChange = findViewById(R.id.displayChange);
        amountPaid = findViewById(R.id.amountPaid);
        amountPaid.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if (event.getAction() == KeyEvent.ACTION_DOWN)
                {
                    switch (keyCode)
                    {
                        case KeyEvent.KEYCODE_DPAD_CENTER:
                        case KeyEvent.KEYCODE_ENTER:
                            calcChange();
                            return true;
                        default:
                            break;
                    }
                }
                return false;
            }
        });
        button1 = findViewById(R.id.button1);
        button1.setOnClickListener(this);
        button1.setText(buttonLabels.get(0));
        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(this);
        button2.setText(buttonLabels.get(1));
        button3 = findViewById(R.id.button3);
        button3.setOnClickListener(this);
        button3.setText(buttonLabels.get(2));
        button4 = findViewById(R.id.button4);
        button4.setOnClickListener(this);
        button4.setText(buttonLabels.get(3));
        button5 = findViewById(R.id.button5);
        button5.setOnClickListener(this);
        button5.setText(buttonLabels.get(4));
        button6 = findViewById(R.id.button6);
        button6.setOnClickListener(this);
        button6.setText(buttonLabels.get(5));
        button7 = findViewById(R.id.button7);
        button7.setOnClickListener(this);
        button7.setText(buttonLabels.get(6));
        button8 = findViewById(R.id.button8);
        button8.setOnClickListener(this);
        button8.setText(buttonLabels.get(7));
        button9 = findViewById(R.id.button9);
        button9.setOnClickListener(this);
        button9.setText(buttonLabels.get(8));
        button10 = findViewById(R.id.button10);
        button10.setOnClickListener(this);
        button10.setText(buttonLabels.get(9));
        button11 = findViewById(R.id.button11);
        button11.setOnClickListener(this);
        button11.setText(buttonLabels.get(10));
        button12 = findViewById(R.id.button12);
        button12.setOnClickListener(this);
        button12.setText(buttonLabels.get(11));
        button13 = findViewById(R.id.button13);
        button13.setOnClickListener(this);
        button13.setText(buttonLabels.get(12));
        button14 = findViewById(R.id.button14);
        button14.setOnClickListener(this);
        button14.setText(buttonLabels.get(13));
        button15 = findViewById(R.id.button15);
        button15.setOnClickListener(this);
        button15.setText(buttonLabels.get(14));


        display.setText("$0.0");
        displayChange.setText("$0.0");
        runningTotal = 0.0;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button1:
                updateDisplay(0);
                break;
            case R.id.button2:
                updateDisplay(1);
                break;
            case R.id.button3:
                updateDisplay(2);
                break;
            case R.id.button4:
                updateDisplay(3);
                break;
            case R.id.button5:
                updateDisplay(4);
                break;
            case R.id.button6:
                updateDisplay(5);
                break;
            case R.id.button7:
                updateDisplay(6);
                break;
            case R.id.button8:
                updateDisplay(7);
                break;
            case R.id.button9:
                updateDisplay(8);
                break;
            case R.id.button10:
                updateDisplay(9);
                break;
            case R.id.button11:
                updateDisplay(10);
                break;
            case R.id.button12:
                updateDisplay(11);
                break;
            case R.id.button13:
                updateDisplay(12);
                break;
            case R.id.button14:
                updateDisplay(13);
                break;
            case R.id.button15:
                updateDisplay(14);
                break;
            case R.id.buttonClear:
                runningTotal = 0.0;
                displayChange.setText("$0.0");
                amountPaid.setText("");
                updateDisplay(-1);
                break;
            case R.id.buttonEditItems:
                Intent intent = new Intent(this, ItemSetting.class);
                startActivity(intent);
                break;
        }
    }
    private void updateDisplay(int indexOfPrice) {
        if (indexOfPrice != -1) {
            runningTotal = runningTotal + prices.get(indexOfPrice);
        }
        display.setText("$" + String.format(Double.toString((double)Math.round(runningTotal * 100d) / 100d
                )));
    }
    private void calcChange() {
        displayChange.setText("$" + Double.toString((double)Math.round((Double.parseDouble(amountPaid.getText().toString()) - runningTotal) * 100d) / 100d));
    }
}
