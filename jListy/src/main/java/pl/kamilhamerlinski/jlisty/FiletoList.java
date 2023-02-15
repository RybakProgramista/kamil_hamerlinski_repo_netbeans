/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.kamilhamerlinski.jlisty;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;

/**
 *
 * @author kkile
 */
public class FiletoList {
    public static DefaultListModel readFile(File file){
        DefaultListModel dlm = new DefaultListModel();
        Scanner sc;
        try {
            sc = new Scanner(file);
            while(sc.hasNext()){   
                dlm.addElement(sc.nextLine());
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DefaultListModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dlm;
    }
}
