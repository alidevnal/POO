import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ContactManagerGUI extends JFrame {
    private JTextField nameField;
    private JTextField numberField;
    private JTextArea displayArea;
    private static final String FILE_NAME = "friendsContact.txt";

    public ContactManagerGUI() {
        setTitle("Gestor de Contactos");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel(new GridLayout(2, 2, 5, 5));
        inputPanel.add(new JLabel("Nombre:"));
        nameField = new JTextField();
        inputPanel.add(nameField);
        inputPanel.add(new JLabel("Número:"));
        numberField = new JTextField();
        inputPanel.add(numberField);

        JPanel buttonPanel = new JPanel(new FlowLayout());
        JButton createButton = new JButton("Crear");
        JButton readButton = new JButton("Mostrar");
        JButton updateButton = new JButton("Actualizar");
        JButton deleteButton = new JButton("Eliminar");

        buttonPanel.add(createButton);
        buttonPanel.add(readButton);
        buttonPanel.add(updateButton);
        buttonPanel.add(deleteButton);

        displayArea = new JTextArea(10, 40);
        displayArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(displayArea);

        add(inputPanel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);
        add(scrollPane, BorderLayout.SOUTH);

        createButton.addActionListener(e -> createContact());
        readButton.addActionListener(e -> showContacts());
        updateButton.addActionListener(e -> updateContact());
        deleteButton.addActionListener(e -> deleteContact());
    }

    private void createContact() {
        String name = nameField.getText().trim();
        String numberStr = numberField.getText().trim();
        if (name.isEmpty() || numberStr.isEmpty()) {
            showError("Nombre y número son requeridos.");
            return;
        }
        try {
            long number = Long.parseLong(numberStr);
            File file = new File(FILE_NAME);
            file.createNewFile();
            try (BufferedReader br = new BufferedReader(new FileReader(file));
                 BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
                String line;
                while ((line = br.readLine()) != null) {
                    String[] parts = line.split("!");
                    if (parts.length >= 2) {
                        if (parts[0].equalsIgnoreCase(name) || parts[1].equals(numberStr)) {
                            showError("El contacto ya existe.");
                            return;
                        }
                    }
                }
                bw.write(name + "!" + number);
                bw.newLine();
                showMessage("Contacto añadido.");
                clearFields();
            }
        } catch (NumberFormatException e) {
            showError("Formato de número inválido.");
        } catch (IOException e) {
            showError("Error al acceder al archivo.");
        }
    }

    private void showContacts() {
        File file = new File(FILE_NAME);
        if (!file.exists()) {
            showMessage("No hay contactos.");
            return;
        }
        StringBuilder content = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("!");
                if (parts.length >= 2) {
                    content.append("Nombre: ").append(parts[0])
                            .append(" - Número: ").append(parts[1])
                            .append("\n");
                }
            }
            displayArea.setText(content.toString());
        } catch (IOException e) {
            showError("Error al leer contactos.");
        }
    }

    private void updateContact() {
        String name = nameField.getText().trim();
        String numberStr = numberField.getText().trim();
        if (name.isEmpty() || numberStr.isEmpty()) {
            showError("Nombre y número son requeridos.");
            return;
        }
        try {
            long newNumber = Long.parseLong(numberStr);
            File file = new File(FILE_NAME);
            if (!file.exists()) {
                showError("No hay contactos para actualizar.");
                return;
            }
            List<String> lines = new ArrayList<>();
            boolean found = false;
            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = br.readLine()) != null) {
                    String[] parts = line.split("!");
                    if (parts[0].equalsIgnoreCase(name)) {
                        lines.add(name + "!" + newNumber);
                        found = true;
                    } else {
                        lines.add(line);
                    }
                }
            }
            if (found) {
                try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
                    for (String line : lines) {
                        bw.write(line);
                        bw.newLine();
                    }
                    showMessage("Contacto actualizado.");
                    clearFields();
                }
            } else {
                showError("Contacto no encontrado.");
            }
        } catch (NumberFormatException e) {
            showError("Formato de número inválido.");
        } catch (IOException e) {
            showError("Error al acceder al archivo.");
        }
    }

    private void deleteContact() {
        String name = nameField.getText().trim();
        if (name.isEmpty()) {
            showError("Ingrese el nombre a eliminar.");
            return;
        }
        File file = new File(FILE_NAME);
        if (!file.exists()) {
            showError("No hay contactos para eliminar.");
            return;
        }
        List<String> lines = new ArrayList<>();
        boolean found = false;
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("!");
                if (parts[0].equalsIgnoreCase(name)) {
                    found = true;
                } else {
                    lines.add(line);
                }
            }
        } catch (IOException e) {
            showError("Error al leer contactos.");
            return;
        }
        if (found) {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
                for (String line : lines) {
                    bw.write(line);
                    bw.newLine();
                }
                showMessage("Contacto eliminado.");
                clearFields();
            } catch (IOException e) {
                showError("Error al guardar cambios.");
            }
        } else {
            showError("Contacto no encontrado.");
        }
    }

    private void showMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
    }

    private void showError(String error) {
        JOptionPane.showMessageDialog(this, error, "Error", JOptionPane.ERROR_MESSAGE);
    }

    private void clearFields() {
        nameField.setText("");
        numberField.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ContactManagerGUI().setVisible(true));
    }
}
