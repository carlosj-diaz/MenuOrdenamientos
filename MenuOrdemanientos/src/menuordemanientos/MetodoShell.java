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
public class MetodoShell {
    
  public void metodoShell(){
        
    String b;
    int salir=1;
    int t=0;
   t=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite los datos"));
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
                         metodoOrdenacionShell(numeros);
        
              }if(b.equals("4")){
              salir=0;
              }

              }catch(Exception ex){
              JOptionPane.showMessageDialog(null,"Ingrese los datos correspondientes");
              }
              }while(salir==1);
    
    }
     public static void metodoOrdenacionShell(int A[]){
          int salto, aux, i;
          boolean cambios;
          for(salto=A.length/2; salto!=0; salto/=2){
          cambios=true;
          while(cambios){ 
          cambios=false;
          for(i=salto; i< A.length; i++) 
          if(A[i-salto]>A[i]){ 
          aux=A[i]; 
          A[i]=A[i-salto];
          A[i-salto]=aux;
          cambios=true; 
              }
            }
          }
       }
     }

