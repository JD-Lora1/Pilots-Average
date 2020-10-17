package model;

public class Championship{
	public static final int MAX=15;

	//Atributes
	private int year;
	private int races;

	//relationships
	private Pilot[] pilots;

	public Championship(int year, int races){
		this.year = year;
		this.races = races;
		pilots = null;
	}

	public void addPilot(String name, int age, int[] scores){
		boolean ctrl = false;
		String message = "";

		for(int i=0; i<pilots.length && !ctrl; i++){
			if(pilots[i]==null){
				pilots[i] = new Pilot(name, age, scores);
				ctrl=true;
				message = "Piloto creado";
			}else if(){
				message = "Maximo de pilotos alcanzado";
			}
		}
		System.out.println(message);
	}

	public boolean findPilot(String name){
		boolean bn = false;
		for(int i=0; i<pilots.length && !bn; i++){
			if(pilots[i].getName().equalsIgnoreCase(name)){
				bn = true;
			}
		}
		return bn;
	}

	public String showAverageTimes(){

		double numAverages = Pilot.calculateAverage();
		String averages = String.valueOf(numAverages);
		return averages;
	}

	//gets
	public int getYear(){
		return year;
	}
	public int getRaces(){
		return races;
	}

	//sets
	public int setYear(int pYear){
		year = pYear;
	}
	public int setRaces(int pRaces){
		races = pRaces;
	}

}