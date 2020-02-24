package MyContactList;
import myLinkedListOperations.myLinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        myLinkesList linkesList1 = new myLinkedList();
        myTasks tasks1 = new myTasks();
        System.out.println("Welcome to ritika's contact list application");
        System.out.println("press 1 to add a new contact");
        System.out.println("press 2 to view to all contact");
        System.out.println("press 3 to seach a contact");
        System.out.println("press 4 to delete a contact");
        System.out.println("press 5 to exit program");
        int choice = Integer.parseInt(sc.nextLine());
        if(choice ==1) {
            tasks1.addContact(myLinkedList);
            choice = Integer.parseInt(sc.nextLine());
        }
        if(choice == 2){
            myTasks.viewContact(myLinkedist);
            choice = Integer.parseInt(sc.nextLine());
        }
        if(choice == 3){
            myTasks.seachContact(myLinkedList);
            choice = Integer.parseInt(sc.nextLine());
        }
        if(choice == 4){
            myTasks.deleteContact(myLinkedList);
            choice = Integer.parseInt(sc.nextLine());
        }
        if(choice == 5){
            System.out.println("Application terminated");
        }
    }
}
