package ui;
import java.util.Scanner;
import model.Championship;

public class Main{
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args){
		Championship championship1 = createChampionship();

		int opt=-1;
		boolean ctrl= false;

		while(opt!=1 && opt!=2 && opt!=0 || !ctrl){
			System.out.println(
					"\nSeleccione una opcion:\n" +
					"(1) Agregar Piloto\n" +
					"(2) Calcular los promedios\n"+
					"(0) Salir" );

			System.out.print(": ");
			opt = sc.nextInt();
			System.out.println(" ");
			sc.nextLine();
			if(opt!=1 && opt!=2 && opt!=0){
				System.out.println("Digite una opcion valida"); }
		
			switch (opt){
				case 1:
					addPilotx(championship1);
					break;
				case 2:
					showAverageTimes(championship1);
					break;
				case 0:
					System.out.println("Fin del progarama");
					ctrl=true;
					break;
			}
		}
		
	}

	public static Championship createChampionship(){
		System.out.println("\nPorfavor ingrese:");
		System.out.print("Anio del Campeonato: ");
		int year = sc.nextInt();
		sc.nextLine();
		System.out.print("Numero de carreras: ");
		int races = sc.nextInt();
		sc.nextLine();

		Championship championshipx = new Championship(year, races);
		return championshipx;
	}

	public static void addPilotx(Championship championshipx){
		System.out.println("Porfavor ingrese:");
		System.out.print("Nombre del piloto: ");
		String name = sc.nextLine();
		System.out.print("Edad del piloto: ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("Escuderia(Equipo): ");
		String teams = sc.nextLine();
		System.out.println("- Tiempo(en segundos) ");
		int[] scores = new int[championshipx.getRaces()];

		for(int i=0; i<scores.length; i++){
			System.out.print("carrera "+(i+1)+": ");
			scores[i] = sc.nextInt();
			sc.nextLine();
		}
		championshipx.addPilot(name, age, teams, scores);	
	}

	public static void showAverageTimes(Championship championshipx){
		for(int i=0; i<championshipx.MAXI; i++){
			if(championshipx.showAverageTimes(i)!=null){
				System.out.println(championshipx.showAverageTimes(i));
			}
		}
	}
}