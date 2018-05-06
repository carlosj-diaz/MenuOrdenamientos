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
public class MetodoQuicksort {
  public void metodoQuicksort(){
        
    String b;
    int salir=1;
    int t=0;
   t=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite los de datos "));
    int [] numeros=new int[t];        
           do{ 
             try{
              b=JOptionPane.showInputDialog("1 Insertar datos\n2 Listar\n3 Ordenar\n4 Regresar al menu anterior");
               if(b.equals("1")){        
               for(int i = 0;i<t;i++){
               numeros[i]=Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese numero"));
               }
              }if(b.equals("2")){
               for(int i = 0;i<t;i++){
               JOptionPane.showMessageDialog(null,numeros[i]);
               }
              }if(b.equals("3")){
                  for(int A=0;A<5;A++){
                         metodoOrdenacionQuicksort(numeros,0,numeros.length-1);
                  }
              }if(b.equals("4")){
              salir=0;
              }

             }catch(Exception ex){
              JOptionPane.showMessageDialog(null,"Ingrese los datos correspondientes");
                  }
          }while(salir==1);
    }
    public static void metodoOrdenacionQuicksort(int array[],int primero, int ultimo){
      int izquierda = primero;
      
      int derecha = ultimo;
      System.out.println("la derecha es " +derecha);
      System.out.println("la izquierdad es " +derecha);
      if (izquierda>= ultimo) {
          return;
      }
      int mitad = array[(izquierda + derecha) / 2];
      System.out.println("la mitad es " +mitad);
      while (izquierda< derecha) {
          while (izquierda<derecha && array[izquierda] < mitad) {
              izquierda++;
          }
          while (izquierda<derecha && array[derecha] > mitad) {
              derecha--;
          }
          if (izquierda< derecha) {
              int T = array[izquierda];
              array[izquierda] = array[derecha];
              array[derecha] = T;
          }
      }
      if (derecha < izquierda) {
          int T = derecha;
          derecha = izquierda;
          izquierda = T;
      }
      metodoOrdenacionQuicksort(array, primero, izquierda);
   } 
}

