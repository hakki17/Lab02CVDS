package edu.eci.cvds.patterns.archetype;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("====================================\n\n\n\n");

        if( args.length  <= 0){
            System.out.println("Hola desconocido, ¿Como estas?");
        }else{
            System.out.println("Este es un saludo para:");
            for(int i=0;i< args.length-1;i+=2){
                System.out.println("\t= "+args[i] + " "+args[i+1]);
            }
            if(args.length % 2==1){
                System.out.println("\t= "+args[args.length-1]);
            }
            System.out.println("\n\tEsperamos tengan un hermoso dia.");
        }

        System.out.println("\n\n\n\n====================================");
    }
}
