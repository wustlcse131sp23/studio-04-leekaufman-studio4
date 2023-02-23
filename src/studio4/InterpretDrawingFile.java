package studio4;

import java.awt.Color;
import java.awt.Shape;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		
		
		
		String shapeType = in.next();
		int redComponent = in.nextInt();
		int greenComponent = in.nextInt();
		int blueComponent = in.nextInt();
		boolean isFilled = in.nextBoolean();
		double parameterOne = in.nextDouble();
		double parameterTwo = in.nextDouble();
		double parameterThree = in.nextDouble();
		double parameterFour = in.nextDouble();
		
		
		
		if (shapeType.equals("rectangle"))
		{
			if (isFilled == true) {
				StdDraw.clear();
				StdDraw.setPenColor(redComponent, greenComponent, blueComponent);
				StdDraw.setPenRadius(0.01);
				StdDraw.filledRectangle(parameterOne, parameterTwo, parameterThree, parameterFour);
		}
			
		}
		if (shapeType.equals("rectangle"))
		{
			if (isFilled == false) {
				StdDraw.clear();
				StdDraw.setPenColor(redComponent, greenComponent, blueComponent);
				StdDraw.setPenRadius(0.01);
				StdDraw.rectangle(parameterOne, parameterTwo, parameterThree, parameterFour);
		}		

	}
	}
}


