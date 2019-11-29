/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.libraries;


import java.util.Locale;
import java.util.Scanner;


/**
 *
 * @author CicloM
 */
public final class UtilesEntrada {
    
        
    //Scan
    public static final Scanner SCN = 
	  new Scanner(System.in, "ISO-8859-1")
	  .useLocale(Locale.ENGLISH).useDelimiter("\\s+");
    
    
    //constantes
    public static final String MSG_USR = "Introducir número ....: ";
    public static final String MSG_ERR = "ERROR: Entrada incorrecta";
    public static final String MSG_OUT = "Número introducido ...: ";
    
     //Constantes 
  
    public static final String MSG_A = "Introduzca valor de a ";
    public static final String MSG_B = "Introduzca valor de b ";
    public static final String MSG_C = "Introduzca valor de c ";
    

            

    
    public static final double obtener (String msgUsr, String msgErr) {
    double numero= 0;
    boolean errorOK = true;
    do{
        try{
            System.out.print(msgUsr);
            numero = SCN.nextDouble();
            errorOK = false;
        } catch (Exception e){
            System.out.println(msgErr);
            System.out.println("---");
        } finally{
            SCN.nextLine();
        }
    }while (errorOK);
    
    return numero;
   
}
    
    public static final int leerNumero (String msgUsr, String msgErr){
        return (int) obtener (msgUsr, msgErr);
        
    }
    
 
}
