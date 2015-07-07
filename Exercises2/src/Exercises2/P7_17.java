package Exercises2;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.io.IOException;

public class P7_17 
{
	public static void main(String[] args) 
	{
		Scanner console = new Scanner(System.in);
	
		try
		{
			System.out.print("Please type in your input filename: ");
			String inputFileName = console.next();
			console.close();	
			process(inputFileName);
		}
		catch (FileNotFoundException exception)
		{
			System.out.println("File not found.");
		}
		catch (NoSuchElementException exception)
		{
			System.out.println("File contents invalid.");
		}
		catch (IOException exception)
		{
			exception.printStackTrace();
		}
	}

	private static void process(String filename) throws IOException
	{
		File inputFile = new File(filename);
	    Scanner in = new Scanner(inputFile);
		PrintWriter out = null;
		
		try
		{
			while (in.hasNextLine())
			{
				String line = in.nextLine();
				String[] lineArray = line.split(";");
				out = new PrintWriter(new FileWriter(lineArray[1] + ".txt", true));
				out.append(line + "\n");
				out.close();
			}

		}
		finally
		{ 
			in.close();
			out.close();
		}	
	}
}
