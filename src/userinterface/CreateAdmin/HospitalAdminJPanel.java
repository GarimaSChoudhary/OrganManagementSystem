

package userinterface.CreateAdmin;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author  saras
 */
public class HospitalAdminJPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    Enterprise enterprise;
    EcoSystem ecoSystem;
    Network network;
    /** Creates new form AdminWorkAreaJPanel */
    public HospitalAdminJPanel(JPanel userProcessContainer, Enterprise enterprise,EcoSystem ecoSystem,Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.ecoSystem=ecoSystem;
        this.network=network;
        System.out.println(enterprise.getOrgName().concat("hospital"));
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_admin_dashboard_heading = new javax.swing.JLabel();
        btn_manage_users = new javax.swing.JButton();
        btn_manage_organization = new javax.swing.JButton();
        btn_manage_employees = new javax.swing.JButton();
        btn_manage_patients = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1200, 800));
        setPreferredSize(new java.awt.Dimension(1200, 800));

        lbl_admin_dashboard_heading.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        lbl_admin_dashboard_heading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_admin_dashboard_heading.setText("ADMIN DASHBOARD");

        btn_manage_users.setBackground(new java.awt.Color(0, 102, 153));
        btn_manage_users.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btn_manage_users.setForeground(java.awt.Color.white);
        btn_manage_users.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/AdminDashboardManageUserAccount1.png"))); // NOI18N
        btn_manage_users.setText("Manage User Accounts");
        btn_manage_users.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_manage_usersActionPerformed(evt);
            }
        });

        btn_manage_organization.setBackground(new java.awt.Color(0, 102, 153));
        btn_manage_organization.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btn_manage_organization.setForeground(java.awt.Color.white);
        btn_manage_organization.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/AdminDashboardManageOraganisation.png"))); // NOI18N
        btn_manage_organization.setText("Manage Organization");
        btn_manage_organization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_manage_organizationActionPerformed(evt);
            }
        });

        btn_manage_employees.setBackground(new java.awt.Color(0, 102, 153));
        btn_manage_employees.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btn_manage_employees.setForeground(java.awt.Color.white);
        btn_manage_employees.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/AdminDashboardManageEmployees.png"))); // NOI18N
        btn_manage_employees.setText("Manage Employees");
        btn_manage_employees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_manage_employeesActionPerformed(evt);
            }
        });

        btn_manage_patients.setBackground(new java.awt.Color(0, 102, 153));
        btn_manage_patients.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btn_manage_patients.setForeground(java.awt.Color.white);
        btn_manage_patients.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/AdminDashboardManagePatient.png"))); // NOI18N
        btn_manage_patients.setText("Manage Patients");
        btn_manage_patients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_manage_patientsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_manage_organization, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_manage_employees, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_manage_users, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_manage_patients, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(343, 343, 343)
                        .addComponent(lbl_admin_dashboard_heading, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(786, 786, 786))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(lbl_admin_dashboard_heading)
                .addGap(81, 81, 81)
                .addComponent(btn_manage_organization)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_manage_users, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_manage_employees, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(13, 13, 13)
                .addComponent(btn_manage_patients, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(516, 516, 516))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_manage_usersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_manage_usersActionPerformed
        UserDetailManage manage_users = new UserDetailManage(userProcessContainer, enterprise);
        userProcessContainer.add("ManageUserAccountJPanel", manage_users);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btn_manage_usersActionPerformed

    private void btn_manage_organizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_manage_organizationActionPerformed
        OrganizationManagementJPanel manage_organization = new OrganizationManagementJPanel(userProcessContainer, enterprise.getOrganizationDirectory(),enterprise);
        userProcessContainer.add("manageOrganizationJPanel", manage_organization);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btn_manage_organizationActionPerformed

    private void btn_manage_employeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_manage_employeesActionPerformed

        EmployeeManagement manage_employees = new EmployeeManagement(userProcessContainer, enterprise.getOrganizationDirectory(),enterprise,ecoSystem);
        userProcessContainer.add("manageOrganizationJPanel", manage_employees);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btn_manage_employeesActionPerformed

    private void btn_manage_patientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_manage_patientsActionPerformed
        
        PatientManagement manage_patients = new PatientManagement(userProcessContainer, enterprise.getOrganizationDirectory(),enterprise,ecoSystem);
        userProcessContainer.add("manageOrganizationJPanel", manage_patients);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btn_manage_patientsActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_manage_employees;
    private javax.swing.JButton btn_manage_organization;
    private javax.swing.JButton btn_manage_patients;
    private javax.swing.JButton btn_manage_users;
    private javax.swing.JLabel lbl_admin_dashboard_heading;
    // End of variables declaration//GEN-END:variables
    
}
