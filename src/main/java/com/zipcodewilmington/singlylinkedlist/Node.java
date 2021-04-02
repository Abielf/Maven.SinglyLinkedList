package com.zipcodewilmington.singlylinkedlist;

public class Node<T> {
    T data;
    Node<T> next=null;
    //Make before property for double linked lists

    public Node(T savedData){
        data=savedData;
    }

    //this would be used with an insert method of some kind?
    Node(T savedData, Node nextInList){
        data=savedData;
        next=nextInList;
    }

    public T getData(){return data;}
    public void setData(T t){data=t;}

    public void setNext(Node<T> n){next=n;}

    public Node getNext(){return next;}
}
