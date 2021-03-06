/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import com.sun.javafx.geom.Curve;
import com.sun.xml.internal.ws.api.config.management.policy.ManagedClientAssertion;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javazoom.jl.player.Player;

/**
 *
 * @author Admin
 */
public  class DictGui extends javax.swing.JFrame {
    
    private DefaultListModel lst;
    final static ReadFile rf = new ReadFile();
    private final boolean busy = false, select = true;
    DialogAdd dla = new DialogAdd(rf.tm);
    DialogEdit dle = new DialogEdit();
    ReadChooseFile rcf;
    WriteToFile wtf;
    Untility ult= new Untility();
    final static ArrayList<String> arr = new ArrayList<>();
    String []dicput = {"bird","chicken","dog","man","monkey"};
    private final HashSet<String> hs = new HashSet();

    public SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy zzz");

    ;
    
    /**
     * Creates new form DictGui1
     * @throws java.io.IOException
     */
    public DictGui() throws IOException {
        setTitle("Từ Điển Anh Việt");
 
        rf.fReader();
        initComponents();
        status.setText("Sẵn Sàng");

        this.Init();
        boolean addAll = arr.addAll(Arrays.asList(dicput));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        tfWord = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jPanel2 = new javax.swing.JPanel();
        btFind = new javax.swing.JButton();
        btAdd = new javax.swing.JButton();
        btEdit = new javax.swing.JButton();
        btDelete = new javax.swing.JButton();
        btWriteFile = new javax.swing.JButton();
        btSpeak = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tpRead = new javax.swing.JTextPane();
        btExit1 = new javax.swing.JButton();
        btRefrest = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        dateTime = new javax.swing.JLabel();
        status = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 255, 255));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        tfWord.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tfWord.setForeground(new java.awt.Color(51, 0, 51));
        tfWord.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tfWord.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfWordMouseClicked(evt);
            }
        });
        tfWord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfWordActionPerformed(evt);
            }
        });
        tfWord.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfWordKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfWordKeyReleased(evt);
            }
        });

        jList1.setForeground(new java.awt.Color(102, 0, 204));
        jList1.setModel(lst = new DefaultListModel());
        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });

        btFind.setForeground(new java.awt.Color(51, 102, 255));
        btFind.setText("Tìm Kiếm");
        btFind.setAlignmentY(0.8F);
        btFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFindActionPerformed(evt);
            }
        });

        btAdd.setForeground(new java.awt.Color(51, 102, 255));
        btAdd.setText("Thêm Từ");
        btAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddActionPerformed(evt);
            }
        });

        btEdit.setForeground(new java.awt.Color(51, 102, 255));
        btEdit.setText("Sửa Từ");
        btEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditActionPerformed(evt);
            }
        });

        btDelete.setForeground(new java.awt.Color(51, 102, 255));
        btDelete.setText("Xóa Từ");
        btDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeleteActionPerformed(evt);
            }
        });

        btWriteFile.setForeground(new java.awt.Color(51, 102, 255));
        btWriteFile.setText("Ghi File");
        btWriteFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btWriteFileActionPerformed(evt);
            }
        });

        btSpeak.setForeground(new java.awt.Color(51, 102, 255));
        btSpeak.setText("Phát Âm");
        btSpeak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSpeakActionPerformed(evt);
            }
        });

        tpRead.setEditable(false);
        tpRead.setBackground(new java.awt.Color(204, 255, 204));
        tpRead.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tpRead.setForeground(new java.awt.Color(51, 0, 51));
        tpRead.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tpReadMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tpRead);

        btExit1.setForeground(new java.awt.Color(255, 51, 51));
        btExit1.setText("Thoát");
        btExit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExit1ActionPerformed(evt);
            }
        });

        btRefrest.setForeground(new java.awt.Color(51, 102, 255));
        btRefrest.setText("Làm mới");
        btRefrest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRefrestActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btFind, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btWriteFile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btExit1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btSpeak, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                            .addComponent(btEdit, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                            .addComponent(btDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                            .addComponent(btRefrest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btFind, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(btRefrest, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btSpeak, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btWriteFile, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btExit1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
            .addComponent(jScrollPane2)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(tfWord, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(tfWord, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        dateTime.setText("date");

        status.setText("Sẵn sàng");

        jLabel1.setText("Trạng Thái :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 716, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dateTime, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateTime)
                    .addComponent(status)
                    .addComponent(jLabel1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfWordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfWordKeyPressed
        // TODO add your handling code here:
        status.setText("Tìm Kiếm");
        String a = tfWord.getText();

        if (evt.getKeyCode() == 10) {
            tpRead.setText(getFind(a));
        }

    }//GEN-LAST:event_tfWordKeyPressed

    private void tfWordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfWordKeyReleased
        // TODO add your handling code here:
        status.setText("Tìm Kiếm");
        if (tfWord.getText().compareTo("") != 0) {
            if (evt.getKeyCode() != 8) {
                for (int i = 0; i < lst.size(); i++) {
                    String str = lst.getElementAt(i).toString();
                    str = str.toLowerCase();
                    String word = tfWord.getText();
                    word = word.toLowerCase();
                    if (str.indexOf(word) == 0) {
                        jList1.setSelectedIndex(i);
                        jList1.ensureIndexIsVisible(i);
                        tfWord.setText(lst.getElementAt(i).toString());
                        int s = word.length();
                        int e = str.length();
                        tfWord.select(s, e);
                        tpRead.setText(getFind(jList1.getSelectedValue().toString()));
                        break;
                    }
                }
            } else {

                for (int i = 0; i < lst.size(); i++) {
                    String str = lst.getElementAt(i).toString();
                    String word = tfWord.getText();
                    if (str.indexOf(word) == 0) {
                        jList1.setSelectedIndex(i);
                        jList1.ensureIndexIsVisible(i);
                        tpRead.setText(getFind(jList1.getSelectedValue().toString()));
                        break;
                    }
                }

            }
        }


    }//GEN-LAST:event_tfWordKeyReleased

    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged
        // TODO add your handling code here:
        status.setText("Tìm Kiếm");
        Object obj = evt.getSource();

        if (obj.equals(jList1) && !busy && select) {

            if (jList1.isSelectionEmpty()) {
                tfWord.setText("");
                tpRead.setText("");
                
                
            } else {
                String s;
                s = jList1.getSelectedValue().toString();
                tfWord.setText(s);
                tfWord.selectAll();
                tpRead.setText(getFind(s));
                
            }
        }
    }//GEN-LAST:event_jList1ValueChanged

    private void btFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFindActionPerformed
        // TODO add your handling code here:
        status.setText("Tìm Kiếm");
        tpRead.setText(getFind(tfWord.getText()));
    }//GEN-LAST:event_btFindActionPerformed

    private void tfWordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfWordMouseClicked
        // TODO add your handling code here:
        tfWord.selectAll();
    }//GEN-LAST:event_tfWordMouseClicked

    private void btAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddActionPerformed
        // TODO add your handling code here:
        status.setText("Thêm Từ");
        dla.setVisible(true);
        dla.setLocation(300, 200);
        dla.tfNewRead.setText("");
        dla.tfNewWord.setText("");
        
        

    }//GEN-LAST:event_btAddActionPerformed

    private void btEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditActionPerformed
        // TODO add your handling code here:
        status.setText("Sửa Từ");
        
        if (!jList1.isSelectionEmpty()) {
              dle.setVisible(true);
            dle.jLabel1.setText("Bạn đang sửa từ: ");
            dle.jLabel4.setText(jList1.getSelectedValue().toString());
            dle.jTextField1.setText(jList1.getSelectedValue().toString());
            dle.jTextField2.setText("");
            
            
        } else {
              dle.setVisible(false);
            JOptionPane.showMessageDialog(null, "Không có từ được chọn");
          
        }
        
        


    }//GEN-LAST:event_btEditActionPerformed

    private void btDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteActionPerformed
        // TODO add your handling code here:
        status.setText("Xóa Từ");
       
        if(jList1.getSelectedIndex()!=-1)
        {
               ult.deleteWord(jList1.getSelectedValue().toString().toLowerCase());
               arr.remove(jList1.getSelectedValue().toString().toLowerCase());
               Collections.sort(arr);
                JOptionPane.showMessageDialog(null, "Xóa từ thành công");
            try {
                wtf = new WriteToFile("newdictionaries");
                wtf.Write(rf.tm.values());
            } catch (FileNotFoundException ex) {
                Logger.getLogger(DictGui.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(DictGui.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else 
            JOptionPane.showMessageDialog(null, "Bạn chưa chọn từ");
        
        
    }//GEN-LAST:event_btDeleteActionPerformed

    private void btWriteFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btWriteFileActionPerformed
        status.setText("Ghi file");
        try {
            wtf = new WriteToFile("newdictionaries");
        } catch (FileNotFoundException | UnsupportedEncodingException ex) {
            Logger.getLogger(DictGui.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            wtf.Write(rf.tm.values());
        } catch (IOException ex) {
            Logger.getLogger(DictGui.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "Ghi ra File thành công");


    }//GEN-LAST:event_btWriteFileActionPerformed
    Player p;
    private void btSpeakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSpeakActionPerformed
        // TODO add your handling code here:
        status.setText("Cách Đọc");
        int index = jList1.getSelectedIndex();
        String name1 = "Sound/" + arr.get(index) + ".mp3";
        try {
            if (btSpeak.getText().equals("Phát Âm")) {

                File f = new File(name1);
                FileInputStream fi = new FileInputStream(f);
                p = new Player(fi);
                p.play();

            } else {
                btSpeak.setText("Phát Âm");
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btSpeakActionPerformed

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        // TODO add your handling code here:
        status.setText("Sẵn Sàng");
        jList1.clearSelection();

    }//GEN-LAST:event_jPanel2MouseClicked

    private void tpReadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tpReadMouseClicked
        // TODO add your handling code here:
        status.setText("Sẵn Sàng");
        jList1.clearSelection();
    }//GEN-LAST:event_tpReadMouseClicked

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
        status.setText("Sẵn Sàng");
        jList1.clearSelection();
    }//GEN-LAST:event_formMouseClicked

    private void btExit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExit1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btExit1ActionPerformed

    private void btRefrestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRefrestActionPerformed
        // TODO add your handling code here:
        lst.clear();
        Init();
    }//GEN-LAST:event_btRefrestActionPerformed

    private void tfWordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfWordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfWordActionPerformed

    private String getFind(String word) {
        word = word.toLowerCase();
        if (rf.tm.containsKey(word)) {
            Word mw = (Word) rf.tm.get(word);
            return "\n *Từ:\t" + mw.getWordTarget()+ "\n\n *Nghĩa:\n\t" + mw.getWordExplain();
        } else if (word.compareTo("") == 0) {
            tpRead.setText("");
            JOptionPane.showMessageDialog(null, "Bạn chưa nhập từ");
            return "";
        } else {
            return "Không có từ trong từ điển";
        }

    }

    private void Init() {

        Collection<Word> col2 = rf.tm.values();
        col2.stream().forEach((mw) -> {
            lst.addElement(mw.getWordTarget());
        });

    }

    public void showTime() {
        Date time = new Date();
        dateTime.setText(sdf.format(time));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdd;
    private javax.swing.JButton btDelete;
    private javax.swing.JButton btEdit;
    private javax.swing.JButton btExit1;
    private javax.swing.JButton btFind;
    private javax.swing.JButton btRefrest;
    private javax.swing.JButton btSpeak;
    private javax.swing.JButton btWriteFile;
    private javax.swing.JLabel dateTime;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JList jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel status;
    private javax.swing.JTextField tfWord;
    private javax.swing.JTextPane tpRead;
    // End of variables declaration//GEN-END:variables
}
