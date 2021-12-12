/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CreateAdmin;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Users.Users;
import Business.Users.UsersDirectory;
import java.awt.CardLayout;
import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author namangupta
 */
public class UserDetailManage extends javax.swing.JPanel {

    /**
     * Creates new form UserDetailManage
     */
    private JPanel container;
    private Enterprise enterprise;
    private UsersDirectory accountDir;
    ArrayList <String> userstring = new ArrayList<String>();
    HashMap <String,String> name_id = new HashMap<String, String>();

    public UserDetailManage(JPanel container, Enterprise enterprise) {
        initComponents();
        this.enterprise = enterprise;
        this.container = container;
        populateUserName();
        populateOrganization();
        populateData();
        populateUser();
      
    }
    public void populateUserName(){
        
        for(Organization organization:enterprise.getOrganizationDirectory().getListOfOrganizations()){
            for(Users u:organization.getUserAccountDirectory().getAccountList()){
            System.out.println("Actual users"+u.toString());
            name_id.put(u.getEmployee().toString(),u.toString());}
        }
    }
    public void populateUser(){
        for(Users u:enterprise.getUserAccountDirectory().getAccountList()){
            userstring.add(u.toString());
        }
    }

    public void populateOrganization() {
        cbOrganization.removeAllItems();
        for (Organization organization : enterprise.getOrganizationDirectory().getListOfOrganizations()) {
            cbOrganization.addItem(organization);
        }
    }
    

    
    public void initEmployeeComboBox(Organization organization){
        cbEmployeeName.removeAllItems();
        for (Employee employee : organization.getEmployeeDirectory().getEmployeeDirectory()){
            cbEmployeeName.addItem(employee);
        }
    }
    
    private void initRoleComboBox(Organization organization){
        cbRole.removeAllItems();
        for (Role role : organization.getRole()){
            cbRole.addItem(role);
        }
    }
    
   

