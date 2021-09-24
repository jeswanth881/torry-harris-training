package com.torryharris.driver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class DemoExcwption {
    public static void main(String[] args) {
        try{
            readFromFile("input.txt");
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public static void readFromFile(String fileName) throws FileNotFoundException{
        File file = new File(fileName);
        FileInputStream fi=new FileInputStream(file);
    }
}
