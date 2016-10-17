/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenanombres;

/**
 *
 * @author alvaro
 */
import java.util.Arrays;
public class OrdenaNombres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
                //int j=0;j<args.length;j++
        for(String j : args) {
            //int i=0;i<args[i].length;i++
            for(int i=0; i<j.length(); i++) {
                if (args[i].compareTo(args[i+1])>0) {
                    String aux;
                    aux=args[i];
                    args[i]=args[i+1];
                    args[i+1]=aux;
                }   
            }
        }
        for (String i : args) {
            System.out.println
        (i + ", ");
        }
        /*String[] nombres = {"Pepe", "Juan", "Alex",
            "Julian", "Francisco", "Luis"};
        
        Arrays.sort(nombres);
        
        for (String i : nombres) {
            System.out.println
        (i + ", ");
        }*/
    }
    
    /*public void ordenar(args[]) {
        for(int j=0;j<args.length();j++) {
            for(int i=0;i<args.charAt(i-j);i++) {
                if (args[i].compareTo(args[j.[i]])>0) {
                    String aux;
                    aux=args[i];
                    args[i]=args[i+1];
                    args[i+1]=aux;
                }
            }
        }
    }*/
    
}
