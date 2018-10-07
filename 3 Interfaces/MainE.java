public class MainE 
{
	public static void main(String[] args) {
		System.out.println("Vamos a ver que pasa");
		Gerente juan = new Gerente("Juan",30000,"Gerente","Matutino");
		Analista pepe = new Analista("Pepe",20000,"Analista","Mixto");
		Intendencia maria = new Intendencia("Maria",12000,"Intendencia","Vespertino");

		
		juan.trabajar();
		juan.comer();
		juan.tomardecision();
		System.out.println();
		pepe.trabajar();
		pepe.comer();
		pepe.tomardecision();
		System.out.println();
		maria.trabajar();
		maria.comer();
		maria.tomardecision();

	}
}