    public void populateData() {

        DefaultTableModel model = (DefaultTableModel) tblCurrentAccounts.getModel();
        model.setRowCount(0);

        for (Organization organization : enterprise.getOrganizationDirectory().getListOfOrganizations()) {
            for (Users ua : organization.getUserAccountDirectory().getAccountList()) {
                Object row[] = new Object[2];
                row[0] = ua;
                row[1] = ua.getRole();
                ((DefaultTableModel) tblCurrentAccounts.getModel()).addRow(row);
                userstring.add(ua.toString());
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        btnCreateUser = new javax.swing.JButton();
        txtUsername = new javax.swing.JTextField();
        lblUsername = new javax.swing.JLabel();
        tblUserDetails = new javax.swing.JScrollPane();
        tblCurrentAccounts = new javax.swing.JTable();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        lblEmployeeName = new javax.swing.JLabel();
        cbEmployeeName = new javax.swing.JComboBox();
        btnBack = new javax.swing.JButton();
        lblOrganization = new javax.swing.JLabel();
        cbOrganization = new javax.swing.JComboBox();
        lblRole = new javax.swing.JLabel();
        cbRole = new javax.swing.JComboBox();
        lblAddress = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        lblQualification = new javax.swing.JLabel();
        txtQualification = new javax.swing.JTextField();
        lblContact = new javax.swing.JLabel();
        txtContact = new javax.swing.JTextField();
        lblAge = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        lblSex = new javax.swing.JLabel();
        radMale = new javax.swing.JRadioButton();
        radFemale = new javax.swing.JRadioButton();
        lblTitle = new javax.swing.JLabel();
        lblCurrentAccount = new javax.swing.JLabel();
        lblMustText = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 0, 51));
        setMaximumSize(new java.awt.Dimension(1200, 800));
        setPreferredSize(new java.awt.Dimension(1200, 800));

        btnCreateUser.setBackground(new java.awt.Color(255, 0, 51));
        btnCreateUser.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnCreateUser.setText("Create");
        btnCreateUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateUserActionPerformed(evt);
            }
        });

        txtUsername.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N

        lblUsername.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(255, 0, 51));
        lblUsername.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblUsername.setText("User Name*:");

        tblCurrentAccounts.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblCurrentAccounts.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        tblCurrentAccounts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User Name", "Role"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblUserDetails.setViewportView(tblCurrentAccounts);
        if (tblCurrentAccounts.getColumnModel().getColumnCount() > 0) {
            tblCurrentAccounts.getColumnModel().getColumn(0).setResizable(false);
            tblCurrentAccounts.getColumnModel().getColumn(1).setResizable(false);
        }

        lblPassword.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(255, 0, 51));
        lblPassword.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblPassword.setText("Password*:");

        txtPassword.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N

        lblEmployeeName.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        lblEmployeeName.setForeground(new java.awt.Color(255, 0, 51));
        lblEmployeeName.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblEmployeeName.setText("Employee:");

        cbEmployeeName.setBackground(new java.awt.Color(255, 0, 51));
        cbEmployeeName.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        cbEmployeeName.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbEmployeeName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEmployeeNameActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(255, 0, 51));
        btnBack.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblOrganization.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        lblOrganization.setForeground(new java.awt.Color(255, 0, 51));
        lblOrganization.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblOrganization.setText("Organization:");

        cbOrganization.setBackground(new java.awt.Color(255, 0, 51));
        cbOrganization.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        cbOrganization.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbOrganization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbOrganizationActionPerformed(evt);
            }
        });

        lblRole.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        lblRole.setForeground(new java.awt.Color(255, 0, 51));
        lblRole.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblRole.setText("Role:");

        cbRole.setBackground(new java.awt.Color(255, 0, 51));
        cbRole.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        cbRole.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbRole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbRoleActionPerformed(evt);
            }
        });

        lblAddress.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        lblAddress.setForeground(new java.awt.Color(255, 0, 51));
        lblAddress.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblAddress.setText("Address*:");

        txtAddress.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });

        lblQualification.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        lblQualification.setForeground(new java.awt.Color(255, 0, 51));
        lblQualification.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblQualification.setText("Qualifications*:");

        txtQualification.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N

        lblContact.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        lblContact.setForeground(new java.awt.Color(255, 0, 51));
        lblContact.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblContact.setText("Contact*:");

        txtContact.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N

        lblAge.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        lblAge.setForeground(new java.awt.Color(255, 0, 51));
        lblAge.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblAge.setText("Age*:");

        txtAge.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });

        lblSex.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        lblSex.setForeground(new java.awt.Color(255, 0, 51));
        lblSex.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblSex.setText("Gender*:");

        radMale.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(radMale);
        radMale.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        radMale.setText("M");

        radFemale.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(radFemale);
        radFemale.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        radFemale.setText("F");

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 0, 51));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("CREATE USER ACCOUNT");

        lblCurrentAccount.setFont(new java.awt.Font("Cambria", 3, 18)); // NOI18N
        lblCurrentAccount.setForeground(new java.awt.Color(255, 0, 51));
        lblCurrentAccount.setText("Current accounts");

        lblMustText.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        lblMustText.setForeground(new java.awt.Color(255, 51, 51));
        lblMustText.setText("* fields are mandatory to fill");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ezgif-4-19244d407726.gif"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 691, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tblUserDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(196, 196, 196)
                                        .addComponent(lblCurrentAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(76, 76, 76)
                                .addComponent(jLabel1))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblRole, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblOrganization))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbRole, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblContact, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtPassword)
                                            .addComponent(txtContact)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtUsername)))))
                        .addGap(284, 284, 284)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblEmployeeName, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(cbEmployeeName, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblQualification, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(txtQualification, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(lblAge, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(lblSex, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(radMale, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(392, 392, 392)
                        .addComponent(btnCreateUser, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(441, 441, 441)
                        .addComponent(lblMustText, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(176, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(lblTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblOrganization)
                            .addComponent(cbOrganization, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblRole)
                            .addComponent(cbRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUsername))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(lblAge)
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblSex)
                                    .addComponent(radMale)
                                    .addComponent(radFemale)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(43, 43, 43))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblPassword)
                                        .addGap(12, 12, 12)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(lblContact)
                                            .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEmployeeName)
                            .addComponent(cbEmployeeName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAddress)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblQualification)
                            .addComponent(txtQualification, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMustText)
                .addGap(3, 3, 3)
                .addComponent(btnCreateUser, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(lblCurrentAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tblUserDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cbEmployeeName, cbOrganization, cbRole, lblAddress, lblAge, lblContact, lblEmployeeName, lblOrganization, lblPassword, lblQualification, lblRole, lblSex, lblUsername, radFemale, radMale, txtAddress, txtAge, txtContact, txtPassword, txtQualification, txtUsername});

    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateUserActionPerformed
        String userName = txtUsername.getText();
        String password = txtPassword.getText();
        String phNum = txtContact.getText();
        String address = txtAddress.getText();
        String qualification = txtQualification.getText();
         boolean nameMatch=true,userNameMatch=true,passMatch=true,qualificationMatch=true;
        String sex;
        int f=0;
        int newage=0;
        boolean availability=true;
        boolean organavail = true;
        String age = txtAge.getText();
        if(radMale.isSelected()){
            sex = radMale.getText();
        } 
        else {
            sex = radFemale.getText();
        }
        
        if(address.equals("")){
            JOptionPane.showMessageDialog(null, "Address can't be empty");
            return;
        }
        boolean flag;
        flag = userName.matches("^[a-zA-Z0-9]+@[a-zA-Z0-9]+.[a-zA-Z0-9]+$");
        if(!flag) {
            JOptionPane.showMessageDialog(null, "UserName must be in format of A@B.C");
            userNameMatch=false;
            return;}
         else {
              for(String s:userstring){
               if(s.equalsIgnoreCase(userName)){
                 JOptionPane.showMessageDialog(null, "Username exists please take another username");
                 userNameMatch=false;
                 return;
                }
            }
            
        }
       
        flag =password.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$");
        if (!flag) {
            JOptionPane.showMessageDialog(null, "Password should contain at least  a Character, One Captial,Small letter with minimum 8 characters length");
           passMatch = false;  
           
           return;}
         if(phNum == null || phNum.equals("")){
                JOptionPane.showMessageDialog(null, "Please enter Contact Number");
                return;
            }
             else{
                 if(!phNum.matches("^(?=.*[0-9]).{10,10}")){
                     JOptionPane.showMessageDialog(null, "Please enter valid Contact Number");
                     return;
                 }
             }

        if(qualification.matches("^([A-Za-z]+)(\\s[A-Za-z]+)*\\s?$")){
            f=1;
        }
        else{
            qualificationMatch=false;
            return;
        }
        if(age.matches("[0-9]+")){
            newage = Integer.parseInt(age);
            if(newage<0 || newage>200){
                JOptionPane.showMessageDialog(null, "Age should be between 1 and 199");
            }
            f=1;
        }
        else{
            return;
        }
        
        if(f==0){
           JOptionPane.showMessageDialog(null, "Please fill all the details");
        }
        else{
            for(String s:name_id.keySet()){
                System.out.println("In keyset"+s);
                if(name_id.containsKey(cbEmployeeName.getSelectedItem().toString())){
                    JOptionPane.showMessageDialog(null, "User already has an account");
                    return;
                }
            }
        Organization organization = (Organization) cbOrganization.getSelectedItem();
        Employee employee = (Employee) cbEmployeeName.getSelectedItem();
        Role role = (Role) cbRole.getSelectedItem();
        organization.getUserAccountDirectory().createUserAccount(userName,password,phNum,address,qualification, sex, availability, newage, employee, role,organavail);
        populateUserName();
        populateData();
        }
    }//GEN-LAST:event_btnCreateUserActionPerformed

    
    
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_btnBackActionPerformed

    private void cbOrganizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbOrganizationActionPerformed
        Organization organization = (Organization) cbOrganization.getSelectedItem();
        if (organization != null){
            initEmployeeComboBox(organization);
            initRoleComboBox(organization);
        }
        

    }//GEN-LAST:event_cbOrganizationActionPerformed

    private void cbRoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbRoleActionPerformed
        // TODO add your handling code here:
        txtAge.setVisible(true);
        lblAge.setVisible(true);
        radFemale.setVisible(true);
        radMale.setVisible(true);
        lblSex.setVisible(true);

        
    }//GEN-LAST:event_cbRoleActionPerformed

    private void cbEmployeeNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEmployeeNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbEmployeeNameActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreateUser;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cbEmployeeName;
    private javax.swing.JComboBox cbOrganization;
    private javax.swing.JComboBox cbRole;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblContact;
    private javax.swing.JLabel lblCurrentAccount;
    private javax.swing.JLabel lblEmployeeName;
    private javax.swing.JLabel lblMustText;
    private javax.swing.JLabel lblOrganization;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblQualification;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblSex;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JRadioButton radFemale;
    private javax.swing.JRadioButton radMale;
    private javax.swing.JTable tblCurrentAccounts;
    private javax.swing.JScrollPane tblUserDetails;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtQualification;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}