package ie.tudublin;

import java.util.ArrayList;
import java.lang.String;


import processing.core.PApplet;

public class ScoreDisplay extends PApplet
{

	ArrayList<String> notes = new ArrayList<String>();

	private float leftBorder;
	private float border;

	//String score = "DEFGABcd";
	//String score = "D2E2F2G2A2B2c2d2";
	String score = "DEF2F2F2EFA2A2B2AFD2E2D2D2D2";
	char[] charac = new char[20];
	int[] integ = new int[20];
	char c;
	int in;
	
	public void settings()
	{
		size(1000, 500);

		// How to convert a character to a number
		c = '7'; // c holds the character 7 (55)
		int i = c - '0'; // i holds the number 7 (55 - 48) 
		println(i);
		
	}

	public void setup() 
	{
		colorMode(RGB);
		leftBorder = width * 0.2f;
		border = width * 0.05f;
		loadScore();
		printScores();

	}

	public void draw()
	{
		background(255);
		drawScore();
		drawLines();
	}

	void drawNotes()
	{
		
	}

	void drawScore()
	{
		stroke(0);
		strokeWeight(3);
		fill(0);
		textAlign(CENTER,CENTER);
		for(int i = 0;i < notes.size();i++)
		{
			float x = map(i,0,notes.size(),leftBorder,width-border);
			text(notes.get(i),x,border);
		}
	}

	void drawLines()
	{
		for(int i = 0;i < 5;i++)
		{
			float y = map(i,0,5,height/3,height);
			line(leftBorder*0.9f,y,width,y);
		}
	}

	void loadScore()
	{
		for(int i = 0;i < score.length();i++)
		{
			if(score.charAt(i) == '2')
			{
				in = score.charAt(i);
				in = in - '0';
				for(int j =0;j < integ.length;j++)
				{
					integ[j] = in;
				}
			}
			else
			{
				notes.add(score.substring(i,i+1));
				c = score.charAt(i);
				for(int k = 0;k < charac.length;k++)
				{
					charac[k] = c;
				}
				
				
			}
		}
	}

	void printScores()
	{
		for(int i = 0; i < score.length() -1;i++)
		{
			if(score.charAt(i) == '2' && (score.charAt(i-1) == 'D' || score.charAt(i-1) == 'E' || score.charAt(i-1) == 'F' || score.charAt(i-1) == 'A' || score.charAt(i-1) == 'B' 
			|| score.charAt(i-1) == 'c' || score.charAt(i-1) == 'd'))
			{
				
			}
			else
			{
				if(score.charAt(i+1) == '2')
				{
					System.out.print(score.substring(i,i+1));
					System.out.print("\t2");
					System.out.print("\tCrochet");
					System.out.println();
				}
				else
				{
				System.out.print(score.substring(i,i+1));
				System.out.print("\t1");
				System.out.print("\tQuaver");
				System.out.println();
				}
			}
		}
	}
}
