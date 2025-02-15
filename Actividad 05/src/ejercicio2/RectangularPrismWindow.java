package ejercicio2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RectangularPrismWindow extends JFrame implements ActionListener {
    private Container container;
    private JLabel lengthLabel, widthLabel, heightLabel, volume, surface;
    private JTextField lengthField, widthField, heightField;
    private JButton calculate;
    public RectangularPrismWindow() {
        initialize();
        setTitle("Prisma Rectangular");
        setSize(280, 240);
        setLocationRelativeTo(null);
        setResizable(false);
    }
    private void initialize() {
        container = getContentPane();
        container.setLayout(null);
        lengthLabel = new JLabel("Longitud (cm):");
        lengthLabel.setBounds(20, 20, 135, 23);
        lengthField = new JTextField();
        lengthField.setBounds(120, 20, 135, 23);
        widthLabel = new JLabel("Ancho (cm):");
        widthLabel.setBounds(20, 50, 135, 23);
        widthField = new JTextField();
        widthField.setBounds(120, 50, 135, 23);
        heightLabel = new JLabel("Altura (cm):");
        heightLabel.setBounds(20, 80, 135, 23);
        heightField = new JTextField();
        heightField.setBounds(120, 80, 135, 23);
        calculate = new JButton("Calcular");
        calculate.setBounds(120, 110, 135, 23);
        calculate.addActionListener(this);
        volume = new JLabel("Volumen (cm³):");
        volume.setBounds(20, 140, 200, 23);
        surface = new JLabel("Superficie (cm²):");
        surface.setBounds(20, 170, 200, 23);
        container.add(lengthLabel);
        container.add(lengthField);
        container.add(widthLabel);
        container.add(widthField);
        container.add(heightLabel);
        container.add(heightField);
        container.add(calculate);
        container.add(volume);
        container.add(surface);
    }
    public void actionPerformed(ActionEvent event) {
        RectangularPrism prism;
        boolean error = false;
        double length = 0, width = 0, height = 0;
        try {
            length = Double.parseDouble(lengthField.getText());
            width = Double.parseDouble(widthField.getText());
            height = Double.parseDouble(heightField.getText());
            prism = new RectangularPrism(length, width, height);
            volume.setText("Volumen (cm³): " + String.format("%.2f", prism.calculateVolume()));
            surface.setText("Superficie (cm²): " + String.format("%.2f", prism.calculateSurface()));
        } catch (Exception e) {
            error = true;
        } finally {
            if (error) {
                JOptionPane.showMessageDialog(null, "Campo vacío o error de formato numérico", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
