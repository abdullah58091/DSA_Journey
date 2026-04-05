package com.company.Linked_List;
public class LL {

    Node head;
    private  int size ;

    LL(){
        this.size = 0;
    }

class  Node {

    String data ;
    Node Next ;
    Node(String data){
        this.data = data;
        this.Next = null;
        size++;
    }
}

// add - first ,last
public void AddFirst (String data) {
    Node newNode = new Node(data);
    if(head == null){
        head = newNode;
        return;
    }

    newNode.Next = head;
    head = newNode;
}

public void Addlast (String data){
    Node newNode = new Node(data);
    if(head == null ){
        head = newNode;
        return;
    }
    Node currNode = head;
    while(currNode.Next  != null){
        currNode = currNode.Next;
    }

    currNode.Next = newNode;
}

// print
     public void printList (){
    if ( head == null) {
        System.out.print(" list is empty");
        return;
    }
    Node currNode = head;
    while(currNode != null){
        System.out.print(currNode.data + "  ->");
        currNode = currNode.Next;
    }

    System.out.println("Null");
}

// delete first

    public void deleteFirst(){
    if (head == null){
        System.out.println(" the list is empty ");
        return;
    }
    size--;
    head = head.Next;
    }

    // delete last
     public void deleteLast() {
         if (head == null) {
             System.out.println("the list is empty ");
             return;
         }
         size--;
         if (head.Next == null) {
             head = null;
             return;
         }

         Node secondLast = head;
         Node lastNode = head.Next;
         while (lastNode.Next != null){
             lastNode= lastNode.Next;
             secondLast = secondLast.Next;
         }
         secondLast.Next = null;
     }

     public  int getSize(){
        return size;
     }

    public static void main(String[] args) {

        LL list =  new LL();
        list.AddFirst("a");
        list.AddFirst("is");
        list.printList();

        list.Addlast("list");
        list.printList();

        list.AddFirst("This ");
        list.printList();

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();

        System.out.println(list.getSize());
        list.AddFirst("this");
        System.out.println(list.getSize());

    }
}
