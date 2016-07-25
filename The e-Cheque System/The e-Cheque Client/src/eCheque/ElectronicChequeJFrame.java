/*
 * ElectronicChequeJFrame.java
 *
 * Created on May 4, 2007, 5:29 PM
 */

package eCheque;

/**
 *
 * @author  Sherif Saad
 */
//import com.Trendy.swing.plaf.TrendyLookAndFeel;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import javax.swing.UIManager;
import javax.swing.JOptionPane;
import javax.crypto.Cipher;
import java.security.Key;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.File;
import java.security.PrivateKey;

public class ElectronicChequeJFrame extends javax.swing.JFrame {
    
    private RegistrationJFrame eChqueConfigureWindow;
    private EBankingJFrame eBankingWindow;
    private ChequeJFrame eChequeWindow;
    private SendChequeJFrame sendChequeWindow;
    private EChequeRegisteration registerdUser;
    private ReceiveChequeJFrame receiveChequeWindow;
    private String userName;
    private String passTemp;
    private PrivateKey privKey;
    private boolean privateKeyFlag;
    private boolean activationDone;
    private boolean activationNeed;
    /** Creates new form ElectronicChequeJFrame */
    public ElectronicChequeJFrame() {
       try{
            //TrendyLookAndFeel tlf = new TrendyLookAndFeel();
            //tlf.setCurrentTheme( new com.Trendy.swing.plaf.Themes.TrendyOrangeTheme());
            //UIManager.setLookAndFeel(tlf);
            UIManager.setLookAndFeel(
            UIManager.getSystemLookAndFeelClassName());
        }
        catch(Exception e){
            
            //JOptionPane.showMessageDialog(null,"System Error", "can not found themes", JOptionPane.ERROR_MESSAGE);
        
        }    
        
        initComponents();
        activationDone = false;
        loadUserInfo();
        eChqueConfigureWindow = new RegistrationJFrame();
        eChequeWindow = new ChequeJFrame(registerdUser);
        sendChequeWindow = new SendChequeJFrame(registerdUser);
        eBankingWindow = new EBankingJFrame(registerdUser);
        privateKeyFlag = false;
        
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jTUserName = new javax.swing.JTextField();
        jTPassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jBActivaton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jBConfigure = new javax.swing.JButton();
        jBReceivedCheque = new javax.swing.JButton();
        jBEBanking = new javax.swing.JButton();
        jBSendCheque = new javax.swing.JButton();
        jBDrawCheque = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("e-Cheque Client");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "e-Cheque Payment ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 0, 0))); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Welcome e-Cheque Client", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 0, 0))); // NOI18N

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Login", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 0, 0))); // NOI18N

        jLabel1.setText("User Name");

        jLabel2.setText("Password");

        jBActivaton.setText("Log in");
        jBActivaton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBActivatonMouseClicked(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel4Layout = new org.jdesktop.layout.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel4Layout.createSequentialGroup()
                        .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel4Layout.createSequentialGroup()
                                .add(jLabel2)
                                .add(18, 18, 18))
                            .add(jPanel4Layout.createSequentialGroup()
                                .add(jLabel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)))
                        .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(jTUserName)
                            .add(jTPassword, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE))
                        .addContainerGap(26, Short.MAX_VALUE))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel4Layout.createSequentialGroup()
                        .add(jBActivaton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 81, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(70, 70, 70))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jTUserName, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel2)
                    .add(jTPassword, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 12, Short.MAX_VALUE)
                .add(jBActivaton)
                .addContainerGap())
        );

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eCheque/resources/UserLogo.jpg"))); // NOI18N

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 114, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "GO TO:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 0, 0))); // NOI18N

        jBConfigure.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eCheque/resources/Config.jpg"))); // NOI18N
        jBConfigure.setToolTipText("System Configuration");
        jBConfigure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConfigureActionPerformed(evt);
            }
        });

        jBReceivedCheque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eCheque/resources/Send&Receivejpg.jpg"))); // NOI18N
        jBReceivedCheque.setToolTipText("Receive Cheque");
        jBReceivedCheque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBReceivedChequeMouseClicked(evt);
            }
        });

        jBEBanking.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eCheque/resources/E-Banking.jpg"))); // NOI18N
        jBEBanking.setToolTipText("E-Banking");
        jBEBanking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEBankingActionPerformed(evt);
            }
        });

        jBSendCheque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eCheque/resources/Send&Receivejpg.jpg"))); // NOI18N
        jBSendCheque.setToolTipText("Send Cheque");
        jBSendCheque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBSendChequeMouseClicked(evt);
            }
        });

        jBDrawCheque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eCheque/resources/Draw.jpg"))); // NOI18N
        jBDrawCheque.setToolTipText("e-Cheque Tools");
        jBDrawCheque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBDrawChequeMouseClicked(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel3Layout = new org.jdesktop.layout.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(jBEBanking, 0, 0, Short.MAX_VALUE)
                    .add(jBSendCheque, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 122, Short.MAX_VALUE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 16, Short.MAX_VALUE)
                .add(jBConfigure, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 120, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(jBReceivedCheque, 0, 0, Short.MAX_VALUE)
                    .add(jBDrawCheque, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 121, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel3Layout.createSequentialGroup()
                        .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jBReceivedCheque, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 109, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jBSendCheque, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 109, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jBEBanking, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(jBDrawCheque, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)))
                    .add(jPanel3Layout.createSequentialGroup()
                        .add(61, 61, 61)
                        .add(jBConfigure, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 128, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-465)/2, (screenSize.height-541)/2, 465, 541);
    }// </editor-fold>//GEN-END:initComponents

    private void jBConfigureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConfigureActionPerformed
