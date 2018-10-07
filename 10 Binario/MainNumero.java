/**

 * Esta clase hereda de la clase numero, aqui se encuentra el main

 * @author: Enrique Martinez Cazares

 * @author: Hector Cabello

 * @author: Christian Sanchez
 
 * @version: Octubre 5, 2018

 */


import java.util.ArrayList;

public class MainNumero extends Numero {


public static void main(String[] args) {

        ArrayList<Numero> MazapanDelaRosa = new ArrayList<Numero>();
        int paletapollito = 0;
        for (int i = 0; i < args.length; i++) {

                paletapollito = Integer.parseInt(args[i]);

                MazapanDelaRosa.add(new Numero(paletapollito));
        }

        MazapanDelaRosa.trimToSize();

        String bubulubuena = "";

        for(Numero n4: MazapanDelaRosa) {

                bubulubuena = n4.Convertir(n4);
                n4.setNumeroBinario(bubulubuena);
        }

        int b;
        for(Numero n4: MazapanDelaRosa) {
                b=0;
                for (int i =0; i < n4.getNumeroBinario().length(); i++) {

                        if(n4.getNumeroBinario().charAt(i) == '1') {
                                b++;
                                n4.setUnos(b);
                        }
                }
                System.out.println(n4.getNumeroBinario() + " <-- " +n4.getNumeroDec());
        }

        int arreglo[] = new int[args.length];
        int k, i=0;
        for(Numero n7: MazapanDelaRosa) {
                k = n7.getUnos();
                arreglo[i] = k;
                i++;
        }

        Repetidos(arreglo);
        System.out.println();



        int arreglo2[] = new int[args.length];
        int l = 0;
        for(k=0;k<arreglo.length;k++){
          if(arreglo[k] != 0){
            arreglo2[l] = arreglo[k];
            l++;
          }
        }

int arreglo3[] = new int[l];
for(k=0;k<l;k++){
  if(arreglo2[k] != 0){
    arreglo3[k] = arreglo2[k];

  }
}

String tamalitosVerdes = "";

for(i=0; i<arreglo3.length;i++){
for(Numero elPanaderoConElPan:MazapanDelaRosa){

  if(elPanaderoConElPan.getUnos() == arreglo3[i]){
    tamalitosVerdes = tamalitosVerdes + " " + elPanaderoConElPan.getNumeroBinario();

  }
}
System.out.println(tamalitosVerdes + " <-- "+ arreglo3[i]);
tamalitosVerdes = "";
}


}

public static int[] Repetidos( int[] arreglo ) {


        int paletaPayaso = arreglo.length;

        for ( int i = 0; i < paletaPayaso; i++ ) {
                for ( int j = 0; j < ( paletaPayaso - 1 ); j++ ) {

                        if ( i != j ) {
                                if ( arreglo[ i ] == ( arreglo[ j ] )) {
                                        arreglo[ j ] = 0;
                                }
                        }
                }
        }
        return arreglo;
}
}
