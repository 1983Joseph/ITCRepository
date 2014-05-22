import java.io.*;
import java.util.*;

public class ReadFile {

    public static void main(String[] args) throws IOException{
        ArrayList <Integer> nor = new ArrayList();
        try {
            Scanner scanner = new Scanner(new File("TreeSort.txt"));
            while (scanner.hasNextInt()) {
                nor.add(scanner.nextInt());
            }
                scanner.close();
        } catch (IOException e) {
            System.out.println("ошибка " + e); 
        }
        for(int k=0; k < nor.size(); k++) {
            //   k=scanner.nextInt();
            System.out.println( "tiv" + nor.get(k));
        }
    }

}
