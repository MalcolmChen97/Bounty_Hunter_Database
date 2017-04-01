/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MissionHolder;


import Main.*;
import static Main.signup.drawErrorDialog;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author MalcolmChen
 */
public class ItemMission extends javax.swing.JFrame {
    private static int itemMission=2000;
    
    private Connection con;
    private Statement stmt;
    private ResultSet rs;
    private int id;
    private PreparedStatement pst;
    /**
     * Creates new form ItemMission
     */
    public ItemMission(int id) {
        this.id=id;
        initComponents();
       
        con=Connector.getConnection();
        try{
            stmt = con.createStatement();
            String itemQuery = "select ItemName from Item_Name";
            rs = stmt.executeQuery(itemQuery);
            while(rs.next()){
                itembox.addItem(rs.getString("itemName"));
            }
           

        }catch(SQLException err){
            System.out.print(err);
            drawErrorDialog(err.toString(), "SQL Exception");
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

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        submit = new javax.swing.JButton();
        createmoney2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        des = new javax.swing.JTextPane();
        diff = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        deadline = new javax.swing.JTextField();
        createmoney = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        itembox = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 153)), "Item Mission", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Lucida Grande", 0, 24), new java.awt.Color(153, 153, 0))); // NOI18N

        jLabel3.setText("Item Related:");

        submit.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        createmoney2.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        createmoney2.setText("$");

        jLabel4.setText("Difficulty:");

        jLabel2.setText("Mission Description:");

        jLabel6.setText("Gold needed to Create:");

        jScrollPane1.setViewportView(des);

        diff.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                diffFocusLost(evt);
            }
        });
        diff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diffActionPerformed(evt);
            }
        });

        jLabel5.setText("Deadline:");

        jLabel1.setText("Mission Type: Item-Related");

        deadline.setText("(e.g. 1997/04/03)");
        deadline.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                deadlineFocusGained(evt);
            }
        });
        deadline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deadlineActionPerformed(evt);
            }
        });

        createmoney.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        createmoney.setText("-------");

        jButton2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        itembox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemboxActionPerformed(evt);
            }
        });

        jButton1.setText("Create Your Item");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(deadline))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(diff))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(21, 21, 21)
                            .addComponent(itembox, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(16, 16, 16)
                            .addComponent(jButton1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(31, 31, 31))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(createmoney2)
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(createmoney, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(submit)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(createmoney2)
                            .addComponent(createmoney))
                        .addGap(3, 89, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(itembox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(diff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addComponent(submit)
                        .addGap(15, 15, 15)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(deadline, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void deadlineFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_deadlineFocusGained
        // TODO add your handling code here:
         deadline.setText("");
    }//GEN-LAST:event_deadlineFocusGained

    private void diffFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_diffFocusLost
        // TODO add your handling code here:
        
        if(diff.getText().equals("s")||diff.getText().equals("S")){
            createmoney.setText("1000000");
        }else if(diff.getText().equals("A")||diff.getText().equals("a")){
            createmoney.setText("500000");
        }else if(diff.getText().equals("B")||diff.getText().equals("b")){
            createmoney.setText("250000");
        } else if(diff.getText().equals("C")||diff.getText().equals("c")){
            createmoney.setText("100000");
        } else if(diff.getText().equals("D")||diff.getText().equals("d")){
            createmoney.setText("50000");
        }else{
            JOptionPane.showMessageDialog(null, "Difficulty should be one of s,a,b,c,d");
        }
        
        
    }//GEN-LAST:event_diffFocusLost

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void diffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diffActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diffActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // TODO add your handling code here:
        String description=des.getText();
        String itemid=itembox.getItemAt(0).toString();
        //TODO
        String difficult=diff.getText();
        String dl=deadline.getText();
        String insertIMission="insert into Item_Foraging_Mission(itemMissionId,missionHolderID,deadline,description,expReward,goldReward,startTime) values(?,?,?,?,?,?,?)";
        try{
            pst=con.prepareStatement(insertIMission);
            pst.setInt(1, ItemMission.itemMission);
            ItemMission.itemMission=ItemMission.itemMission+1;
            pst.setInt(2, id);
            pst.setString(3, dl);
            pst.setString(4, description);
            if (diff.getText().equals("s") || diff.getText().equals("S")) {
                pst.setInt(5,100000);
                pst.setInt(6, 500000);
            } else if (diff.getText().equals("A") || diff.getText().equals("a")) {
                pst.setInt(5,50000);
                pst.setInt(6, 50000);
            } else if (diff.getText().equals("B") || diff.getText().equals("b")) {
                pst.setInt(5,10000);
                pst.setInt(6, 10000);
            } else if (diff.getText().equals("C") || diff.getText().equals("c")) {
                pst.setInt(5,1000);
                pst.setInt(6, 1000);
            } else if (diff.getText().equals("D") || diff.getText().equals("d")) {
                pst.setInt(5,100);
                pst.setInt(6, 100);
            }
            Calendar cal = Calendar.getInstance();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String data=sdf.format(cal.getTime());
            pst.setString(7, data);
            pst.execute();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        setVisible(false);
    }//GEN-LAST:event_submitActionPerformed

    private void deadlineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deadlineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deadlineActionPerformed

    private void itemboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemboxActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new createItem().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel createmoney;
    private javax.swing.JLabel createmoney2;
    private javax.swing.JTextField deadline;
    private javax.swing.JTextPane des;
    private javax.swing.JTextField diff;
    private javax.swing.JComboBox<String> itembox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables
}
