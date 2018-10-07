/**
Metodo principal de la clase Pokemon
@author SomePrebe.
@version 1.0.
*/
import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;
public class Principal2{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Jugador red = new Jugador();
		Jugador green = new Jugador();
		ArrayList<Pokemon> iniciales = new ArrayList<Pokemon>();

		Pokemon thyploshion = new Pokemon();
		Pokemon meganium = new Pokemon();
		Pokemon feraligator = new Pokemon();
		//int numero = (int) (Math.random() * 3) + 1;
		thyploshion.setFisico(150);
		thyploshion.setEspecial(100);
		thyploshion.setNivel(36);
		thyploshion.nombre = "Thyploshion";
		thyploshion.setPp(3);
		thyploshion.setSalud(2000);
		iniciales.add(thyploshion);
		meganium.setFisico(150);
		meganium.setEspecial(100);
		meganium.setNivel(36);
		meganium.nombre = "Meganium";
		meganium.setPp(3);
		meganium.setSalud(2000);
		iniciales.add(meganium);
		feraligator.setFisico(150);
		feraligator.setEspecial(100);
		feraligator.setNivel(36);
		feraligator.nombre = "Feraligator";
		feraligator.setPp(3);
		feraligator.setSalud(2000);
		iniciales.add(feraligator);

		System.out.println("Red escoge un pokemon: ");
		System.out.println(" 1)Cyndaquil\n 2)Chicorita\n 3)Totodile");
		int opcion = sc.nextInt();
		red.pokebolas.add(iniciales.get(opcion-1));
		System.out.println("Green escoge un pokemon: ");
		System.out.println(" 1)Cyndaquil\n 2)Chicorita\n 3)Totodile");
		opcion = sc.nextInt();
		green.pokebolas.add(iniciales.get(opcion-1));
		//System.out.println("inicial Red:" + red.pokebolas.get(0).nombre);
		//System.out.println("inicial Green:" + green.pokebolas.get(0).nombre);
		ArrayList<Pokemon> pokedex = new ArrayList<Pokemon>();
		Pokemon arbok = new Pokemon();
		Pokemon exeggutor = new Pokemon();
		Pokemon xatu = new Pokemon();
		Pokemon kadabra = new Pokemon();
		Pokemon ursaring = new Pokemon();
		Pokemon masquerain = new Pokemon();
		Pokemon swalot = new Pokemon();
		Pokemon salamence = new Pokemon();
		Pokemon luxray = new Pokemon();
		Pokemon rotom = new Pokemon();
		Pokemon solrock = new Pokemon();
		Pokemon bouffalant = new Pokemon();
		Pokemon pyroar = new Pokemon();
		Pokemon armaldo = new Pokemon();
		Pokemon sneasel = new Pokemon();



		arbok.setFisico(150);
		arbok.setEspecial(100);
		arbok.setNivel(36);
		arbok.nombre = "Arbok";
		arbok.setPp(3);
		arbok.setSalud(2000);
		pokedex.add(arbok);

		exeggutor.setFisico(150);
		exeggutor.setEspecial(100);
		exeggutor.setNivel(36);
		exeggutor.nombre = "Exeggutor";
		exeggutor.setPp(3);
		exeggutor.setSalud(2000);
		pokedex.add(exeggutor);

		xatu.setFisico(150);
		xatu.setEspecial(100);
		xatu.setNivel(36);
		xatu.nombre = "Xatu";
		xatu.setPp(3);
		xatu.setSalud(2000);
		pokedex.add(xatu);

		kadabra.setFisico(150);
		kadabra.setEspecial(100);
		kadabra.setNivel(36);
		kadabra.nombre = "Kadabra";
		kadabra.setPp(3);
		kadabra.setSalud(2000);
		pokedex.add(kadabra);

		ursaring.setFisico(150);
		ursaring.setEspecial(100);
		ursaring.setNivel(36);
		ursaring.nombre = "Ursaring";
		ursaring.setPp(3);
		ursaring.setSalud(2000);
		pokedex.add(ursaring);

		masquerain.setFisico(150);
		masquerain.setEspecial(100);
		masquerain.setNivel(36);
		masquerain.nombre = "Masquerain";
		masquerain.setPp(3);
		masquerain.setSalud(2000);
		pokedex.add(masquerain);

		swalot.setFisico(150);
		swalot.setEspecial(100);
		swalot.setNivel(36);
		swalot.nombre = "Swalot";
		swalot.setPp(3);
		swalot.setSalud(2000);
		pokedex.add(swalot);

		salamence.setFisico(150);
		salamence.setEspecial(100);
		salamence.setNivel(36);
		salamence.nombre = "Salamence";
		salamence.setPp(3);
		salamence.setSalud(2000);
		pokedex.add(salamence);

