/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca1;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 *
 * @author micha
 */
public class LinkedList implements Iterable {

    
    
    private Node first;
    private Node last;
    
    private int size;
    
    //the first slot of the list is empty
   public LinkedList(){
       first = last = null;
   }
   
   // checks if the list has anything in it.
   public boolean isEmpty(){
       return first == null;
   }
   
   //this method add new element to the list
   public void addToEnd(String data){
       //create a node obj to hold the data to be parsed in for storage
       Node newNode = new Node(data);
       
       
       //if the list is empty, insert the new node as the first element
       
       if(isEmpty()){
           first = newNode;
       }
       //if the list is not empty, find the end of the slots and add it there 
       else{
           //this block loops through till it gets to the end
           
           //if there is another element present in the slot, continue the loop
           Node current = first;
           while(current.hasNext()){
               //set current to the next node
               current = current.next;
           }
           
           //now point the original to the new one
           current.next = newNode;
       }
       //incrememnt the size of the nodes available in the slot
       size++;
   }
   
   //incase we want to add to the first slot instead of adding it to the 
   //last slot.
   public void addFirst(String data){
       //holds the the new data to be stored
       Node newNode = new Node(data);
       //if there is no element in the slot
       //newNode is set as the first
       
       if(isEmpty()){
           first = newNode;
           
       }
       
       else{
            // Otherwise, insert our new node in front of the current first one
            // set our new node to point to the original first element
            newNode.next = first;
            // Set the list's first element to be our new node
            first = newNode;
       }
        // Increase the number of nodes in the list
        size++;
   }
   
    @Override
    public Iterator iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void forEach(Consumer cnsmr) {
        Iterable.super.forEach(cnsmr); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Spliterator spliterator() {
        return Iterable.super.spliterator(); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * The Node class create a container to store data within , it is variable
     * to store the data and pointer pointing towards the next on
     *
     */
    private static class Node {

        private String data;
        private Node next;

        // Constructor takes in the data to be stored
        // It should set the next node in the list to be null
        // as this node is not connected to anything yet
        public Node(String data) {
            next = null;
            this.data = data;
        }

        // Handy method to let us check if there's anything connected to this node
        // Lets us check if this is the last one in the list
        public boolean hasNext() {
            return next != null;
        }
    }

}
