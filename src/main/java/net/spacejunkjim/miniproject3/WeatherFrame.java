/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.spacejunkjim.miniproject3;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.WindowConstants;

/**
 *
 * @author jamesashford
 */
public class WeatherFrame extends javax.swing.JFrame {

    /**
     * Creates new form WeatherFrame
     */
    public WeatherFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        appTitle = new JLabel();
        appURLLabel = new JLabel();
        appURLField = new JTextField();
        appForecastButton = new JButton();
        appOutputTextArea = new JScrollPane();
        jTextArea1 = new JTextArea();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("BBC Weather Observations");
        setResizable(false);

        appTitle.setFont(new Font("Lucida Grande", 0, 18)); // NOI18N
        appTitle.setText("BBC Weather Observations");

        appURLLabel.setText("URL: ");

        appURLField.setText("Enter BBC Weather Observations RSS URL...");
        appURLField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                appURLFieldActionPerformed(evt);
            }
        });

        appForecastButton.setText("Forecast");
        appForecastButton.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                appForecastButtonMouseClicked(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        appOutputTextArea.setViewportView(jTextArea1);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(appOutputTextArea)
                    .addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(appURLLabel)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(appURLField, GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE))
                    .addComponent(appForecastButton, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(appTitle)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(appTitle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(appURLLabel)
                    .addComponent(appURLField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(appForecastButton)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(appOutputTextArea, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void appURLFieldActionPerformed(ActionEvent evt) {//GEN-FIRST:event_appURLFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_appURLFieldActionPerformed

    private void appForecastButtonMouseClicked(MouseEvent evt) {//GEN-FIRST:event_appForecastButtonMouseClicked
        // Clear the output
        jTextArea1.removeAll();
        jTextArea1.setText("");
        // Get the URL
        String url = appURLField.getText();
        
        if(url.equals("")){
            jTextArea1.setText("Please enter an RSS URL");
        }else{
        
        
            // Get a WeatherParser with URL
            WeatherParser parser = new WeatherParser(url);
        
            // Add output to display
            // Now the error has been resolved.
            jTextArea1.append(parser.getOutput());
        
            // Clear URL field
            appURLField.setText("");
        }
    }//GEN-LAST:event_appForecastButtonMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WeatherFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton appForecastButton;
    private JScrollPane appOutputTextArea;
    private JLabel appTitle;
    private JTextField appURLField;
    private JLabel appURLLabel;
    private JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
