/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author Admin
 */
public class ReadFile {
    private Word mw;

    /**
     *
     */
    public TreeMap tm;

    public ReadFile() {
        this.tm = new TreeMap<>();
    }
    public void fReader() throws  FileNotFoundException, IOException
    {
        Scanner sc = new Scanner(new FileInputStream("dictionaries.txt"),"UTF-8");
        String content ;
        
        while(sc.hasNextLine()) {
             content = sc.nextLine();
             System.out.println(content);
             this.splitStringAndAddTreeMap(content);
    }
    }
        public void splitStringAndAddTreeMap(String content) {
                    String[] contentsplit=content.split("\\t");
                    String key = contentsplit[0];
                    String val = contentsplit[1];
                    mw = new Word(key, val);
                    tm.put(key.toLowerCase(), mw);
                    
                    
        }
}
