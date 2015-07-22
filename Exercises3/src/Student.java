import java.util.ArrayList;

public class Student 
{
	private String name;
	private ArrayList<Double> scores;
	private double totalScore;
	
	public Student(String name)
	{
		this.name = name;
		this.scores = new ArrayList<Double>();
	}
	
	public String getName()
	{ return this.name;}
	
	public void addQuiz(double score)
	{ this.scores.add(score);}
	
	public double getTotalScore()
	{
		this.totalScore = 0;
		for (int i = 0; i < this.scores.size(); i++) { totalScore += this.scores.get(i);}
		return totalScore;
	}
	
	public double getAverageScore()
	{ 
		this.totalScore = 0;
		return this.getTotalScore() / this.scores.size();
	}
}
