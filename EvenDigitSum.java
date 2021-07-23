import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

public class EvenDigitSum {


    public static int getEvenDigitSum(int number) {

        int even = 0; //creating the values fir both even and last integer  needed.
        int last = 0;


        if (number < 0) {        //If statement so user does not include any negative values. 

            System.out.println(" Invalid Value");
            return -1;    //Code will end here if the value is less than 0.


        }

        for (int i = 0; number != 0; number /= 10) {   //for loop that was created.   Used the basic i  for index , number will not equal zero !=0 and number /= will result in the results for number after done. 
            
            


            last = number % 10;   //will get the remainder once number is divided by 10. 


            if (last % 2 == 0) {    // If the value is not able to be divided by two then it's not a even value.


                even += last; 


            }


        }


        return even;

    }










    


public static void main(String args[]){

    System.out.println(getEvenDigitSum(252));



}








}










