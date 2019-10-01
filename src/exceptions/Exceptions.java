package exceptions;

import javax.swing.JOptionPane;
public class Exceptions {

    public static void main(String[] args) {
        operaciones();
    }
    public static void operaciones(){
        int resultado;
        try {
        int numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese 1re numero"));
        int numero1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese 2do numero"));
        if(numero<10 && numero1<10){
        resultado=numero/numero1;
        JOptionPane.showMessageDialog(null,"Resultado: "+ resultado);
        }
        else{
        JOptionPane.showMessageDialog(null,"El numero ingresado es mayor a 10");
        }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"Ingreso una cadena de letras: "+e);
        }
        catch(ArithmeticException ex){
        JOptionPane.showMessageDialog(null,"Esta dividiendo por 0"+ ex.getMessage());
        }
    }
    
}
