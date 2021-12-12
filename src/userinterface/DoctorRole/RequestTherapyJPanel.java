/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DoctorRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.PhysioEnterprise;
import Business.Network.Network;
import Business.Organization.HealthCare;
import Business.Organization.Organization;
import Business.Person.Patients;
import Business.Users.Users;
import Business.WorkQueue.TherapistWorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Noordeep
 */
public class RequestTherapyJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RequestTherapyJPanel
     */
    JPanel userProcessContainer;
    Users userAccount;
    String id;
    HealthCare org;
    EcoSystem ecoSystem;
    Enterprise enterprise;
    Network network;
    Patients p;
    public RequestTherapyJPanel(JPanel userProcessContainer, HealthCare organization, Users userAccount, Patients p, EcoSystem ecosystem, Enterprise enterprise, Network network) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.userAccount=userAccount;
        this.id=""+p.getPatientId();
        this.ecoSystem=ecosystem;
        this.p=p;
        this.org=organization;
        this.network=network;
        this.enterprise=enterprise;
        txt_patient_id.setText(id);
        txt_patient_name.setText(this.p.getPatientName());
        display();
    }
    
    public void display(){
        network_comboBox.addItem("--Select--");
        for(Network n: ecoSystem.getNetworkList()){
            network_comboBox.addItem(n.getName());
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

        lbl_patient_id = new javax.swing.JLabel();
        lbl_patient_name = new javax.swing.JLabel();
        txt_patient_id = new javax.swing.JTextField();
        txt_patient_name = new javax.swing.JTextField();
        lbl_network = new javax.swing.JLabel();
        network_comboBox = new javax.swing.JComboBox<>();
        lbl_therapy = new javax.swing.JLabel();
        lbl_therapy_catalog = new javax.swing.JLabel();
        btn_submit = new javax.swing.JButton();
        centers_comboBox = new javax.swing.JComboBox<>();
        therapy_comboBox = new javax.swing.JComboBox<>();
        btn_back = new javax.swing.JButton();
        lbl_request_therapy = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1200, 800));
        setPreferredSize(new java.awt.Dimension(1200, 800));

        lbl_patient_id.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_patient_id.setForeground(new java.awt.Color(255, 0, 0));
        lbl_patient_id.setText("Patient ID:");

        lbl_patient_name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_patient_name.setForeground(new java.awt.Color(255, 0, 0));
        lbl_patient_name.setText("Patient Name:");

        txt_patient_id.setEditable(false);

        txt_patient_name.setEditable(false);

        lbl_network.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_network.setForeground(new java.awt.Color(255, 0, 0));
        lbl_network.setText("Network:");

        network_comboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                network_comboBoxActionPerformed(evt);
            }
        });

        lbl_therapy.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_therapy.setForeground(new java.awt.Color(255, 0, 0));
        lbl_therapy.setText("Therapy Centers:");

        lbl_therapy_catalog.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_therapy_catalog.setForeground(new java.awt.Color(255, 0, 0));
        lbl_therapy_catalog.setText("Therapy Category:");

        btn_submit.setBackground(new java.awt.Color(255, 0, 51));
        btn_submit.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btn_submit.setForeground(new java.awt.Color(255, 255, 255));
        btn_submit.setText("Submit");
        btn_submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_submitActionPerformed(evt);
            }
        });

        centers_comboBox.setBackground(new java.awt.Color(255, 0, 51));
        centers_comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select--" }));
        centers_comboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                centers_comboBoxActionPerformed(evt);
            }
        });

        therapy_comboBox.setBackground(new java.awt.Color(255, 0, 51));
        therapy_comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select--" }));
        therapy_comboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                therapy_comboBoxActionPerformed(evt);
            }
        });

        btn_back.setBackground(new java.awt.Color(255, 0, 51));
        btn_back.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btn_back.setForeground(new java.awt.Color(255, 255, 255));
        btn_back.setText("Back");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });

        lbl_request_therapy.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        lbl_request_therapy.setForeground(new java.awt.Color(255, 0, 51));
        lbl_request_therapy.setText("Request Therapy");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/health.gif"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(244, 244, 244)
                        .addComponent(lbl_request_therapy, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(191, 191, 191)
                                .addComponent(btn_submit, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(107, 107, 107)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(46, 46, 46)
                                            .addComponent(lbl_patient_id)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txt_patient_id, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(26, 26, 26)
                                            .addComponent(lbl_patient_name)
                                            .addGap(18, 18, 18)
                                            .addComponent(txt_patient_name, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(60, 60, 60)
                                            .addComponent(lbl_network)
                                            .addGap(18, 18, 18)
                                            .addComponent(network_comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(lbl_therapy_catalog))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(therapy_comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGap(3, 3, 3)
                                            .addComponent(lbl_therapy)
                                            .addGap(18, 18, 18)
                                            .addComponent(centers_comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(243, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_back)
                    .addComponent(lbl_request_therapy, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_patient_id, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_patient_id, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_patient_name, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_patient_name, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(network_comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_network, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(centers_comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_therapy, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_therapy_catalog, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(therapy_comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btn_submit, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(345, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void centers_comboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_centers_comboBoxActionPerformed
       
        therapy_comboBox.removeAllItems();
        for(Network n: ecoSystem.getNetworkList()){
            if(network_comboBox.getSelectedItem().toString().equalsIgnoreCase(n.getName())){
                for(Enterprise e: n.getEnterpriseList().getEnterpriseList()){
                    if(e.getOrgName().equalsIgnoreCase(centers_comboBox.getSelectedItem().toString())){
                        for(Organization o: e.getOrganizationDirectory().getListOfOrganizations()){
                            therapy_comboBox.addItem(o.getOrgName());
                        }
                    }
                }
            }
        }
        
    }//GEN-LAST:event_centers_comboBoxActionPerformed

    private void therapy_comboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_therapy_comboBoxActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_therapy_comboBoxActionPerformed

    private void network_comboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_network_comboBoxActionPerformed
      
        centers_comboBox.removeAllItems();
        centers_comboBox.addItem("--Select--");
        for(Network n: ecoSystem.getNetworkList()){
            if(network_comboBox.getSelectedItem().toString().equalsIgnoreCase(n.getName())){
                for(Enterprise e: n.getEnterpriseList().getEnterpriseList()){
                    if(e.getEnterpriseType().getType().equalsIgnoreCase("Physio")){
                        centers_comboBox.addItem(e.getOrgName());
                    }
                   
                }
            }
        }
    }//GEN-LAST:event_network_comboBoxActionPerformed

    private void btn_submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_submitActionPerformed
        // TODO add your handling code here:
        boolean check;
        check=(!(centers_comboBox.getSelectedItem()==null||network_comboBox.getSelectedItem()==null||therapy_comboBox.getSelectedItem()==null));
        
        if(!check){
            JOptionPane.showMessageDialog(null, "Select proper options (or) doctors not available");
            return;
        }
        
        
        TherapistWorkRequest request = new TherapistWorkRequest();
        request.setPatientAccount(p);
        Organization orga = null;
        request.setSender(userAccount);
        request.setStatus("Requested");

        for(Network n: ecoSystem.getNetworkList()){
            if(n.getName().equalsIgnoreCase(network_comboBox.getSelectedItem().toString())){
                for(Enterprise e: n.getEnterpriseList().getEnterpriseList()){
                    if(e instanceof PhysioEnterprise&&e.getOrgName().equalsIgnoreCase(centers_comboBox.getSelectedItem().toString())){
                        for(Organization o:e.getOrganizationDirectory().getListOfOrganizations()){
                            if(o.getOrgName().equalsIgnoreCase(therapy_comboBox.getSelectedItem().toString())){
                                orga=o;
                                o.getWorkQueue().getWorkRequestList().add(request);
                                userAccount.getWorkQueue().getWorkRequestList().add(request);
                                JOptionPane.showMessageDialog(null, "Therapist service requested");
                            }
                        }
                    }
                }
            }
        }
        
        DoctorWorkAreaJPanel sa=new DoctorWorkAreaJPanel(userProcessContainer,userAccount,org,enterprise,ecoSystem,network);
        userProcessContainer.add("Customer Adding",sa);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btn_submitActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        // TODO add your handling code here:
        DoctorWorkAreaJPanel sa=new DoctorWorkAreaJPanel(userProcessContainer,userAccount,org,enterprise,ecoSystem,network);
        userProcessContainer.add("Customer Adding",sa);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btn_backActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_submit;
    private javax.swing.JComboBox<String> centers_comboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbl_network;
    private javax.swing.JLabel lbl_patient_id;
    private javax.swing.JLabel lbl_patient_name;
    private javax.swing.JLabel lbl_request_therapy;
    private javax.swing.JLabel lbl_therapy;
    private javax.swing.JLabel lbl_therapy_catalog;
    private javax.swing.JComboBox<String> network_comboBox;
    private javax.swing.JComboBox<String> therapy_comboBox;
    private javax.swing.JTextField txt_patient_id;
    private javax.swing.JTextField txt_patient_name;
    // End of variables declaration//GEN-END:variables
}
