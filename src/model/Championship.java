package model;

public class Championship{
	public final int MAXI=15;

	//Atributes
	private int year;
	private int races;

	//relationships
	private Pilot[] pilots;

	public Championship(int year, int races){
		this.year = year;
		this.races = races;
		pilots = new Pilot[MAXI];
		for(int i=0; i<pilots.length; i++){
			pilots[i] = null;
		}
	}

	public void addPilot(String name, int age, String teams, int[] scores){
		boolean ctrl = false;
		String message = "Maximo de pilotos alcanzado";
		if(findPilot(name)){
			message= "El piloto ya existe";
		}
		for(int i=0; i<pilots.length && !ctrl; i++){

			if(pilots[i]==null && !findPilot(name)){
				pilots[i] = new Pilot(name, age, teams, scores);
				ctrl=true;
				message = "\n* Piloto creado";
			}
		}
		System.out.println(message);
	}

	public boolean findPilot(String name){
		boolean bn = false;
		for(int i=0; i<pilots.length && !bn; i++){
			if(pilots[i]!=null){
				if(pilots[i].getName().equalsIgnoreCase(name)){
				bn = true; }
			}
		}
		return bn;
	}

	public String showAverageTimes(int i){
		String messagex="";
		if(pilots[i]!=null){
			double average = pilots[i].calculateAverage(races);

			double sec= average%60;
	        double min=((average-(sec))/60)%60;
	        double hour=(average-((min*60)+sec))/3600;
	        messagex="* "+pilots[i].getName()+": ("+hour+" hrs // "+min+" min // "+sec+" sec)";
		}else{
			messagex=null;
		}
		
        return messagex;
	}

	//gets
	public int getRaces(){
		return races;
	}

	//sets
	public void setRaces(int pRaces){
		races = pRaces;
	}
}