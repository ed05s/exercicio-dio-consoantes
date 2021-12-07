/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exe2_consoantes;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Exe2_Consoantes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        
        String[] consoantes = new String[6];
        int quantidadeConsoantes=0;
        
        int count=0;
    do{
       System.out.println("letra: ");
       String letra = scan.next();
            
       if(!(letra.equalsIgnoreCase("a") |
            letra.equalsIgnoreCase("e")|
            letra.equalsIgnoreCase("i")|
            letra.equalsIgnoreCase("o")|
            letra.equalsIgnoreCase("u"))){
           consoantes[count]=letra;
          quantidadeConsoantes++;
       }    
        count++;    
    }while(count < consoantes.length);
    
    System.out.println("Consoantes ");
    for(String consoante : consoantes){
        if(consoante != null)
        System.out.println(consoante + "");
    }
        System.out.println("Quantidade de consoantes "+ quantidadeConsoantes);
        System.out.println(consoantes.length);
  }
    
}  
