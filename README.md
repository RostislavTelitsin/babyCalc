# babyCalc
## Simple android calculator
Calculator allows to make 
| ***+*** | - | : | * |
--- | --- | --- | ---  
of 2 numbers

it implements the procedures of addition, subtraction, multiplication and division

- The example of a method to get data which user input:  
~~~
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
~~~

- The other example is a method to calculate sum of two numbers:  
~~~
// if "+" pressed
    public void plusButtonClik (View v) {
        getData();
        result_meaning =nnum1_meaning + nnum2_meaning;
        result_frame.setText(Double.toString(result_meaning));
    }
~~~
