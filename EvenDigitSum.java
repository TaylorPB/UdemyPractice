import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

public class EvenDigitSum {


    public static int getEvenDigitSum(int number) {

        int even = 0;
        int last = 0;


        if (number < 0) {

            System.out.println(" Invalid Value");
            return -1;


        }

        for (int i = 0; number != 0; number /= 10) {


            last = number % 10;


            if (last % 2 == 0) {


                even += last;


            }


        }


        return even;

    }










    


public static void main(String args[]){

    System.out.println(getEvenDigitSum(252));



}








}










