/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.kamilhamerlinski.whattodo;

import java.util.List;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kkile
 */
public class FileManagment {
    public void save(List<Task> lista){
        try {
            FileWriter fw = new FileWriter(new File("zapis.csv"));
            String output = "";
            for(Task task : lista){
                output+=task.summary() + "\n";
            }
            fw.write(output);
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(FileManagment.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public List<Task> load(){
        List<Task> output = new ArrayList();
        try {
            Scanner sc = new Scanner(new File("zapis.csv"));
            while(sc.hasNext()){
                String[] raw = sc.nextLine().split(";");
                output.add(new Task(raw[0], raw[1], raw[2], raw[3], Boolean.parseBoolean(raw[4])));
            }
            sc.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileManagment.class.getName()).log(Level.SEVERE, null, ex);
        }
        return output;
    }
}
