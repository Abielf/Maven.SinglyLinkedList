package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {

    @Test
    public void testNode(){

        Node bs=new Node("Dumbfuckery");
        Assert.assertTrue(bs.getData() instanceof String);
    }

    @Test
    public void testNode2(){
        Node bs=new Node("");
        Assert.assertTrue(bs instanceof Node);
    }

    @Test
    public void singlyLinkedNullConstructor(){
        SinglyLinkedList whatever=new SinglyLinkedList();
        Assert.assertTrue(whatever instanceof SinglyLinkedList);
    }
    @Test
    public void testGetString(){
        String expected="Working?";
        SinglyLinkedList whatevs=new SinglyLinkedList (expected);
        Assert.assertEquals(expected, whatevs.get(0));
    }
    @Test
    public void testGetNumber(){
        int expected=59;
        SinglyLinkedList whatevs=new SinglyLinkedList (expected);
        Assert.assertEquals(expected, whatevs.get(0));
    }
    @Test
    public void testAdd1(){
        SinglyLinkedList whatever=new SinglyLinkedList();
        String expected="Now we're cooking!";
        whatever.add(expected);
        Assert.assertEquals(whatever.get(0), expected);
    }

    @Test
    public void testAdd2(){
        SinglyLinkedList whatever=new SinglyLinkedList();
        String expected="Now we're cooking!";
        whatever.add("No, not this one fam.");
        whatever.add(expected);
        whatever.add("Swing and a miss");
        whatever.add("Some bullshit");
        whatever.add("Some bullshit");
        whatever.add("Some bullshit");
        whatever.add("Some bullshit");
        whatever.add(expected);
        Assert.assertEquals(expected, whatever.get(7));
    }

    @Test
    public void testSize(){
        SinglyLinkedList whatever=new SinglyLinkedList();
        int expected=6;
        whatever.add(9);
        whatever.add(8);
        whatever.add(9);
        whatever.add(8);
        whatever.add(9);
        whatever.add(8);
        Assert.assertEquals(expected, whatever.size());
    }

    @Test
    public void testAddGetInt(){
        SinglyLinkedList whatever=new SinglyLinkedList();
        int expected=9;
        whatever.add(12);
        whatever.add(8);
        whatever.add(7);
        whatever.add(8);
        whatever.add(9);
        whatever.add(8);
        Assert.assertEquals(expected, whatever.get(4));
    }
    @Test
    public void testAddOutOfBounds(){
        SinglyLinkedList whatever=new SinglyLinkedList();
        Integer expected=null;
        whatever.add(12);
        Assert.assertEquals(expected, whatever.get(4));
    }
    @Test
    public void testAddOutOfBounds2(){
        SinglyLinkedList whatever=new SinglyLinkedList();
        Integer expected=null;
        whatever.add(12);
        Assert.assertEquals(expected, whatever.get(-2));
    }

    @Test
    public void testRemove(){
        SinglyLinkedList whatever=new SinglyLinkedList();
        int expected=8;
        whatever.add(5);
        whatever.add(6);
        whatever.add(7);
        whatever.add(8);
        whatever.add(9);
        whatever.remove(0);
        whatever.remove(0);
        Assert.assertEquals(expected, whatever.get(1));
    }

    @Test
    public void testRemove1(){
        SinglyLinkedList whatever=new SinglyLinkedList();
        int expected=3;
        whatever.add(5);
        whatever.add(6);
        whatever.add(7);
        whatever.add(8);
        whatever.add(9);
        whatever.remove(4);
        whatever.remove(3);
        whatever.remove(4);
        whatever.remove(4);
        Assert.assertEquals(expected, whatever.size());
    }

    @Test
    public void testRemove2(){
        SinglyLinkedList whatever=new SinglyLinkedList();
        int expected=2;
        whatever.add(5);
        whatever.add(6);
        whatever.add(7);
        whatever.add(8);
        whatever.add(9);
        whatever.remove(2);
        whatever.remove(2);
        whatever.remove(2);
        whatever.remove(2);
        Assert.assertEquals(expected, whatever.size());
    }

    @Test
    public void testContains(){
        SinglyLinkedList whatever=new SinglyLinkedList();
        whatever.add(5);
        whatever.add(6);
        whatever.add(7);
        whatever.add(8);
        whatever.add(9);
        Assert.assertTrue(whatever.contains(6));
    }
    @Test
    public void testContains2(){
        SinglyLinkedList whatever=new SinglyLinkedList();
        whatever.add(5);
        whatever.add(6);
        whatever.add(7);
        whatever.add(8);
        whatever.add(9);
        Assert.assertFalse(whatever.contains(80));
    }
    @Test
    public void testFind(){SinglyLinkedList whatever=new SinglyLinkedList();
        int expected=3;
        whatever.add(5);
        whatever.add(6);
        whatever.add(7);
        whatever.add(8);
        whatever.add(9);
    Assert.assertEquals(expected,whatever.find(8));}
    @Test
    public void testFind2(){
        SinglyLinkedList whatever=new SinglyLinkedList();
        int expected=0;
        whatever.add(5);
        whatever.add(6);
        whatever.add(7);
        whatever.add(8);
        whatever.add(9);
        Assert.assertEquals(expected,whatever.find(5));}
    @Test
    public void testFind3(){
        SinglyLinkedList whatever=new SinglyLinkedList();
        int expected=4;
        whatever.add(5);
        whatever.add(6);
        whatever.add(7);
        whatever.add(8);
        whatever.add(9);
        Assert.assertEquals(expected,whatever.find(9));}

    @Test
    public void testFind4(){
        SinglyLinkedList whatever=new SinglyLinkedList();
        int expected=-1;
        whatever.add(5);
        whatever.add(6);
        whatever.add(7);
        whatever.add(8);
        whatever.add(9);
        Assert.assertEquals(expected,whatever.find(89));}

    @Test
    public void testCopy(){
        SinglyLinkedList whatever=new SinglyLinkedList();
        whatever.add(5);
        whatever.add(6);
        whatever.add(7);
        whatever.add(8);
        whatever.add(9);
        SinglyLinkedList blurgyWurgyWoo=whatever.copy();
        Assert.assertEquals(8, blurgyWurgyWoo.get(3));}

        @Test
    public void testSort(){
            SinglyLinkedList whatever=new SinglyLinkedList();
            whatever.add(103);
            whatever.add(6);
            whatever.add(92);
            whatever.add(8);
            whatever.add(4);
            whatever.sort();
            Assert.assertEquals(4,whatever.get(0));
        }

}


