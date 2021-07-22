import sun.print.SunMinMaxPage;

public class FirstLastDigitSum {


    public static int sumFirstAndLastDigit(int number) {


        int LastDigit = number % 10;
        if (number < 0) {
            System.out.println("Invalid Value");
            return -1;


        } else if (number > 10) {


            while (number >= 10) {


                number /= 10;
            }


        } else if (number == 10) {

            number /= 10;


        } else if (number < 5 && number > 0) {

            return number;
        }


        return number + LastDigit;
    }

}



public static void main(String args[]){

    System.out.println(sumFirstAndLastDigit(02));





}





}










