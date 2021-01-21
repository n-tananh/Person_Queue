/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personqueue;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Dell
 */


public class TheQueue {
     Queue<Person> queue = new LinkedList<Person>();
     
    public void enqueue(Person ps){
         queue.add(ps);
    }
    
    public Person dequeue(){
        if (queue.isEmpty()) {
            System.out.println("Queue empty !!!");
        } 
        return queue.poll(); 
    }
    
    public void front(){
        if (queue.isEmpty()){
            System.out.println("Queue empty !!!");
        }else{
            System.out.println(queue.peek() + " checkin");
        }
    }
    
    public int size(){
        return queue.size();
    }
 
    public void clear(){
        queue.clear();
        System.out.println("Clear successful !!!");
    }
    
    public void diplayQueue(){
        if (queue.isEmpty()) {
            System.out.println("Queue Empty !!!");
        } else {
            System.out.println("***********************");
            System.out.println("Current check in queue:");
            System.out.print("DOOR: ");
            queue.forEach(student -> {
                System.out.print(student+ " | ");
            });
        }
    }
   
}
