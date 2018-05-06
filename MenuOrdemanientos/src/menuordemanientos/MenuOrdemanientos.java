/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuordemanientos;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
/**
 *
 * @author carlos diaz
 */

public class MenuOrdemanientos {
      public static void main(String[] args) {
       // asigno variables
        int menu;
        int salir=0;
             do{
                try{
                menu=Integer.parseInt(JOptionPane.showInputDialog("Menu de ordenamientos\n1- Metodo burbuja\n2- Metodo Shell\n3-Metodo QuickSort\n4-Metodo objetos\n5-Salir "));
                switch (menu){
                    
                case 1:
                      MetodoBurbuja burbuja =new MetodoBurbuja();
                       burbuja.metodoBurbuja();
                       break;
                
                case 2:
                      MetodoShell shell =new MetodoShell();
                      shell.metodoShell();
                      break;
                      
                case 3:
                       MetodoQuicksort quickshort =new MetodoQuicksort();
                       quickshort.metodoQuicksort();
                       break;
                       
                case 4:
                      MetodoObjeto arreglos =new MetodoObjeto();
                   
                      break;
                     
                case 5:
                    
                    salir=1;
                break;
                
                default:
                    
                JOptionPane.showMessageDialog(null,"digite su opcion del 1 a 5");
                break;
                }
                
                }
                catch(HeadlessException | NumberFormatException ex){
                JOptionPane.showMessageDialog(null,"Digitar una opcion valida");
                 }
             }while(salir==0);
    } 
    
}
