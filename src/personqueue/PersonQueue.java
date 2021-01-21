/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personqueue;
import java.util.Scanner;


public class PersonQueue {

    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        TheQueue myqueue = new TheQueue();
        
        Person ps1 = new Person("Tony");
        Person ps2 = new Person("Huyen");
        Person ps3 = new Person("Ngoc");
        Person ps4 = new Person("Hang");
          
        myqueue.enqueue(ps1);
        myqueue.enqueue(ps2);
        myqueue.enqueue(ps3);
        myqueue.enqueue(ps4);
                      
        do {            
            System.out.println("\n________________________");
            System.out.println("""
                               1: Display
                               2: Checkin
                               3: Enqueue
                               4: Size
                               5: Clear all
                               0: Exit""");
            System.out.println("________________________");
            
            int opt = sc.nextInt();
            if (opt == 1) {
                myqueue.diplayQueue();
            }
            if (opt == 2) {
                myqueue.front();
                myqueue.dequeue();
            }
            if (opt == 3){
                System.out.print("Enter name of person: ");
                myqueue.enqueue(new Person(sc.next())); 
            }
            if (opt == 4){
                System.out.println("The queue have " + myqueue.size() + " people");
            }
            if (opt == 5){
                myqueue.clear();
            }
            if (opt == 0) break;
        } while (true);        
    }
}
