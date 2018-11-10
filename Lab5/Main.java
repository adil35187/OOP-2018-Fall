package Lab5;
import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {

    //    FileInputStream infile = new FileInputStream("in.dat");
//    FileOutputStream outfile = new FileOutputStream("out.dat");
    public static void main(String[] args) {
        FileReader infile = null;

        {
            try {
                infile = new FileReader("/Users/AdilBirlesov/IdeaProjects/OOP/src/Lab5/score.txt");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        FileWriter outfile = null;

        {
            try {
                outfile = new FileWriter("/Users/AdilBirlesov/IdeaProjects/OOP/src/Lab5/grades.txt");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        BufferedReader reader = new BufferedReader(infile);
        BufferedWriter writer = new BufferedWriter(outfile);
        String line;

        String score_int = "";
        String out = "";
        int best = 100;
        {
            try {
                line = reader.readLine();
                while (line != null) {

                    StringTokenizer st = new StringTokenizer(line);
                    while (st.hasMoreTokens()) {
                        score_int = "";
                        out += st.nextToken() + " ";
                        score_int += st.nextToken();
                    }
                    out = out.substring(0, out.length() - score_int.length());
                    if (Integer.parseInt(score_int) >= best - 10) {
                        out += "A";
                    } else if (Integer.parseInt(score_int) >= best - 20) {
                        out += "B";
                    } else if (Integer.parseInt(score_int) >= best - 30) {
                        out += "C";
                    } else if (Integer.parseInt(score_int) >= best - 40) {
                        out += "D";
                    } else {
                        out += "F";
                    }
                    writer.write(out);
                    writer.newLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}






