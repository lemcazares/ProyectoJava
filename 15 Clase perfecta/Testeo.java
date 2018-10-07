/**
Esta es una descripcion muy corta de lo que hace la clase Testeo.
@author SomePrebe.
@version 1.0.
*/

import java.util.ArrayList;
import java.util.Arrays;
public class Testeo{
  public static void main(String[] args) {
    ClasePerfecta<Object> perfectaComoMayito = new ClasePerfecta<Object>();
    perfectaComoMayito.metodoGenerico();
    perfectaComoMayito.clone();
    perfectaComoMayito.equals();
    perfectaComoMayito.finalize();
    perfectaComoMayito.hashCode();
    perfectaComoMayito.toString();

    ArrayList<ClasePerfecta> arreglo = new ArrayList<ClasePerfecta>();
    int tamanio = arreglo.size();
    System.out.println(tamanio);
    for(int i=0;i<5;i++){
      arreglo.add(new ClasePerfecta());
    }
    tamanio = arreglo.size();
    System.out.println(tamanio);
    arreglo.get(0).atributo1 = 5;
    arreglo.get(1).atributo1 = 6;
    arreglo.get(2).atributo1 = 8;
    arreglo.get(3).atributo1 = 1;
    arreglo.get(4).atributo1 = 5;

    int [] enteros = new int[tamanio];
    int i = 0;
    for (ClasePerfecta a: arreglo) {
      enteros[i] = a.atributo1;
      i++;
    }
    for (int b = 0;b<5;b++) {
      System.out.print(enteros[b]+",");
    }
    System.out.println("");
    Arrays.sort(enteros);
    for (int b = 0;b<5;b++) {
      System.out.print(enteros[b]+",");
    }
    System.out.println("");
    ArrayList<ClasePerfecta> arreglo2 = new ArrayList<ClasePerfecta>();
    for (int m = 0;m<5;m++){
      for (int j = 0;j<arreglo.size();j++){
        if(arreglo.get(j).atributo1 == enteros[m]){
          arreglo2.add(arreglo.get(j));
          arreglo.remove(j);
        }
      }
    }
    System.out.println("");
    for (ClasePerfecta a : arreglo2) {
      System.out.print(a.atributo1 + ",");
    }

  }
}
