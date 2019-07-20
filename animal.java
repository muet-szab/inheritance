/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADIL RAZA
 */
public class animal {
    
    
   int dogn0;
    String dogname;
    String type;
    
    void talk(){
        
        System.out.println("Animal can talk");
        
        
        
    }

    public animal(int dogn0, String dogname, String type) {
        this.dogn0 = dogn0;
        this.dogname = dogname;
        this.type = type;
    }
    
    public void show(){
    System.out.println("the type of the animal is dog");
   
    System.out.println("the name of the animal is "+dogname);
    System.out.println("the  sub type of the animal is "+type);
    System.out.println("the no of the animal is "+dogn0); 
    
    }
}
