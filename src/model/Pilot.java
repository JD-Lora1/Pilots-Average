import model;
public class Pilot{

	//Atributes
	private String name;
	private int age;
	private int[] scores;

	//relationships
	private Team teams;

	public Pilot(String name, int age, int[] scores){
		this.name = name;
		this.age = age;
		this.scores = scores;
	}

	//gets
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public int[] getScores(){
		return scores;
	}

}	