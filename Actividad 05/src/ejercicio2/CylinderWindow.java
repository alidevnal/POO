package ejercicio2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CylinderWindow extends JFrame implements ActionListener {
    private Container container;
    private JLabel radius, height, volume, surface;
    private JTextField radiusField, heightField;
    private JButton calculate;
    public CylinderWindow() {
        initialize();
        setTitle("Cilindro");
        setSize(280, 210);
        setLocationRelativeTo(null);
        setResizable(false);
    }
    private void initialize() {
        container = getContentPane();
        container.setLayout(null);
        radius = new JLabel();
        radius.setText("Radio (cm):");
        radius.setBounds(20, 20, 135, 23);
        radiusField = new JTextField();
        radiusField.setBounds(100, 20, 135, 23);
        height = new JLabel();
        height.setText("Altura (cm):");
        height.setBounds(20, 50, 135, 23);
        heightField = new JTextField();
        heightField.setBounds(100, 50, 135, 23);
        calculate = new JButton();
        calculate.setText("Calcular");
        calculate.setBounds(100, 80, 135, 23);
        calculate.addActionListener(this);
        volume = new JLabel();
        volume.setText("Volumen (cm³):");
        volume.setBounds(20, 110, 135, 23);
        surface = new JLabel();
        surface.setText("Superficie (cm²):");
        surface.setBounds(20, 140, 135, 23);
        container.add(radius);
        container.add(radiusField);
        container.add(height);
        container.add(heightField);
        container.add(calculate);
        container.add(volume);
        container.add(surface);
    }
    public void actionPerformed(ActionEvent event) {
        boolean error = false;
        double radius = 0;
        double height = 0;
        try {
            radius = Double.parseDouble(radiusField.getText());
            height = Double.parseDouble(heightField.getText());
            Cylinder cylinder = new Cylinder(radius, height);
            volume.setText("Volumen (cm³): " + String.format("%.2f", cylinder.calculateVolume()));
            surface.setText("Superficie (cm²): " + String.format("%.2f", cylinder.calculateSurface()));
        } catch (Exception e) {
            error = true;
        } finally {
            if (error) {
                JOptionPane.showMessageDialog(null, "Campo vacío o error de formato numérico", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}

