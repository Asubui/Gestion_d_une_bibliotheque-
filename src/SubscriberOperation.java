
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Al Badmari
 */
public final class SubscriberOperation extends javax.swing.JFrame {

    private DefaultTableModel model;
    private Object btnDernier;

    /**
     * Creates new form SubscriberOperation
     */
    public SubscriberOperation() {
        initComponents();
        table_update();

    }
    
     Connection con;
    PreparedStatement pst;
    ResultSet rs;
    
    
    
    public void search(String str){
        model = (DefaultTableModel) tableSubs.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(model);
        tableSubs.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(str));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        javax.swing.JPanel jPanel4 = new javax.swing.JPanel();
        javax.swing.JPanel jPanel2 = new javax.swing.JPanel();
        textGmail = new javax.swing.JTextField();
        textName = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        textCity = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        textNumCNI = new javax.swing.JTextField();
        textTel = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel12 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        javax.swing.JButton jButton5 = new javax.swing.JButton();
        javax.swing.JButton btnSupABN = new javax.swing.JButton();
        javax.swing.JButton btnAjouterABN = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        textRechercher = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnPremier = new javax.swing.JButton();
        btnPrecedent = new javax.swing.JButton();
        btnSuivant = new javax.swing.JButton();
        btnDernier = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableSubs = new javax.swing.JTable();
        btnRetour = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(102, 204, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)), "OPERATION SUR L'ABONNE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe Print", 3, 24))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 102)));

        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        jLabel10.setText("Tel");

        textCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCityActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        jLabel9.setText("Ville");

        textTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textTelActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        jLabel11.setText("Gmail");

        jLabel12.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        jLabel12.setText("Numero CNI");

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        jLabel8.setText("Nom");

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button.png"))); // NOI18N
        jButton5.setText("Vider");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        btnSupABN.setBackground(new java.awt.Color(204, 0, 0));
        btnSupABN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trash.png"))); // NOI18N
        btnSupABN.setText("Supprimer");
        btnSupABN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupABNActionPerformed(evt);
            }
        });

        btnAjouterABN.setBackground(new java.awt.Color(0, 204, 0));
        btnAjouterABN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add.png"))); // NOI18N
        btnAjouterABN.setText("Ajouter");
        btnAjouterABN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjouterABNActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 0, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/modify.png"))); // NOI18N
        jButton3.setText("Modifier");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(textNumCNI, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(textGmail, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(btnSupABN, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(textCity, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(textTel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(textName, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAjouterABN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(btnAjouterABN))
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(textCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel10))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(textTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton5))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(textGmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(textNumCNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(btnSupABN)))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        textRechercher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textRechercherActionPerformed(evt);
            }
        });
        textRechercher.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textRechercherKeyReleased(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/search.png"))); // NOI18N
        jLabel1.setText("Entrez une Chaine");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(30, 30, 30)
                        .addComponent(textRechercher, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textRechercher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(38, 38, 38))
        );

        btnPremier.setBackground(new java.awt.Color(0, 204, 204));
        btnPremier.setText("<< Premier");
        btnPremier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPremierActionPerformed(evt);
            }
        });

        btnPrecedent.setBackground(new java.awt.Color(0, 204, 204));
        btnPrecedent.setText("< Precedent");
        btnPrecedent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrecedentActionPerformed(evt);
            }
        });

        btnSuivant.setBackground(new java.awt.Color(0, 204, 204));
        btnSuivant.setText("Suivant >");
        btnSuivant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuivantActionPerformed(evt);
            }
        });

        btnDernier.setBackground(new java.awt.Color(0, 204, 204));
        btnDernier.setText("Dernier >>");
        btnDernier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDernierActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btnPremier)
                        .addGap(32, 32, 32)
                        .addComponent(btnPrecedent)
                        .addGap(34, 34, 34)
                        .addComponent(btnSuivant)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDernier)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPremier)
                    .addComponent(btnPrecedent)
                    .addComponent(btnSuivant)
                    .addComponent(btnDernier))
                .addGap(75, 75, 75))
        );

        tableSubs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nom", "Ville", "Tel", "Gmail", "NumCNI", "id"
            }
        ));
        tableSubs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableSubsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableSubs);
        if (tableSubs.getColumnModel().getColumnCount() > 0) {
            tableSubs.getColumnModel().getColumn(5).setMinWidth(0);
            tableSubs.getColumnModel().getColumn(5).setPreferredWidth(0);
            tableSubs.getColumnModel().getColumn(5).setMaxWidth(0);
        }

        btnRetour.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back(1).png"))); // NOI18N
        btnRetour.setText("Retour");
        btnRetour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetourActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRetour))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRetour)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
     public void table_update()
        {
            
            int c;
            
            
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/gestionbibliotheque?useSSL=true","root","");
            pst = con.prepareStatement("SELECT * FROM ABONNE");
            
            ResultSet resultset = pst.executeQuery();
            
            ResultSetMetaData rd = resultset.getMetaData();
            
            c = rd.getColumnCount();
            DefaultTableModel df = (DefaultTableModel)tableSubs.getModel();
            
            df.setRowCount(0);
                DefaultTableModel model = (DefaultTableModel) tableSubs.getModel();
            
            while(resultset.next())
            {
                Vector v2 = new Vector();
                for(int i=1; i<=c; i++)
                {
                    v2.add(resultset.getString("Nom"));
                    v2.add(resultset.getString("Ville"));
                    v2.add(resultset.getString("Tel"));
                    v2.add(resultset.getString("Gmail"));
                    v2.add(resultset.getString("NumCNI"));
                }
                df.addRow(v2);
            }
        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SubscriberOperation.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SubscriberOperation.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
            
            
        }
    
    private void textTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textTelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textTelActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        textName.setText("");
        textCity.setText("");
        textTel.setText("");
        textGmail.setText("");
        textNumCNI.setText("");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnSupABNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupABNActionPerformed
        // TODO add your handling code here:
        DefaultTableModel d1 = (DefaultTableModel)tableSubs.getModel();
        int selectIndex = tableSubs.getSelectedRow();

        String id = d1.getValueAt(selectIndex, 0).toString();

        int dialogResult = JOptionPane.showConfirmDialog(this, "Voulez-vous supprimer cet Abonné ?", "Attention",JOptionPane.YES_NO_OPTION);

        if(textName.getText().equals("") || textCity.getText().equals("") || textTel.getText().equals("") || textGmail.getText().equals("") ||  textNumCNI.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Veillez selectionner un Abonné, SVP !");
        }

        else if(dialogResult == JOptionPane.YES_OPTION)
        {
               int row = tableSubs.getSelectedRow();
                DefaultTableModel model = (DefaultTableModel) tableSubs.getModel();
            model.removeRow(row);
       try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost/gestionbibliotheque?useSSL=true","root","");

                pst = con.prepareStatement("DELETE FROM Abonne WHERE nom = ?");

                pst.setString(1, id);
                pst.executeUpdate();

                JOptionPane.showMessageDialog(this, "Abonné supprimé avec Succès !");

            } catch (ClassNotFoundException ex) {
                Logger.getLogger(IssueBook.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(IssueBook.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
      
    }//GEN-LAST:event_btnSupABNActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
          DefaultTableModel df = (DefaultTableModel)tableSubs.getModel();
        int selectIndex = tableSubs.getSelectedRow();
        
        int dialogResult = JOptionPane.showConfirmDialog(this, "Voulez-vous modifier cet Abonne ?", "Attention",JOptionPane.YES_NO_OPTION);
            
            if(dialogResult == JOptionPane.YES_OPTION)
            {
                
                try {
                String id = df.getValueAt(selectIndex, 0).toString();
                String nom = textName.getText();
                String ville = textCity.getText();
                String tel = textTel.getText();
                String gmail = textGmail.getText();
                String  numCNI = textNumCNI.getText();
                
            
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost/gestionbibliotheque?useSSL=true","root","");
            
            
                pst = con.prepareStatement("UPDATE ABONNE set Nom = ?, Ville = ?, Tel = ?, Gmail =?, NumCNI = ? WHERE Nom = ? ");
                pst.setString(1, nom);
                pst.setString(2, ville);
                pst.setString(3, tel);
                pst.setString(4, gmail);
                pst.setString(5, numCNI);
                pst.setString(6, id);
            
                pst.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "Abonné Modifié !");
            table_update();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SubscriberOperation.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SubscriberOperation.class.getName()).log(Level.SEVERE, null, ex);
        }
                
            }
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tableSubsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableSubsMouseClicked
      DefaultTableModel mode = (DefaultTableModel)tableSubs.getModel();
      int index = tableSubs.getSelectedRow();
       textName.setText(mode.getValueAt(index,0).toString());
        textCity.setText(mode.getValueAt(index,1).toString());
        textTel.setText(mode.getValueAt(index,2).toString());
        textNumCNI.setText(mode.getValueAt(index,3).toString());
        textGmail.setText(mode.getValueAt(index,4).toString());
        
      
    }//GEN-LAST:event_tableSubsMouseClicked

    private void textCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCityActionPerformed

    private void btnAjouterABNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjouterABNActionPerformed
        // TODO add your handling code here:
        String nom =  textName.getText();
        String ville =   textCity.getText();
        String tel =   textTel.getText();
        String gmail = textGmail.getText();
        String numID =  textNumCNI.getText();
        if(nom.isEmpty() || ville.isEmpty() || tel.isEmpty() || gmail.isEmpty() || numID.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Veuillez remplir tous les champs", "Ressayez SVP!",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            DefaultTableModel model = (DefaultTableModel) tableSubs.getModel();
            model.addRow(new Object []{ nom, ville, tel, gmail, numID});
        }
            

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/GestionBibliotheque?useSSL=true","root","");

            pst = con.prepareStatement("INSERT INTO Abonne ( Nom, Ville, Tel, Gmail,NumCNI) VALUES (?,?,?,?,?)");

            pst.setString(1, nom);
            pst.setString(2, ville);
            pst.setString(3, tel);
            pst.setString(4, gmail);
            pst.setString(5, numID);
            pst.executeUpdate();
            table_update();

            JOptionPane.showMessageDialog(this, "Un abonné a été ajouté avec succés !");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SubscriberOperation.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SubscriberOperation.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnAjouterABNActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

    private void textRechercherKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textRechercherKeyReleased
        
        
        String searchString = textRechercher.getText();
        search(searchString);
    }//GEN-LAST:event_textRechercherKeyReleased

    private void btnRetourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetourActionPerformed
        this.hide();
        Home form = new Home();
        form.setVisible(true);
    }//GEN-LAST:event_btnRetourActionPerformed

    private void btnPremierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPremierActionPerformed
        Premier();
    }//GEN-LAST:event_btnPremierActionPerformed

    private void btnPrecedentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrecedentActionPerformed
        Precedent();
    }//GEN-LAST:event_btnPrecedentActionPerformed

    private void btnSuivantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuivantActionPerformed
        suivant();
    }//GEN-LAST:event_btnSuivantActionPerformed

    private void btnDernierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDernierActionPerformed
        dernier();
    }//GEN-LAST:event_btnDernierActionPerformed

    private void textRechercherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textRechercherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textRechercherActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SubscriberOperation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SubscriberOperation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SubscriberOperation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SubscriberOperation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SubscriberOperation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDernier;
    private javax.swing.JButton btnPrecedent;
    private javax.swing.JButton btnPremier;
    private javax.swing.JButton btnRetour;
    private javax.swing.JButton btnSuivant;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableSubs;
    private javax.swing.JTextField textCity;
    private javax.swing.JTextField textGmail;
    private javax.swing.JTextField textName;
    private javax.swing.JTextField textNumCNI;
    private javax.swing.JTextField textRechercher;
    private javax.swing.JTextField textTel;
    // End of variables declaration//GEN-END:variables
