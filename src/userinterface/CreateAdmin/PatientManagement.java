/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CreateAdmin;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Person.Patients;
import Business.Users.Users;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import Business.EcoSystem;
import java.util.ArrayList;

/**
 *
 * @author namangupta
 */
public class PatientManagement extends javax.swing.JPanel {

    JPanel userProcessContainer;
    OrganizationDirectory organizationDirectory; 
    Enterprise enterprise;
    EcoSystem ecoSystem;
    /**
     * Creates new form PatientManagement
     */
    public PatientManagement(JPanel userProcessContainer, OrganizationDirectory organizationDirectory, Enterprise enterprise,EcoSystem ecoSystem) {
        this.userProcessContainer=userProcessContainer;
        this.organizationDirectory=organizationDirectory;
        this.enterprise=enterprise;
        this.ecoSystem=ecoSystem;
        
        initComponents();
        populateDepartmentCB();
        txtPatientID.setText(""+this.ecoSystem.getPatientId());      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField4 = new javax.swing.JTextField();
        buttonGroup1 = new javax.swing.ButtonGroup();
        lblPatientDetails = new javax.swing.JLabel();
        lblPatientID = new javax.swing.JLabel();
        lblPatientName = new javax.swing.JLabel();
        lblPatientAge = new javax.swing.JLabel();
        lblPatientSpeciality = new javax.swing.JLabel();
        lblDoctor = new javax.swing.JLabel();
        txtPatientID = new javax.swing.JTextField();
        txtPatientName = new javax.swing.JTextField();
        txtPatientAge = new javax.swing.JTextField();
        cbDepartment = new javax.swing.JComboBox<>();
        cbDoctor = new javax.swing.JComboBox<>();
        lblContact = new javax.swing.JLabel();
        txtContact = new javax.swing.JTextField();
        btnSavePatient = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        lblSex = new javax.swing.JLabel();
        cbSex = new javax.swing.JComboBox<>();
        lblPatientCount = new javax.swing.JLabel();

        jTextField4.setText("jTextField4");

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1200, 800));
        setPreferredSize(new java.awt.Dimension(1200, 800));

        lblPatientDetails.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        lblPatientDetails.setText("Patient Details");

        lblPatientID.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        lblPatientID.setText("Patient ID :");

        lblPatientName.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        lblPatientName.setText("Name :");

        lblPatientAge.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        lblPatientAge.setText("Age :");

        lblPatientSpeciality.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        lblPatientSpeciality.setText("Speciality :");

        lblDoctor.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        lblDoctor.setText("Doctor :");

        cbDepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDepartmentActionPerformed(evt);
            }
        });

        cbDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDoctorActionPerformed(evt);
            }
        });

        lblContact.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        lblContact.setText("Phone Number :");

        btnSavePatient.setBackground(new java.awt.Color(0, 102, 153));
        btnSavePatient.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnSavePatient.setForeground(new java.awt.Color(255, 255, 255));
        btnSavePatient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/submit.png"))); // NOI18N
        btnSavePatient.setText("Submit");
        btnSavePatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSavePatientActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(0, 102, 153));
        btnBack.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back3.png"))); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblSex.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        lblSex.setText("Sex :");

        cbSex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select--", "Male", "Female", "Others" }));

        lblPatientCount.setBackground(new java.awt.Color(255, 51, 0));
        lblPatientCount.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        lblPatientCount.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(264, 264, 264)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(lblPatientDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(lblPatientID, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(txtPatientID, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(lblPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(lblPatientAge, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(txtPatientAge, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(lblSex, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(cbSex, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(lblContact, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(lblDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(cbDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(282, 282, 282)
                        .addComponent(btnSavePatient, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnBack)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(lblPatientSpeciality, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(cbDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(141, 141, 141)
                        .addComponent(lblPatientCount, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(481, 481, 481))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lblPatientDetails)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(lblPatientID))
                    .addComponent(txtPatientID, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(lblPatientName))
                    .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(lblPatientAge))
                    .addComponent(txtPatientAge, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(lblSex))
                    .addComponent(cbSex, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(lblContact))
                    .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(lblPatientSpeciality))
                            .addComponent(cbDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(lblDoctor))
                            .addComponent(cbDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnSavePatient, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblPatientCount, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(271, 271, 271))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void populateDepartmentCB(){
        cbDepartment.addItem("--Select--");
        for(Organization org: organizationDirectory.getListOfOrganizations()){
            if(org.getOrgType().getValue().equalsIgnoreCase("medical")){
                cbDepartment.addItem(org.getOrgName());
            }
        }
    }
    
    public void PatientCount(String doctor){
        int counter=0;
        for(Organization org: organizationDirectory.getListOfOrganizations()){
            if(org.getOrgType().getValue().equalsIgnoreCase("medical")){
                for(Patients p: org.getPatientDirectory().getListOfPatient()){
                    if(p.isIsAlive()&&p.getDoctor().equalsIgnoreCase(doctor)){
                        counter++;
                    }
                }
            }
        }
        lblPatientCount.setText(""+counter+" Patients are in queue");
    
    }

    private void btnSavePatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSavePatientActionPerformed
        // TODO add your handling code here:
        if(txtPatientName.getText().isEmpty() || txtPatientAge.getText().isEmpty() || txtContact.getText().isEmpty() ||
               cbDepartment.getSelectedIndex()==0||cbDoctor.getSelectedIndex()==0) {
            JOptionPane.showMessageDialog(null, "Please provide details in all fields");
            return;
        }
        //firstname and last name
        boolean check ; 
        check = txtPatientName.getText().matches("^[a-zA-Z]+$");
        
        if(check == false) {
            JOptionPane.showMessageDialog(null, "First name not valid");
            return;
        }

        //Phone Number
        
        if(txtContact.getText().length() != 10) {
            JOptionPane.showMessageDialog(null, "PhoneNumber must be of 10 digits");
            return;
        }
        check = txtContact.getText().matches("^[0-9]+$");
        if(!check) {
            JOptionPane.showMessageDialog(null, "Phone Number must have digits only");
            return;
        }
        
        //Age
        check=txtPatientAge.getText().matches("^[1-9][0-9]?$");
        if(!check){
            JOptionPane.showMessageDialog(null, "Age not valid");
            return;
        }
        
        check=cbSex.getSelectedIndex()>0;
        if(!check){
            JOptionPane.showMessageDialog(null, "Gender is required");
            return;
        }
        
        ArrayList<String> organs=new ArrayList<>();
        ArrayList<String> testData=new ArrayList<>();
        for(int i=0;i<organizationDirectory.getListOfOrganizations().size();i++){
            if(organizationDirectory.getListOfOrganizations().get(i).getOrgName().equalsIgnoreCase(cbDepartment.getSelectedItem().toString())){
                Organization organization=organizationDirectory.getListOfOrganizations().get(i);
                organization.getPatientDirectory().createPatient(ecoSystem.getPatientId(),txtPatientName.getText(),txtPatientAge.getText(),cbSex.getSelectedItem().toString(),txtContact.getText(),cbDepartment.getSelectedItem().toString(),cbDoctor.getSelectedItem().toString(),true,true,true,organs,testData);
                ecoSystem.incPatientId();
                break;
            }
        }
        JOptionPane.showMessageDialog(null, "Appointment Confirmed..");
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_btnSavePatientActionPerformed

    private void cbDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDoctorActionPerformed
        // TODO add your handling code here:
        if(cbDoctor.getSelectedIndex()>0){
            String doc=cbDoctor.getSelectedItem().toString();
            PatientCount(doc);
        }
        
        
    }//GEN-LAST:event_cbDoctorActionPerformed

    private void cbDepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDepartmentActionPerformed
        // TODO add your handling code here:
        cbDoctor.removeAllItems();
        cbDoctor.addItem("--Select--");
        int counter=0;
        for(int i=0;i<organizationDirectory.getListOfOrganizations().size();i++){
            Organization org=organizationDirectory.getListOfOrganizations().get(i);
            if(cbDepartment.getSelectedItem().toString().equalsIgnoreCase(org.getOrgName())){
                for(int j=0;j<org.getUserAccountDirectory().getAccountList().size();j++){
                    Employee emp=org.getUserAccountDirectory().getAccountList().get(j).getEmployee();
                    cbDoctor.addItem(emp.getEmployeeName());
                    counter++;
                }
            }
        }
        if(counter==0){
            cbDoctor.removeAllItems();
            cbDoctor.addItem("No Doctors");
        }
    }//GEN-LAST:event_cbDepartmentActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSavePatient;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbDepartment;
    private javax.swing.JComboBox<String> cbDoctor;
    private javax.swing.JComboBox<String> cbSex;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel lblContact;
    private javax.swing.JLabel lblDoctor;
    private javax.swing.JLabel lblPatientAge;
    private javax.swing.JLabel lblPatientCount;
    private javax.swing.JLabel lblPatientDetails;
    private javax.swing.JLabel lblPatientID;
    private javax.swing.JLabel lblPatientName;
    private javax.swing.JLabel lblPatientSpeciality;
    private javax.swing.JLabel lblSex;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtPatientAge;
    private javax.swing.JTextField txtPatientID;
    private javax.swing.JTextField txtPatientName;
    // End of variables declaration//GEN-END:variables
}