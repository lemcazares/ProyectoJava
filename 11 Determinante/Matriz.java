import java.util.Scanner;
/**
*Clase Matriz
*@author Some Prebe.
*@version: 1.0.
*/
public class Matriz{
	//------------- atributos ---------------
	Scanner entrada = new Scanner(System.in);
	public int filas = 0;
	public int columnas = 0;
	public int matriz [][];
	public int dato;
//---------------- metodos -------------------
	/**
	*Constructor
	*@param n Numero de filas y columnas de la matriz
	*/
	Matriz(int n){
		this.filas = n;
		this.columnas = n;
		matriz = new int [this.filas][this.columnas];
	}

	/**
	*Getter de la matriz
	*@return Matriz
	*/
	public int[][] getMatriz(){
		return matriz;
	}

	/**
	*Método para llenar la matriz.
	*/
	public void llenarMatriz(){
		for(int i = 0; i < this.filas; i++){
			for (int j = 0; j < this.columnas; j++) {
				System.out.println("Ingresa [" + i + "] [" + j + "]" );
				dato = entrada.nextInt();
				matriz[i][j] = dato;
			}
		}
	}
	/**
	*Método que calcula el determinante de la matriz
	*@param matriz Matriz de la que se va a calcular el determinante
	*@return Determinante de la matriz
	*/
	public double calcularDeterminante(int[][] matriz){
		double det;
    	if(matriz.length == 2)
    	{
        	det = (matriz[0][0]*matriz[1][1])-(matriz[1][0]*matriz[0][1]);
        	return det;
    	}

    	double suma=0;

    	for(int i = 0; i < matriz.length; i++){
    		int [][] nm = new int [matriz.length-1][matriz.length-1];
        	for(int j=0; j < matriz.length; j++){
            	if(j != i){
                	for(int k = 1; k < matriz.length; k++){
                		int indice =- 1;
                		if(j < i)
                			indice = j;
                		else if( j > i)
                			indice=j-1;
                		nm[indice][k-1] = matriz[j][k];
                	}
                }
            }

        	if(i%2==0){
        		suma += matriz[i][0] * calcularDeterminante(nm);
        	}else{
        		suma -= matriz[i][0] * calcularDeterminante(nm);
    		}
    	}
    		return suma;
	}
}
