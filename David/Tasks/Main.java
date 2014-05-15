import java.io.*;
import java.io.IOException;
import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class Main {

	int mMax = 0;
	int MultiplyByRight(int beginPointI,int beginPointJ,int [][]array) {
		int multiply = 1;
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("outputByLeft.txt",true));
			int endJ = beginPointJ + 4;
			for (int j = beginPointJ; j < endJ; ++j) {
				multiply *= array[beginPointI][j];
				bw.write(String.valueOf(array[beginPointI][j]));
				bw.newLine();	
			}
			bw.write(String.valueOf(multiply));
			bw.newLine();
			bw.newLine();
			bw.close();
		} catch(IOException ex) {
			System.out.println("File not Found");
		}
		return multiply;
	}
	int MultiplyByDown(int beginPointI,int beginPointJ,int [][]array) {
		int multiply = 1;
		try {
		       	BufferedWriter bw = new BufferedWriter(new FileWriter("outputByDown.txt",true));
			int endPoint = beginPointI + 4;
			for (int i = beginPointI; i < endPoint; ++i) {
				multiply *= array[i][beginPointJ];
				bw.write(String.valueOf(array[i][beginPointJ]));
				bw.newLine();	
			}
			bw.write(String.valueOf(multiply));
			bw.newLine();
			bw.newLine();
			bw.close();
		} catch(IOException ex) {
			System.out.println("File not Found");
		}
		return multiply;
	}
	int MultiplyByDiagonalByRight(int beginPointI,int beginPointJ,int [][]array) {
		int multiply = 1;
		try {
		       	BufferedWriter bw = new BufferedWriter(new FileWriter("outputByDiaganalRight.txt",true));
	
    			int endPoint = beginPointI + 4;
			for(int i = beginPointI, j = beginPointJ; i < endPoint; ++i, ++j) {
				multiply *= array[i][j];
				bw.write(String.valueOf(array[i][j]));
				bw.newLine();
			}
			bw.write(String.valueOf(multiply));
			bw.newLine();
			bw.newLine();
			bw.close();
 
		} catch(IOException ex) {
			System.out.println("File not Found");
		}
		return multiply;
	}
	int MultiplyByDiagonalByLeft(int beginPointI,int beginPointJ,int [][] array) {
		int multiply = 1;
		try {
		       	BufferedWriter bw = new BufferedWriter(new FileWriter("outputByDiaganalLeft.txt",true));		
			int endPointI = beginPointI + 4;
			int endPointJ = beginPointJ - 4;
			for(int i = beginPointI, j = beginPointJ; i < endPointI && j >= endPointJ; ++i, --j) {
				multiply *= array[i][j];
				bw.write(String.valueOf(array[i][j]));
				bw.newLine();
			}
			bw.write(String.valueOf(multiply));
			bw.newLine();
			bw.newLine();
			bw.close();
		} catch(IOException ex) {
			System.out.println("File not Found");
		}
		return multiply;
	}
	private void CheckMaxAndSetMax(Main program, int value) {
		if(program.mMax < value) {
			program.mMax=value;
		}
	}
	public static void main(String [] args)throws IOException {
		Main program = new Main();
		ReadArray array = new ReadArray(args[0],20);
		int [][] myArray = array.GetArray();
		int arraySize = myArray.length;
		int multiply = 1;

		for(int i = 0; i < arraySize; ++i) {
			for(int j = 0; j < arraySize; ++j) {
				if(j + 4 <= arraySize) {
					multiply = program.MultiplyByRight(i,j,myArray);
					program.CheckMaxAndSetMax(program, multiply);
				}
				if(i + 4 <= arraySize) {
					multiply = program.MultiplyByDown(i,j,myArray);
					program.CheckMaxAndSetMax(program, multiply);
				}
				if(i + 4 <= arraySize && j + 4 <= arraySize) {
					multiply = program.MultiplyByDiagonalByRight(i,j,myArray);
					program.CheckMaxAndSetMax(program, multiply);
				}
				if(i + 4 <= arraySize && j - 3 >= 0) {
					multiply = program.MultiplyByDiagonalByLeft(i,j,myArray);
					program.CheckMaxAndSetMax(program, multiply);
				}
			}
		}
		System.out.println(program.mMax);
		
	}
}