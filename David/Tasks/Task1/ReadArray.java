import java.util.*;
import java.io.File;
import java.io.IOException;

class ReadArray {
	private int mSize = 20;
	private int [][] mArray = null;
	private ReadArray(){}
	public ReadArray(String fileName, int size) throws IOException {
		mSize = size;
		mArray = new int [size][size];
		Scanner in = null;
		try {
			in = new Scanner(new File(fileName));
			for(int i = 0; i < mSize; ++i) {
				String line = in.nextLine();
				String [] numbers = line.split(" ");
				int jSize = numbers.length;
				for(int j = 0; j < jSize; ++j) {
					mArray[i][j] = Integer.parseInt(numbers[j]);
				}
			} 
			in.close();
		} finally {
			if(in != null) {
				in.close();
			}
		}
	}
	public int [][] GetArray() {
		return mArray;
	}
}