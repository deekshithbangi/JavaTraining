package com.bangi;

import java.io.*;

public class InputFile {
    public static void main(String[] args) throws IOException {
        File file = new File("src/com/bangi/sample.txt");
        FileInputStream fileInputStream = new FileInputStream(file);

        int characterCount = 0;
        int wordCount = 0;
        int lineCount = 0;
        int ch;

        try{
            while ((ch = fileInputStream.read()) != -1) {
                char currentChar = (char) ch;

                if ((currentChar >= 'A' & currentChar <= 'Z') || (currentChar >= 'a' & currentChar <= 'z')) {
                    characterCount++;
                } else if (currentChar == ' '){
                    characterCount++;
                    wordCount++;
                } else if(currentChar == '\n') {
                    lineCount++;
                } else {
                    characterCount++;
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Total word count: " + wordCount);
        System.out.println("Total character count: " + characterCount);
        System.out.println("Total line count: " + lineCount);
    }
}
