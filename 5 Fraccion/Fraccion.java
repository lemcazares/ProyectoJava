/**

 * Esta clase define una fraccion con numerador y getDenominador

 *y define los metodos de reduccion

 * @author: Enrique Martinez Cazares

 * @author: Hector Cabello

 * @author: Christian Sanchez

 * @version: Octubre 5, 2018

 */



public class Fraccion {

private int numerador;
private int denominador;


public int getNumerador() {
        return numerador;
}


public void setNumerador(int numerador) {
        this.numerador = numerador;
}

public int getDenominador() {
        return denominador;
}


public void setDenominador(int denominador) {
        this.denominador = denominador;
}

public Fraccion Reducir(Fraccion f1){

        int a = 0, b = 0, c = 0, i = 2, d = 0;

        if (f1.getNumerador() >= f1.getDenominador()) {
                a = f1.getDenominador();
                b = f1.getNumerador();
                c = 1;
                d = f1.getNumerador();
        }
        else{
                a = f1.getNumerador();
                b = f1.getDenominador();
                c = 0;
                d = f1.getDenominador();
        }
        do {


                if(a%i == 0 && b%i == 0) {
                        a = a/i;
                        b = b/i;
                }
                else{

                        if(i == d ) {
                                break;
                        }
                        else{
                                i++;
                        }

                }
        } while((a % b) != 0);

        if(c == 0) {

                f1.setNumerador(a);
                f1.setDenominador(b);
        }
        else{
                f1.setNumerador(b);
                f1.setDenominador(a);
        }

        return f1;
}


public Fraccion() {
}

public Fraccion(int numerador, int denominador) {

        this.numerador = numerador;
        this.denominador = denominador;
}
}
