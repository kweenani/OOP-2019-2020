package ie.tudublin;

// Hello from Bryan

import processing.core.PApplet;

public class Arrays extends PApplet
{	
	float[] rainfall = { 68, 48, 50, 55, 60, 45, 65, 70, 78, 87, 86, 52 };
	String[] months={"Jan", "Feb", "Mar", "Apr", "May", "June", "July", "Aug", "Sep", "Oct", "Nov", "Dec"};
	float h;

	public void settings()
	{
		size(500, 500);
	}

	public void setup() 
	{
		// for (int i = 0; i < rainfall.length; i++){
		// 	System.out.println(rainfall[i] + "\t" + months[i]);
		// }
		
		// for (float f : rainfall) {
		// 	System.out.println(f);
		// }

		// for (String s : months) {
		// 	System.out.println(s);
		// } 
		
	}

	

	float offset = 0;

	void largest(){
		float max = rainfall[0];
		String month = months[0];
		for (int i=0; i<rainfall.length;i++){
			if (rainfall[i] > max){
				max = rainfall[i];
				month = months[i];
			}
			
		}
		System.out.println(month + ": \t" + max);
	}

	void smallest(){
		float min = rainfall[0];
		String month = months[0];
		for (int i =0;i < rainfall.length;i++){
			if (rainfall[i] < min){
				min = rainfall[i];
				month = months[i];
			}
			
		}
		System.out.println(month + ": \t" + min); 
		// System.out.println(min);
	}
	
	
	public void keyPressed()
	{
		if (key == ' ')
		{
			
		}
	}	

	void drawRect(){

		float h = rainfall[0];
		int x = 0;
		float c = 0;
			for (int i =0;i< rainfall.length;i++){
				h = rainfall[i];
				colorMode(HSB);
				fill(c,255,255);
				rect(x,height,30,-h*2);
				x+= 50;
				c += (i*8); 
			}
		
	}

	public void draw()
	{	
		background(0);		
		colorMode(HSB);	
		drawRect();
	}
}
