import java.util.ArrayList;

public class Letter 
{
	private String recipient;
	private String sender;
	private ArrayList<String> line;
	
	public Letter(String from, String to)
	{
		this.sender = from;
		this.recipient = to;
		line = new ArrayList<String>();
	}
	
	public void addLine(String line)
	{ this.line.add(line);}
	
	public String getText()
	{ 
		String text = "Dear " + this.recipient + ":\n\n";
		for (int i = 0; i < this.line.size(); i++) { text += this.line.get(i) + "\n";}
		text = text + "\nSincerely,\n\n" + this.sender;
		return text;
	}
	
	public void main()
	{ System.out.print(this.getText());}
}
