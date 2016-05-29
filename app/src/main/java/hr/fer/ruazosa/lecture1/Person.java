package hr.fer.ruazosa.lecture1;

import java.io.Serializable;

/**
 * Created by Tiyanak on 14.3.2016..
 */
public class Person implements Serializable{

    private String firstName;
    private String lastName;

    public Person(){
        firstName = "";
        lastName = "";
    }

    public Person(String firstName, String lastName){
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }



}