// TODO add your handling code here:
        if(activationNeed)
            eChqueConfigureWindow.setVisible(true);
        else if(activationDone)
               eChqueConfigureWindow.setVisible(true);
         
    }//GEN-LAST:event_jBConfigureActionPerformed

    private void jBEBankingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEBankingActionPerformed
// TODO add your handling code here:
        if(activationDone)
        eBankingWindow.setVisible(true);
    }//GEN-LAST:event_jBEBankingActionPerformed

    private void jBReceivedChequeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBReceivedChequeMouseClicked
// TODO add your handling code here:
        if(activationDone)
        receiveChequeWindow.setVisible(true);
             
    }//GEN-LAST:event_jBReceivedChequeMouseClicked

    private void jBSendChequeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBSendChequeMouseClicked
// TODO add your handling code here:
        if(activationDone)
        sendChequeWindow.setVisible(true);
    }//GEN-LAST:event_jBSendChequeMouseClicked

    private void jBDrawChequeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBDrawChequeMouseClicked
// TODO add your handling code here:
        if(activationDone)
        eChequeWindow.setVisible(true);
    }//GEN-LAST:event_jBDrawChequeMouseClicked

    private void jBActivatonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBActivatonMouseClicked
    // TODO add your handling code here:
        passTemp="";
        userName = jTUserName.getText();
        char password[];
         
       
        password = jTPassword.getPassword();
        if(password.length >=8 && password.length <16){
        
            for(int i=0; i<password.length; i++){
                passTemp+=password[i];
            }
        
            if(password.length < 16){
            int pad = 16 - password.length;
                for(int i=0; i<pad; i++){
                   passTemp+=password[i];
                }  
            } 
        }
        
        if(userName.hashCode()== registerdUser.getUsername()&& userName.length()!=0){
            
            if(passTemp.hashCode()==registerdUser.getPasword()&& passTemp.length()!=0){
                
                jBConfigure.setEnabled(true);
                jBEBanking.setEnabled(true);
                jBDrawCheque.setEnabled(true);
                jBSendCheque.setEnabled(true);
                jBReceivedCheque.setEnabled(true);
                
                try {
                    
                        if(!privateKeyFlag){
             
                        //create AES Key with user password and cipher  
                        AESCrypt aesCrypt = new AESCrypt();
                        Key AES128 = aesCrypt.inilizeAESKeyByPassword(passTemp);
                        Cipher cipher = aesCrypt.initializeCipher(AES128,1);
                        InputStream in = new FileInputStream(registerdUser.getEWalletLoaction()+"\\Security Tools\\Private Key.key");
                        OutputStream out = new FileOutputStream(registerdUser.getEWalletLoaction()+"\\Security Tools\\PrivateKey.key"); 
                                  
                        // decrypt the private key with the AES key and delete the plain key
                        aesCrypt.crypt(in,out,cipher);
                        in.close();
                        out.close();
                        ObjectInputStream objIn = new ObjectInputStream (new FileInputStream(registerdUser.getEWalletLoaction()+"\\Security Tools\\PrivateKey.key"));
                                  
                        //load the user private key.
                        privKey = (PrivateKey)objIn.readObject();
                        objIn.close();
         
                        // delete the un secure key.
                        File control = new File(registerdUser.getEWalletLoaction()+"\\Security Tools\\PrivateKey.key");
                        control.delete();
                        receiveChequeWindow = new ReceiveChequeJFrame(registerdUser,privKey);
                        privateKeyFlag = true;
                        activationDone = true;
                        JOptionPane.showMessageDialog(null,"Welcome "+registerdUser.getClientName(),"Welcome Message",JOptionPane.INFORMATION_MESSAGE);
                        
                        }
                                
                }
                catch(Exception exp){
                    JOptionPane.showMessageDialog(null,"One of your security key is invaild");
                }
            }
            else{
                //invaild password
                JOptionPane.showMessageDialog(null,"Invaild user name or password","Access Denied", JOptionPane.INFORMATION_MESSAGE);
            }
                
        }
        else{
            //invaild user name
            JOptionPane.showMessageDialog(null,"Invaild user name or password","Access Denied", JOptionPane.INFORMATION_MESSAGE);
        }
  
    }//GEN-LAST:event_jBActivatonMouseClicked
    
    private void loadUserInfo(){
        try{
           registerdUser = new EChequeRegisteration();
           ObjectInputStream readObj = new ObjectInputStream(new FileInputStream("Config.epc"));
           registerdUser = (EChequeRegisteration)readObj.readObject();
           activationNeed = false;
           jBActivaton.setEnabled(true);
           jTUserName.setEnabled(true);
           jTPassword.setEnabled(true);
        
            
        }
        catch(IOException exp){
            JOptionPane.showMessageDialog(null,"Your e-Cheque System is not Configured Yet\nYou have to configure it first","System Configureation",
                    JOptionPane.INFORMATION_MESSAGE);
            jBActivaton.setEnabled(true);
            jTPassword.setEnabled(true);//Changed false to true, fixes initial setup error
            jTUserName.setEnabled(true);//changed false to true
            jBConfigure.setEnabled(true);
            activationNeed = true;
        }
        catch(ClassNotFoundException exp){
            exp.printStackTrace();
            
        }
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ElectronicChequeJFrame().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBActivaton;
    private javax.swing.JButton jBConfigure;
    private javax.swing.JButton jBDrawCheque;
    private javax.swing.JButton jBEBanking;
    private javax.swing.JButton jBReceivedCheque;
    private javax.swing.JButton jBSendCheque;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField jTPassword;
    private javax.swing.JTextField jTUserName;
    // End of variables declaration//GEN-END:variables
    
}
