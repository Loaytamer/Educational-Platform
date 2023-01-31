
import java.awt.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
public class InstructorA extends javax.swing.JFrame {
    public InstructorA() {
        initComponents();
        fillcombobox();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3a = new javax.swing.JPanel();
        jLabel1a = new javax.swing.JLabel();
        jComboBox1a = new javax.swing.JComboBox<>();
        jButton1a = new javax.swing.JButton();
        jButton2a = new javax.swing.JButton();
        jLabel2a = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel4a = new javax.swing.JPanel();
        noteslabel1 = new javax.swing.JLabel();
        note1 = new javax.swing.JButton();
        note2a = new javax.swing.JButton();
        note3 = new javax.swing.JButton();
        note4 = new javax.swing.JButton();
        note5 = new javax.swing.JButton();
        note6 = new javax.swing.JButton();
        note7 = new javax.swing.JButton();
        note8 = new javax.swing.JButton();
        notessep = new javax.swing.JSeparator();
        sep2a = new javax.swing.JSeparator();
        sep3a = new javax.swing.JSeparator();
        sep4a = new javax.swing.JSeparator();
        sep5a = new javax.swing.JSeparator();
        sep6a = new javax.swing.JSeparator();
        sep7a = new javax.swing.JSeparator();
        sep8a = new javax.swing.JSeparator();
        sep9a = new javax.swing.JSeparator();
        note9 = new javax.swing.JButton();
        note10 = new javax.swing.JButton();
        sep10 = new javax.swing.JSeparator();
        sep11 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3a.setBackground(new java.awt.Color(255, 153, 153));

        jLabel1a.setBackground(new java.awt.Color(255, 153, 153));
        jLabel1a.setForeground(new java.awt.Color(36, 47, 65));
        jLabel1a.setText(" Choose Lecture: ");
        jLabel1a.setOpaque(true);

        jComboBox1a.setBackground(new java.awt.Color(255, 204, 255));
        jComboBox1a.setEditable(true);
        jComboBox1a.setToolTipText("Tap to choose lecture");
        jComboBox1a.setOpaque(false);
        jComboBox1a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1aActionPerformed(evt);
            }
        });

        jButton1a.setBackground(new java.awt.Color(36, 47, 65));
        jButton1a.setForeground(new java.awt.Color(204, 204, 204));
        jButton1a.setText("Open");
        jButton1a.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(35, 47, 65), new java.awt.Color(35, 47, 65), new java.awt.Color(35, 47, 65), new java.awt.Color(35, 47, 65)));
        jButton1a.setBorderPainted(false);
        jButton1a.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1aMouseClicked(evt);
            }
        });
        jButton1a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1aActionPerformed(evt);
            }
        });

        jButton2a.setBackground(new java.awt.Color(255, 153, 153));
        jButton2a.setForeground(new java.awt.Color(204, 204, 204));
        jButton2a.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add file.png"))); // NOI18N
        jButton2a.setMnemonic('a');
        jButton2a.setToolTipText("Add Lecture");
        jButton2a.setBorderPainted(false);
        jButton2a.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2aMouseClicked(evt);
            }
        });
        jButton2a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2aActionPerformed(evt);
            }
        });

        jLabel2a.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2a.setText("Add Materials");

        jButton1.setBackground(new java.awt.Color(255, 153, 153));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-home-40.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3aLayout = new javax.swing.GroupLayout(jPanel3a);
        jPanel3a.setLayout(jPanel3aLayout);
        jPanel3aLayout.setHorizontalGroup(
            jPanel3aLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3aLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jLabel1a, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1a, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1a, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3aLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3aLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2a)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3aLayout.createSequentialGroup()
                        .addComponent(jButton2a, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)))
                .addGap(342, 342, 342))
            .addGroup(jPanel3aLayout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3aLayout.setVerticalGroup(
            jPanel3aLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3aLayout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(56, 56, 56)
                .addGroup(jPanel3aLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1a, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1a, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1a, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jButton2a, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2a, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4a.setBackground(new java.awt.Color(36, 47, 65));

        noteslabel1.setBackground(new java.awt.Color(255, 153, 153));
        noteslabel1.setFont(new java.awt.Font("Segoe UI", 2, 20)); // NOI18N
        noteslabel1.setText("                      NOTES");
        noteslabel1.setOpaque(true);

        note1.setBackground(new java.awt.Color(35, 47, 65));
        note1.setForeground(new java.awt.Color(204, 204, 204));
        note1.setText("Note 1");
        note1.setBorder(null);
        note1.setOpaque(false);
        note1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                note1ActionPerformed(evt);
            }
        });

        note2a.setBackground(new java.awt.Color(35, 47, 65));
        note2a.setForeground(new java.awt.Color(204, 204, 204));
        note2a.setText("Note 2");
        note2a.setBorder(null);
        note2a.setOpaque(false);
        note2a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                note2aActionPerformed(evt);
            }
        });

        note3.setBackground(new java.awt.Color(35, 47, 65));
        note3.setForeground(new java.awt.Color(204, 204, 204));
        note3.setText("Note 3");
        note3.setBorder(null);
        note3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                note3ActionPerformed(evt);
            }
        });

        note4.setBackground(new java.awt.Color(35, 47, 65));
        note4.setForeground(new java.awt.Color(204, 204, 204));
        note4.setText("Note 4");
        note4.setBorder(null);
        note4.setOpaque(false);
        note4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                note4ActionPerformed(evt);
            }
        });

        note5.setBackground(new java.awt.Color(35, 47, 65));
        note5.setForeground(new java.awt.Color(204, 204, 204));
        note5.setText("Note 5");
        note5.setBorder(null);
        note5.setOpaque(false);
        note5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                note5ActionPerformed(evt);
            }
        });

        note6.setBackground(new java.awt.Color(35, 47, 65));
        note6.setForeground(new java.awt.Color(204, 204, 204));
        note6.setText("Note 6");
        note6.setBorder(null);
        note6.setOpaque(false);
        note6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                note6ActionPerformed(evt);
            }
        });

        note7.setBackground(new java.awt.Color(35, 47, 65));
        note7.setForeground(new java.awt.Color(204, 204, 204));
        note7.setText("Note 7");
        note7.setBorder(null);
        note7.setOpaque(false);
        note7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                note7ActionPerformed(evt);
            }
        });

        note8.setBackground(new java.awt.Color(35, 47, 65));
        note8.setForeground(new java.awt.Color(204, 204, 204));
        note8.setText("Note 8");
        note8.setBorder(null);
        note8.setOpaque(false);
        note8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                note8ActionPerformed(evt);
            }
        });

        note9.setBackground(new java.awt.Color(35, 47, 65));
        note9.setForeground(new java.awt.Color(204, 204, 204));
        note9.setText("Note 9");
        note9.setBorder(null);
        note9.setOpaque(false);
        note9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                note9ActionPerformed(evt);
            }
        });

        note10.setBackground(new java.awt.Color(35, 47, 65));
        note10.setForeground(new java.awt.Color(204, 204, 204));
        note10.setText(" Note 10");
        note10.setBorder(null);
        note10.setOpaque(false);
        note10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                note10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4aLayout = new javax.swing.GroupLayout(jPanel4a);
        jPanel4a.setLayout(jPanel4aLayout);
        jPanel4aLayout.setHorizontalGroup(
            jPanel4aLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4aLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4aLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(noteslabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                    .addComponent(note1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(note2a, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(note3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(note4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(note5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(note6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(note7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(note8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(notessep)
                    .addComponent(sep2a)
                    .addComponent(sep3a)
                    .addComponent(sep4a)
                    .addComponent(sep5a)
                    .addComponent(sep6a)
                    .addComponent(sep7a)
                    .addComponent(sep8a)
                    .addComponent(sep9a)
                    .addComponent(note9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(note10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sep10)
                    .addComponent(sep11))
                .addContainerGap())
        );
        jPanel4aLayout.setVerticalGroup(
            jPanel4aLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4aLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(noteslabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(notessep, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(note1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sep2a, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(note2a)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sep3a, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(note3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sep4a, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(note4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sep5a, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(note5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sep6a, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(note6)
                .addGap(8, 8, 8)
                .addComponent(sep7a, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(note7)
                .addGap(6, 6, 6)
                .addComponent(sep8a, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(note8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sep9a, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(note9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sep10, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(note10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sep11, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel3a, javax.swing.GroupLayout.PREFERRED_SIZE, 765, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel4a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3a, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4a, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1aMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1aMouseClicked
        
    }//GEN-LAST:event_jButton1aMouseClicked
   private void deleteA(String a)
    {try{
        File inputFileA = new File("combobox.txt");
        File tempFileA = new File("myTempFile.txt");
        BufferedReader readerA = new BufferedReader(new FileReader(inputFileA));
        BufferedWriter writerA = new BufferedWriter(new FileWriter(tempFileA));
        String lineToRemove = a;
        String currentLine;
        while((currentLine = readerA.readLine()) != null) {
            // trim newline when comparing with lineToRemove
            String trimmedLine = currentLine.trim();
            if(trimmedLine.equals(lineToRemove)) continue;
            writerA.write(currentLine + System.getProperty("line.separator"));
        }
        writerA.close(); 
        readerA.close(); 
        boolean successful = tempFileA.renameTo(inputFileA);
    }
    catch(Exception e)
    {
        e.printStackTrace();
    }       
    }    
    private void fillcombobox()
    {
        File fa = new File("combobox.txt");
         Scanner sca =null;
        try{
            sca = new Scanner(fa);
            while(sca.hasNext())
            {
            jComboBox1a.addItem(sca.nextLine());
            } 
            sca.close();
        }
        catch(Exception e)
        { e.printStackTrace();}
    }
    public String newpath;
    private void jButton2aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2aActionPerformed
        // TODO add your handling code here:
         //Upload the lecture
        JFileChooser lec_upload=new JFileChooser();
        int resa= lec_upload.showOpenDialog(null);
        if(resa == JFileChooser.APPROVE_OPTION){
            //get lecture path
            File lec_path = new File(lec_upload.getSelectedFile().getAbsolutePath());
            newpath =(String)lec_upload.getSelectedFile().toString();
        }
        //store lecture number
        String lec_nameA= JOptionPane.showInputDialog("Enter Lecture Name:");
        if (lec_nameA==null){ JOptionPane.showMessageDialog(this,"Invalid Choice","Warning",JOptionPane.ERROR_MESSAGE);}
        else {
        //add lecture to cmbobox
        jComboBox1a.addItem(lec_nameA); 
        try { 
            PrintWriter outputStream,ostream;
            //create txt file to store the path of lecture
            outputStream = new PrintWriter(new FileWriter(lec_nameA+".txt"));
            outputStream.println(newpath);
            outputStream.close();
            ostream = new PrintWriter(new FileWriter("combobox.txt",true));
            ostream.println(lec_nameA);
            ostream.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        }
    }//GEN-LAST:event_jButton2aActionPerformed

    private void jButton2aMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2aMouseClicked
       
    }//GEN-LAST:event_jButton2aMouseClicked

    private void jButton1aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1aActionPerformed
        //check if the combobox is empty or not
        if (jComboBox1a.getItemCount()==0)
        { JOptionPane.showMessageDialog(this, "There Is No Lecture To Show", "Message",JOptionPane.PLAIN_MESSAGE);}
        else{
        //get wanted lecture to open
        String leca =(String)jComboBox1a.getSelectedItem();
        try{
            File file = new File(leca+".txt");
            //check if the file which holds lecture path already exists
            if (file.exists()){
            Scanner sa =new Scanner (file);
            String lecpath = sa.nextLine();
            JOptionPane.showMessageDialog(this, lecpath);
            try {
            File lecfile = new File (lecpath);
                 //check if lecture path is valid
                 if(lecfile.exists()){
                     //to open lecture pdf
                     if(Desktop.isDesktopSupported()){
                         Desktop.getDesktop().open(lecfile);
                     }
                     else {
                         JOptionPane.showMessageDialog(this,"Not Found","ERROR!",JOptionPane.ERROR_MESSAGE);
                     }
                 }
                 //if lecture path not found
                 else{
                     JOptionPane.showMessageDialog(this,"Lecture Not Found","ERROR!",JOptionPane.ERROR_MESSAGE);
                 }
            //if the file not found
           
            } catch(Exception e){
                e.printStackTrace();
                } 
                }
             else
                {
                JOptionPane.showMessageDialog(this,"Lecture Not Found","ERROR!",JOptionPane.ERROR_MESSAGE);
                }
            }
            catch(Exception e){e.printStackTrace();
            }
        }        
    }//GEN-LAST:event_jButton1aActionPerformed
private static boolean checkfound;
    private void note6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_note6ActionPerformed
        // TODO add your handling code here:
         try{ 
            File file_path = new File("Note6.txt"); 
            if(file_path.exists()){ 
            if(Desktop.isDesktopSupported()){ 
            Desktop.getDesktop().open(file_path); 
            } 
             
            else{ 
            JOptionPane.showMessageDialog(this,"Note Not Supported"); 
            } 
             
            } 
            else{ 
            JOptionPane.showMessageDialog(this,"Note Doesn't Exist"); 
            } 
        } 
            catch(Exception e){ 
            e.printStackTrace(); 
            }     
    }//GEN-LAST:event_note6ActionPerformed

    private void note1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_note1ActionPerformed
        try{ 
            File file_path = new File("Note1.txt"); 
            if(file_path.exists()){ 
            if(Desktop.isDesktopSupported()){ 
            Desktop.getDesktop().open(file_path); 
            } 
             
            else{ 
            JOptionPane.showMessageDialog(this,"Note Not Supported"); 
            } 
             
            } 
            else{ 
            JOptionPane.showMessageDialog(this,"Note Doesn't Exist"); 
            } 
        } 
            catch(Exception e){ 
            e.printStackTrace(); 
            }     
    }//GEN-LAST:event_note1ActionPerformed

    private void note2aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_note2aActionPerformed
        try{ 
            File file_path = new File("Note2.txt"); 
            if(file_path.exists()){ 
            if(Desktop.isDesktopSupported()){ 
            Desktop.getDesktop().open(file_path); 
            } 
             
            else{ 
            JOptionPane.showMessageDialog(this,"Note Not Supported"); 
            } 
             
            } 
            else{ 
            JOptionPane.showMessageDialog(this,"Note Doesn't Exist"); 
            } 
        } 
            catch(Exception e){ 
            e.printStackTrace(); 
            }     
    }//GEN-LAST:event_note2aActionPerformed

    private void note3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_note3ActionPerformed
        try {
            File file_path = new File("Note3.txt");
            if (file_path.exists()) {
                if (Desktop.isDesktopSupported()) {
                    Desktop.getDesktop().open(file_path);
                } else {
                    JOptionPane.showMessageDialog(this, "Note Not Supported");
                }

            } else {
                JOptionPane.showMessageDialog(this, "Note Doesn't Exist");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }//GEN-LAST:event_note3ActionPerformed

    private void note4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_note4ActionPerformed
        try {
            File file_path = new File("Note4.txt");
            if (file_path.exists()) {
                if (Desktop.isDesktopSupported()) {
                    Desktop.getDesktop().open(file_path);
                } else {
                    JOptionPane.showMessageDialog(this, "Note Not Supported");
                }

            } else {
                JOptionPane.showMessageDialog(this, "Note Doesn't Exist");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_note4ActionPerformed

    private void note5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_note5ActionPerformed
        // TODO add your handling code here:
         try{ 
            File file_path = new File("Note5.txt"); 
            if(file_path.exists()){ 
            if(Desktop.isDesktopSupported()){ 
            Desktop.getDesktop().open(file_path); 
            } 
             
            else{ 
            JOptionPane.showMessageDialog(this,"Note Not Supported"); 
            } 
             
            } 
            else{ 
            JOptionPane.showMessageDialog(this,"Note Doesn't Exist"); 
            } 
        } 
            catch(Exception e){ 
            e.printStackTrace(); 
            }     
    }//GEN-LAST:event_note5ActionPerformed

    
    
    private void note7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_note7ActionPerformed
        // TODO add your handling code here:
         try{ 
            File file_path = new File("Note7.txt"); 
            if(file_path.exists()){ 
            if(Desktop.isDesktopSupported()){ 
            Desktop.getDesktop().open(file_path); 
            } 
             
            else{ 
            JOptionPane.showMessageDialog(this,"Note Not Supported"); 
            } 
             
            } 
            else{ 
            JOptionPane.showMessageDialog(this,"Note Doesn't Exist"); 
            } 
        } 
            catch(Exception e){ 
            e.printStackTrace(); 
            }     
    }//GEN-LAST:event_note7ActionPerformed

    private void note8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_note8ActionPerformed
        // TODO add your handling code here:
         try{ 
            File file_path = new File("Note8.txt"); 
            if(file_path.exists()){ 
            if(Desktop.isDesktopSupported()){ 
            Desktop.getDesktop().open(file_path); 
            } 
             
            else{ 
            JOptionPane.showMessageDialog(this,"Note Not Supported"); 
            } 
             
            } 
            else{ 
            JOptionPane.showMessageDialog(this,"Note Doesn't Exist"); 
            } 
        } 
            catch(Exception e){ 
            e.printStackTrace(); 
            }     
    }//GEN-LAST:event_note8ActionPerformed

    private void note9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_note9ActionPerformed
        // TODO add your handling code here:
         try{ 
            File file_path = new File("Note9.txt"); 
            if(file_path.exists()){ 
            if(Desktop.isDesktopSupported()){ 
            Desktop.getDesktop().open(file_path); 
            } 
             
            else{ 
            JOptionPane.showMessageDialog(this,"Note Not Supported"); 
            } 
             
            } 
            else{ 
            JOptionPane.showMessageDialog(this,"Note Doesn't Exist"); 
            } 
        } 
            catch(Exception e){ 
            e.printStackTrace(); 
            }     
    }//GEN-LAST:event_note9ActionPerformed

    private void note10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_note10ActionPerformed
        // TODO add your handling code here:
         try{ 
            File file_path = new File("Note10.txt"); 
            if(file_path.exists()){ 
            if(Desktop.isDesktopSupported()){ 
            Desktop.getDesktop().open(file_path); 
            } 
             
            else{ 
            JOptionPane.showMessageDialog(this,"Note Not Supported"); 
            } 
             
            } 
            else{ 
            JOptionPane.showMessageDialog(this,"Note Doesn't Exist"); 
            } 
        } 
            catch(Exception e){ 
            e.printStackTrace(); 
            }     
    }//GEN-LAST:event_note10ActionPerformed

    private void jComboBox1aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1aActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jComboBox1aActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 SignInl s1=new SignInl();
                    s1.show();
                    dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InstructorA().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    public javax.swing.JButton jButton1a;
    public javax.swing.JButton jButton2a;
    public javax.swing.JComboBox<String> jComboBox1a;
    public javax.swing.JLabel jLabel1a;
    public javax.swing.JLabel jLabel2a;
    public javax.swing.JPanel jPanel3a;
    public javax.swing.JPanel jPanel4a;
    public javax.swing.JButton note1;
    public javax.swing.JButton note10;
    public javax.swing.JButton note2a;
    public javax.swing.JButton note3;
    public javax.swing.JButton note4;
    public javax.swing.JButton note5;
    public javax.swing.JButton note6;
    public javax.swing.JButton note7;
    public javax.swing.JButton note8;
    public javax.swing.JButton note9;
    public javax.swing.JLabel noteslabel1;
    public javax.swing.JSeparator notessep;
    public javax.swing.JSeparator sep10;
    public javax.swing.JSeparator sep11;
    public javax.swing.JSeparator sep2a;
    public javax.swing.JSeparator sep3a;
    public javax.swing.JSeparator sep4a;
    public javax.swing.JSeparator sep5a;
    public javax.swing.JSeparator sep6a;
    public javax.swing.JSeparator sep7a;
    public javax.swing.JSeparator sep8a;
    public javax.swing.JSeparator sep9a;
    // End of variables declaration//GEN-END:variables
}
