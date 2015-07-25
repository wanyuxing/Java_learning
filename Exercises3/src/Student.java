import java.util.ArrayList;

public class Student 
{
	private String name;
	private ArrayList<Double> scores; 
	/*
	
	Attention:
	You only use ArrayList when you need to access/modify individual elements in the list by index

	*/

	// you don't have to use ArrayList here, because you only need to keep track of the TOTAL score and number of quizzes
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

// my solution for your reference

public class P8_8_Student {
    private String name;
    private double totalScore;
    private int numberOfQuiz;

    public P8_8_Student (String name) {
        this.name = name;
    }

    public String getName (String name) {
        return this.name;
    }

    // The addQuiz method as in P8.7
    public void addQuiz (double score) {
        this.totalScore += score;
        this.numberOfQuiz += 1;
    }

    // The new addQuiz method
    public void addQuiz(Grade grade) {
        this.totalScore += grade.getScore();
        this.numberOfQuiz += 1;
    }

    public double getTotalScore() {
        return this.totalScore;
    }

    public double getAverageScore() {
        return (this.totalScore / this.numberOfQuiz);
    }

}