int d;
    void defilemnet(int defiler){
        try{
            
           if(d == 0){
               btnPremier.setEnabled(false);
               btnPrecedent.setEnabled(false);
               
           }else{
               btnPremier.setEnabled(true);
               btnPrecedent.setEnabled(true);
       
           }
            if(d == tableSubs.getRowCount()){
               btnSuivant.setEnabled(false);
               btnDernier.setEnabled(false);
               
           }else{
               btnSuivant.setEnabled(true);
               btnDernier.setEnabled(true);
       
           }
            
            textName.setText(tableSubs.getValueAt(defiler,0).toString());
            textCity.setText(tableSubs.getValueAt(defiler,1).toString());
            textTel.setText(tableSubs.getValueAt(defiler,2).toString());
            textNumCNI.setText(tableSubs.getValueAt(defiler,3).toString());
            textGmail.setText(tableSubs.getValueAt(defiler,4).toString());
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null,ex.getMessage(),"Defilement", JOptionPane.ERROR_MESSAGE);        }

}
    // boutton premier
    void Premier(){
        try{
            d=0;
            defilemnet(d);
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null,ex.getMessage(),"Premier", JOptionPane.ERROR_MESSAGE);        }
    }
    
     // boutton precedent
    void Precedent(){
        try{
            d--;
            defilemnet(d);
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null,ex.getMessage(),"Precedent", JOptionPane.ERROR_MESSAGE);        }
    }
    
    
    // boutton suivant
    void suivant(){
        try{
            d++;
            defilemnet(d);
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null,ex.getMessage(),"Suivant", JOptionPane.ERROR_MESSAGE);        }
    }
    
    
     // boutton Dernier
    void dernier(){
        try{
            d =tableSubs.getRowCount()-1 ;
            defilemnet(d);
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null,ex.getMessage(),"Dernier", JOptionPane.ERROR_MESSAGE);        }
    }
    

    
    
    
    
    
}

