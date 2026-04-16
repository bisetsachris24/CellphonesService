package com.pluralsight;


import javax.swing.*;
import java.util.Scanner;
public class  cellphoneApp {

    public static Scanner theScanner = new Scanner(System.in);

    public static void main(String[] args) {

        cellPhone thePhone = new cellPhone();

        System.out.println(" What is the serial number");
        int serialNumber= theScanner.nextInt();
        thePhone.setSerialNumber(serialNumber);
        theScanner.nextLine();

        System.out.println("What's the model is the phone");
        String model= theScanner.nextLine();
        thePhone.setModel(model);

        System.out.println(" What is the carrier");
        String carrier=theScanner.nextLine();
        thePhone.setCarrier(carrier);

        System.out.println(" What is your phone number? ");
        String phoneNumber=theScanner.nextLine();
        thePhone.setPhoneNumber(phoneNumber);

        System.out.println("Who is the owner of the phone?");
        String owner = theScanner.nextLine();
        thePhone.setOwner(owner);


        System.out.println(thePhone.toString());








    }
}

