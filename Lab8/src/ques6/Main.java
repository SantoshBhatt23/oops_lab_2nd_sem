package ques6;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        File inputFile = new File("sdj.txt");
        File tempFile = new File("output.txt");

        BufferedReader br = new BufferedReader(new FileReader(inputFile));
        BufferedWriter bw = new BufferedWriter(new FileWriter(tempFile));

        String line;

        while ((line = br.readLine()) != null) {

            line = line.replaceAll("\\bhis\\b", "her");

            bw.write(line);
            bw.newLine();
        }

        br.close();
        bw.close();


        inputFile.delete();



    }
}