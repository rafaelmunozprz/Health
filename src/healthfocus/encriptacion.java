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
            }else if(charUno[i]>=68&&charUno[i]<=77){
                charUno[i]=(char)(charUno[i]-20);
            }else if(charUno[i]>=78 && charUno[i]<=88){
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
    public String encriptarPlan(String palabra){
        palabra = generarPlan1023(palabra);
        char[] arreglo = palabra.toCharArray();
        String[] arrayUno = palabra.split("@");
        char[] charUno = arrayUno[0].toCharArray();
        for (int i = 0; i < charUno.length; i++) {
            if(charUno[i]>=48 && charUno[i]<=57){
                charUno[i]=(char)(charUno[i]+20);
            }else if(charUno[i]>=68&&charUno[i]<=77){
                charUno[i]=(char)(charUno[i]-20);
            }else if(charUno[i]>=78 && charUno[i]<=88){
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
        String[] arregloDos = palabra.split("a");
        char[] charDos = arregloDos[0].toCharArray();
        System.out.println(arregloDos[0]);
        for(int i = 0; i < charDos.length; i++){
            if(charDos[i]>=68 && charDos[i]<=77){
                charDos[i]=(char)(charDos[i]-20);
            }else if(charDos[i]>=48 && charDos[i]<=57){
                charDos[i]=(char) (charDos[i]+20);
            }else if(charDos[i]>=78 && charDos[i]<=89){
                charDos[i]=(char)(charDos[i]-1);
            }else if(charDos[i]==90){
                charDos[i]='Z';
            }else if(charDos[i]>=97 && charDos[i]<=121){
                charDos[i]=(char)(charDos[i]-1);
            }else if(charDos[i]==122){
                charDos[i]='z';
            }
        }
        palabra = String.valueOf(charDos);
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
    private String generarPlan1023(String palabra){
        Random rnd = new Random();
        palabra = palabra + "@";
        do{
            int numVariable;
            numVariable = rnd.nextInt(48 + rnd.nextInt(74));
            if((numVariable>=48&&numVariable<=57)||(numVariable>=65&&numVariable<=90)||(numVariable>=98&&numVariable<=122)){
                palabra=palabra+(char)numVariable;
            }
        }while(palabra.length()<=1023);
        return palabra;
    }
}
