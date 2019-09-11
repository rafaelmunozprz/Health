/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package healthfocus;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Kevin
 */
public class funciones {
    public boolean comprobarEspaciosVacios(String variable){
        return !variable.equals("");
    }
    
    public boolean tipoNumero(String variable, int tipo){
        boolean bandera = false;
        switch(tipo){
            case 1:
                bandera = variable.matches("[0-9]{5}");
                return bandera;
            case 2:
                //El caso dos es para el ingreso de la estatura en centimetros
                Pattern p = Pattern.compile("[0-9]");
                Matcher m = p.matcher(variable);
                return m.find();
            case 3:
                //El caso dos es para el ingreso de la estatura en centimetros
                bandera = variable.matches("[0-9]{10}");
                return bandera;
            default:
                bandera = false;
                break;
        }
        return bandera;
    }
    
    
    public boolean tipoString(String variable){
        Pattern p = Pattern.compile("[a-zA-Z#.]");
        Matcher m = p.matcher(variable);
        return m.find();
    }
    
    public boolean tipoDomicilio(String variable){
        Pattern p = Pattern.compile("[a-záÁéÉíÍóÓúÚA-Z#.,]");
        Matcher m = p.matcher(variable);
        return m.find();
    }
    
    public boolean tipoCiudad(String variable){
        Pattern p = Pattern.compile("[a-zA-Z#.,]");
        Matcher m = p.matcher(variable);
        return m.find();
    }
    public void tipo(String variable){
        System.out.println(variable);
    }
}
