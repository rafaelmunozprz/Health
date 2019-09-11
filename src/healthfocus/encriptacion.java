/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package healthfocus;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Kevin
 */
public class encriptacion {
    public String encriptar(String palabra){
        palabra = generarPalabra256(palabra);
        char[] arreglo = palabra.toCharArray();
        for(int i = 0; i < arreglo.length; i++){
            if(arreglo[i]=='@'){
                arreglo[i]='a';
            }else{                
                arreglo[i] = (char)(arreglo[i]*2);
                arreglo[i] = (char)(arreglo[i]+2);
            }
        }
        palabra = String.valueOf(arreglo);
        return palabra;
    }
    public String desEncriptar(String palabra){
        char[] arreglo = palabra.toCharArray();
        for(int i = 0; i < arreglo.length; i++){
            if(arreglo[i]=='a'){
                arreglo[i]='@';
            }else{
                arreglo[i] = (char)(arreglo[i]-2);
                arreglo[i] = (char)(arreglo[i]/2);
            }
        }
        palabra = String.valueOf(arreglo);
        return palabra;
    }
    
    private String generarPalabra256(String palabra){
        Random rnd = new Random();
        int largoInicial;
        largoInicial = palabra.length();
        for(int i = largoInicial; i<256; i++){
            palabra=palabra+(char)(char)(48 + rnd.nextInt(118));
            if(palabra.length()>=255){
                i=255;
            }
        }
        return palabra;
    }
}
