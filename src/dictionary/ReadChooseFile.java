/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dictionary;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;
import java.util.HashSet;




public class ReadChooseFile {

    private final FileReader file ;
    private final BufferedReader buff ;
    private StringBuffer strBuff;
    private String line;
    private String word;
    private final HashSet hs = new HashSet();

   
    public ReadChooseFile(String filePath) throws FileNotFoundException
    {
        file = new FileReader(filePath);
        buff = new BufferedReader(file);
 
    }
   public HashSet readChoose(Collection<String> clStr) throws IOException{
        
       
        
        while ((line= buff.readLine())!=null)
        {
          if((line.length())==0)
              System.out.println("dấu xuống dòng");
              else
          {
            line = line.toLowerCase();
            clStr.stream().filter((s) -> (line.contains(s))).forEachOrdered((s) -> {
                hs.add(s);
              });
          
          }
           }
        file.close();
        buff.close();
        return hs;
           }
}
           
           
            
        
    
    
    

