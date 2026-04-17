package com.pluralsight;


import java.util.Scanner;
public class  CellphoneApp {

    public static Scanner theScanner = new Scanner(System.in);


    public static void main(String[] args) {



        CellPhone thePhone1 = new CellPhone();
        CellPhone thePhone2 = new CellPhone();
        thePhone2.setSerialNumber(1);
        thePhone2.setOwner("Amani");
        thePhone2.setModel("Iphone 14");
        thePhone2.setCarrier("Cricket");
        thePhone2.setPhoneNumber("9032155817");



        System.out.println(" What is the serial number");
        int serialNumber= theScanner.nextInt();
        thePhone1.setSerialNumber(serialNumber);
        theScanner.nextLine();

        System.out.println("What's the model is the phone");
        String model= theScanner.nextLine();
        thePhone1.setModel(model);

        System.out.println(" What is the carrier");
        String carrier=theScanner.nextLine();
        thePhone1.setCarrier(carrier);

        System.out.println(" What is your phone number? ");
        String phoneNumber=theScanner.nextLine();
        thePhone1.setPhoneNumber(phoneNumber);

        System.out.println("Who is the owner of the phone?");
        String owner = theScanner.nextLine();
        thePhone1.setOwner(owner);

       display(thePhone1);
       display(thePhone2);




    thePhone2.dial("9032155817");
    thePhone2.dial(thePhone1.getOwner());


    }

    public static void display(CellPhone thePhone){
        System.out.println("owner: " + thePhone.getOwner());
        System.out.println("carrier: " + thePhone.getPhoneNumber());
        System.out.println("Model: " + thePhone.getModel());
        System.out.println("Phone number: " + thePhone.getPhoneNumber());
        System.out.println("Serial number: " + thePhone.getSerialNumber());
    }

}

