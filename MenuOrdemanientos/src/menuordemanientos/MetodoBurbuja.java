package menuordemanientos;
import javax.swing.JOptionPane;
/**
 *
 * @author carlos diaz
 */


public class MetodoBurbuja {
    public void metodoBurbuja(){
        
    String b;
    int salir=1;
    int t=0;
    t=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la canidad de datos que va a ingresar"));
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
                         metodoOrdenacionBurbuja(numeros);
              }if(b.equals("4")){
              salir=0;
               }

        }catch(Exception ex){
           JOptionPane.showMessageDialog(null,"Ingrese los datos correspondientes");
            }
    }while(salir==1);
    
    }
    static void metodoOrdenacionBurbuja(int arreglo[])
    {
        for(int i = 0; i < arreglo.length - 1; i++)
        {
            for(int j = 0; j < arreglo.length - 1; j++)
            {
                if (arreglo[j] > arreglo[j + 1])
                {
                    int tmp = arreglo[j+1];
                    arreglo[j+1] = arreglo[j];
                    arreglo[j] = tmp;
                }
            }
        }
    }
}

    