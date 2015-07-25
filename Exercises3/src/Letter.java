import java.util.ArrayList;

public class Letter 
{
	private String recipient;
	private String sender;
	private ArrayList<String> line;
	// similar to Student.java, you don't have to use ArrayList here
	// use a string variable called "body" instead, and every time you call addLine(), just append a new string to "body"
	
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

// my solution for your reference

public class Letter {
    private String from;
    private String to;
    private String body = "";

    public Letter (String from, String to) {
        this.from = from;
        this.to = to;
    }

    public void addLine (String line) {
        this.body += line + '\n';
    }

    public String getText () {
        return ("Dear " + to + ":" + '\n' + '\n' + body + "\n" + "Sincerely,\n\n" + from);
    }
}