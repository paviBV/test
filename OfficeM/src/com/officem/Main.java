package com.officem;

import com.officem.manager.Manager;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Manager manager = new Manager();
        Scanner sc = new Scanner(System.in);
        int Option = 0;
        do {

            System.out.println("Please enter the Option");
            System.out.println("Option 1: Add");
            System.out.println("Option 2: Display");
            System.out.println("Option 3: Update");
            System.out.println("Option 4: Search");
            System.out.println("Option 5: Delete");
            Option = sc.nextInt();

            if(Option==1){
                System.out.println("Please enter the Details of the record");
                System.out.println("Please enter the Id");
                int id = sc.nextInt();
                System.out.println("Please enter the Name");
                String name = sc.next();
                System.out.println("Please enter the Rank");
                int rank = sc.nextInt();
                manager.setOfficeMain(id, name, rank);

            }
            if(Option==2){
                manager.fetch();
            }
            if(Option==3){
                System.out.println("Please enter the Details for updation");
                System.out.println("Please enter the Id");
                int id = sc.nextInt();
                System.out.println("Please enter the Name");
                String name = sc.next();
                System.out.println("Please enter the Rank");
                int rank = sc.nextInt();
                manager.updateRecord(id,name,rank);
            }
            if(Option==4){
                System.out.println("Please enter the Id to Search a record");
                int id = sc.nextInt();
                manager.fetchSingleRecord(id);
            }
            if(Option==5){
                System.out.println("Please enter the Id to delete a record");
                int id = sc.nextInt();
                manager.deleteRecord(id);
                System.out.println("Records in Table after Deletion");
                manager.fetch();
            }

            
        } while ( Option != 6);

    }
}
