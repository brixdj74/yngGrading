package yngMain;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class grades extends javax.swing.JFrame {

    Connection conn;
    PreparedStatement pst,pst1;
    ResultSet rs,rs1;
    public ImageIcon logo = new ImageIcon(getClass().getResource("/img/logo.png"));
    
    public String empId;
    double p0;
    
    static final String USERNAME = "root";
    static final String PASSWORD = "";
    static final String DATACONN = "jdbc:mysql://localhost/sql12655413";
    
    public grades() {
        initComponents();
        conn = (com.mysql.jdbc.Connection) con();
        setResizable(false);
        setTitle("Grades");
        setIconImage(logo.getImage()); 
        refresh();HIDE();
    }
    
    void HIDE(){
        gid.setVisible(false);
    }
    
    public final Connection con(){
        try{
            conn = (com.mysql.jdbc.Connection) DriverManager.getConnection(DATACONN,USERNAME,PASSWORD);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,e);
        }
        return conn;
        
    }
    
    
    String f1,f2,f3;
    
    public void refresh(){
        try{
            pst = conn.prepareStatement("select * from grades where studentId = ? and subjectId = ?");
            pst.setString(1,studentId.getText());
            pst.setString(2,subjectId.getText());
            
            rs = pst.executeQuery();
            
            if(rs.next()){
                gid.setText(rs.getString("gradesId"));
                prelim.setText(rs.getString("prelim"));
                midterm.setText(rs.getString("midterm"));
                finals.setText(rs.getString("finals"));
                comp();
            }else{
                System.out.println("No grades found.");
            }
            
        }
        catch(Exception e){
            System.out.println("Error: "+e);
        }
        
    }
    
    
    //SELECT * FROM `student_units` inner join `subjects` on `student_units`.`get_sub` = `subjects`.`subject_id` where `student_units`.`get_student`='$getId' 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        studentId = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        studentName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        subjectId = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        prelim = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        midterm = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        finals = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        save = new javax.swing.JButton();
        remarks = new javax.swing.JLabel();
        gwa = new javax.swing.JLabel();
        subjectdesc = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        EMPID = new javax.swing.JLabel();
        skedyul = new javax.swing.JLabel();
        gid = new javax.swing.JLabel();
        klase = new javax.swing.JLabel();
        ave = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(310, 330));
        setSize(new java.awt.Dimension(310, 330));
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setLayout(null);

        studentId.setEditable(false);
        studentId.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.add(studentId);
        studentId.setBounds(10, 30, 100, 30);

        jLabel10.setText("Student Name");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(120, 10, 150, 16);

        jLabel18.setText("Student Id");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(10, 10, 80, 16);

        studentName.setEditable(false);
        studentName.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.add(studentName);
        studentName.setBounds(120, 30, 150, 30);

        jLabel4.setText("Subject Description");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(120, 70, 150, 16);

        subjectId.setEditable(false);
        subjectId.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.add(subjectId);
        subjectId.setBounds(10, 90, 100, 30);

        jLabel6.setText("Prelim");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(10, 150, 80, 16);

        prelim.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        prelim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prelimActionPerformed(evt);
            }
        });
        jPanel1.add(prelim);
        prelim.setBounds(10, 170, 80, 30);

        jLabel5.setText("Subject Id");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 70, 80, 16);

        jLabel19.setText("Midterm");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(100, 150, 80, 16);

        midterm.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        midterm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                midtermActionPerformed(evt);
            }
        });
        jPanel1.add(midterm);
        midterm.setBounds(100, 170, 80, 30);

        jLabel12.setText("Finals");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(190, 150, 80, 16);

        finals.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        finals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalsActionPerformed(evt);
            }
        });
        jPanel1.add(finals);
        finals.setBounds(190, 170, 80, 30);
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(10, 130, 260, 10);

        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        jPanel1.add(save);
        save.setBounds(170, 240, 100, 30);
        jPanel1.add(remarks);
        remarks.setBounds(0, 0, 1, 10);
        jPanel1.add(gwa);
        gwa.setBounds(0, 0, 1, 10);

        subjectdesc.setEditable(false);
        subjectdesc.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.add(subjectdesc);
        subjectdesc.setBounds(120, 90, 150, 30);
        jPanel1.add(jSeparator3);
        jSeparator3.setBounds(10, 220, 260, 10);

        EMPID.setText("jLabel1");
        jPanel1.add(EMPID);
        EMPID.setBounds(0, 0, 1, 10);

        skedyul.setText("jLabel1");
        jPanel1.add(skedyul);
        skedyul.setBounds(0, 0, 1, 10);
        jPanel1.add(gid);
        gid.setBounds(40, 240, 41, 0);

        klase.setText("jLabel1");
        jPanel1.add(klase);
        klase.setBounds(0, 0, 1, 10);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 10, 280, 280);
        getContentPane().add(ave);
        ave.setBounds(0, 0, 1, 10);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
    comp();
    System.out.println(prelim.getText()+","+midterm.getText()+","+finals.getText()+","+gwa.getText()+","+remarks.getText()+","+studentId.getText()+","+EMPID.getText()
    +","+subjectId.getText()+","+skedyul.getText()+","+p0+",No,"+klase.getText());
        try{
        pst = conn.prepareStatement("insert into grades (`prelim`,`midterm`,`finals`,`gwa`,`remarks`,`studentId`,`employeeId`,`subjectId`,`scheduleId`,`average`,`approve`,`class`)"
                + "values (?,?,?,?,?,?,?,?,?,?,?,?)");
        pst.setString(1,prelim.getText());
        pst.setString(2,midterm.getText());
        pst.setString(3,finals.getText());
        pst.setString(4,gwa.getText());
        pst.setString(5,remarks.getText());
        pst.setString(6,studentId.getText());
        pst.setString(7,EMPID.getText());
        pst.setString(8, subjectId.getText());
        pst.setString(9,skedyul.getText());
        pst.setDouble(10,p0);
        pst.setString(11,"No");
        pst.setString(12,klase.getText());
        
        if(JOptionPane.showConfirmDialog(null,"Save Grade","Save",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
                pst.executeUpdate();
                pst1 = conn.prepareStatement("delete from grades where gradesId = ?");
                pst1.setString(1,gid.getText());
                pst1.executeUpdate();
                JOptionPane.showMessageDialog(null,"Save Grade.\nSuccess!");
                dispose();
                new lists().studentList();
            }else{
            JOptionPane.showMessageDialog(null,"Failed to Save");
        }
        
    }catch(HeadlessException | SQLException e){
        System.out.println(e);
    }
        
        
    }//GEN-LAST:event_saveActionPerformed
    void comp(){
        try{
        
        if(prelim.getText().equals("")){
            prelim.setText("0");
        }
        if(midterm.getText().equals("")){
            midterm.setText("0");
        }
        if(finals.getText().equals("")){
            finals.setText("0");
        }
        
            
        double PRELIM = Double.parseDouble(prelim.getText());
        double MIDTERM = Double.parseDouble(midterm.getText());
        double FINALS = Double.parseDouble(finals.getText());
        double p1 = ((PRELIM * .3));
        double p2 = ((MIDTERM * .3));
        double p3 = ((FINALS * .4));
        p0 = (p1+p2+p3);
        String g0;
        ave.setText(""+p0);
        
        if(p0>=74.5){
            remarks.setText("Passed");
        }else{
            remarks.setText("Failed");
        }
        
        if(p0>=96.5 && p0<=100){
            g0 ="1";
        }else if(p0>=93.5 && p0<96.5){
            g0 ="1.25";
        }else if(p0>=90.5 && p0<93.5){
            g0 ="1.5";
        }else if(p0>=87.5 && p0<90.5){
            g0 ="1.75";
        }else if(p0>=84.5 && p0<87.5){
            g0 ="2";
        }else if(p0>=81.5 && p0<84.5){
            g0 ="2.25";
        }else if(p0>=78.5 && p0<81.5){
            g0 ="2.5";
        }else if(p0>=75.5 && p0<78.5){
            g0 ="2.75";
        }else if(p0>=74.5 && p0<75.5){
            g0 ="3";
        }else if(p0<74.5 && p0>74){
            g0 ="5";
        }else {
            g0= "INC";
        }
        gwa.setText(g0);
        
        System.out.println("Prelim - "+ p1);
        System.out.println("Midterm - "+ p2);
        System.out.println("Finals - "+ p3);
        System.out.println("Average - " + p0);
        System.out.println("GWA - " + g0);
        System.out.println("Remarks: " + remarks.getText());
        System.out.println("Instructor: "+ EMPID.getText());
        System.out.println("Schedule iD: "+skedyul.getText());
        }
        catch(NumberFormatException e){
            System.out.println(e);
        }
    }
    private void prelimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prelimActionPerformed
        comp();
    }//GEN-LAST:event_prelimActionPerformed

    private void midtermActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_midtermActionPerformed
        comp();
    }//GEN-LAST:event_midtermActionPerformed

    private void finalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalsActionPerformed
        comp();
    }//GEN-LAST:event_finalsActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("FlatLaf Light".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(grades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(grades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(grades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(grades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new grades().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel EMPID;
    private javax.swing.JLabel ave;
    public javax.swing.JTextField finals;
    private javax.swing.JLabel gid;
    private javax.swing.JLabel gwa;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    public javax.swing.JLabel klase;
    public javax.swing.JTextField midterm;
    public javax.swing.JTextField prelim;
    private javax.swing.JLabel remarks;
    private javax.swing.JButton save;
    public javax.swing.JLabel skedyul;
    public javax.swing.JTextField studentId;
    public javax.swing.JTextField studentName;
    public javax.swing.JTextField subjectId;
    public javax.swing.JTextField subjectdesc;
    // End of variables declaration//GEN-END:variables
}
