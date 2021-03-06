package net.spacejunkjim.miniproject3;

import Serialization.XMLSerialization;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.LayoutStyle;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

/**
 * The GUI Frame for Part 2 of the XML Assignment
 *
 * @author James Ashford, Dorian Dressler
 */
public class WeatherFrame extends javax.swing.JFrame {
    private XMLSerialization serialization;
    private ArrayList<Location> locations;
    private String defaultFrameInputText = "Enter a location...";
    private String searchTerm;

    /**
     * Constructor new form WeatherFrame
     */
    public WeatherFrame() {
        initComponents();
        serialization = new XMLSerialization();
        jPanel1.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userInfoLabel1 = new JLabel();
        jLabel9 = new JLabel();
        jToggleButton1 = new JToggleButton();
        appTitle = new JLabel();
        queryLabel = new JLabel();
        queryField = new JTextField();
        getLocationsButton = new JButton();
        locationSelector = new JComboBox<String>();
        userInfo = new JLabel();
        jPanel1 = new JPanel();
        tempValueField = new JLabel();
        jPanel2 = new JPanel();
        windField = new JLabel();
        windValueField = new JLabel();
        windSpeedField = new JLabel();
        windSpeedValueField = new JLabel();
        humidityField = new JLabel();
        humidIcon = new JLabel();
        pressureField = new JLabel();
        pressureIcon = new JLabel();
        visibilityField = new JLabel();
        visibilityValueField = new JLabel();
        weatherIcon = new JLabel();

        userInfoLabel1.setFont(new Font("Lucida Grande", 0, 18)); // NOI18N
        userInfoLabel1.setForeground(new Color(102, 102, 102));
        userInfoLabel1.setHorizontalAlignment(SwingConstants.CENTER);
        userInfoLabel1.setText("Please enter a location...");

        jLabel9.setText("jLabel9");

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("BBC Weather Observations");

        appTitle.setFont(new Font("Lucida Grande", 0, 18)); // NOI18N
        appTitle.setText("BBC Weather Observations");

        queryLabel.setText("City");

        queryField.setText("Enter a location...");
        queryField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                queryFieldActionPerformed(evt);
            }
        });

        getLocationsButton.setText("Get Location(s)");
        getLocationsButton.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                getLocationsButtonMouseClicked(evt);
            }
        });
        getLocationsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                getLocationsButtonActionPerformed(evt);
            }
        });

        locationSelector.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent evt) {
                locationSelectorItemStateChanged(evt);
            }
        });
        locationSelector.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                locationSelectorActionPerformed(evt);
            }
        });

        userInfo.setFont(new Font("Lucida Grande", 0, 14)); // NOI18N
        userInfo.setForeground(new Color(102, 102, 102));
        userInfo.setText("Please enter a location...");

        jPanel1.setBorder(BorderFactory.createEtchedBorder());

        tempValueField.setFont(new Font("Lucida Grande", 0, 36)); // NOI18N
        tempValueField.setHorizontalAlignment(SwingConstants.CENTER);
        tempValueField.setText("9C");

        jPanel2.setLayout(new GridLayout(5, 2));

        windField.setText("Wind Direction");
        jPanel2.add(windField);

        windValueField.setHorizontalAlignment(SwingConstants.RIGHT);
        windValueField.setText("WIND");
        jPanel2.add(windValueField);

        windSpeedField.setText("Wind Speed");
        jPanel2.add(windSpeedField);

        windSpeedValueField.setHorizontalAlignment(SwingConstants.RIGHT);
        windSpeedValueField.setText("WIND-SPEED");
        jPanel2.add(windSpeedValueField);

        humidityField.setText("Humidity");
        jPanel2.add(humidityField);

        humidIcon.setHorizontalAlignment(SwingConstants.RIGHT);
        humidIcon.setText("HUMIDITY");
        jPanel2.add(humidIcon);

        pressureField.setText("Pressure");
        jPanel2.add(pressureField);

        pressureIcon.setHorizontalAlignment(SwingConstants.RIGHT);
        pressureIcon.setText("PRESSURE");
        jPanel2.add(pressureIcon);

        visibilityField.setText("Visibility");
        jPanel2.add(visibilityField);

        visibilityValueField.setHorizontalAlignment(SwingConstants.RIGHT);
        visibilityValueField.setText("VISIBILITY");
        jPanel2.add(visibilityValueField);

        weatherIcon.setHorizontalAlignment(SwingConstants.CENTER);
        weatherIcon.setIcon(new ImageIcon(getClass().getResource("/simple_weather_icon_01.png"))); // NOI18N

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                    .addComponent(weatherIcon, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tempValueField, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tempValueField, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(weatherIcon, GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                .addContainerGap())
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(userInfo, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(locationSelector, GroupLayout.Alignment.LEADING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(queryLabel)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(queryField, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(getLocationsButton, GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE))
                    .addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(appTitle)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(appTitle)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(queryLabel)
                    .addComponent(queryField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(getLocationsButton))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(locationSelector, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userInfo, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void queryFieldActionPerformed(ActionEvent evt) {//GEN-FIRST:event_queryFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_queryFieldActionPerformed

    /**
     * Event handler for getLocation button in gui
     * @param evt the event
     */
    private void getLocationsButtonMouseClicked(MouseEvent evt) {//GEN-FIRST:event_getLocationsButtonMouseClicked
        // Check if query field is not equal to default message
        if (!queryField.getText().equals(defaultFrameInputText)) {
            // Show the panel
            jPanel1.setVisible(true);

            // Set info message to invisible
            userInfo.setVisible(false);

            // Clear ComboBox
            locationSelector.removeAllItems();

            // Get the city name
            searchTerm = queryField.getText();

            // Get locations
            LocationParser parser = new LocationParser(searchTerm);
            locations = parser.getOutput();

            // Populate ComboList
            for (Location l : locations) {
                locationSelector.addItem(l.getName() + ", " + l.getCountry());
            }
            
            // Reset query field
            queryField.setText(defaultFrameInputText);
        } else {
            JOptionPane.showMessageDialog(this, "Please enter a city name.", "Invalid input", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_getLocationsButtonMouseClicked

    /**
     * 
     * @param evt 
     */
    private void getLocationsButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_getLocationsButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getLocationsButtonActionPerformed

    private void locationSelectorActionPerformed(ActionEvent evt) {//GEN-FIRST:event_locationSelectorActionPerformed
        updateWeatherInfoPanel();
    }//GEN-LAST:event_locationSelectorActionPerformed

    private void locationSelectorItemStateChanged(ItemEvent evt) {//GEN-FIRST:event_locationSelectorItemStateChanged
        updateWeatherInfoPanel();
    }//GEN-LAST:event_locationSelectorItemStateChanged

    /**
     * Updates the GUI with selected weather info
     *
     */
    private void updateWeatherInfoPanel() {
        Location l = locations.get(locationSelector.getSelectedIndex());
        int geonameId = l.getGeonameId();

        WeatherParser parser = new WeatherParser(geonameId);
        boolean locationFounds = parser.getDesciption().contains("ERROR");
        
        if (!locationFounds) {
            Weather w = new Weather(parser.getDesciption());
            System.out.println(parser.getDesciption());
            
            // Update weather info in field
            tempValueField.setText(w.getTemperature());
            windValueField.setText(w.getWindDirection());
            windSpeedValueField.setText(w.getWindSpeed());
            humidIcon.setText(w.getHumidity());
            pressureIcon.setText(w.getPressure());
            visibilityValueField.setText(w.getVisibility());
            
            // Set weather icon
            String condition = WeatherAppUtils.getWeatherCondition(parser.getTitle());
            setWeatherIcon(condition);
        } else {
            JOptionPane.showMessageDialog(this, "Location not in BBC database", "Invalid location", JOptionPane.WARNING_MESSAGE);
        }
        
        serialization.addSearchItems(searchTerm, locationFounds, geonameId);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new WeatherFrame().setVisible(true);
            }
        });
    }

    /**
     * Method assigns icon to reflect the current weather.
     */
    private void setWeatherIcon(String comparator) {
        String fileLocation = WeatherAppUtils.weatherToIcon(comparator);
        weatherIcon.setIcon(new ImageIcon(getClass().getResource(fileLocation)));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JLabel appTitle;
    private JButton getLocationsButton;
    private JLabel humidIcon;
    private JLabel humidityField;
    private JLabel jLabel9;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JToggleButton jToggleButton1;
    private JComboBox<String> locationSelector;
    private JLabel pressureField;
    private JLabel pressureIcon;
    private JTextField queryField;
    private JLabel queryLabel;
    private JLabel tempValueField;
    private JLabel userInfo;
    private JLabel userInfoLabel1;
    private JLabel visibilityField;
    private JLabel visibilityValueField;
    private JLabel weatherIcon;
    private JLabel windField;
    private JLabel windSpeedField;
    private JLabel windSpeedValueField;
    private JLabel windValueField;
    // End of variables declaration//GEN-END:variables
}
