package model;
public class Pilot{

	//Atributes
	private String name;
	private int age;
	private String teams;
	private int[] scores;

	//relationships
	private Team teamA;

	public Pilot(String name, int age, String teams, int[] scores){
		this.name = name;
		this.age = age;
		this.teams = teams;
		this.scores = scores;
	}

	public double calculateAverage(int races){
		double average = 0;
		double sum = 0;

		for(int j=0; j<scores.length; j++){
			sum+= scores[j]*1.0;
		}
        average=(sum)/races;
        
		return average;
	}

	//gets
	public String getName(){
		return name;
	}
	public int[] getScores(){
		return scores;
	}

	//sets
	public void setName(String pName){
		name = pName;
	}
	public void setScores(int[] pScores){
		scores = pScores;
	}

}	