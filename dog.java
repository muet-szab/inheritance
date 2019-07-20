/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADIL RAZA
 */
public class dog extends animal {

    public dog(int dogn0, String dogname, String type) {
        super(dogn0, dogname, type);
        
    }
    
   
   @Override
   void talk (){
    
    
    System.out.println("dog can talk");
    System.out.println("dog can bite also");}

//    /**
//     *
//     * @param type
//     * @param name
//     * @param no
//     */
//    public dog(String type,String name,int no ) {
//        this.dogn0=no;
//        this.dogname=name;
//        this.type=type;
//        
//        
//    }
    
    public void show(){
    
    System.out.println("the name of the dog is "+dogname);
    System.out.println("the Type  of the dog is "+type);
    System.out.println("the nomber of the dog is "+dogn0);
    
    
    }
    
}
