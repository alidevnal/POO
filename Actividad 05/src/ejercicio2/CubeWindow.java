package ejercicio2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CubeWindow extends JFrame implements ActionListener {
    private Container container;
    private JLabel sideLabel, volume, surface;
    private JTextField sideField;
    private JButton calculate;
    public CubeWindow() {
        initialize();
        setTitle("Cubo");
        setSize(280, 200);
        setLocationRelativeTo(null);
        setResizable(false);
    }
    private void initialize() {
        container = getContentPane();
        container.setLayout(null);
        sideLabel = new JLabel("Lado (cm):");
        sideLabel.setBounds(20, 20, 135, 23);
        sideField = new JTextField();
        sideField.setBounds(120, 20, 135, 23);
        calculate = new JButton("Calcular");
        calculate.setBounds(120, 50, 135, 23);
        calculate.addActionListener(this);
        volume = new JLabel("Volumen (cm³):");
        volume.setBounds(20, 80, 200, 23);
        surface = new JLabel("Superficie (cm²):");
        surface.setBounds(20, 110, 200, 23);
        container.add(sideLabel);
        container.add(sideField);
        container.add(calculate);
        container.add(volume);
        container.add(surface);
    }
    public void actionPerformed(ActionEvent event) {
        Cube cube;
        boolean error = false;
        double side = 0;
        try {
            side = Double.parseDouble(sideField.getText());
            cube = new Cube(side);
            volume.setText("Volumen (cm³): " + String.format("%.2f", cube.calculateVolume()));
            surface.setText("Superficie (cm²): " + String.format("%.2f", cube.calculateSurface()));
        } catch (Exception e) {
            error = true;
        } finally {
            if (error) {
                JOptionPane.showMessageDialog(null, "Campo vacío o error de formato numérico", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
