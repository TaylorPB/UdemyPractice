import java.util.*;
public class GreatestCommonDivisor {


    public static int getGreatestCommonDivisor(int first, int second) {


        if (first < 10 || second < 10) {


            System.out.println("Invalid Value");
            return -1;

        } else {


            int grc = 1;


            System.out.println(first + " " + second + " ");
            for (int i = 1; i <= first && i <= second; i++) {

                if ((first % i == 0) && (second % i == 0))

                    grc = i;
            }


            return grc;

        }


    }










    public static void main(String args[]){


        System.out.println(getGreatestCommonDivisor(81 ,153));

            }




    }





