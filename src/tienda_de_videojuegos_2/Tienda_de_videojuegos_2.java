
package tienda_de_videojuegos_2;
import java.util.Scanner;
public class Tienda_de_videojuegos_2 {

    
    public static void main(String[] args) {
        Scanner polo = new Scanner(System.in);
       int opcion=0,m;
       double total_a_pagar,porcentaje,descuento,descuentoaplicado;
       double a,b,i = 0,j,k,l,c = 0,d = 0,e=0,f=0,g=0,h=0;
       double Agame,Bgame,Cgame,Dgame,Egame,Fgame;
      Agame = 40;
      Bgame = 20;
      Cgame = 25;
      Dgame = 36;
      Egame = 59;
      Fgame = 28;
      String sino;
      
        System.out.println("Cuantos clientes han entrado");
       m = polo.nextInt();
        
        for (int af = 1; af <= m; af++) {
        System.out.println("Hola cliente#"+m+" bienvenido a nuestra pequeña tienda de videojuegos");
   
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
                    a = polo.nextDouble();
                    
                      c = Agame * a;
                    System.out.println("El subtotal es de: "+ c);   
                   
                    break;
                case 2:
                    System.out.println("Hollow Knight cuesta: 20.00");
                    System.out.println("Cuantas copias desea ");
                    b = polo.nextDouble();
                    
                       d = Bgame * b;
                    System.out.println("El subtotal es de: "+ d);   
                    break;
                case 3:
                    System.out.println("Carrion cuesta: 25.00");
                    System.out.println("Cuantas copias desea ");
                    i = polo.nextDouble();
                    
                       e = Cgame * i;
                    System.out.println("El subtotal es de: "+ e);  
                    break;
                case 4:
                    System.out.println("Cross Code : 36.00");
                    System.out.println("Cuantas copias desea ");
                    j = polo.nextDouble();
                    
                      f = Dgame * j;
                    System.out.println("El subtotal es de: "+ f);   
                    break;
                    
                    case 5:
                    System.out.println("Red Dead Redemption: 59.00");
                    System.out.println("Cuantas copias desea ");
                    k = polo.nextDouble();
                    
                      g = Egame *k;
                    System.out.println("El subtotal es de: "+ g);   
                    break;
                 
                    case 6:
                    System.out.println("Dantes Inferno: 28.00");
                    System.out.println("Cuantas copias desea ");
                    l = polo.nextDouble();
                    
                      h = Fgame * l;
                    System.out.println("El subtotal es de: "+ h);   
                    break;
                default:
                    throw new AssertionError();
            }
            System.out.println(" Desea comprar otro juego [s/n]");
            sino = polo.next();
            } while ("s".equals(sino));
      
total_a_pagar = c+d+e+f+g+h;

         System.out.println("Cliente#" + m);              
         System.out.println(" El total del juego 1 es: "+ c);
         System.out.println(" El total del juego 2 es: "+ d);
         System.out.println(" El total del juego 3 es: "+ e);
         System.out.println(" El total del juego 4 es: "+ f);
         System.out.println(" El total del juego 5 es: "+ g);
         System.out.println(" El total del juego 6 es: "+ h);

        System.out.println(" El total a pagar es:"+ total_a_pagar);
        if (total_a_pagar>=100) {
            
            descuento =   total_a_pagar * 10/100 ;
            descuentoaplicado = total_a_pagar - descuento ;
            System.out.println("Se le ha aplicado un descuento del 10% ahora su total a pagar es: " + descuentoaplicado);
            
        }

        
        }
               
    }
    
}
