/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.kamilhamerlinski.whattodo;

/**
 *
 * @author kkile
 */
public class Task {
    private String title, date, shortDesc, description;
    private boolean isUrgent;
    public Task(String title, String date, String shortDesc, String description, boolean isUrgent){
        this.title = title;
        this.date = date;
        this.shortDesc = shortDesc;
        this.description = description;
        this.isUrgent = isUrgent;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setDate(String date){
        this.date = date;
    }
    public void setShortDesc(String shortDesc){
        this.shortDesc = shortDesc;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public void setUrgent(boolean isUrgent){
        this.isUrgent = isUrgent;
    }
    public String getTitle(){
        return title;
    }
    public String getDate(){
        return date;
    }
    public String getShortDesc(){
        return shortDesc;
    }
    public String getDescription(){
        return description;
    }
    public boolean getUrgent(){
        return isUrgent;
    }
    public String shortSummary(){
        return getTitle() + ";" + getDate() + ";" + getShortDesc();
    }
    public String summary(){
        return shortSummary() + ";" + getDescription() + ";" + getUrgent();
    }
}
