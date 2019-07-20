/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADIL RAZA
 */
public class Man {
    public static void main(String args[]){
    
//    animal animal1=new animal(1,"pask","asad");// Animal Refrences with new object
//    animal animal2=new dog(3, " dog3"," tummy");// A%nimal refrences but with dog object
//    
//    animal1.talk(); //animal class
//    animal2.talk();// Dog class
//    
    dog dog1=new dog(1," dog2"," dubby");
    dog1.show();
    System.out.println();
     dog dog2=new dog(2," toomy ","tummy");
     dog2.show();
     animal animal3=new animal(3,"tummy","dog");
     
     
       System.out.println();
     animal3.show();
     
     
     
    }
    
}
