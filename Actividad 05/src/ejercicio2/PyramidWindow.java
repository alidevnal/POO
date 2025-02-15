package ejercicio2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PyramidWindow extends JFrame implements ActionListener {
    private Container container;
    private JLabel base, height, apothem, volume, surface;
    private JTextField baseField, heightField, apothemField;
    private JButton calculate;
    public PyramidWindow() {
        initialize();
        setTitle("Pirámide");
        setSize(280, 240);
        setLocationRelativeTo(null);
        setResizable(false);
    }
    private void initialize() {
        container = getContentPane();
        container.setLayout(null);
        base = new JLabel();
        base.setText("Base (cm):");
        base.setBounds(20, 20, 135, 23);
        baseField = new JTextField();
        baseField.setBounds(120, 20, 135, 23);
        height = new JLabel();
        height.setText("Altura (cm):");
        height.setBounds(20, 50, 135, 23);
        heightField = new JTextField();
        heightField.setBounds(120, 50, 135, 23);
        apothem = new JLabel();
        apothem.setText("Apotema (cm):");
        apothem.setBounds(20, 80, 135, 23);
        apothemField = new JTextField();
        apothemField.setBounds(120, 80, 135, 23);
        calculate = new JButton();
        calculate.setText("Calcular");
        calculate.setBounds(120, 110, 135, 23);
        calculate.addActionListener(this);
        volume = new JLabel();
        volume.setText("Volumen (cm³):");
        volume.setBounds(20, 140, 135, 23);
        surface = new JLabel();
        surface.setText("Superficie (cm²):");
        surface.setBounds(20, 170, 135, 23);
        container.add(base);
        container.add(baseField);
        container.add(height);
        container.add(heightField);
        container.add(apothem);
        container.add(apothemField);
        container.add(calculate);
        container.add(volume);
        container.add(surface);
    }
    public void actionPerformed(ActionEvent event) {
        Pyramid pyramid;
        boolean error = false;
        double base = 0;
        double height = 0;
        double apothem = 0;
        try {
            base = Double.parseDouble(baseField.getText());
            height = Double.parseDouble(heightField.getText());
            apothem = Double.parseDouble(apothemField.getText());
            pyramid = new Pyramid(base, height, apothem);
            volume.setText("Volumen (cm³): " + String.format("%.2f", pyramid.calculateVolume()));
            surface.setText("Superficie (cm²): " + String.format("%.2f", pyramid.calculateSurface()));
        } catch (Exception e) {
            error = true;
        } finally {
            if (error) {
                JOptionPane.showMessageDialog(null, "Campo vacío o error de formato numérico", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}

