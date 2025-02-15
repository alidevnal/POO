package ejercicio2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SphereWindow extends JFrame implements ActionListener {
    private Container container;
    private JLabel radius, volume, surface;
    private JTextField radiusField;
    private JButton calculate;
    public SphereWindow() {
        initialize();
        setTitle("Sphere");
        setSize(280, 200);
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
        calculate = new JButton();
        calculate.setText("Calcular");
        calculate.setBounds(100, 50, 135, 23);
        calculate.addActionListener(this);
        volume = new JLabel();
        volume.setText("Volumen (cm³):");
        volume.setBounds(20, 90, 135, 23);
        surface = new JLabel();
        surface.setText("Superficie (cm²):");
        surface.setBounds(20, 120, 135, 23);
        container.add(radius);
        container.add(radiusField);
        container.add(calculate);
        container.add(volume);
        container.add(surface);
    }
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == calculate) {
            boolean error = false;
            try {
                double radius = Double.parseDouble(radiusField.getText());
                Sphere sphere = new Sphere(radius);
                volume.setText("Volumen (cm³): " + String.format("%.2f", sphere.calculateVolume()));
                surface.setText("Superficie (cm²): " + String.format("%.2f", sphere.calculateSurface()));
            } catch (Exception e) {
                error = true;
            } finally {
                if (error) {
                    JOptionPane.showMessageDialog(null, "Campo vacío o error de formato numérico", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }
}

