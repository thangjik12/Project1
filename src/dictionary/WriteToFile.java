/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dictionary;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.Collection;

/**
 *
 * @author Admin
 */
public class WriteToFile {
    FileOutputStream fos;
    OutputStreamWriter osw;
    
    
    
    public WriteToFile(String name) throws FileNotFoundException, UnsupportedEncodingException
    {
       fos = new FileOutputStream(name+".txt",false);
       osw = new OutputStreamWriter(fos,"utf-8");
        
       
    }
    
    public void Write(Collection<Word> cl) throws IOException
    {
      
        for(Word s:cl)
        {
           osw.write(s.getWordTarget()+ "\t" + s.getWordExplain());
           osw.write("\r\n");
        }
       osw.flush();
       fos.close();
 
    }
    
    
    
    
}
