/**

 * Esta clase contiene al main y define los atributos de un objeto Cifrado

 *con la frase  cifrada y descifrada, el desplazamiento y los abecedarios

 * @author: Enrique Martinez Cazares

 * @version: Octubre 5, 2018

 *@return Objeto Cifrado

 */


import java.util.Scanner;

public class Cifrado {

//----------------Atributos de un objeto Cifrado---------------------------


private String fraseCifrada = "";
private String fraseDescifrada = "";
private int cont = 3;

private String abcMinus = "abcdefghijklmnñopqrstuvwxyz";
private String abcMayus = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";


// --------------------Getters y Setters de Atributos-----------------------

//Dejo comentado el contador porque no se va a mofificar el desplazamiento
//En cuanto al String con el abecedario no coloque Setters porque no se
//va a modificar la cadena

public String getFraseCifrada() {
        return fraseCifrada;
}

public void setFraseCifrada(String fraseCifrada) {
        this.fraseCifrada = fraseCifrada;
}


public String getFraseDescifrada() {
        return fraseDescifrada;
}


public void setFraseDescifrada(String fraseDescifrada) {
        this.fraseDescifrada = fraseDescifrada;
}


public int getCont() {
        return cont;
}

/*
public void setCont(int cont) {
        this.cont = cont;
}
*/

public String getAbcMinus() {
        return abcMinus;
}


public String getAbcMayus() {
        return abcMayus;
}

//--------------------Metodos de Clase------------------------

/*
*Con dos ciclos for se recorre y se realiza el desplazamiento
* @return String
*/

public String cifrarFrase(Cifrado f1){

        String aux = "";
        for (int i = 0; i < f1.getFraseDescifrada().length(); i++) {
                for (int j = 0; j < f1.getAbcMinus().length(); j++) {
                        if(f1.getFraseDescifrada().charAt(i) == f1.getAbcMinus().charAt(j)) {
                                if(j + cont >= f1.getAbcMinus().length()) {
                                        aux = aux + f1.getAbcMinus().charAt((j + cont) % f1.getAbcMinus().length());
                                        f1.setFraseCifrada(aux);
                                }
                                else{
                                        aux = aux + f1.getAbcMinus().charAt(j + cont);
                                        f1.setFraseCifrada(aux);
                                }
                        }
                        else if(f1.getFraseDescifrada().charAt(i) == f1.getAbcMayus().charAt(j)) {
                                if(j + cont >= f1.getAbcMayus().length()) {
                                        aux = aux + f1.getAbcMayus().charAt((j + cont)%f1.getAbcMayus().length());
                                        f1.setFraseCifrada(aux);
                                }
                                else{
                                        aux = aux + f1.getAbcMayus().charAt(j + cont);
                                        f1.setFraseCifrada(aux);
                                }
                        }
                }

        }

        return f1.getFraseCifrada();
}


public String DescifrarFrase(Cifrado f1){


        String aux = "";
        for (int i = 0; i < f1.getFraseCifrada().length(); i++) {
                for (int j = 0; j < f1.getAbcMinus().length(); j++) {
                        if(f1.getFraseCifrada().charAt(i) == f1.getAbcMinus().charAt(j)) {
                                if(j - cont < 0) {
                                        aux = aux + f1.getAbcMinus().charAt(26+(j-cont));
                                        f1.setFraseDescifrada(aux);
                                }
                                else{
                                        aux = aux + f1.getAbcMinus().charAt(j - cont);
                                        f1.setFraseDescifrada(aux);
                                }
                        }
                        else if(f1.getFraseCifrada().charAt(i) == f1.getAbcMayus().charAt(j)) {
                                if(j - cont < 0) {
                                        aux = aux + f1.getAbcMinus().charAt(26+(j-cont));
                                        f1.setFraseDescifrada(aux);
                                }
                                else{
                                        aux = aux + f1.getAbcMayus().charAt(j - cont);
                                        f1.setFraseDescifrada(aux);
                                }
                        }
                }

        }

        return f1.getFraseDescifrada();

}




//------------------------Main pruebas------------

public static void main(String[] args) {


        Cifrado f1 = new Cifrado();

        int opcion = Integer.parseInt(args[0]);
        Scanner reader = new Scanner(System.in);

        System.out.print("Ingresa una palabra:  ");

        String aux = reader.nextLine();


        if (opcion == 1){
          f1.setFraseDescifrada(aux);
          System.out.println(f1.cifrarFrase(f1));

        }
        else{
          f1.setFraseCifrada(aux);
          System.out.println(f1.DescifrarFrase(f1));
        }
/*
        f1.setFraseDescifrada("Hola");
        f1.setFraseCifrada("Kñrd");
        System.out.println(f1.cifrarFrase(f1));
        System.out.println(f1.DescifrarFrase(f1));
*/
}


//-----------------------Constructores---------------------


	public Cifrado() {
	}


}
