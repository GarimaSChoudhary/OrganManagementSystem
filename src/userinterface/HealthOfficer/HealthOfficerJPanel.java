/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.HealthOfficer;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.EnterpriseDirectory;
import Business.Network.Network;
import Business.Organization.AwarnessEvent;
import Business.Organization.FinanceEvent;
import Business.Person.Donors;
import Business.Users.Users;
import Business.WorkQueue.EventWorkRequest;
import Business.WorkQueue.WorkRequest;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Noordeep 
 */
public class HealthOfficerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateNGOJPanel
     */
    private JPanel userProcessContainer;
    private AwarnessEvent awarnesscamp;
    private FinanceEvent organization;
    private Enterprise enterprise;
    private Users userAccount;
    private EnterpriseDirectory enterpriseDirectory;
    private EcoSystem ecosystem;
    public HealthOfficerJPanel(JPanel userProcessContainer, Users account, FinanceEvent organization, Enterprise enterprise, EcoSystem business, Network network) {
       
        initComponents();
          this.userProcessContainer = userProcessContainer;
          this.userAccount=account;
          this.organization = organization;
          this.ecosystem = business;
      
          populateReqTbl();
          populate_list();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_ngo_title = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_list_of_events = new javax.swing.JTable();
        btn_accept = new javax.swing.JButton();
        btn_decline = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_list_of_donors = new javax.swing.JTable();
        lbl_list_of_donors = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1200, 800));
        setPreferredSize(new java.awt.Dimension(1200, 800));

        lbl_ngo_title.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_ngo_title.setForeground(new java.awt.Color(255, 0, 51));
        lbl_ngo_title.setText("Event Fund Requests ");

        tbl_list_of_events.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tbl_list_of_events.setForeground(new java.awt.Color(153, 0, 0));
        tbl_list_of_events.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Venue", "Date", "Time", "Status", "Amount", "Comments"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_list_of_events.setSelectionBackground(new java.awt.Color(255, 102, 102));
        tbl_list_of_events.setSelectionForeground(new java.awt.Color(255, 255, 51));
        jScrollPane1.setViewportView(tbl_list_of_events);

        btn_accept.setBackground(new java.awt.Color(255, 0, 51));
        btn_accept.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        btn_accept.setText("ACCEPT");
        btn_accept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_acceptActionPerformed(evt);
            }
        });

        btn_decline.setBackground(new java.awt.Color(255, 0, 51));
        btn_decline.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        btn_decline.setText("DECLINE");
        btn_decline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_declineActionPerformed(evt);
            }
        });

        tbl_list_of_donors.setForeground(new java.awt.Color(153, 0, 0));
        tbl_list_of_donors.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Donor Name", "Contact"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_list_of_donors.setSelectionBackground(new java.awt.Color(255, 102, 102));
        tbl_list_of_donors.setSelectionForeground(new java.awt.Color(255, 255, 51));
        jScrollPane2.setViewportView(tbl_list_of_donors);

        lbl_list_of_donors.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_list_of_donors.setForeground(new java.awt.Color(255, 0, 51));
        lbl_list_of_donors.setText("List of Donors ");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ksas12yl.gif"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_accept)
                .addGap(34, 34, 34)
                .addComponent(btn_decline)
                .addGap(75, 75, 75))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(1046, 1046, 1046)
                        .addComponent(lbl_ngo_title))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbl_list_of_donors, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jScrollPane2))))))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn_accept, btn_decline});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_ngo_title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_accept)
                    .addComponent(btn_decline))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(lbl_list_of_donors)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(230, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btn_accept, btn_decline});

    }// </editor-fold>//GEN-END:initComponents

    private void btn_declineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_declineActionPerformed
        // TODO add your handling code here:
        int selectedRow = tbl_list_of_events.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Please Select a row from table first", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }
        System.out.println(tbl_list_of_events.getValueAt(selectedRow, 0));
        EventWorkRequest ewr = (EventWorkRequest)tbl_list_of_events.getValueAt(selectedRow,0);
        ewr.setStatus("Declined");
        populateReqTbl();
    }//GEN-LAST:event_btn_declineActionPerformed

    private void btn_acceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_acceptActionPerformed
        // TODO add your handling code here:
         
        
        int selectedRow = tbl_list_of_events.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"No row selected, please Select a row from table first", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }
        System.out.println(tbl_list_of_events.getValueAt(selectedRow, 0));
        EventWorkRequest ewr = (EventWorkRequest)tbl_list_of_events.getValueAt(selectedRow,0);
        ewr.setStatus("Approved");
        populateReqTbl();
        
    }//GEN-LAST:event_btn_acceptActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_accept;
    private javax.swing.JButton btn_decline;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_list_of_donors;
    private javax.swing.JLabel lbl_ngo_title;
    private javax.swing.JTable tbl_list_of_donors;
    private javax.swing.JTable tbl_list_of_events;
    // End of variables declaration//GEN-END:variables

    private void populateReqTbl() {
        DefaultTableModel model = (DefaultTableModel) tbl_list_of_events.getModel();
        
        model.setRowCount(0);
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()){

            if(request instanceof EventWorkRequest){
            Object[] row = new Object[7];
            row[0] = request;
            row[1] = ((EventWorkRequest) request).getVenue();
            row[2] = ((EventWorkRequest) request).getDate();
            row[3] =((EventWorkRequest) request).getTime();
            row[4] = ((EventWorkRequest) request).getAmount();
            row[5] = ((EventWorkRequest) request).getComment();
            row[6] = ((EventWorkRequest) request).getStatus();
            
            model.addRow(row);}
        }
    }
    private void populate_list() {
        DefaultTableModel model = (DefaultTableModel) tbl_list_of_donors.getModel();
        
        model.setRowCount(0);
        for (Donors donr : ecosystem.getDonorDirectory()){
            Object[] row = new Object[3];
            row[0] = donr.getDonorName();
            row[1] = donr.getContact();
            
            model.addRow(row);
        }
    }
}
