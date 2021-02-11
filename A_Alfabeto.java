/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a_alfabeto;

import java.util.ArrayList;

/**
 *
 * @author ESTEFANIA TAMAY
 */
public class A_Alfabeto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> letras = new ArrayList();
        ArrayList<String> codigo = new ArrayList();
        //Alfabeto
        letras.add("A");
        letras.add("B");
        letras.add("C");
        letras.add("D");
        letras.add("E");
        letras.add("F");
        letras.add("G");
        letras.add("H");
        letras.add("I");
        letras.add("J");
        letras.add("K");
        letras.add("L");
        letras.add("M");
        letras.add("N");
        letras.add("O");
        letras.add("P");
        letras.add("Q");
        letras.add("R");
        letras.add("S");
        letras.add("T");
        letras.add("U");
        letras.add("V");
        letras.add("W");
        letras.add("X");
        letras.add("Y");
        letras.add("Z");
        //Codigos
        codigo.add(".-");
        codigo.add("-...");
        codigo.add("-.-.");
        codigo.add("-..");
        codigo.add(".");
        codigo.add("..-.");
        codigo.add("--.");
        codigo.add("....");
        codigo.add("..");
        codigo.add(".---");
        codigo.add("-.-");
        codigo.add(".-..");
        codigo.add("--");
        codigo.add("-.");
        codigo.add("---");
        codigo.add(".--.");
        codigo.add("--.-");
        codigo.add(".-.");
        codigo.add("...");
        codigo.add("-");
        codigo.add("..-");
        codigo.add("...-");
        codigo.add(".--");
        codigo.add("-..-");
        codigo.add("-.--");
        codigo.add("--..");
        
        
        System.out.println("");
        A_Alfabeto.Morse( letras, codigo);
        System.out.println();

    }    
    public static void Morse(ArrayList <String> letras,ArrayList <String> codigo){
    
    System.out.println("Letras del alfabeto y su codigo morse");
   
    for(int i=0;i<26;i++){
    System.out.println(letras.get(i)+" = "+codigo.get(i));
 
        
      }
    }
    
}
