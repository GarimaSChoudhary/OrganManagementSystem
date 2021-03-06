/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.PhysioTherapistRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.PhysioTherapist;
import Business.Users.Users;
import Business.WorkQueue.TherapistWorkRequest;
import Business.WorkQueue.WorkRequest;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author namangupta
 */
public class PhysioTherapistWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PhysioTherapistWorkAreaJPanel
     */
    JPanel userProcessContainer;
    Users account;
    PhysioTherapist organization;
    Enterprise enterprise;
    EcoSystem ecosystem;
    Network network;
    
    public PhysioTherapistWorkAreaJPanel(JPanel userProcessContainer, Users account, PhysioTherapist organization, Enterprise enterprise, EcoSystem ecosystem, Network network) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.account=account;
        this.organization=organization;
        this.enterprise=enterprise;
        this.ecosystem=ecosystem;
        this.network=network;
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblPatientData = new javax.swing.JTable();
        btnAssignTherapist = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1200, 800));
        setPreferredSize(new java.awt.Dimension(1200, 800));

        tblPatientData.setForeground(new java.awt.Color(102, 0, 0));
        tblPatientData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Patient ID", "Patient Name", "Doctor name", "Request Date", "Therapist", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPatientData.setSelectionBackground(new java.awt.Color(255, 153, 153));
        tblPatientData.setSelectionForeground(new java.awt.Color(255, 255, 0));
        jScrollPane1.setViewportView(tblPatientData);

        btnAssignTherapist.setBackground(new java.awt.Color(255, 0, 51));
        btnAssignTherapist.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAssignTherapist.setText("Assign me");
        btnAssignTherapist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignTherapistActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 0, 51));
        lblTitle.setText("Therapist Dashboard");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/82910-psychotherapy.gif"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAssignTherapist)
                        .addGap(540, 540, 540))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(491, 491, 491)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 719, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(332, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAssignTherapist)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel) tblPatientData.getModel();
        model.setRowCount(0);
        for (WorkRequest workRequest:organization.getWorkQueue().getWorkRequestList()) {
                Object[] row = new Object[6];
                row[0] = ((TherapistWorkRequest)workRequest).getPatient().getPatientId();
                row[1] = ((TherapistWorkRequest)workRequest).getPatient().getPatientName();
                row[2] = workRequest.getSender();
                row[3] = workRequest.getRequestDate();
                row[4] = workRequest.getReceiver();
                row[5] = workRequest.getStatus();
                model.addRow(row);   
        }                
    }
    
    
    private void btnAssignTherapistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignTherapistActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblPatientData.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Please select the request to assign");
            return;
        }

        WorkRequest request = null;
        for(WorkRequest w:organization.getWorkQueue().getWorkRequestList()){
            if(Integer.parseInt(""+tblPatientData.getValueAt(tblPatientData.getSelectedRow(), 0))==((TherapistWorkRequest)w).getPatient().getPatientId()){
             request=w;
             break;
            }
        }

        if(request.getStatus().equalsIgnoreCase("Assigned")){
            JOptionPane.showMessageDialog(null,"This patient is assigned");
        }
        request.setStatus("Assigned");
        request.setReceiver(account);
        populateTable();
        
    }//GEN-LAST:event_btnAssignTherapistActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssignTherapist;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblPatientData;
    // End of variables declaration//GEN-END:variables
}
