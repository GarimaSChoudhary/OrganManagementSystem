/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CreateAdmin;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Noordeep
 */
public class EmployeeManagement extends javax.swing.JPanel {

    private OrganizationDirectory organizationDirectory;
    private JPanel userProcessContainer;
    ArrayList<String> userList = new ArrayList<String>();
    EcoSystem ecoSystem;
    
    /**
     * Creates new form ManageOrganizationJPanel
     */
    public EmployeeManagement(JPanel userProcessContainer,OrganizationDirectory organizationDirectory,Enterprise enterprise,EcoSystem ecoSystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organizationDirectory = organizationDirectory;
        this.ecoSystem=ecoSystem;
        loadOrganizationEmployeeCombobox();
        loadInitialEmmployeeTable();
    }
    
    
    public void loadOrganizationEmployeeCombobox(){
        cmbxOrganization.removeAllItems();
        cmbxOrganization.addItem("--Select--");
        for (Organization organization : organizationDirectory.getListOfOrganizations()){
            cmbxOrganization.addItem(organization);
        }
    }

    private void loadInitialEmmployeeTable(){
        DefaultTableModel model = (DefaultTableModel) tbl_current_employee_list.getModel();
        
        model.setRowCount(0);

        for(Organization or:organizationDirectory.getListOfOrganizations()){
            for (Employee employee : or.getEmployeeDirectory().getEmployeeDirectory()){
                Object[] row = new Object[2];
                row[0] = employee.getEmployeeId();
                row[1] = employee.getEmployeeName();
                userList.add(employee.getEmployeeName());
                model.addRow(row);
            }
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_current_employee_list = new javax.swing.JTable();
        btn_create_new_employee = new javax.swing.JButton();
        btn_go_back = new javax.swing.JButton();
        lbl_name = new javax.swing.JLabel();
        txt_name_val = new javax.swing.JTextField();
        cmbxOrganization = new javax.swing.JComboBox();
        lbl_organizationName = new javax.swing.JLabel();
        txt_createNewEmployeeHeading = new javax.swing.JLabel();
        lbl_currentEmployees_head = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1200, 800));
        setPreferredSize(new java.awt.Dimension(1200, 800));

        tbl_current_employee_list.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        tbl_current_employee_list.setForeground(new java.awt.Color(153, 51, 0));
        tbl_current_employee_list.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_current_employee_list.setSelectionBackground(new java.awt.Color(255, 153, 153));
        tbl_current_employee_list.setSelectionForeground(new java.awt.Color(255, 255, 51));
        jScrollPane1.setViewportView(tbl_current_employee_list);
        if (tbl_current_employee_list.getColumnModel().getColumnCount() > 0) {
            tbl_current_employee_list.getColumnModel().getColumn(0).setResizable(false);
            tbl_current_employee_list.getColumnModel().getColumn(1).setResizable(false);
        }

        btn_create_new_employee.setBackground(new java.awt.Color(0, 102, 153));
        btn_create_new_employee.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btn_create_new_employee.setForeground(new java.awt.Color(255, 255, 255));
        btn_create_new_employee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/create1.png"))); // NOI18N
        btn_create_new_employee.setText("Create");
        btn_create_new_employee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_create_new_employeeActionPerformed(evt);
            }
        });

        btn_go_back.setBackground(new java.awt.Color(0, 102, 153));
        btn_go_back.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btn_go_back.setForeground(new java.awt.Color(255, 255, 255));
        btn_go_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back3.png"))); // NOI18N
        btn_go_back.setText("Back");
        btn_go_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_go_backActionPerformed(evt);
            }
        });

        lbl_name.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        lbl_name.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbl_name.setText("Name:");

        txt_name_val.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        txt_name_val.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_name_valActionPerformed(evt);
            }
        });

        cmbxOrganization.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        cmbxOrganization.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lbl_organizationName.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        lbl_organizationName.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbl_organizationName.setText("Organization:");

        txt_createNewEmployeeHeading.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        txt_createNewEmployeeHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_createNewEmployeeHeading.setText("CREATE EMPLOYEE");

        lbl_currentEmployees_head.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        lbl_currentEmployees_head.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbl_currentEmployees_head.setText("Current employees");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_currentEmployees_head)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_go_back))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbl_organizationName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_name, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btn_create_new_employee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_name_val, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbxOrganization, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_createNewEmployeeHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(212, 212, 212))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(lbl_currentEmployees_head)
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txt_createNewEmployeeHeading)
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbxOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_organizationName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_name)
                            .addComponent(txt_name_val, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btn_create_new_employee)))
                .addGap(47, 47, 47)
                .addComponent(btn_go_back)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_create_new_employeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_create_new_employeeActionPerformed
        boolean check;
        check=cmbxOrganization.getSelectedIndex()>0;
        if(!check){
            JOptionPane.showMessageDialog(null, "No organization is selected, please select an organisation");
            return;
        }
        
        Organization organization = (Organization) cmbxOrganization.getSelectedItem();
        String name = txt_name_val.getText();
        for(String s:userList){
            if(s.equals(name)){
                JOptionPane.showMessageDialog(null, "Employee name already exists, please try again");
                return;
            }
        }
     
        if(name.matches("^([A-Za-z]+)(\\s[A-Za-z]+)*\\s?$")){
        organization.getEmployeeDirectory().createEmployee(ecoSystem.getEmployeeId(),name);
        ecoSystem.incEmployeeId();
        loadInitialEmmployeeTable();
        txt_name_val.setText("");}
         else{
            JOptionPane.showMessageDialog(null, "Try again, names can't contain numbers or special characters");
        }
        
    }//GEN-LAST:event_btn_create_new_employeeActionPerformed

    private void btn_go_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_go_backActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btn_go_backActionPerformed

    private void txt_name_valActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_name_valActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_name_valActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_create_new_employee;
    private javax.swing.JButton btn_go_back;
    private javax.swing.JComboBox cmbxOrganization;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_currentEmployees_head;
    private javax.swing.JLabel lbl_name;
    private javax.swing.JLabel lbl_organizationName;
    private javax.swing.JTable tbl_current_employee_list;
    private javax.swing.JLabel txt_createNewEmployeeHeading;
    private javax.swing.JTextField txt_name_val;
    // End of variables declaration//GEN-END:variables
}