public class FactorPrinter {
    public static void printFactors(int number) {

        int factorthingy = 0;

        if (number < 1) {

            System.out.println("Invalid Value");


        } else if (number >= 1) {


            for (int i = 1; i <= number; i++) {


                if (number % i == 0)

                    System.out.println(i);


            }


        }


    }




public static void main(String args[]){


    printFactors(1);




}











}
