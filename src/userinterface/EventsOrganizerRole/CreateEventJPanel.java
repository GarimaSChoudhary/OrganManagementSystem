/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.EventsOrganizerRole;

import Business.EcoSystem;
import Business.Network.Network;
import Business.Enterprise.Enterprise;
import Business.Organization.*;
import Business.Organization.Organization;
import Business.Users.Users;
import Business.WorkQueue.EventWorkRequest;
import Business.WorkQueue.WorkQueue;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author namangupta
 */
public class CreateEventJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private AwarnessEvent organization;
    private Enterprise enterprise;
    private Users userAccount;
    private EcoSystem system;
    
    /**
     * Creates new form CreateEventJPanel
     */
    
    public CreateEventJPanel(JPanel userProcessContainer,Users userAccount,Enterprise enterprise,EcoSystem ecosystem) {
       initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.system = ecosystem;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblEventName = new javax.swing.JLabel();
        lblVenueName = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        txtEventName = new javax.swing.JTextField();
        txtVenueName = new javax.swing.JTextField();
        lblDate = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        txtHours = new javax.swing.JTextField();
        txtMInutes = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnCreateEvent = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        lblComments = new javax.swing.JLabel();
        txtComments = new javax.swing.JTextField();
        lblAmount = new javax.swing.JLabel();
        txtAmount = new javax.swing.JTextField();
        txtDate = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1200, 800));
        setPreferredSize(new java.awt.Dimension(1200, 800));

        lblEventName.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        lblEventName.setForeground(new java.awt.Color(255, 0, 51));
        lblEventName.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblEventName.setText("Event Name:");

        lblVenueName.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        lblVenueName.setForeground(new java.awt.Color(255, 0, 51));
        lblVenueName.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblVenueName.setText("Venue:");

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 0, 51));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("CREATE NEW EVENTS");

        txtEventName.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N

        txtVenueName.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        txtVenueName.setText(" ");
        txtVenueName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVenueNameActionPerformed(evt);
            }
        });

        lblDate.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        lblDate.setForeground(new java.awt.Color(255, 0, 51));
        lblDate.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblDate.setText("Date:");

        lblTime.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        lblTime.setForeground(new java.awt.Color(255, 0, 51));
        lblTime.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblTime.setText("Time:");

        txtHours.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        txtHours.setText("HH");

        txtMInutes.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        txtMInutes.setText("MM");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText(":");

        btnCreateEvent.setBackground(new java.awt.Color(255, 0, 51));
        btnCreateEvent.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnCreateEvent.setForeground(new java.awt.Color(255, 255, 255));
        btnCreateEvent.setText("Create");
        btnCreateEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateEventActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(0, 102, 153));
        btnBack.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblComments.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        lblComments.setForeground(new java.awt.Color(255, 0, 51));
        lblComments.setText("Comments: ");

        lblAmount.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        lblAmount.setForeground(new java.awt.Color(255, 0, 51));
        lblAmount.setText("Amount Required:");

        txtDate.setBackground(new java.awt.Color(255, 0, 51));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/events.gif"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 844, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblVenueName, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblEventName, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTime, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblComments)
                                    .addComponent(lblAmount))
                                .addGap(18, 18, 18)
                                .addComponent(txtEventName, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnCreateEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(94, 94, 94))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(219, 219, 219)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(txtDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtAmount, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtComments, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                    .addComponent(txtHours, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(27, 27, 27)
                                                    .addComponent(txtMInutes, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(txtVenueName, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(43, 43, 43)))
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(82, 82, 82)
                .addComponent(jLabel1)
                .addContainerGap(214, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTitle)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEventName)
                            .addComponent(txtEventName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblVenueName)
                                    .addComponent(txtVenueName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblDate)
                                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblTime)
                                        .addComponent(txtMInutes, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtHours, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblComments)
                                    .addComponent(txtComments, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblAmount))
                                .addGap(18, 18, 18)
                                .addComponent(btnCreateEvent)
                                .addGap(68, 68, 68)
                                .addComponent(btnBack))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(284, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnCreateEvent, lblAmount, lblComments, lblDate, lblEventName, lblTime, lblVenueName, txtAmount, txtComments, txtEventName, txtHours, txtMInutes, txtVenueName});

    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateEventActionPerformed
        // TODO add your handling code here:
        String message = txtEventName.getText();
        String venue = txtVenueName.getText();
        Date d = (txtDate.getDate());
        Date today = new Date(); 
        String t = txtHours.getText()+":"+txtMInutes.getText();
        EventWorkRequest request = new EventWorkRequest();
        request = (EventWorkRequest) request;
        request.setMessage(message);
        request.setVenue(venue);
        request.setDate(d);
        request.setTime(t);
        request.setStatus("Request Submitted");
        
        if(message.equals("")){
            JOptionPane.showMessageDialog(null, "Event Name can't be empty");
            return;
        }
        
        if(venue.equals("")){
            JOptionPane.showMessageDialog(null, "Venue can't be empty");
            return;
        }
        
        if (!d.after(today)) {
            JOptionPane.showMessageDialog(null, "Please select a proper date");
            return;
        }
        
        
        int hrs=0;
        int min=0;
        try{
            hrs = Integer.parseInt(txtHours.getText());
            min = Integer.parseInt(txtMInutes.getText());
        }catch(Exception e){
         JOptionPane.showMessageDialog(null, "Please enter only numbers");
         return;
        }
        if(hrs<0 || hrs >=24){
             JOptionPane.showMessageDialog(null, "Hours Should be between 0-23");
             return;
        }
         if(min<0 || min >=60){
             JOptionPane.showMessageDialog(null, "Minutes Should be between 0-60");
             return;
        }

        request.setSender(userAccount);
        request.setMessage(message);
        request.setComment(txtComments.getText());
        request.setAmount(txtAmount.getText());
        if(userAccount.getWorkQueue()==null){
            WorkQueue wq = new WorkQueue();
                 userAccount.setWorkQueue(wq);
        }
        userAccount.getWorkQueue().getWorkRequestList().add(request);
        Organization org = null;
        for(Network network:system.getNetworkList()){
        for(Enterprise enterprise:network.getEnterpriseList().getEnterpriseList()){
        for(Organization organization:enterprise.getOrganizationDirectory().getListOfOrganizations()){
         System.out.println("Siva"+organization.getOrgName());
         if(organization instanceof FinanceEvent){
         System.out.println("sai"+organization.getOrgName()); 
         for (Users ua :organization.getUserAccountDirectory().getAccountList()){
                 
                if(organization instanceof FinanceEvent){
                    

        if(ua.getWorkQueue()== null){
                 WorkQueue wq = new WorkQueue();
                 ua.setWorkQueue(wq);}
                    
         ua.getWorkQueue().getWorkRequestList().add(request);
         request.setReceiver(ua);
                break;} }
                    if (organization instanceof AwarnessEvent) {
                        System.out.println("To know ORg "+organization);
                        org= organization;
                        break;
                    }
                }

            }
        }
}
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        EventOrganizerWorkAreaJPanel eowajp = (EventOrganizerWorkAreaJPanel ) component;
        eowajp.populateRequestTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnCreateEventActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        EventOrganizerWorkAreaJPanel eventOrgWorkArea = (EventOrganizerWorkAreaJPanel ) component;
        eventOrgWorkArea.populateRequestTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtVenueNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVenueNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVenueNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreateEvent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblAmount;
    private javax.swing.JLabel lblComments;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblEventName;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblVenueName;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtComments;
    private com.toedter.calendar.JDateChooser txtDate;
    private javax.swing.JTextField txtEventName;
    private javax.swing.JTextField txtHours;
    private javax.swing.JTextField txtMInutes;
    private javax.swing.JTextField txtVenueName;
    // End of variables declaration//GEN-END:variables
}
