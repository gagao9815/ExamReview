/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examquestion1;
import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author gagao9815
 */
public class ExamQuestion1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Movie> movies = readFile();
    }
    private static ArrayList readFile(){
        try{
            String name, director,format;
            int year;
            ArrayList<Movie> mov = new ArrayList<>();
            File f = new File("\\src\\examquestion1\\data.txt");
            Scanner sc = new Scanner(f);
            while(sc.hasNextLine()){
                name = sc.nextLine();
                year = sc.nextInt();
                sc.nextLine();
                director = sc.nextLine();
                format = sc.nextLine();
                mov.add(new Movie(name,year,director,format));
            }
            return mov;
        }catch(FileNotFoundException e) {
            e.printStackTrace();
            System.exit(1);
        }
        return null;
    }
    
}
