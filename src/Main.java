import impl.PersonImpl;
import impl.WhatsAppImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        commands();
        PersonImpl person = new PersonImpl();
        WhatsAppImpl whatsApp = new WhatsAppImpl();

        while (true) {
            int num = scanner.nextInt();

            switch (num) {
                case 1:
                   person.createPerson();
                    System.out.println("Passport created successfully!");
                    break;
                case 2:
                    whatsApp.createWhatsAppProfile();
                    System.out.println("Whats App profile created successfully!");
                    break;
                case 3:
                    whatsApp.changeStatus();
                    System.out.println("Whats App status changed successfully!");
                    break;
                default: {
                    System.out.println("No such command!");
                }
            }
        }
    }

   static void commands(){
       System.out.println("----------COMMANDS----------");
       System.out.println("1. Create a passport");
       System.out.println("2. Create a Whats App profile");
       System.out.println("3. Change a Whats App status");
    }
}