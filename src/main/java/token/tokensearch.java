/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package token;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import metro_system.convar;
import metro_system.mainframe;

/**
 *
 * @author sparsh
 */
public class tokensearch extends javax.swing.JInternalFrame  implements convar{

    static String s[]=new String[4];
    static Integer n;
    /**
     * Creates new form tokensearch
     */
    public tokensearch() {
        initComponents();
        Integer a=1;
        jSpinner1.setValue(a);
        Connection myconnection;
        
        
        try{
             myconnection =DriverManager.getConnection(path+place, username, password);
             try
             {
                 String query="select * from routetable";
                 PreparedStatement mystatement=myconnection.prepareStatement(query);
                 ResultSet myres = mystatement.executeQuery();
                 if(myres.next())
                 {
                      do
                      {
                          jComboBox3.addItem(myres.getString("route"));
                            jComboBox2.addItem(myres.getString("route"));
                      }
                      while(myres.next());

       
                     
                 }
             }
             catch(Exception e)
             {
                 JOptionPane.showMessageDialog(rootPane, "Error:"+e.getMessage());
             }
             finally
                     {
                         myconnection.close();
                     }
        }
        
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(rootPane, "Connection Error:"+e.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jComboBox5 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();

        setClosable(true);
        setIconifiable(true);

        jLabel2.setText("To:");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Route" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "choose route first" }));

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "choose route first" }));

        jLabel1.setText("From");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose route" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jButton1.setText("Proceed");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Number of person(s)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99)
                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(172, 172, 172))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        Connection myconnection;

        if(jComboBox3.getSelectedIndex()>0){
            try{
                myconnection =DriverManager.getConnection(path+place, username, password);
                try
                {
                    String query="select * from stationtable where route=?";
                    PreparedStatement mystatement=myconnection.prepareStatement(query);
                    mystatement.setString(1, jComboBox3.getSelectedItem().toString());

                    ResultSet myres = mystatement.executeQuery();
                    jComboBox5.removeAllItems();
                    jComboBox5.addItem("choose station");
                    if(myres.next())
                    {  
                        do
                        {
                            jComboBox5.addItem(myres.getString("stn_name"));

                        }
                        while(myres.next());

                    }
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(rootPane, "Error:"+e.getMessage());
                }
                finally
                {
                    myconnection.close();
                }
            }

            catch(Exception e)
            {
                JOptionPane.showMessageDialog(rootPane, "Connection Error:"+e.getMessage());
            }
        }
        else{
            jComboBox5.addItem("choose route first");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        Connection myconnection;

        if(jComboBox2.getSelectedIndex()>0){
            try{
                myconnection =DriverManager.getConnection(path+place, username, password);
                try
                {
                    String query="select * from stationtable where route=?";
                    PreparedStatement mystatement=myconnection.prepareStatement(query);
                    mystatement.setString(1, jComboBox2.getSelectedItem().toString());
                    ResultSet myres = mystatement.executeQuery();
                    jComboBox4.removeAllItems();
                        jComboBox4.addItem("choose station");
                    if(myres.next())
                    {  
                        do
                        {
                            jComboBox4.addItem(myres.getString("stn_name"));

                        }
                        while(myres.next());

                    }
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(rootPane, "Error:"+e.getMessage());
                }
                finally
                {
                    myconnection.close();
                }
            }

            catch(Exception e)
            {
                JOptionPane.showMessageDialog(rootPane, "Connection Error:"+e.getMessage());
            }
        }
        else{
            jComboBox4.addItem("choose route first");
        }
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            if(jComboBox2.getSelectedIndex()>0 && jComboBox3.getSelectedIndex()>0 && jComboBox4.getSelectedIndex()>0 && jComboBox5.getSelectedIndex()>0 )
            {               
                s[0] = jComboBox2.getSelectedItem().toString();
                s[1] = jComboBox4.getSelectedItem().toString();
                s[2] = jComboBox3.getSelectedItem().toString();
                s[3] = jComboBox5.getSelectedItem().toString();
                 n=Integer.parseInt(jSpinner1.getValue().toString());
                token obj=new token();
                mainframe.jDesktopPane1.add(obj);
                obj.setVisible(true);
            }
            else{
                JOptionPane.showMessageDialog(rootPane, "Please select appropriate option");
                
            }
                
                
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSpinner jSpinner1;
    // End of variables declaration//GEN-END:variables
}
