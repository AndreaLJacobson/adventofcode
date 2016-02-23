package day2;

import java.util.Scanner;
import java.io.*;


public class WrappingPaperCalculator {
	
	public static void main(String[] args){
		try {
			Scanner input = new Scanner(new File("data/day2input.txt"));
			
			Integer l = new Integer(0);
			Integer w = new Integer(0);
			Integer h = new Integer(0);
				
					
			int overage = 0;
			int totalSurfaceArea = 0;
			
			//read in input loop
			while(input.hasNextLine())
			{
				String s = input.nextLine();
				String[] dimensions = s.split("x");

				l = Integer.parseInt(dimensions[0]);
				w = Integer.parseInt(dimensions[1]);
				h = Integer.parseInt(dimensions[2]);
				
				overage = findOverage(l,w,h);
				
				totalSurfaceArea = totalSurfaceArea + (2*l*w + 2*w*h + 2*h*l) + overage;
				

			}
			
			System.out.println("Total wrapping paper required is: " + totalSurfaceArea);
			input.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}//end main
	
	public static int findOverage(int l, int w, int h)
	{
		
		int[] dim = {-1,-1,-1};
				
		if(l < w)
		{
			dim[0] = l;
			dim[1] = w;
		}
		
		else
		{
			dim[0] = w;
			dim[1] = l;
		}
			
		
		if(h < dim[0])
		{		
			dim[2] = dim[1];
			dim[1] = dim[0];
			dim[0] = h;
		}
		
		else if(h < dim[1])
		{
			dim[2] = dim[1];
			dim[1] = h;
		}
		
		return dim[0]*dim[1];
	}
}
