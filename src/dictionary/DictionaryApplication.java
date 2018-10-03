/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.IOException;

/**
 *
 * @author Admin
 */
public class DictionaryApplication {
    public void run() throws IOException {
        DictGui dg = new DictGui();
        dg.setLocation(200,100);
        dg.setVisible(true);
        dg.setResizable(false);
        dg.showTime();
    }
    public static void main(String[] args) throws IOException {
    
     DictionaryApplication start = new DictionaryApplication();
     start.run();
    
}

}