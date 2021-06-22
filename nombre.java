import java.util.Scanner;

public class nombre{
   public static void main (String arg[]){
       Scanner tem=new Scanner(System.in);
       String nomb;
       String ape;
       System.out.println("ingrese su nombre");
       nomb=tem.nextLine();
       System.out.println("ingrese su apellido");
       ape=tem.nextLine();
       System.out.println("hola mi  nombre es: "+nomb);
       System.out.println("mi apellido es: "+ape);
       
}
}