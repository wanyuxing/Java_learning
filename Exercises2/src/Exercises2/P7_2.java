package Exercises2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JFileChooser;

public class P7_2 
{
	public static void main(String[] args) throws FileNotFoundException
	{
		// Prompt for the input and output file names
		JFileChooser chooser = new JFileChooser();
		if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
		{
			File inputFile = chooser.getSelectedFile();
			Scanner in = new Scanner(inputFile);
			
			Scanner console = new Scanner(System.in);
			System.out.print("Output file: ");
			String outputFileName = console.next();
			console.close();
			PrintWriter out = new PrintWriter(outputFileName);
			
			// Read the input and write the output
			int count = 0;
			while (in.hasNextLine())
			{
				count++;
				String readIn = in.nextLine();
				out.printf("/* %d */ %s\n", count, readIn);
			}		
			in.close();
			out.close();
		}	
	}
}
