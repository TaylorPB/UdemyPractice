import com.sun.javafx.image.BytePixelSetter;

public class Person {


    private String firstName;
    private String lastName;
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


    if(age <0 || age > 100 || age == 0) {


        age = 0;

    }



return age;


}
public boolean isTeen(){
    if(age > 12 && age < 20){
        return true;
    }
    return false;
}
public String getFullName(){
    if(firstName.isEmpty() && lastName.isEmpty()){
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