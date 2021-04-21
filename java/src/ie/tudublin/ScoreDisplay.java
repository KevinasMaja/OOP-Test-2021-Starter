package ie.tudublin;

import java.util.ArrayList;


import processing.core.PApplet;

public class ScoreDisplay extends PApplet
{
	private float leftBorder;
	private float border;

	String score = "DEFGABcd";
	//String score = "D2E2F2G2A2B2c2d2";
	//String score = "DEF2F2F2EFA2A2B2AFD2E2D2D2D2";
	
	public void settings()
	{
		size(1000, 500);

		// How to convert a character to a number
		char c = '7'; // c holds the character 7 (55)
		int i = c - '0'; // i holds the number 7 (55 - 48) 
		println(i);
		println(score.substring(0,1));
		
	}

	public void setup() 
	{
		colorMode(RGB);
		leftBorder = width * 0.2f;
		border = width * 0.05f;

	}

	public void draw()
	{
		background(255);
		drawNotes();
	}

	void drawNotes()
	{
		stroke(0);
		strokeWeight(5);
		fill(0);
		textAlign(CENTER,CENTER);
		for(int i = 0;i < score.length();i++)
		{
			float x = map(i,0,score.length(),leftBorder,width-border);
			text(score.substring(i,i+1),x,border);
		}
	}

	void drawLines();

	private void Note()
	{
		char n;
		int d;

	}
}
