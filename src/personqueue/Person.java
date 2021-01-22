/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package personqueue;
/**
 *
 * @author Dell
 */

public class Person {

    private String name;

    public Person(String name){
        this.name=name;
    }
    
    @Override
    public String toString(){
        return name;
    }

}