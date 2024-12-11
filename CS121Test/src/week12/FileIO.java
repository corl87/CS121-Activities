package week12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileIO {
    public static void main(String[] args) throws FileNotFoundException {
        File inputFile= new File("courses.txt");

        try {
            Scanner input = new Scanner(inputFile);

            String header = input.nextLine();
            System.out.println(header);
            while (input.hasNextLine()) {
                String course = input.next();
                int credits = Integer.parseInt(input.next());
                int score = Integer.parseInt(input.next());
                System.out.println(course+" " +credits +" "+score);
            }
            input.close();
        }catch(FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
