package ru.gb.homework2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

/*    private double valueOne = Double.NaN;
    private double valueTwo;


    private static final char ADDITION = '+';
    private static final char SUBTRACTION = '-';
    private static final char MULTIPLICATION = '*';
    private static final char DIVISION = '/';
    private char CURRENT_ACTION;*/

    //Buttons buttons;

    TextView resultField; // текстовое поле для вывода результата
    EditText numberField;   // поле для ввода числа
    TextView operationField;    // текстовое поле для вывода знака операции
    Double operand = null;  // операнд операции
    String lastOperation = "="; // последняя операция

    private Button button_1;
    private Button button_2;
    private Button button_3;
    private Button button_4;
    private Button button_5;
    private Button button_6;
    private Button button_7;
    private Button button_8;
    private Button button_9;
    private Button button_0;
    private Button button_clear;
    private Button button_brace;
    private Button button_percent;
    private Button button_split;
    private Button button_multiply;
    private Button button_minus;
    private Button button_plus;
    private Button button_sign;
    private Button button_point;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);


        // получаем все поля по id из activity_main.xml
        resultField =(TextView) findViewById(R.id.tvResult);
        numberField = (EditText) findViewById(R.id.etNum2);
        operationField = (TextView) findViewById(R.id.tvNum1);
        button_1 = findViewById(R.id.button_1);
        button_1.setOnClickListener(this);
        button_2 = findViewById(R.id.button_2);
        button_2.setOnClickListener(this);
        button_3 = findViewById(R.id.button_3);
        button_3.setOnClickListener(this);
        button_4 = findViewById(R.id.button_4);
        button_4.setOnClickListener(this);
        button_5 = findViewById(R.id.button_5);
        button_5.setOnClickListener(this);
        button_6 = findViewById(R.id.button_6);
        button_6.setOnClickListener(this);
        button_7 = findViewById(R.id.button_7);
        button_7.setOnClickListener(this);
        button_8 = findViewById(R.id.button_8);
        button_8.setOnClickListener(this);
        button_9 = findViewById(R.id.button_9);
        button_9.setOnClickListener(this);
        button_0 = findViewById(R.id.button_0);
        button_0.setOnClickListener(this);
        button_clear = findViewById(R.id.button_clear);
        button_clear.setOnClickListener(this);
        button_brace = findViewById(R.id.button_brace);
        button_brace.setOnClickListener(this);
        button_percent = findViewById(R.id.button_percent);
        button_percent.setOnClickListener(this);
        button_split = findViewById(R.id.button_split);
        button_split.setOnClickListener(this);
        button_multiply = findViewById(R.id.button_multiply);
        button_multiply.setOnClickListener(this);
        button_minus = findViewById(R.id.button_minus);
        button_minus.setOnClickListener(this);
        button_plus = findViewById(R.id.button_plus);
        button_plus.setOnClickListener(this);
        button_sign = findViewById(R.id.button_sign);
        button_sign.setOnClickListener(this);
        button_point = findViewById(R.id.button_point);
        button_point.setOnClickListener(this);





    }


/*    buttons.button_1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            buttons.editText.setText(buttons.editText.getText() + "1");
        }
    });*/

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button_1 :
                numberField.setText(String.format(Locale.getDefault(), "%d", 1));
                break;
            case R.id.button_2 :
                numberField.setText(String.format(Locale.getDefault(), "%d", 2));
                break;
            case R.id.button_3 :
                numberField.setText(String.format(Locale.getDefault(), "%d", 3));
                break;
            case R.id.button_4 :
                numberField.setText(String.format(Locale.getDefault(), "%d", 4));
                break;
            case R.id.button_5 :
                numberField.setText(String.format(Locale.getDefault(), "%d", 5));
                break;
            case R.id.button_6 :
                numberField.setText(String.format(Locale.getDefault(), "%d", 6));
                break;
            case R.id.button_7 :
                numberField.setText(String.format(Locale.getDefault(), "%d", 7));
                break;
            case R.id.button_8 :
                numberField.setText(String.format(Locale.getDefault(), "%d", 8));
                break;
            case R.id.button_9 :
                numberField.setText(String.format(Locale.getDefault(), "%d", 9));
                break;
            case R.id.button_0 :
                numberField.setText(String.format(Locale.getDefault(), "%d", 2));
                break;

        }
    }


    // сохранение состояния
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putString("OPERATION", lastOperation);
        if(operand!=null)
            outState.putDouble("OPERAND", operand);
        super.onSaveInstanceState(outState);
    }
    // получение ранее сохраненного состояния
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        lastOperation = savedInstanceState.getString("OPERATION");
        operand= savedInstanceState.getDouble("OPERAND");
        resultField.setText(operand.toString());
        operationField.setText(lastOperation);
    }


}