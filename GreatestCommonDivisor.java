import java.util.*;
public class GreatestCommonDivisor {


    public static int getGreatestCommonDivisor(int first, int second) {
        // first and second are the parameters  
        


        // If the value is less than 10 it will result in a invalid value. 
        
        if (first < 10 || second < 10) { // | | operator  first or second can not be less 10 


            System.out.println("Invalid Value");
            return -1;

        } else {

// GRC = Greatest commeon Denominator , but GRC was my onld job.
            int grc = 1;


            System.out.println(first + " " + second + " ");
            
            //Basic for loop 
            for (int i = 1; i <= first && i <= second; i++) {

                
                //Remainders need to equal 0 to make sure there is no remainder. 
                if ((first % i == 0) && (second % i == 0))

                    grc = i;
            }


            return grc;

        }


    }








//basic print method. 

    public static void main(String args[]){


        System.out.println(getGreatestCommonDivisor(81 ,153));

            }




    }





