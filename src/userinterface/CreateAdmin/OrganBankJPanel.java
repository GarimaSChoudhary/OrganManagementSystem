

package userinterface.CreateAdmin;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.WorkQueue.WorkQueue;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Noordeep
 */
public class OrganBankJPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    Enterprise enterprise;
    EcoSystem ecoSystem;
    Network network;
    /** Creates new form AdminWorkAreaJPanel */
    public OrganBankJPanel(JPanel userProcessContainer, Enterprise enterprise,EcoSystem ecoSystem,Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.ecoSystem=ecoSystem;
        this.network=network;
        System.out.println(enterprise.getOrgName().concat("hospital"));
        //this.enterprise.setWorkQueue(new WorkQueue());
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_admin_dashboard = new javax.swing.JLabel();
        btn_manage_users = new javax.swing.JButton();
        btn_manage_organization = new javax.swing.JButton();
        btn_manage_employees = new javax.swing.JButton();
        btn_view_request = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1200, 800));

        txt_admin_dashboard.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        txt_admin_dashboard.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_admin_dashboard.setText("ADMIN DASHBOARD");

        btn_manage_users.setBackground(new java.awt.Color(0, 102, 153));
        btn_manage_users.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btn_manage_users.setForeground(new java.awt.Color(255, 255, 255));
        btn_manage_users.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/AdminDashboardManageUserAccount1.png"))); // NOI18N
        btn_manage_users.setText("Manage User Accounts");
        btn_manage_users.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_manage_usersActionPerformed(evt);
            }
        });

        btn_manage_organization.setBackground(new java.awt.Color(0, 102, 153));
        btn_manage_organization.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btn_manage_organization.setForeground(new java.awt.Color(255, 255, 255));
        btn_manage_organization.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/AdminDashboardManageOraganisation.png"))); // NOI18N
        btn_manage_organization.setText("Manage Organization");
        btn_manage_organization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_manage_organizationActionPerformed(evt);
            }
        });

        btn_manage_employees.setBackground(new java.awt.Color(0, 102, 153));
        btn_manage_employees.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btn_manage_employees.setForeground(new java.awt.Color(255, 255, 255));
        btn_manage_employees.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/AdminDashboardManageEmployees.png"))); // NOI18N
        btn_manage_employees.setText("Manage Employees");
        btn_manage_employees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_manage_employeesActionPerformed(evt);
            }
        });

        btn_view_request.setBackground(new java.awt.Color(0, 102, 153));
        btn_view_request.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btn_view_request.setForeground(new java.awt.Color(255, 255, 255));
        btn_view_request.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/view.png"))); // NOI18N
        btn_view_request.setText("View Requests");
        btn_view_request.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_view_requestActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_admin_dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 916, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_manage_users, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_manage_employees, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_manage_organization, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_view_request, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(209, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn_manage_employees, btn_manage_organization, btn_manage_users, btn_view_request});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(txt_admin_dashboard)
                .addGap(35, 35, 35)
                .addComponent(btn_manage_organization)
                .addGap(18, 18, 18)
                .addComponent(btn_manage_employees)
                .addGap(18, 18, 18)
                .addComponent(btn_manage_users)
                .addGap(18, 18, 18)
                .addComponent(btn_view_request)
                .addContainerGap(450, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btn_manage_employees, btn_manage_organization, btn_manage_users});

    }// </editor-fold>//GEN-END:initComponents

    private void btn_manage_usersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_manage_usersActionPerformed
        UserManagement manage_users = new UserManagement(userProcessContainer, enterprise);
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
        // TODO add your handling code here:
        EmployeeManagement manage_employees = new EmployeeManagement(userProcessContainer, enterprise.getOrganizationDirectory(),enterprise,ecoSystem);
        userProcessContainer.add("manageOrganizationJPanel", manage_employees);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btn_manage_employeesActionPerformed

    private void btn_view_requestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_view_requestActionPerformed
        // TODO add your handling code here:
        OrganManagement pm = new OrganManagement(userProcessContainer, enterprise.getOrganizationDirectory(),enterprise,ecoSystem,network);
        userProcessContainer.add("manageOrgan", pm);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btn_view_requestActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_manage_employees;
    private javax.swing.JButton btn_manage_organization;
    private javax.swing.JButton btn_manage_users;
    private javax.swing.JButton btn_view_request;
    private javax.swing.JLabel txt_admin_dashboard;
    // End of variables declaration//GEN-END:variables
    
}