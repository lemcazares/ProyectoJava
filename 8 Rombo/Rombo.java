/**

 * Esta clase dibuja un rombo con las filas indicadas por el usuario desde la terminal

 * @author: Enrique Martinez Cazares

 * @author: Hector Cabello

 * @author: Christian Sanchez

 * @version: Octubre 5, 2018

 */

public class Rombo {

public int filas;



public static String Linea(int cont){

        String aster = "";
        aster = new String(new char[cont]).replace("", "*"+" ");
        return aster;
}

public static String Tab(int cont){

        String tabu = "";
        tabu = new String(new char[cont]).replace("", " ");
        return tabu;
}



public static void DibujarSup(int filas){
        int cont = (filas-1);
        String rombito1 = "";
        for (int i = 0; i <= (filas-1); i++) {
                rombito1 = Tab(cont) + Linea(i);
                cont--;
                System.out.println(rombito1);

        }
}

public static void DibujarInf(int filas){
        int cont = 1;
        String rombito = "";
        for (int i = (filas-2); i >= 0; i--) {
                rombito = Tab(cont) + Linea(i);
                cont++;
                System.out.println(rombito);

        }
}


public void Dibujar(int filas){
        DibujarSup(filas);
        DibujarInf(filas);
}


public static void main(String[] args) {

        Rombo r1 = new Rombo();

        int lineas = Integer.parseInt(args[0]);
        r1.Dibujar(lineas);

}
}
