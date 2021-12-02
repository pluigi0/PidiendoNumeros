
package Positivos;

import javax.swing.JOptionPane;

/*
Pedir numeros hasta que se teclee uno negativo 
y mostrar cuantos numeros se han introducido.
 */
public class PedirPositivos {
    public static void main(String[] args) {
        int numero, contador = 0;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Hola introduce un numero: "));
        
        while (numero >= 0){
            
            
        contador += 1;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Hola introduce un numero: "));            
        }
        
        JOptionPane.showMessageDialog(null, "Termino el ciclo porque tecleaste un numero negativo "+numero);
        
        JOptionPane.showMessageDialog(null, "Se introducieron "+contador +" numeros");
        
    }
}
