/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.LabAssistantRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Laboratory;
import Business.Organization.Organization;
import Business.Users.Users;
import Business.WorkQueue.DiagnosticsWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Noordeep
 */
public class DiagnosticsWorkArea extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem business;
    private Users userAccount;
    private Laboratory diagnostics;
    private Enterprise enterprise;

    public DiagnosticsWorkArea(JPanel userProcessContainer, Users account, Organization organization, EcoSystem business,Enterprise enterprise) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        this.enterprise=enterprise;
        this.diagnostics = (Laboratory) organization;
       

        load_work_tbl();

    }

    public void load_work_tbl() {
        DefaultTableModel model = (DefaultTableModel) tbl_work_request.getModel();
        model.setRowCount(0);
        for (WorkRequest request : enterprise.getWorkQueue().getWorkRequestList()) {
            Object[] row = new Object[6];
            row[1] = ((DiagnosticsWorkRequest) request).getPatient().getPatientName();
            row[2] = request.getSender().getEmployee().getEmployeeName();
            row[3] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getEmployeeName();
            row[4] = request.getStatus();
            row[0] = request;
            model.addRow(row);
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
        tbl_work_request = new javax.swing.JTable();
        assign_button = new javax.swing.JButton();
        process_btn = new javax.swing.JButton();
        btn_refresh = new javax.swing.JButton();
        lbl_diagnostics_dashboard = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1200, 800));
        setPreferredSize(new java.awt.Dimension(1200, 800));

        tbl_work_request.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        tbl_work_request.setForeground(new java.awt.Color(153, 51, 0));
        tbl_work_request.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Message", "Patient Name", "Sender", "Receiver", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_work_request.setSelectionBackground(new java.awt.Color(255, 153, 153));
        tbl_work_request.setSelectionForeground(new java.awt.Color(255, 255, 51));
        jScrollPane1.setViewportView(tbl_work_request);
        if (tbl_work_request.getColumnModel().getColumnCount() > 0) {
            tbl_work_request.getColumnModel().getColumn(0).setResizable(false);
            tbl_work_request.getColumnModel().getColumn(1).setResizable(false);
            tbl_work_request.getColumnModel().getColumn(2).setResizable(false);
            tbl_work_request.getColumnModel().getColumn(3).setResizable(false);
            tbl_work_request.getColumnModel().getColumn(4).setResizable(false);
        }

        assign_button.setBackground(new java.awt.Color(255, 0, 51));
        assign_button.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        assign_button.setText("Assign me");
        assign_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assign_buttonActionPerformed(evt);
            }
        });

        process_btn.setBackground(new java.awt.Color(255, 0, 51));
        process_btn.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        process_btn.setText("Process");
        process_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                process_btnActionPerformed(evt);
            }
        });

        btn_refresh.setBackground(new java.awt.Color(255, 0, 51));
        btn_refresh.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btn_refresh.setText("Refresh");
        btn_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refreshActionPerformed(evt);
            }
        });

        lbl_diagnostics_dashboard.setBackground(new java.awt.Color(255, 255, 255));
        lbl_diagnostics_dashboard.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        lbl_diagnostics_dashboard.setForeground(new java.awt.Color(255, 0, 51));
        lbl_diagnostics_dashboard.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_diagnostics_dashboard.setText("DIAGNOSTICS DASHBOARD");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/WhatsApp Image 2021-12-10 at 11.22.12 PM.jpeg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(lbl_diagnostics_dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(296, 296, 296))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 691, Short.MAX_VALUE)
                        .addGap(27, 27, 27)
                        .addComponent(assign_button, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(process_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_refresh)))
                .addGap(131, 131, 131))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 866, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_diagnostics_dashboard)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(process_btn)
                        .addComponent(btn_refresh)
                        .addComponent(assign_button))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(178, 178, 178))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {assign_button, btn_refresh, process_btn});

    }// </editor-fold>//GEN-END:initComponents

    private void assign_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assign_buttonActionPerformed

        int selectedRow = tbl_work_request.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"No row is selected, please select the request to assign");
            return;
        }

        WorkRequest request = (WorkRequest) tbl_work_request.getValueAt(selectedRow, 0);
        if(request.getStatus().equalsIgnoreCase("pending")){
            JOptionPane.showMessageDialog(null,"This request is under process");
        }
        else if(request.getStatus().equalsIgnoreCase("Sent")){
        request.setReceiver(userAccount);
        request.setStatus("Pending");
        load_work_tbl();
        }
    }//GEN-LAST:event_assign_buttonActionPerformed

    private void process_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_process_btnActionPerformed

        int selectedRow = tbl_work_request.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Please select the item from the list");
            return;
        }

        DiagnosticsWorkRequest request = (DiagnosticsWorkRequest) tbl_work_request.getValueAt(selectedRow, 0);
        if(request.getStatus().equalsIgnoreCase("completed")){
            JOptionPane.showMessageDialog(null,"The request was processed sucessfully");
        }   
        else if(request.getStatus().equalsIgnoreCase("sent")){
            JOptionPane.showMessageDialog(null,"This request is not assigned to you");
        }
        else if(request.getStatus().equalsIgnoreCase("pending") && !request.getReceiver().getEmployee().getEmployeeName().equals(userAccount.getEmployee().getEmployeeName())){
            JOptionPane.showMessageDialog(null,"This request is in progress");
        }
        else{
        request.setStatus("Processing");

        ProcessDiagnostics processdiag = new ProcessDiagnostics(userProcessContainer, request);
            System.out.println(request.getTests()+" +++++ Tests");
        userProcessContainer.add("ProcessDiagnostics", processdiag);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_process_btnActionPerformed

    private void btn_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refreshActionPerformed
        load_work_tbl();
    }//GEN-LAST:event_btn_refreshActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assign_button;
    private javax.swing.JButton btn_refresh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_diagnostics_dashboard;
    private javax.swing.JButton process_btn;
    private javax.swing.JTable tbl_work_request;
    // End of variables declaration//GEN-END:variables
}
