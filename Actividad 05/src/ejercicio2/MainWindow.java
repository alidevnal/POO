package ejercicio2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame implements ActionListener {
    private Container container;
    private JButton cylinder, sphere, pyramid, cube, prism;
    public MainWindow() {
        initialize();
        setTitle("Formas Geométricas");
        setSize(520, 160);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    private void initialize() {
        container = getContentPane();
        container.setLayout(null);
        sphere = new JButton("Esfera");
        sphere.setBounds(20, 50, 100, 23);
        sphere.addActionListener(this);
        cylinder = new JButton("Cilindro");
        cylinder.setBounds(110, 50, 100, 23);
        cylinder.addActionListener(this);
        pyramid = new JButton("Pirámide");
        pyramid.setBounds(200, 50, 100, 23);
        pyramid.addActionListener(this);
        cube = new JButton("Cubo");
        cube.setBounds(300, 50, 100, 23);
        cube.addActionListener(this);
        prism = new JButton("Prisma");
        prism.setBounds(390, 50, 100, 23);
        prism.addActionListener(this);
        container.add(sphere);
        container.add(cylinder);
        container.add(pyramid);
        container.add(cube);
        container.add(prism);
    }
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == sphere) {
            SphereWindow sphere = new SphereWindow();
            sphere.setVisible(true);
        }
        if (event.getSource() == cylinder) {
            CylinderWindow cylinder = new CylinderWindow();
            cylinder.setVisible(true);
        }
        if (event.getSource() == pyramid) {
            PyramidWindow pyramid = new PyramidWindow();
            pyramid.setVisible(true);
        }
        if (event.getSource() == cube) {
            CubeWindow cube = new CubeWindow();
            cube.setVisible(true);
        }
        if (event.getSource() == prism) {
            RectangularPrismWindow prism = new RectangularPrismWindow();
            prism.setVisible(true);
        }
    }
}
