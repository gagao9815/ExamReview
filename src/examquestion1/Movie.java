/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examquestion1;

/**
 *
 * @author gagao9815
 */
public class Movie {
    private String name;
    private int year;
    private String director;
    private String format;
    
    public Movie(String name, int year){
        this.name = name;
        this.year = year;
    }
    public Movie(String name, int year, String director){
        this(name, year);
        this.director = director;
    }
    public Movie(String name, int year, String director, String format){
        this(name,year,director);
        this.format = format;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year = year;
    }
    public String getDirector(){
        return director;
    }
    public void setDirector(String director){
        this.director = director;
    }
    public String getFormat(){
        return format;
    }
    public void setFormat(String format){
        this.format = format;
    }
    
    public boolean equals(Movie mv){
        return this.getName().equals(mv.getName()) 
                && this.getYear()==(mv.getYear()) 
                && this.getDirector().equals(mv.getDirector())
                && this.getFormat().equals(mv.getFormat());
    }
    
    public String toString(){
        return "Name:" + name + "'\n"
                + "Year:" + year + "\n"
                + "Director:" + director + "\n"
                + "Format:" + format;
    }
}