		luxray.setFisico(150);
		luxray.setEspecial(100);
		luxray.setNivel(36);
		luxray.nombre = "Luxray";
		luxray.setPp(3);
		luxray.setSalud(2000);
		pokedex.add(luxray);

		rotom.setFisico(150);
		rotom.setEspecial(100);
		rotom.setNivel(36);
		rotom.nombre = "Rotom";
		rotom.setPp(3);
		rotom.setSalud(2000);
		pokedex.add(rotom);

		solrock.setFisico(150);
		solrock.setEspecial(100);
		solrock.setNivel(36);
		solrock.nombre = "Solrock";
		solrock.setPp(3);
		solrock.setSalud(2000);
		pokedex.add(solrock);

		bouffalant.setFisico(150);
		bouffalant.setEspecial(100);
		bouffalant.setNivel(36);
		bouffalant.nombre = "Bouffalant";
		bouffalant.setPp(3);
		bouffalant.setSalud(2000);
		pokedex.add(bouffalant);

		pyroar.setFisico(150);
		pyroar.setEspecial(100);
		pyroar.setNivel(36);
		pyroar.nombre = "pyroar";
		pyroar.setPp(3);
		pyroar.setSalud(2000);
		pokedex.add(pyroar);

		armaldo.setFisico(150);
		armaldo.setEspecial(100);
		armaldo.setNivel(36);
		armaldo.nombre = "Armaldo";
		armaldo.setPp(3);
		armaldo.setSalud(2000);
		pokedex.add(armaldo);

		sneasel.setFisico(150);
		sneasel.setEspecial(100);
		sneasel.setNivel(36);
		sneasel.nombre = "Sneasel";
		sneasel.setPp(3);
		sneasel.setSalud(2000);
		pokedex.add(sneasel);

		for(int i = 0;i<5 ;i++){
			System.out.println("POKEDEX: ");
			int j = 1;
			for (Pokemon p : pokedex) {
				System.out.println(j + ") " + p.nombre);
				j++;
			}
			System.out.println("Red escoge un pokemon");
			int numPokedex = sc.nextInt()-1;
			red.pokebolas.add(pokedex.get(numPokedex));
			pokedex.remove(numPokedex);
		}
		System.out.println("--------------------------------------");
		for(int i = 0;i<5 ;i++){
			System.out.println("POKEDEX: ");
			int j = 1;
			for (Pokemon p : pokedex) {
				System.out.println(j + ") " + p.nombre);
				j++;
			}
			System.out.println("Green escoge un pokemon");
			int numPokedex = sc.nextInt()-1;
			green.pokebolas.add(pokedex.get(numPokedex));
			pokedex.remove(numPokedex);
		}
		System.out.println("####### Inicia la pelea #######");
		while(red.pokebolas.size()>0 && green.pokebolas.size()>0){
			System.out.println("Red escoje un pokemon");
			System.out.println(red.pokebolas);
			int redNumero = sc.nextInt()-1;
			//Pokemon red.pokebolas.get(redNumero) = red.pokebolas.get(redNumero);
			System.out.println("Green escoje un pokemon");
			System.out.println(green.pokebolas);
			int greenNumero = sc.nextInt()-1;
			//Pokemon green.pokebolas.get(greenNumero) = green.pokebolas.get(greenNumero);
			System.out.println(green.pokebolas.get(greenNumero).getSalud()+"|"+red.pokebolas.get(redNumero).getSalud());
			while(green.pokebolas.get(greenNumero).getSalud()>0 && red.pokebolas.get(redNumero).getSalud()>0){
				System.out.println(green.pokebolas.get(greenNumero).getSalud()+"|"+red.pokebolas.get(redNumero).getSalud());
				if(red.pokebolas.get(redNumero).rand.nextInt() > green.pokebolas.get(greenNumero).rand.nextInt()){
					System.out.println("Pelea primero red");
					green.pokebolas.get(greenNumero).setSalud(green.pokebolas.get(greenNumero).getSalud()-red.pokebolas.get(redNumero).getFisico());
				}else{
					System.out.println("Green pelea primero");
					red.pokebolas.get(redNumero).setSalud(red.pokebolas.get(redNumero).getSalud()-green.pokebolas.get(greenNumero).getFisico());
				}
				if(red.pokebolas.get(redNumero).getSalud()<0){
					System.out.println("entre a salud de red");
					red.pokebolas.remove(redNumero);
					System.out.println(red.pokebolas);
				}else{
					System.out.println("entre a salud de Green");
					green.pokebolas.remove(greenNumero);
					System.out.println(green.pokebolas);
				}
			}
		}

  }
}
