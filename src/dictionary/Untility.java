/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.util.Collections;
import java.util.TreeMap;

/**
 *
 * @author Admin
 */
public class Untility {
    
    final static int exsit = 0,notFull = -1,ok = 1,noExsit = 2;

    public int addWord(Word word, TreeMap<String,Word> tm) {
        if((word.getWordTarget().compareTo("")==0)||(word.getWordExplain().compareTo("")==0))return notFull;
        else
        {
        if(tm.containsKey(word.getWordTarget()))
            return exsit;
        else
        {
            String str = word.getWordTarget().toLowerCase();
            tm.put(str, word);
            DictGui.arr.add(str);
            Collections.sort(DictGui.arr);
            return ok;
        }

    }
    }
    public void deleteWord(String word){
      DictGui.rf.tm.remove(word);
    }
    
    public void editWord(Word word)
    {
        DictGui.rf.tm.put(word.getWordTarget().toLowerCase(),word);
        
    }
}
