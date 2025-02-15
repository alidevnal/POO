package ejercicio1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame implements ActionListener {
    private Container container;
    private JLabel grade1, grade2, grade3, grade4, grade5, average, deviation, highest, lowest;
    private JTextField fieldGrade1, fieldGrade2, fieldGrade3, fieldGrade4, fieldGrade5;
    private JButton calculate, clear;
    public MainWindow() {
        init();
        setTitle("Notas");
        setSize(280, 380);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
    }
    private void init() {
        container = getContentPane();
        container.setLayout(null);
        grade1 = new JLabel("Nota 1:");
        grade1.setBounds(20, 20, 135, 23);
        fieldGrade1 = new JTextField();
        fieldGrade1.setBounds(105, 20, 135, 23);
        grade2 = new JLabel("Nota 2:");
        grade2.setBounds(20, 50, 135, 23);
        fieldGrade2 = new JTextField();
        fieldGrade2.setBounds(105, 50, 135, 23);
        grade3 = new JLabel("Nota 3:");
        grade3.setBounds(20, 80, 135, 23);
        fieldGrade3 = new JTextField();
        fieldGrade3.setBounds(105, 80, 135, 23);
        grade4 = new JLabel("Nota 4:");
        grade4.setBounds(20, 110, 135, 23);
        fieldGrade4 = new JTextField();
        fieldGrade4.setBounds(105, 110, 135, 23);
        grade5 = new JLabel("Nota 5:");
        grade5.setBounds(20, 140, 135, 23);
        fieldGrade5 = new JTextField();
        fieldGrade5.setBounds(105, 140, 135, 23);
        calculate = new JButton("Calcular");
        calculate.setBounds(20, 170, 100, 23);
        calculate.addActionListener(this);
        clear = new JButton("Limpiar");
        clear.setBounds(125, 170, 80, 23);
        clear.addActionListener(this);
        average = new JLabel("Promedio = ");
        average.setBounds(20, 210, 135, 23);
        deviation = new JLabel("Desviación = ");
        deviation.setBounds(20, 240, 200, 23);
        highest = new JLabel("Nota mayor = ");
        highest.setBounds(20, 270, 120, 23);
        lowest = new JLabel("Nota menor = ");
        lowest.setBounds(20, 300, 120, 23);
        container.add(grade1);
        container.add(fieldGrade1);
        container.add(grade2);
        container.add(fieldGrade2);
        container.add(grade3);
        container.add(fieldGrade3);
        container.add(grade4);
        container.add(fieldGrade4);
        container.add(grade5);
        container.add(fieldGrade5);
        container.add(calculate);
        container.add(clear);
        container.add(average);
        container.add(deviation);
        container.add(highest);
        container.add(lowest);
    }
    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == calculate) {
            try {
                if (fieldGrade1.getText().isEmpty() ||
                        fieldGrade2.getText().isEmpty() ||
                        fieldGrade3.getText().isEmpty() ||
                        fieldGrade4.getText().isEmpty() ||
                        fieldGrade5.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Debe ingresar las cinco notas.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                double g1 = Double.parseDouble(fieldGrade1.getText());
                double g2 = Double.parseDouble(fieldGrade2.getText());
                double g3 = Double.parseDouble(fieldGrade3.getText());
                double g4 = Double.parseDouble(fieldGrade4.getText());
                double g5 = Double.parseDouble(fieldGrade5.getText());
                Grades grades = new Grades();
                grades.gradeList[0] = g1;
                grades.gradeList[1] = g2;
                grades.gradeList[2] = g3;
                grades.gradeList[3] = g4;
                grades.gradeList[4] = g5;
                average.setText("Promedio = " + String.format("%.2f", grades.calculateAverage()));
                deviation.setText("Desviación estándar = " + String.format("%.2f", grades.calculateDeviation()));
                highest.setText("Valor mayor = " + String.valueOf(grades.calculateHighest()));
                lowest.setText("Valor menor = " + String.valueOf(grades.calculateLowest()));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Ingrese solo valores numéricos en las notas.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        if (event.getSource() == clear) {
            fieldGrade1.setText("");
            fieldGrade2.setText("");
            fieldGrade3.setText("");
            fieldGrade4.setText("");
            fieldGrade5.setText("");
        }
    }

}
