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
	String score = "D2E2F2G2A2B2c2d2";
	//String score = "DEF2F2F2EFA2A2B2AFD2E2D2D2D2";
	
	public void settings()
	{
		size(1000, 500);

		// How to convert a character to a number
		char c = '7'; // c holds the character 7 (55)
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
		for(int i = 0;i < score.length();i++)
		{
			float x = map(i,0,score.length(),leftBorder,width-border);
			text(score.substring(i,i+1),x,border);
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
		for(int i = 0;i<score.length();i++)
		{
			notes.add(score.substring(i,i+1));
		}
	}

	void printScores()
	{
		System.out.println(notes);
	}
}
