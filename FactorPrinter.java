public class FactorPrinter {
    public static void printFactors(int number) {

        

        if (number < 1) { //Setting anything less than 1 is unneeded. 

            System.out.println("Invalid Value");


        } else if (number >= 1) {


            for (int i = 1; i <= number; i++) { //For loop that will display everything from 1-6. Started i off at 1 so  0 will not be added.  


                if (number % i == 0) //if number and i rendered no remainders then i will be displayed. I.e. 9 =1 ,3, 9 
                    

                    System.out.println(i);


            }


        }


    }




public static void main(String args[]){


    printFactors(1);




}











}
