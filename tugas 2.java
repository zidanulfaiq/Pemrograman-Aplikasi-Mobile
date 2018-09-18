/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author ZIDAN
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  
    int umur = 23;
        String paras ="cantik";
        String brain ="gakpintargpp";
        
        if(paras=="cantik" && brain=="pintar" &&(umur >=20 && umur <=23)){
            System.out.println("jawabannya : pasti mau");
        }
        else if(brain=="gakpintargpp" &&(paras=="cantik"&& (umur >=20 && umur <=23))){
            System.out.println("jawabannya : ok lah");
        }
        else if(paras=="cantik"&& umur>=23){
            System.out.println("jawabannya : saya pikir dulu");
        }
        else{
            System.out.println("I Dont Agree!!");
        }
}
    
}
