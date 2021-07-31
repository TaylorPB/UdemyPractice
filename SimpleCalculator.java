import java.util.*;
public class SimpleCalculator {
    private double  firstNumber;
    private double secondNumber;

//Setting up both variables first and second number

public void setFirstNumber(double firstNumber){

    this.firstNumber = firstNumber;

    
    // Setting the first and second number through  
    

}


public void setSecondNumber(double secondNumber) {

    this.secondNumber = secondNumber;


}


public double getFirstNumber(){

    return firstNumber;

    }

public double getSecondNumber(){

    return secondNumber;
// Getting the variables 


}

// Addition, Subtraction, Division and Multiplication methods with a return value.

public double getAdditionResult() {


    return firstNumber + secondNumber;

}


    public double getSubtractionResult() {


        return firstNumber - secondNumber;

    }

    public double getMultiplicationResult() {


        return firstNumber * secondNumber;

    }


    public double getDivisionResult() {


    if(secondNumber == 0 ) {


        return 0;

    }


    else {

        return firstNumber / secondNumber;
    }

    }





}



class Checker {


public static void main(String args[]){
Scanner sc = new Scanner(System.in);

SimpleCalculator calculator = new SimpleCalculator();
calculator.setFirstNumber(5.25);
calculator.setSecondNumber(0);


    System.out.println(calculator.getDivisionResult());





}

}
