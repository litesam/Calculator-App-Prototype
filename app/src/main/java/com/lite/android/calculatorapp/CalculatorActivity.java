package com.lite.android.calculatorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity {

    private EditText mLeftValue;
    private EditText mRightValue;
    private Button mAdditionButton;
    private Button mDivisionButton;
    private Button mSubtractionButton;
    private Button mMultiplicationButton;
    private TextView mShowAnswer;

    private float leftValue;
    private float rightValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        mShowAnswer = (TextView) findViewById(R.id.answer_text_view);

        mAdditionButton = (Button) findViewById(R.id.addition_button);
        mAdditionButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               getOperands();
               float result = leftValue + rightValue;
               mShowAnswer.setText("" + result);
           }
        });

        mSubtractionButton = (Button) findViewById(R.id.subtraction_button);
        mSubtractionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getOperands();
                float result = leftValue - rightValue;
                mShowAnswer.setText("" + result);
            }
        });

        mDivisionButton = (Button) findViewById(R.id.division_button);
        mDivisionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getOperands();
                float result = leftValue / rightValue;
                mShowAnswer.setText("" + result);
            }
        });

        mMultiplicationButton = (Button) findViewById(R.id.multiplication_button);
        mMultiplicationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getOperands();
                float result = leftValue * rightValue;
                mShowAnswer.setText("" + result);
            }
        });
    }

    public void getOperands() {
        mLeftValue = (EditText) findViewById(R.id.left_value_text_view);
        leftValue = Float.parseFloat(mLeftValue.getText().toString());

        mRightValue = (EditText) findViewById(R.id.right_value_text_view);
        rightValue = Float.parseFloat(mRightValue.getText().toString());
    }
}
