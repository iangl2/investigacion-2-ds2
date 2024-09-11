/**
 * problema3
 */
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class problema3 {
    public static void punto1(float num, int cant) {
        //aquí trabajo yo 

      
        JOptionPane.showMessageDialog(null, 
        "La suma es: "+
        String.format("%."+cant+"f", num +cant)
        +"\nLa resta es: "+
        String.format("%."+cant+"f", num -cant)
        +"\nLa multiplicacion es: "+
        String.format("%."+cant+"f", num *cant)
        , "Result", JOptionPane.INFORMATION_MESSAGE);
        

    }
    public static void punto2() {
        //aqui trabaja Raul
        // branch test
        System.out.println("hello world this the second method");

    }
    public static void main(String[] args) {
        //Raul estuvo aqui
        String [] options={"Problema 1", "Problema 2", "Salir"};
        while (true) {
            var selection= JOptionPane.showOptionDialog(null, "Discount Percentage: ", 
            "Select a Discount Option", 0, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
            try {
                
                switch (selection) {
                    case 0 -> {
                        String decimal = JOptionPane.showInputDialog("Introduzca el numero a redondear");
                        float decimalNum=Float.parseFloat(decimal);
                        String cantidad = JOptionPane.showInputDialog("Introduzca la cantidad de decimales a redondear");
                        int cantidadNum=Integer.parseInt(cantidad);
                        punto1(decimalNum,cantidadNum);
                        
                    }
                    case 1 -> punto2();
                    default -> {
                        return;
                    }
                }
            } 

                catch (HeadlessException | NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Introduzca un tipo de dato valido!","ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
}