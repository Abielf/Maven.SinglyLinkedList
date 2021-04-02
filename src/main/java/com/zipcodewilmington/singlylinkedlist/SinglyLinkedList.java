package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList<T extends Comparable<T>>{
private Node<T> head=null;
private Node<T> end=null;
private int size=0;

public SinglyLinkedList(T element){
    size++;
    Node<T> n=new Node(element);
    head=n;

}

public SinglyLinkedList(){}

public void add(T t){
    size++;
    Node<T> n=new Node(t);
    if (head==null){
        head=n;
    } else if(size==2){
        head.setNext(n);
        end=n;
    } else{
        end.setNext(n);
        end=n;}
}
public boolean legalIndex(int index){
    if(index>=size||index<0){
        System.out.println("Index out of bounds");return false;
    }else return true;
}

public Node<T> findNode(int index){
    Node<T> n=head;
    for(int i=0;i<index;i++){
        n=getNext(n);
    }
    return n;
}

public T get(int index){
    if(!legalIndex(index)){return null;}
    return findNode(index).getData();
}

public void remove(int index){
    if(legalIndex(index)&&size>0){
    if(index==0){
        if(size>1){
            head=findNode(1);
        }else head=null;
    }else if(index==size-1&&size>0){end=findNode(index-1);}
    else{findNode(index-1).setNext(findNode(index+1));}
    size--;
    }
}

public Node getNext(Node<T> n){
    return n.getNext();
}
public boolean contains(T t){
    if(find(t)==-1){return false;
    } else return true;}

public int find(T t){
    for (int i = 0; i < size; i++) {
    if(findNode(i).getData()==t){return i;}
    }return -1;
}

public T getSmallest(){
    T smallest=findNode(0).getData();
    if(size>1){
        for (int i = 1; i < size; i++) {
            if(smallest.compareTo(findNode(i).getData())<1){
                smallest=findNode(i).getData();
            }
        }
    }return smallest;
}

public int size(){return size;}

public SinglyLinkedList<T> copy(){
    SinglyLinkedList<T> newOne=new SinglyLinkedList<T>();
    for (int i = 0; i < size; i++) {
        newOne.add(findNode(i).getData());
    }
    return newOne;}

    public void sort(){
            SinglyLinkedList<T> newOne=new SinglyLinkedList<T>();
            while (size>1){
                newOne.add(getSmallest());
                remove(find(getSmallest()));
            }
            for(int i=0;i<newOne.size();i++){
                add(newOne.get(i));
            }
        }
}


/*Method definitions:
copy -- returns a new linked list containing the same values
         (look up deep versus shallow copy)
sort -- sorts the list using your algorithm of choice.*/