package vn.com.example.caculatordemo.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import vn.com.example.caculatordemo.R;

public class MainActivity extends AppCompatActivity {

    Button btnZero, btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix, btnSeven, btnEight, btnNine,
            btnAddition, btnDivision, btnSubtraction, btnMultiplation, btnResult, btnPercent, btnDot,
            btnClear, btnSign;
    TextView txtInput, txtOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        setEvent();
    }

    private void setEvent() {

    }

    private void init() {
        btnZero = findViewById(R.id.btn_zero);
        btnOne = findViewById(R.id.btn_one);
        btnTwo = findViewById(R.id.btn_two);
        btnThree = findViewById(R.id.btn_three);
        btnFour = findViewById(R.id.btn_four);
        btnFive = findViewById(R.id.btn_five);
        btnSix = findViewById(R.id.btn_six);
        btnSeven = findViewById(R.id.btn_seven);
        btnEight = findViewById(R.id.btn_eight);
        btnNine = findViewById(R.id.btn_nine);
        btnAddition = findViewById(R.id.btn_addition);
        btnDivision = findViewById(R.id.btn_division);
        btnSubtraction = findViewById(R.id.btn_subtraction);
        btnMultiplation = findViewById(R.id.btn_multiplation);
        btnResult = findViewById(R.id.btn_result);
        btnPercent = findViewById(R.id.btn_percent);
        btnResult = findViewById(R.id.btn_result);
        btnResult = findViewById(R.id.btn_result);
        btnResult = findViewById(R.id.btn_result);
        btnResult = findViewById(R.id.btn_result);
        btnResult = findViewById(R.id.btn_result);
        btnResult = findViewById(R.id.btn_result);
    }


}
