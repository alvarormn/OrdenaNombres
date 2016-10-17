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
    public static void main(String [] args) {
        // TODO code application logic here
        /*String[] nombres = {"Pepe", "Juan", "Alex",
            "Julian", "Francisco", "Luis"};
                //int j=0;j<args.length;j++
                //String j : args
        for(int j=0;j<nombres.length;j++) {
            int count = nombres[j].length();
            for(int i=0; i<count; i++) {
                System.out.println(nombres[j].charAt(i));
                String l = new StringBuilder().append("").append(nombres[j].charAt(i)).toString();
                String nextL = new StringBuilder().append("").append(nombres[j+1].charAt(i)).toString();
                System.out.println(l);
                System.out.println(nextL);
                if (l.compareTo(nextL)>0) {
                    String aux;
                    aux=nombres[i];
                    nombres[i]=nombres[i+1];
                    nombres[i+1]=aux;
                }   
            }
        }
        for (String i : args) {
            System.out.println
        (i + ", ");
        }*/
        /*String[] nombres = {"Pepe", "Juan", "Alex",
            "Julian", "Francisco", "Luis"};*/
        
        Arrays.sort(args);
        
        for (String i : args) {
            System.out.println
        (i + ", ");
        }
    }    
}
