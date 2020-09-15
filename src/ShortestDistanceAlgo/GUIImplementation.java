/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ShortestDistanceAlgo;

import static ShortestDistanceAlgo.ShortestDistanceAlgo.printPath;
import java.util.List;
import static ShortestDistanceAlgo.ShortestDistanceAlgo.ShortestPathAlgorithm;

/**
 *
 * @author zeylmnop
 */
public class GUIImplementation extends javax.swing.JFrame {

    /**
     * Creates new form GUIImplementation
     */
    public GUIImplementation() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.SystemColor.activeCaption);
        setFont(new java.awt.Font("Gill Sans MT", 0, 10)); // NOI18N

        jLabel1.setText("Book your flight:");

        jLabel2.setText("Departure:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "KHI", "GWA", "RYK", "QUE", "DGK", "MUX", "LHR", "PES", "ISB" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "KHI", "GWA", "RYK", "QUE", "DGK", "MUX", "LHR", "PES", "ISB" }));

        jLabel3.setText("Arrival:");

        jButton1.setText("Press to find shortest path");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField2.setText("Path will be displayed here");

        jLabel4.setText("If Departure and Arrival are same, Path will be to the same city");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String deptCity = "" + jComboBox1.getSelectedItem();
        String arriCity = "" + jComboBox2.getSelectedItem();
        
        //initializing cities with heuristic value of 1
        
                Node karachi = new Node("KHI",1);
                Node gwadar = new Node("GWA",1);
                Node rahimYarKhan = new Node("RYK",1);
                Node quetta = new Node("QUE",1);
                Node dGK = new Node("DGK",1);
                Node multan = new Node("MUX",1);
                Node lahore = new Node("LHR",1);
                Node peshawar = new Node("PES",1); 
                Node islamabad = new Node("ISB",1);
                
                
 
                karachi.adjacencies = new Edge[]{
                        new Edge(gwadar,474),
                        new Edge(quetta,592),
                        new Edge(rahimYarKhan,513),
                        new Edge(multan,739),
                        new Edge(lahore,1035)
                };
                  
                gwadar.adjacencies = new Edge[]{
                        new Edge(karachi,474),
                        new Edge(quetta,720)
                };
                  
                rahimYarKhan.adjacencies = new Edge[]{
                        new Edge(karachi,513),
                        new Edge(quetta,375),
                        new Edge(multan,228)
                };
                  
                quetta.adjacencies = new Edge[]{
                        new Edge(karachi,592),
                        new Edge(gwadar,720),
                        new Edge(rahimYarKhan,375),
                        new Edge(dGK,349),
                        new Edge(peshawar,606)
                };
                 
 
                dGK.adjacencies = new Edge[]{
                        new Edge(quetta,349),
                        new Edge(multan,107),
                        new Edge(lahore,420)
                };
                  
                multan.adjacencies = new Edge[]{
                        new Edge(karachi,739),
                        new Edge(rahimYarKhan,228),
                        new Edge(dGK,107),
                        new Edge(lahore,314)
                };
                  
                lahore.adjacencies = new Edge[]{
                        new Edge(karachi,1035),
                        new Edge(dGK,420),
                        new Edge(multan,214),
                        new Edge(peshawar,377),
                        new Edge(islamabad,270)
                };
                  
                peshawar.adjacencies = new Edge[]{
                        new Edge(quetta,606),
                        new Edge(lahore,377)
                };
                
                islamabad.adjacencies = new Edge[]{
                    new Edge(lahore,270)
                };
                
         boolean found =true;
                while(found){
                    
                    String depCity = deptCity; 
                    String destCity = arriCity; 
                    
                    //checks if both cities are present in the graph
                    if(karachi.toString().equals(depCity)&&karachi.toString().equals(destCity))
                    {   ShortestPathAlgorithm(karachi,karachi);
                        List<Node> path = printPath(karachi);
                        jTextField2.setText("Path: " + path);
                    }
                    
                    else if(karachi.toString().equals(depCity)&&karachi.toString().equals(destCity))
                    {   ShortestPathAlgorithm(karachi,karachi);
                        List<Node> path = printPath(karachi);
                        jTextField2.setText("Path: " + path);
                    }
                    
                    else if(karachi.toString().equals(depCity)&&gwadar.toString().equals(destCity))
                    {   ShortestPathAlgorithm(karachi,gwadar);
                        List<Node> path = printPath(gwadar);
                        jTextField2.setText("Path: " + path);
                    }
                    
                    else if(karachi.toString().equals(depCity)&&rahimYarKhan.toString().equals(destCity))
                    {   ShortestPathAlgorithm(karachi,rahimYarKhan);
                        List<Node> path = printPath(rahimYarKhan);
                        jTextField2.setText("Path: " + path);}
                    
                    else if(karachi.toString().equals(depCity)&&quetta.toString().equals(destCity))
                    {   ShortestPathAlgorithm(karachi,quetta);
                        List<Node> path = printPath(quetta);
                        jTextField2.setText("Path: " + path);
                    }
                    
                    else if(karachi.toString().equals(depCity)&&dGK.toString().equals(destCity))
                    {   ShortestPathAlgorithm(karachi,dGK);
                        List<Node> path = printPath(dGK);
                        jTextField2.setText("Path: " + path);
                    }
                    
                    else if(karachi.toString().equals(depCity)&&multan.toString().equals(destCity))
                    {   ShortestPathAlgorithm(karachi,multan);
                        List<Node> path = printPath(multan);
                        jTextField2.setText("Path: " + path);
                    }
                    
                    else if(karachi.toString().equals(depCity)&&lahore.toString().equals(destCity))
                    {   ShortestPathAlgorithm(karachi,lahore);
                        List<Node> path = printPath(lahore);
                        jTextField2.setText("Path: " + path);
                    }
                    
                    else if(karachi.toString().equals(depCity)&&peshawar.toString().equals(destCity))
                    {   ShortestPathAlgorithm(karachi,peshawar);
                        List<Node> path = printPath(peshawar);
                        jTextField2.setText("Path: " + path);
                    }
                    
                    else if(karachi.toString().equals(depCity)&&islamabad.toString().equals(destCity))
                    {   ShortestPathAlgorithm(karachi,islamabad);
                        List<Node> path = printPath(islamabad);
                        jTextField2.setText("Path: " + path);
                    }
                    
                    else if(gwadar.toString().equals(depCity)&&karachi.toString().equals(destCity))
                    {   ShortestPathAlgorithm(gwadar,karachi);
                        List<Node> path = printPath(karachi);
                        jTextField2.setText("Path: " + path);
                    }
                    
                    else if(gwadar.toString().equals(depCity)&&gwadar.toString().equals(destCity))
                    {   ShortestPathAlgorithm(gwadar,gwadar);
                        List<Node> path = printPath(gwadar);
                        jTextField2.setText("Path: " + path);}
                    
                    else if(gwadar.toString().equals(depCity)&&rahimYarKhan.toString().equals(destCity))
                    {   ShortestPathAlgorithm(gwadar,rahimYarKhan);
                        List<Node> path = printPath(rahimYarKhan);
                        jTextField2.setText("Path: " + path);
                    }
                    
                    else if(gwadar.toString().equals(depCity)&&quetta.toString().equals(destCity))
                    {   ShortestPathAlgorithm(gwadar,quetta);
                        List<Node> path = printPath(quetta);
                        jTextField2.setText("Path: " + path);
                    }
                    
                    else if(gwadar.toString().equals(depCity)&&dGK.toString().equals(destCity))
                    {   ShortestPathAlgorithm(gwadar,dGK);
                        List<Node> path = printPath(dGK);
                        jTextField2.setText("Path: " + path);
                    }
                    
                    else if(gwadar.toString().equals(depCity)&&multan.toString().equals(destCity))
                    {   ShortestPathAlgorithm(gwadar,multan);
                        List<Node> path = printPath(multan);
                        jTextField2.setText("Path: " + path);
                    }
                    
                    else if(gwadar.toString().equals(depCity)&&lahore.toString().equals(destCity))
                    {   ShortestPathAlgorithm(gwadar,lahore);
                        List<Node> path = printPath(lahore);
                        jTextField2.setText("Path: " + path);
                    }
                    
                    else if(gwadar.toString().equals(depCity)&&peshawar.toString().equals(destCity))
                    {   ShortestPathAlgorithm(gwadar,peshawar);
                        List<Node> path = printPath(peshawar);
                        jTextField2.setText("Path: " + path);
                    }
                    
                    else if(gwadar.toString().equals(depCity)&&islamabad.toString().equals(destCity))
                    {   ShortestPathAlgorithm(gwadar,islamabad);
                        List<Node> path = printPath(islamabad);
                        jTextField2.setText("Path: " + path);
                    }
                    
                    else if(rahimYarKhan.toString().equals(depCity)&&karachi.toString().equals(destCity))
                    {   ShortestPathAlgorithm(rahimYarKhan,karachi);
                        List<Node> path = printPath(karachi);
                        jTextField2.setText("Path: " + path);
                    }
                    
                    else if(rahimYarKhan.toString().equals(depCity)&&gwadar.toString().equals(destCity))
                    {   ShortestPathAlgorithm(rahimYarKhan,gwadar);
                        List<Node> path = printPath(gwadar);
                        jTextField2.setText("Path: " + path);
                    }
                    
                    else if(rahimYarKhan.toString().equals(depCity)&&rahimYarKhan.toString().equals(destCity))
                    {   ShortestPathAlgorithm(rahimYarKhan,rahimYarKhan);
                        List<Node> path = printPath(rahimYarKhan);
                        jTextField2.setText("Path: " + path);
                    }
                    
                    else if(rahimYarKhan.toString().equals(depCity)&&quetta.toString().equals(destCity))
                    {   ShortestPathAlgorithm(rahimYarKhan,quetta);
                        List<Node> path = printPath(quetta);
                        jTextField2.setText("Path: " + path);
                    }
                    
                    else if(rahimYarKhan.toString().equals(depCity)&&dGK.toString().equals(destCity))
                    {   ShortestPathAlgorithm(rahimYarKhan,dGK);
                        List<Node> path = printPath(dGK);
                        jTextField2.setText("Path: " + path);
                    }
                    
                    else if(rahimYarKhan.toString().equals(depCity)&&multan.toString().equals(destCity))
                    {   ShortestPathAlgorithm(rahimYarKhan,multan);
                        List<Node> path = printPath(multan);
                        jTextField2.setText("Path: " + path);
                    }
                    
                    else if(rahimYarKhan.toString().equals(depCity)&&lahore.toString().equals(destCity))
                    {   ShortestPathAlgorithm(rahimYarKhan,lahore);
                        List<Node> path = printPath(lahore);
                        jTextField2.setText("Path: " + path);
                    }
                    
                    else if(rahimYarKhan.toString().equals(depCity)&&peshawar.toString().equals(destCity))
                    {   ShortestPathAlgorithm(rahimYarKhan,peshawar);
                        List<Node> path = printPath(peshawar);
                        jTextField2.setText("Path: " + path);
                    }
                    
                    else if(rahimYarKhan.toString().equals(depCity)&&islamabad.toString().equals(destCity))
                    {   ShortestPathAlgorithm(rahimYarKhan,islamabad);
                        List<Node> path = printPath(islamabad);
                        jTextField2.setText("Path: " + path);
                    }
                    
                    else if(quetta.toString().equals(depCity)&&karachi.toString().equals(destCity))
                    {   ShortestPathAlgorithm(quetta,karachi);
                        List<Node> path = printPath(karachi);
                        jTextField2.setText("Path: " + path);
                    }
                    
                    else if(quetta.toString().equals(depCity)&&gwadar.toString().equals(destCity))
                    {   ShortestPathAlgorithm(quetta,gwadar);
                        List<Node> path = printPath(gwadar);
                        jTextField2.setText("Path: " + path);
                    }
                    
                    else if(quetta.toString().equals(depCity)&&rahimYarKhan.toString().equals(destCity))
                    {   ShortestPathAlgorithm(quetta,rahimYarKhan);
                        List<Node> path = printPath(rahimYarKhan);
                        jTextField2.setText("Path: " + path);
                    }
                    
                    else if(quetta.toString().equals(depCity)&&quetta.toString().equals(destCity))
                    {   ShortestPathAlgorithm(quetta,quetta);
                        List<Node> path = printPath(quetta);
                        jTextField2.setText("Path: " + path);
                    }
                    
                    else if(quetta.toString().equals(depCity)&&dGK.toString().equals(destCity))
                    {   ShortestPathAlgorithm(quetta,dGK);
                        List<Node> path = printPath(dGK);
                        jTextField2.setText("Path: " + path);
                    }
                    
                    else if(quetta.toString().equals(depCity)&&multan.toString().equals(destCity))
                    {   ShortestPathAlgorithm(quetta,multan);   
                        List<Node> path = printPath(multan);
                        jTextField2.setText("Path: " + path);
                    }
                    
                    else if(quetta.toString().equals(depCity)&&lahore.toString().equals(destCity))
                    {   ShortestPathAlgorithm(quetta,lahore);
                        List<Node> path = printPath(lahore);
                        jTextField2.setText("Path: " + path);
                    }
                    
                    else if(quetta.toString().equals(depCity)&&peshawar.toString().equals(destCity))
                    {   ShortestPathAlgorithm(quetta,peshawar);
                        List<Node> path = printPath(peshawar);
                        jTextField2.setText("Path: " + path);
                    }
                    
                    else if(quetta.toString().equals(depCity)&&islamabad.toString().equals(destCity))
                    {   ShortestPathAlgorithm(quetta,islamabad);
                        List<Node> path = printPath(islamabad);
                        jTextField2.setText("Path: " + path);
                    }
                    
                    else if(dGK.toString().equals(depCity)&&karachi.toString().equals(destCity))
                    {   ShortestPathAlgorithm(dGK,karachi);
                        List<Node> path = printPath(karachi);
                        jTextField2.setText("Path: " + path);
                    }
                    
                    else if(dGK.toString().equals(depCity)&&gwadar.toString().equals(destCity))
                    {   ShortestPathAlgorithm(dGK,gwadar);
                        List<Node> path = printPath(gwadar);
                        jTextField2.setText("Path: " + path);
                    }
                    
                    else if(dGK.toString().equals(depCity)&&rahimYarKhan.toString().equals(destCity))
                    {   ShortestPathAlgorithm(dGK,rahimYarKhan);
                        List<Node> path = printPath(rahimYarKhan);
                        jTextField2.setText("Path: " + path);
                    }
                    
                    else if(dGK.toString().equals(depCity)&&quetta.toString().equals(destCity))
                    {   ShortestPathAlgorithm(dGK,quetta);
                        List<Node> path = printPath(quetta);
                        jTextField2.setText("Path: " + path);
                    }
                    
                    else if(dGK.toString().equals(depCity)&&dGK.toString().equals(destCity))
                    {   ShortestPathAlgorithm(dGK,dGK);
                        List<Node> path = printPath(dGK);
                        jTextField2.setText("Path: " + path);
                    }
                    
                    else if(dGK.toString().equals(depCity)&&multan.toString().equals(destCity))
                    {   ShortestPathAlgorithm(dGK,multan);
                        List<Node> path = printPath(multan);
                        jTextField2.setText("Path: " + path);
                    }
                    
                    else if(dGK.toString().equals(depCity)&&lahore.toString().equals(destCity))
                    {   ShortestPathAlgorithm(dGK,lahore);
                        List<Node> path = printPath(lahore);
                        jTextField2.setText("Path: " + path);
                    }
                    
                    else if(dGK.toString().equals(depCity)&&peshawar.toString().equals(destCity))
                    {   ShortestPathAlgorithm(dGK,peshawar);
                        List<Node> path = printPath(peshawar);
                        jTextField2.setText("Path: " + path);
                    }
                    
                    else if(dGK.toString().equals(depCity)&&islamabad.toString().equals(destCity))
                    {   ShortestPathAlgorithm(dGK,islamabad);
                        List<Node> path = printPath(islamabad);
                        jTextField2.setText("Path: " + path);
                    }
                    
                    else if(multan.toString().equals(depCity)&&karachi.toString().equals(destCity))
                    {   ShortestPathAlgorithm(multan,karachi);
                        List<Node> path = printPath(karachi);
                        jTextField2.setText("Path: " + path);
                    }
                    
                    else if(multan.toString().equals(depCity)&&gwadar.toString().equals(destCity))
                    {   ShortestPathAlgorithm(multan,gwadar);
                        List<Node> path = printPath(gwadar);
                        jTextField2.setText("Path: " + path);
                    }
                    
                    else if(multan.toString().equals(depCity)&&rahimYarKhan.toString().equals(destCity))
                    {   ShortestPathAlgorithm(multan,rahimYarKhan);
                        List<Node> path = printPath(rahimYarKhan);
                        jTextField2.setText("Path: " + path);
                    }
                    
                    else if(multan.toString().equals(depCity)&&quetta.toString().equals(destCity))
                    {   ShortestPathAlgorithm(multan,quetta);
                        List<Node> path = printPath(quetta);
                        jTextField2.setText("Path: " + path);
                    }
                    
                    else if(multan.toString().equals(depCity)&&dGK.toString().equals(destCity))
                    {   ShortestPathAlgorithm(multan,dGK);
                        List<Node> path = printPath(dGK);
                        jTextField2.setText("Path: " + path);
                    }
                    
                    else if(multan.toString().equals(depCity)&&multan.toString().equals(destCity))
                    {   ShortestPathAlgorithm(multan,multan);
                        List<Node> path = printPath(multan);
                        jTextField2.setText("Path: " + path);
                    }
                    
                    else if(multan.toString().equals(depCity)&&lahore.toString().equals(destCity))
                    {   ShortestPathAlgorithm(multan,lahore);
                        List<Node> path = printPath(lahore);
                        jTextField2.setText("Path: " + path);
                    }
                    
                    else if(multan.toString().equals(depCity)&&peshawar.toString().equals(destCity))
                    {   ShortestPathAlgorithm(multan,peshawar);
                        List<Node> path = printPath(peshawar);
                        jTextField2.setText("Path: " + path);
                    }
                    
                    else if(multan.toString().equals(depCity)&&islamabad.toString().equals(destCity))
                    {   ShortestPathAlgorithm(multan,islamabad);
                        List<Node> path = printPath(islamabad);
                        jTextField2.setText("Path: " + path);
                    }
                    
                    else if(lahore.toString().equals(depCity)&&karachi.toString().equals(destCity))
                    {   ShortestPathAlgorithm(lahore,karachi);
                        List<Node> path = printPath(karachi);
                        jTextField2.setText("Path: " + path);
                    }
                    
                    else if(lahore.toString().equals(depCity)&&gwadar.toString().equals(destCity))
                    {   ShortestPathAlgorithm(lahore,gwadar);
                        List<Node> path = printPath(gwadar);
                        jTextField2.setText("Path: " + path);
                    }
                    
                    else if(lahore.toString().equals(depCity)&&rahimYarKhan.toString().equals(destCity))
                    {   ShortestPathAlgorithm(lahore,rahimYarKhan);
                        List<Node> path = printPath(rahimYarKhan);
                        jTextField2.setText("Path: " + path);
                    }
                    
                    else if(lahore.toString().equals(depCity)&&quetta.toString().equals(destCity))
                    {   ShortestPathAlgorithm(lahore,quetta);
                        List<Node> path = printPath(quetta);
                        jTextField2.setText("Path: " + path);
                    }
                    
                    else if(lahore.toString().equals(depCity)&&dGK.toString().equals(destCity))
                    {   ShortestPathAlgorithm(lahore,dGK);
                        List<Node> path = printPath(dGK);
                        jTextField2.setText("Path: " + path);
                    }
                    
                    else if(lahore.toString().equals(depCity)&&multan.toString().equals(destCity))
                    {   ShortestPathAlgorithm(lahore,multan);
                        List<Node> path = printPath(multan);
                        jTextField2.setText("Path: " + path);
                    }
                    
                    else if(lahore.toString().equals(depCity)&&lahore.toString().equals(destCity))
                    {   ShortestPathAlgorithm(lahore,lahore);
                        List<Node> path = printPath(lahore);
                        jTextField2.setText("Path: " + path);
                    }
                    
                    else if(lahore.toString().equals(depCity)&&peshawar.toString().equals(destCity))
                    {   ShortestPathAlgorithm(lahore,peshawar);
                        List<Node> path = printPath(peshawar);
                        jTextField2.setText("Path: " + path);
                    }
                    
                    else if(lahore.toString().equals(depCity)&&islamabad.toString().equals(destCity))
                    {   ShortestPathAlgorithm(lahore,islamabad);
                        List<Node> path = printPath(islamabad);
                        jTextField2.setText("Path: " + path);
                    }
                    
                    else if(peshawar.toString().equals(depCity)&&karachi.toString().equals(destCity))
                    {   ShortestPathAlgorithm(peshawar,karachi);
                        List<Node> path = printPath(karachi);
                        jTextField2.setText("Path: " + path);
                    }
                    
                    else if(peshawar.toString().equals(depCity)&&gwadar.toString().equals(destCity))
                    {   ShortestPathAlgorithm(peshawar,gwadar);
                        List<Node> path = printPath(gwadar);
                        jTextField2.setText("Path: " + path);
                    }
                    
                    else if(peshawar.toString().equals(depCity)&&rahimYarKhan.toString().equals(destCity))
                    {   ShortestPathAlgorithm(peshawar,rahimYarKhan);
                        List<Node> path = printPath(rahimYarKhan);
                        jTextField2.setText("Path: " + path);
                    }
                    
                    else if(peshawar.toString().equals(depCity)&&quetta.toString().equals(destCity))
                    {   ShortestPathAlgorithm(peshawar,quetta);
                        List<Node> path = printPath(quetta);
                        jTextField2.setText("Path: " + path);
                    }
                    
                    else if(peshawar.toString().equals(depCity)&&dGK.toString().equals(destCity))
                    {   ShortestPathAlgorithm(peshawar,dGK);
                        List<Node> path = printPath(dGK);
                        jTextField2.setText("Path: " + path);
                    }
                    
                    else if(peshawar.toString().equals(depCity)&&multan.toString().equals(destCity))
                    {   ShortestPathAlgorithm(peshawar,multan); 
                        List<Node> path = printPath(multan);
                        jTextField2.setText("Path: " + path);
                    }
                    
                    else if(peshawar.toString().equals(depCity)&&lahore.toString().equals(destCity))
                    {   ShortestPathAlgorithm(peshawar,lahore);
                        List<Node> path = printPath(lahore);
                        jTextField2.setText("Path: " + path);}
                    
                    else if(peshawar.toString().equals(depCity)&&peshawar.toString().equals(destCity))
                    {   ShortestPathAlgorithm(peshawar,peshawar);
                        List<Node> path = printPath(peshawar);
                        jTextField2.setText("Path: " + path);
                    }
                    
                    else if(peshawar.toString().equals(depCity)&&islamabad.toString().equals(destCity))
                    {   ShortestPathAlgorithm(peshawar,islamabad);
                        List<Node> path = printPath(islamabad);
                        jTextField2.setText("Path: " + path);
                    }
                    
                    else if(islamabad.toString().equals(depCity)&&karachi.toString().equals(destCity))
                    {   ShortestPathAlgorithm(islamabad,karachi);
                        List<Node> path = printPath(karachi);
                        jTextField2.setText("Path: " + path);
                    }
                    
                    else if(islamabad.toString().equals(depCity)&&gwadar.toString().equals(destCity))
                    {   ShortestPathAlgorithm(islamabad,gwadar);
                        List<Node> path = printPath(gwadar);
                        jTextField2.setText("Path: " + path);
                    }
                    
                    else if(islamabad.toString().equals(depCity)&&rahimYarKhan.toString().equals(destCity))
                    {   ShortestPathAlgorithm(islamabad,rahimYarKhan);
                        List<Node> path = printPath(rahimYarKhan);
                        jTextField2.setText("Path: " + path);
                    }
                    
                    else if(islamabad.toString().equals(depCity)&&quetta.toString().equals(destCity))
                    {   ShortestPathAlgorithm(islamabad,quetta);
                        List<Node> path = printPath(quetta);
                        jTextField2.setText("Path: " + path);}
                    
                    else if(islamabad.toString().equals(depCity)&&dGK.toString().equals(destCity))
                    {   ShortestPathAlgorithm(islamabad,dGK);
                        List<Node> path = printPath(dGK);
                        jTextField2.setText("Path: " + path);}
                    
                    else if(islamabad.toString().equals(depCity)&&multan.toString().equals(destCity))
                    {   ShortestPathAlgorithm(islamabad,multan);
                        List<Node> path = printPath(multan);
                        jTextField2.setText("Path: " + path);
                    }
                    
                    else if(islamabad.toString().equals(depCity)&&lahore.toString().equals(destCity))
                    {ShortestPathAlgorithm(islamabad,lahore);
                    List<Node> path = printPath(lahore);
                    jTextField2.setText("Path: " + path);
                    }
                    
                    else if(islamabad.toString().equals(depCity)&&peshawar.toString().equals(destCity))
                    {   ShortestPathAlgorithm(islamabad,peshawar);
                        List<Node> path = printPath(peshawar);
                        jTextField2.setText("Path: " + path);
                    }
                    
                    else
                    {   ShortestPathAlgorithm(islamabad,islamabad);
                        List<Node> path = printPath(islamabad);
                        jTextField2.setText("Path: " + path);
                    }
                    
                    found =false;
                    
                }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUIImplementation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIImplementation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIImplementation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIImplementation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new GUIImplementation().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
