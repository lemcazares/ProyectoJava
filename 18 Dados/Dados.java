import java.util.Random;
/**

 * Esta clase obtiene la grafica de los dados

 * @author: Christian Sánchez Olvera

 * @version: 05/10/2018

 */



public class Dados {
	public static void main(String[] args) {
	Random dados = new Random();
	
	int v2=0,v3=0,v4=0,v5=0,v6=0,v7=0,v8=0,v9=0,v10=0,v11=0,v12=0;

	for (int i = 0; i<100; i++){
		
	int intdados = dados.nextInt(11)+2;

	if (intdados == 12) {
			v12+=1;
		}
	else if (intdados == 11) {
		v11+=1;
	}
	else if (intdados == 10) {
		v10+=1;
	}
	else if (intdados == 9) {
		v9+=1;
	}
	else if (intdados == 8) {
		v8+=1;
	}
	else if (intdados == 7) {
		v7+=1;
	}
	else if (intdados == 6) {
		v6+=1;
	}
	else if (intdados == 5) {
		v5+=1;
	}
	else if (intdados == 4) {
		v4+=1;
	}
	else if (intdados == 3) {
		v3+=1;
	}
	else if (intdados == 2) {
		v2+=1;
	}

	}
	
		System.out.println("DOCE: "+v12);
		System.out.println("ONCE: "+v11);
		System.out.println("DIEZ: "+v10);
		System.out.println("NUEVE: "+v9);
		System.out.println("OCHO: "+v8);
		System.out.println("SIETE: "+v7);
		System.out.println("SEIS: "+v6);
		System.out.println("CINCO: "+v5);
		System.out.println("CUATRO: "+v4);
		System.out.println("TRES: "+v3);
		System.out.println("DOS: "+v2);

	int graf12[] = new int[20];
	int graf11[] = new int[20];
	int graf10[] = new int[20];
	int graf9[] = new int[20];
	int graf8[] = new int[20];
	int graf7[] = new int[20];
	int graf6[] = new int[20]; 
	int graf5[] = new int[20];
	int graf4[] = new int[20];
	int graf3[] = new int[20];
	int graf2[] = new int[20];

	for (int i=0; i<v12 ; i++ ) {
				graf12[i]=0;			
	}		

	System.out.print("12:	");
	for (int i=0; i<v12 ; i++ ) {
				System.out.print(graf12[i]); 			
	}
	System.out.println();

	for (int i=0; i<v11 ; i++ ) {
				graf11[i]=0;			
	}		
	System.out.print("11:	");
	for (int i=0; i<v11 ; i++ ) {
				System.out.print(graf11[i]); 			
	}
	System.out.println();

	for (int i=0; i<v10 ; i++ ) {
				graf10[i]=0;			
	}		
	System.out.print("10:	");
	for (int i=0; i<v10 ; i++ ) {
				System.out.print(graf10[i]); 			
	}
	System.out.println();

	for (int i=0; i<v9 ; i++ ) {
				graf9[i]=0;			
	}		
	System.out.print("9:	");
	for (int i=0; i<v9 ; i++ ) {
				System.out.print(graf9[i]); 			
	}
	System.out.println();

	for (int i=0; i<v8 ; i++ ) {
				graf8[i]=0;			
	}		
	System.out.print("8:	");
	for (int i=0; i<v8 ; i++ ) {
				System.out.print(graf8[i]); 			
	}
	System.out.println();

	for (int i=0; i<v7 ; i++ ) {
				graf7[i]=0;			
	}		
	System.out.print("7:	");
	for (int i=0; i<v7 ; i++ ) {
				System.out.print(graf7[i]); 			
	}
	System.out.println();

	for (int i=0; i<v6 ; i++ ) {
				graf6[i]=0;			
	}		
	System.out.print("6:	");
	for (int i=0; i<v6 ; i++ ) {
				System.out.print(graf6[i]); 			
	}
	System.out.println();

	for (int i=0; i<v5 ; i++ ) {
				graf5[i]=0;			
	}		
	System.out.print("5:	");
	for (int i=0; i<v5 ; i++ ) {
				System.out.print(graf5[i]); 			
	}
	System.out.println();

	for (int i=0; i<v4 ; i++ ) {
				graf4[i]=0;			
	}		
	System.out.print("4:	");
	for (int i=0; i<v4 ; i++ ) {
				System.out.print(graf4[i]); 			
	}
	System.out.println();

	for (int i=0; i<v3 ; i++ ) {
				graf3[i]=0;			
	}		
	System.out.print("3:	");
	for (int i=0; i<v3 ; i++ ) {
				System.out.print(graf3[i]); 			
	}
	System.out.println();

	for (int i=0; i<v2 ; i++ ) {
				graf2[i]=0;			
	}		
	System.out.print("2:	");
	for (int i=0; i<v2 ; i++ ) {
				System.out.print(graf2[i]); 			
	}
	System.out.println();


	}

	
}