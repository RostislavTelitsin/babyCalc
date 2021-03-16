package tel.rostel.mycalc;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public Double nnum1_meaning, nnum2_meaning, result_meaning;
    public EditText num1_frame, num2_frame;
    public TextView result_frame;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1_frame = (EditText)findViewById(R.id.num1); //first variable input
        num2_frame = (EditText)findViewById(R.id.num2); //second variable input
        result_frame = (TextView)findViewById(R.id.result); //result variable input

    }
// if "+" pressed
    @SuppressLint("SetTextI18n")
    public void plusButtonClik (View v) {
        getData();
        result_meaning =nnum1_meaning + nnum2_meaning;
        result_frame.setText(Double.toString(result_meaning));
    }

// if "-" pressed
    @SuppressLint("SetTextI18n")
    public void minusButtonClik (View v) {
        getData();
        result_meaning = nnum1_meaning - nnum2_meaning;
        result_frame.setText(Double.toString(result_meaning));
    }

    // if "*" pressed
    @SuppressLint("SetTextI18n")
    public void multButtonClik (View v) {
        getData();
        result_meaning =nnum1_meaning * nnum2_meaning;
        result_frame.setText(Double.toString(result_meaning));
    }

    // if ":" pressed
    @SuppressLint("SetTextI18n")
    public void divButtonClik (View v) {
        getData();
        result_meaning =nnum1_meaning / nnum2_meaning;
        result_frame.setText(Double.toString(result_meaning));
    }


//Method to get data for calculation
    private void getData () {
//trying to get data 1
        try {
            nnum1_meaning = Double.parseDouble(num1_frame.getText().toString());
//if getting data is impossible, variable = 0
        } catch (NumberFormatException e) {
            nnum1_meaning = (double) 0;
        }
//trying to get data 2
        try {
            nnum2_meaning = Double.parseDouble(num2_frame.getText().toString());
//if getting data is impossible, variable = 0
        } catch (NumberFormatException e) {
            nnum2_meaning = (double) 0;
        }
    }

}