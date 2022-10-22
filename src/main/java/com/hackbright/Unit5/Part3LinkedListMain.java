package com.hackbright.Unit5;

public class Part3LinkedListMain {

    public static void main(String[] args) {

        // Crate a linkedList and reverse the order and print
        LinkedList list1 = new LinkedList();
        list1.head = new Node(3);
        list1.head.next = new Node(2);
        list1.head.next.next = new Node(1);

        System.out.println("Given linked list1");
        list1.printList(list1.head);
        list1.head = list1.reverse(list1.head);
        System.out.println("");
        System.out.println("Reversed linked list1 ");
        list1.printList(list1.head);



        System.out.println("");
        System.out.println("Reversed linked list2 of a given number ");
        int num1= 123;
        LinkedList list2 = createListFromInt(num1);
        list2.printList(list2.head);


        System.out.println("");
        System.out.println("Reversed linked list3 of a given number ");
        int num2= 456;
        LinkedList list3 = createListFromInt(num2);
        list3.printList(list3.head);


        System.out.println("");
        System.out.println("Reversed linked list after adding  numbers ");
        int addedNumber = num1 + num2;
        LinkedList list4 = createListFromInt(addedNumber);
        list4.printList(list4.head);

    }

     static LinkedList createListFromInt(int num){
        LinkedList list = new LinkedList();

        while(num>0){
            int remainder = num % 10;
            list.addNode(new Node(remainder));
            num = num / 10;
        }
        return list;

    }


}
