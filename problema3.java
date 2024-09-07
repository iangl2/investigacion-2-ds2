/**
 * problema3
 */
import javax.swing.JOptionPane;

public class problema3 {
    public static void punto1() {
        //aquí trabajo yo 
        System.out.println("hello world this the first method");
    }
    public static void punto2() {
        //aqui trabaja Raul
        System.out.println("hello world this the second method");

    }
    public static void main(String[] args) {
        //Raul estuvo aqui
        String [] options={"Problema 1", "Problema 2", "Salir"};
        while (true) {
            var selection= JOptionPane.showOptionDialog(null, "Discount Percentage: ", 
            "Select a Discount Option", 0, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

            switch (selection) {
                case 0 -> punto1();
                case 1 -> punto2();
                default -> {
                    return;
                }
            }
        }
    }
}