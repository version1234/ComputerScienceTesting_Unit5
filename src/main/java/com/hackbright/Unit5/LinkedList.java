package com.hackbright.Unit5;

public class LinkedList {

    static Node head;
    LinkedList(){
        head=null;
    }

//    static class Node {
//
//        int data;
//        Node next;
//
//        Node(int d) {
//            data = d;
//            next = null;
//        }
//    }

    Node addNode(Node node){
        if (head!=null){
            Node currentNode=head;
            while(currentNode.next!=null){
                currentNode=currentNode.next;
            }
            currentNode.next=node;
        }else{
            head=node;
        }
        return head;
    }


    /* Function to reverse the linked list */
    Node reverse(Node node) {
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }

    void printList(Node node)
    {
        while (node != null) {
            System.out.print(node.data + "->");
            node = node.next;
        }
    }
}