package impl;

import classes.WhatsApp;
import enums.Status;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class WhatsAppImpl implements WhatsAppService {

    private final List<WhatsApp> whatsApps = new ArrayList<>();

    @Override
    public void createWhatsAppProfile() {
        System.out.println("ID: ");
        long id = new Scanner(System.in).nextLong();
        System.out.println("Username: ");
        String userName = new Scanner(System.in).nextLine();
        System.out.println("Phone number: ");
        String phoneNumber = new Scanner(System.in).nextLine();
        System.out.println("Password: ");
        String password = new Scanner(System.in).nextLine();
        System.out.println("Status: ");
        String status = new Scanner(System.in).nextLine();

    }



    @Override
    public String changeStatus() {
            System.out.print("Write a new status : ");
            String status = new Scanner(System.in).nextLine();
        for (WhatsApp whatsApp : whatsApps) {

        }

            return " Status updated succesfully ";
    }
}
