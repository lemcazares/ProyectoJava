/**

 * Esta clase define objetos y caracteristicas de un numero con

 *un numero decimal, binario y numero de unos,

 *asi como getters, setters y contructores

 * @author: Enrique Martinez Cazares

 * @version: Octubre 5, 2018

 */


public class Numero {

private int numeroDec = 0;
private String numeroBinario;
private int unos=0;


public int getNumeroDec() {
        return numeroDec;
}


public void setNumeroDec(int numeroDec) {
        this.numeroDec = numeroDec;
}

public void setUnos(int unos){
        this.unos = unos;
}

public int getUnos(){
  return unos;
}

public String getNumeroBinario() {
        return numeroBinario;
}

public void setNumeroBinario(String numeroBinario) {
        this.numeroBinario = numeroBinario;
}

public String Convertir(Numero n1){
        String aux = "";

        aux = Integer.toBinaryString(n1.getNumeroDec());

        n1.setNumeroBinario(aux);

        return n1.getNumeroBinario();

}

	public Numero() {
		super();
	}


	public Numero(int numeroDec) {

		this.numeroDec = numeroDec;
	}
}
