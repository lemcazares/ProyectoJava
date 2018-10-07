import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Caja caja = new Caja();
    Scanner sc = new Scanner(System.in);
    System.out.println("### BIENVENIDO A LA PREBEMART ###");
    System.out.println("¿Qué desea comprar?");
    for(int i = 1;i<3;i++){
      System.out.println("Producto " + i + ":");
      caja.ingresarProducto();
    }
    caja.pagar();
    System.out.println("¿Que desea hacer?");
    System.out.println("\t1) Quitar producto");
    int opcion = sc.nextInt();
    switch(opcion){
      case 1:
        System.out.println("HOla esta es la opcion 1");
    }
  }

}
