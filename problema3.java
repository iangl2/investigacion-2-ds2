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
        int ind=0, cont=0, reset;
        float notas[] =new float[5], promedio=0, n_mayor=0, n_menor=0;
        String[] opciones  ={"Siguiente", "Cancelar"};
        String rango1="", rango2="", rango3="", rango4="";
        do {
            reset=1;            
               var opcion = JOptionPane.showOptionDialog(null, "Bienvenido al libro de calificaciones para \n Introducción a la Programación", "Libro de Calificaciones", 0, 3, null, opciones, opciones[0]);
                if (opcion == 0) {
                    try {                        
                        for (ind = 0; ind < 5; ind++) {
                            cont=ind+1;
                            String nota = JOptionPane.showInputDialog("Entre la nota del estudiante "+cont+" (1.0-5.0)");
                            notas[ind] = Float.parseFloat(nota);  
                            if(notas[ind]>=1 && notas[ind]<=5)
                                promedio = promedio + notas[ind];
                            else{
                                throw new Exception();
                            }
                        }
                        n_menor=notas[0];
                        for(ind =0;ind<5;ind++){
                            if(notas[ind]<n_menor)
                                n_menor=notas[ind];                            
                            if(notas[ind]>n_mayor)
                                    n_mayor=notas[ind];
                            if (notas[ind]>=1&&notas[ind]<=2.0) {
                                rango1+="*";            
                            }                                
                            if (notas[ind]>=2.1&&notas[ind]<=3.0) {
                                rango2+="*";
                            }
                            if (notas[ind]>=3.1&&notas[ind]<=4.0) {
                                rango3+="*";                             
                            } 
                            if (notas[ind]>=4.1&&notas[ind]<=5.0) {
                                rango4+="*"; 
                            }    
                        }          
                        promedio=(float) (promedio/5.0);
                        JOptionPane.showMessageDialog(null, "Bienvenido al libro de calificaciones para \nIntroducción a la Programación\n\nLas Calificaciones son: \n\nEstudiante 1: "+notas[0]+"\nEstudiante 2: " +notas[1]
                        +"\nEstudiante 3: "+notas[2]+"\nEstudiante 4: "+notas[3]+"\nEstudiante 5: "+notas[4]+ String.format("\n\nEl promedio de la clase es: %.1f",promedio)+"\nLa nota más baja es: "+n_menor+"\nLa nota más alta es: "+n_mayor+
                        "\n\nDistribución de calificaciones: \n1.0-2.0: "+rango1+"\n2.1-3.0: "+rango2+"\n3.1-4.0: "+rango3+"\n4.1-5.0: "+rango4);                    
                    } catch (Exception e) {
                        reset = JOptionPane.showConfirmDialog(null, "Uno de los datos entrados no es válido o no está dentro del rango. ¿Intentar de nuevo?", "Error", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
                    } 
                                        
                }            
        } while (reset==0);        
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