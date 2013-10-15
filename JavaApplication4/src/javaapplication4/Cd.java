/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

/**
 *
 * @author Student
 */
public class Cd {
    private String title;
    private int year;
    
    
    // Ctor
    public Cd() {
        title="";
        year=0;
    }
    
    // Get/set methods
    
    public String getTitle() {return title;}
    public int getYear() {return year;}
    
    public void setTitle(String x) {title = x;}
    public void setYear(int x) {year = x;}
    
    @Override
    public String toString() {
        return "CD\n   title: " + title + "\n   year: " + Integer.toString(year);
    }
}
