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
        palabra = generarPalabra128(palabra);
        char[] arreglo = palabra.toCharArray();
        String[] arrayUno = palabra.split("@");
        char[] charUno = arrayUno[0].toCharArray();
        for (int i = 0; i < charUno.length; i++) {
            if(charUno[i]>=48 && charUno[i]<=57){
                charUno[i]=(char)(charUno[i]+20);
            }else if(charUno[i]>=65 && charUno[i]<=89){
                charUno[i]=(char)(charUno[i]+1);
            }else if(charUno[i]==90){
                charUno[i]='Z';
            }else if(charUno[i]>=97 && charUno[i]<=121){
                charUno[i]=(char)(charUno[i]+1);
            }else if(charUno[i]==122){
                charUno[i]='z';
            }
        }    
        palabra = String.valueOf(arreglo);
        palabra = palabra.substring(charUno.length+1);
        String primeraPalabra = String.valueOf(charUno);
        palabra = primeraPalabra + "a" + palabra;
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
        for(int i = largoInicial; i<128; i++){
            palabra=palabra+(char)(char)(48 + rnd.nextInt(74));
            if(palabra.length()>=128){
                i=128;
            }
        }
        return palabra;
    }
    private String generarPalabra128(String palabra){
        Random rnd = new Random();
        int largoInicial;
        palabra = palabra + "@";
        do{
            int numVariable;
            numVariable = rnd.nextInt(48 + rnd.nextInt(74));
            if((numVariable>=48&&numVariable<=57)||(numVariable>=65&&numVariable<=90)||(numVariable>=98&&numVariable<=122)){
                palabra=palabra+(char)numVariable;
            }
        }while(palabra.length()<=128);
        return palabra;
    }
}
