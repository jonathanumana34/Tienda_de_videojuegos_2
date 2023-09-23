
package tienda_de_videojuegos_2;
import java.util.Scanner;

public class Tienda_de_videojuegos_2 {

    

 
    public static void main(String[] args) {
        Scanner polo = new Scanner(System.in);
       int opcion=0,m,i;
       double total_a_pagar,porcentaje,descuento,descuentoaplicado;
       double Agame;
       double cantidad,subtotal,copias;
       i=0;
       subtotal = 0;
   copias =0;
      String sino;
      
        System.out.println("Cuantos clientes han entrado");
       m = polo.nextInt();
        
        for (int af = 1; af <= m; af++) {
        System.out.println("Hola cliente#"+af+" bienvenido a nuestra pequeña tienda de videojuegos");
   
            
         do {            
        System.out.println("Blasphemous (1)");
        System.out.println("Hollow Knight (2)"); 
        System.out.println("Carrion (3)");
        System.out.println("Cross Code (4)");
        System.out.println("Red Dead Redemption (5)");
        System.out.println(" Dantes Inferno (6) ");
        System.out.println(" Elija cualquier juego que desee");
        opcion = polo.nextInt();
        
            switch (opcion) {
                case 1: System.out.println("Blasphemous cuesta: 40.00");
                    System.out.println("Cuantas copias desea ");
                    cantidad = polo.nextDouble();
                    Agame = 40;
                      subtotal += Agame * cantidad;
                      copias=copias+ cantidad;
                    System.out.println("El subtotal es de: "+ subtotal);   
                    break;
                case 2:
                    System.out.println("Hollow Knight cuesta: 20.00");
                    System.out.println("Cuantas copias desea ");
                    cantidad = polo.nextDouble();
                    Agame = 20;
                    subtotal += Agame * cantidad;
                    System.out.println("El subtotal es de: "+ subtotal);
                    copias=copias+ cantidad;
                    break;
                case 3:
                    System.out.println("Carrion cuesta: 25.00");
                    System.out.println("Cuantas copias desea ");
                    cantidad = polo.nextDouble();
                    Agame = 25;
                    subtotal += Agame * cantidad;
                    System.out.println("El subtotal es de: "+ subtotal);
                    copias=copias+ cantidad;
                    break;
                case 4:
                    System.out.println("Cross Code : 36.00");
                    System.out.println("Cuantas copias desea ");
                    cantidad = polo.nextDouble();
                    Agame = 36;
                      subtotal += Agame * cantidad;
                    copias=copias+ cantidad;
                    System.out.println("El subtotal es de: "+ subtotal);   
                    break;
                    case 5:
                    System.out.println("Red Dead Redemption: 59.00");
                    System.out.println("Cuantas copias desea ");
                    cantidad = polo.nextDouble();
                     Agame = 59;
                      subtotal += Agame * cantidad;
                    System.out.println("El subtotal es de: "+ subtotal);
                    copias=copias+ cantidad;

                    break;
                    case 6:
                    System.out.println("Dantes Inferno: 28.00");
                    System.out.println("Cuantas copias desea ");
                    cantidad = polo.nextDouble();
                    Agame = 28;
                    subtotal+= Agame * cantidad;
                    System.out.println("El subtotal es de: "+ subtotal);
                    copias=copias+ cantidad;
                    break;
                default:
                    throw new AssertionError();
            }
            System.out.println(" Desea comprar otro juego [s/n]");
            sino = polo.next();
          
            } while ("s".equals(sino));
     
         System.out.println("Cliente#" + af);              
         System.out.println(" El total de copias vendidas es: " + copias);
         if (i<m) {
                System.out.println("El total de clientes atendidos es:" + af);
            }
        total_a_pagar = subtotal;
        System.out.println(" El total a pagar es:"+ subtotal);
        if (total_a_pagar>=100) {
            descuento =   total_a_pagar * 10/100 ;
            descuentoaplicado = total_a_pagar - descuento ;
            System.out.println("Se le ha aplicado un descuento del 10% ahora su total a pagar es: " + descuentoaplicado);
        }
           if (sino !="si") {
                 subtotal =0;
                 copias =0;
             }

        }          
    }   
}

