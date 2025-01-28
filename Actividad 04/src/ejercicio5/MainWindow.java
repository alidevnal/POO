package ejercicio5;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MainWindow extends JFrame implements ActionListener {
    private PeopleList list;
    private Container container;
    private JLabel nameLabel, lastNameLabel, phoneLabel, addressLabel;
    private JTextField nameField, lastNameField, phoneField, addressField;
    private JButton addButton, deleteButton, clearListButton;
    private JList nameList;
    private DefaultListModel model;
    private JScrollPane scrollPane;

    public MainWindow() {
        list = new PeopleList();
        initialize();
        setTitle("People");
        setSize(270, 350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
    }

    private void initialize() {
        container = getContentPane();
        container.setLayout(null);

        nameLabel = new JLabel();
        nameLabel.setText("Name:");
        nameLabel.setBounds(20, 20, 135, 23);
        nameField = new JTextField();
        nameField.setBounds(105, 20, 135, 23);

        lastNameLabel = new JLabel();
        lastNameLabel.setText("Last Name:");
        lastNameLabel.setBounds(20, 50, 135, 23);
        lastNameField = new JTextField();
        lastNameField.setBounds(105, 50, 135, 23);

        phoneLabel = new JLabel();
        phoneLabel.setText("Phone:");
        phoneLabel.setBounds(20, 80, 135, 23);
        phoneField = new JTextField();
        phoneField.setBounds(105, 80, 135, 23);

        addressLabel = new JLabel();
        addressLabel.setText("Address:");
        addressLabel.setBounds(20, 110, 135, 23);
        addressField = new JTextField();
        addressField.setBounds(105, 110, 135, 23);

        addButton = new JButton();
        addButton.setText("Add");
        addButton.setBounds(105, 150, 80, 23);
        addButton.addActionListener(this);

        deleteButton = new JButton();
        deleteButton.setText("Delete");
        deleteButton.setBounds(20, 280, 80, 23);
        deleteButton.addActionListener(this);

        clearListButton = new JButton();
        clearListButton.setText("Clear List");
        clearListButton.setBounds(120, 280, 120, 23);
        clearListButton.addActionListener(this);

        nameList = new JList();
        nameList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        model = new DefaultListModel();
        scrollPane = new JScrollPane();
        scrollPane.setBounds(20, 190, 220, 80);
        scrollPane.setViewportView(nameList);

        container.add(nameLabel);
        container.add(nameField);
        container.add(lastNameLabel);
        container.add(lastNameField);
        container.add(phoneLabel);
        container.add(phoneField);
        container.add(addressLabel);
        container.add(addressField);
        container.add(addButton);
        container.add(deleteButton);
        container.add(clearListButton);
        container.add(scrollPane);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == addButton) {
            addPerson();
        }
        if (event.getSource() == deleteButton) {
            deletePerson(nameList.getSelectedIndex());
        }
        if (event.getSource() == clearListButton) {
            clearList();
        }
    }

    private void addPerson() {
        Person person = new Person(nameField.getText(), lastNameField.getText(), phoneField.getText(), addressField.getText());
        list.addPerson(person);
        String entry = nameField.getText() + "-" + lastNameField.getText() + "-" + phoneField.getText() + "-" + addressField.getText();
        model.addElement(entry);
        nameList.setModel(model);
        nameField.setText("");
        lastNameField.setText("");
        phoneField.setText("");
        addressField.setText("");
    }

    private void deletePerson(int index) {
        if (index >= 0) {
            model.removeElementAt(index);
            list.deletePerson(index);
        } else {
            JOptionPane.showMessageDialog(null, "You must select an item", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void clearList() {
        list.clearList();
        model.clear();
    }
}