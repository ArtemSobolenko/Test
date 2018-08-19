package com.javarush.test;

import java.io.*;

public class Solution {
    public static void main(String[] args) {

        try (InputStream fis = new FileInputStream("C:\\JavaRush\\test.txt")){
            int symbol;
          while ((symbol = fis.read()) != -1){
              System.out.print((char) symbol);
          }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

