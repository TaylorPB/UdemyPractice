import com.sun.javafx.image.BytePixelSetter;  //Import I fat fingered into my code.

public class Person {


    private String firstName;
    private String lastName;                 //Setting the variables
    private int age;

public void setFirstName(String firstName){
    this.firstName=firstName;
}
public String getFirstName(){
    return firstName;
}
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
public String getLastName(){
    return lastName;
}
public void setAge( int age){
    this.age = age;




}
public int getAge() {


    if(age <0 || age > 100 || age == 0) {   // if someone is less than 0 or equal to 0 it will return a 0 in the results.


        age = 0;

    }



return age;


}
public boolean isTeen(){
    if(age > 12 && age < 20){     //Checks to see if the user is a teenager
        return true;
    }
    return false;
}
public String getFullName(){
    if(firstName.isEmpty() && lastName.isEmpty()){   // Puts firstName and Last name together and will spit out an error is both(either or) variables are empty 
        return "";
    }
    else if(firstName.isEmpty()){
        return lastName;
    }
    else if(lastName.isEmpty()){
        return firstName;
    }
    else
    return firstName +" " +  lastName;
}

}


class Check{







// Basic main class checker
    
    public static void main(String args[]){


        Person p = new Person();

        p.setFirstName("Jasper");
        p.setLastName("Park");
        p.setAge(-5);




        System.out.println("FullName= " + p.getFullName());
        System.out.println("Age= " + p.getAge());
        System.out.println("teen= " + p.isTeen());






    }





}
