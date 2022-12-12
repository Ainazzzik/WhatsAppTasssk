package impl;

import classes.Person;

import java.util.*;

public class PersonImpl implements PersonService {
    private final List<Person> persons = new ArrayList<>();

    @Override
    public void createPerson() {
        System.out.println("ID: ");
        String ID = new Scanner(System.in).nextLine();
        System.out.println("Fullname: ");
        String fullName = new Scanner(System.in).nextLine();
        System.out.println("Date of birth: ");
        String dateOfBirth = new Scanner(System.in).nextLine();
        System.out.println("Region: ");
        String region = new Scanner(System.in).nextLine();
        System.out.println("Gender: ");
        String gender = new Scanner(System.in).nextLine();

    }


    }




