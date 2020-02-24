
        System.out.println("enter your email address:");
        scanner.nextLine();

        while (true) {

            String temp = scanner.nextLine();

            if (temp.matches("^[a-z]+[0-9]*@[a-z]+\\.[a-z]+$")) {

                linkedList1.addLast(new Person(firstName, lastName, linkedList, temp));

                break;

            } else {

                System.out.println("Invalid email address ! Enter again");

            }

        }

    }


    ppackage MyContactList;
        import myLinkedListOperation.myLinkedList;
        import person.myperson;
        import java.util.Scanner;
        import java.util.LinkedList;

        public class myTasks {
            Scanner sc = new Scanner(Sytem.in);
            LinkedList<String> linkedList = new LinkedList<>();



            public void addContact(myLinkedList linkedList){
                System.out.println("you have to choosen to add a new contact: \n"+
                        "please enter the name of the person");
                System.out.println("FirstName :");
                String FirstName sc.nextLine().trim();
                while(true){
                    if (FirstName.matches("[A-Za-z")){
                        break ;
                    }
                    else{
                        System.out.println("please enter correct name");
                    }
                    FirstName = sc.nextLine().trim();
                }
                System.out.println("contact Number :");
                while(true){
                    string contact = sc.nextLine().trim();
                    if(contact.matches("[0-9]{10}")) {
                        linkedList.add(contact);
                        break;
                    }
                }
                while(true)
                {
                    System.out.println("would you like to add another contact number ?(y/n) :");
                    char choice = sc.next().charAt(0);
                    if(choice == 'y'){
                        System.out.println("contact Number: ");
                        String contactNumber1 = sc.nextLine().trim();
                        while(true){
                            if(contactNumber1.matches("[0-9]{10}")) {
                                linkedList.add(contactNumber1);
                                break;
                            }
                            else{
                                System.out.println("add correct number");
                            }
                        }
                    }
                    else{
                        break;
                    }
                }ublic void viewcontact(LinkedList1 linkedList1) {

        System.out.println("---Here are all your contacts---");

        if (!linkedList1.isEmpty()) {

            linkedList1.display();

        } else {

            System.out.println("NO results found");

        }

    }


    public void deleteContact(LinkedList1 linkedList1) {

        if (!linkedList1.isEmpty()) {

            System.out.println("Here are all the contacts: Press the number against" +

                    " to delete the contact.");

            linkedList1.displayOne();

            int choice = scanner.nextInt();

            scanner.nextLine();

            linkedList1.deleteNode(choice);

            linkedList1.displayOne();

            System.out.println("Deleted..!!");

        } else {

            System.out.println("No Contacts.You must need to add contacts Before you could delete..");

        }

    }


    public void searchContact(LinkedList1 linkedList1) {

        System.out.println("You could search for a contact from their first names: ");

        String firstName = scanner.nextLine().trim();

        if (linkedList1.indexOf(firstName) >= 0) {

            System.out.println("Match found");

            linkedList1.getNode(linkedList1.indexOf(firstName));

        } else {

            System.out.println("No match found");

        }
}

