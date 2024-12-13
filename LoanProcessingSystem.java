import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

class ClientInfo {
    String fullName, address, occupation, cardType, cardNumber, paymentSchedule;
    int age, loanTerm;
    double monthlyIncome, loanAmount, interestRate, loanBalance, monthlyPayment;

    public ClientInfo(String fullName, int age, String address, String occupation,
                      double monthlyIncome, double loanAmount, int loanTerm,
                      double interestRate, String paymentSchedule, String cardType,
                      String cardNumber, double monthlyPayment) {
        this.fullName = fullName;
        this.age = age;
        this.address = address;
        this.occupation = occupation;
        this.monthlyIncome = monthlyIncome;
        this.loanAmount = loanAmount;
        this.loanTerm = loanTerm;
        this.interestRate = interestRate;
        this.loanBalance = loanAmount; // Initial balance equals the loan amount
        this.paymentSchedule = paymentSchedule;
        this.cardType = cardType;
        this.cardNumber = cardNumber;
        this.monthlyPayment = monthlyPayment;
    }
}

public class LoanProcessingSystem {
    private static ArrayList<ClientInfo> clients = new ArrayList<>();
    private static final String USERNAME = "Lipana";
    private static final String PASSWORD = "Finalproject";

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> showLoginScreen());
    }

    // Login screen method
    public static void showLoginScreen() {
        JFrame frame = new JFrame("Login - Loan Processing System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBackground(new Color(200, 180, 230)); // Deep purple background

        JLabel titleLabel = new JLabel("Login", JLabel.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setForeground(Color.WHITE); // White text for the title
        titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(Box.createRigidArea(new Dimension(0, 20))); // Add spacing
        panel.add(titleLabel);

        // Username and password fields
        JTextField usernameField = new JTextField();
        JPasswordField passwordField = new JPasswordField();

        // Add labels and fields for username and password
        panel.add(new JLabel("Username:"));
        panel.add(usernameField);
        panel.add(Box.createRigidArea(new Dimension(0, 10))); // Add spacing between fields
        panel.add(new JLabel("Password:"));
        panel.add(passwordField);
        panel.add(Box.createRigidArea(new Dimension(0, 20))); // Add spacing before button

        // Styled Login Button
        JButton loginButton = new JButton("Login");
        loginButton.setFont(new Font("Arial", Font.BOLD, 14));
        loginButton.setBackground(new Color(148, 0, 211)); // Purple color
        loginButton.setForeground(Color.WHITE);
        loginButton.setFocusPainted(false);
        loginButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        loginButton.setMaximumSize(new Dimension(200, 40));

        panel.add(loginButton);
        panel.add(Box.createRigidArea(new Dimension(0, 20))); // Add spacing

        // Footer
        JLabel footer = new JLabel("© 2024 Loan Processing System by Lipana, Genelle", JLabel.CENTER);
        footer.setFont(new Font("Arial", Font.ITALIC, 12));
        footer.setForeground(Color.WHITE);
        footer.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(footer);

        frame.add(panel);
        frame.setVisible(true);

        // Action listener for login button
        loginButton.addActionListener(e -> {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());

            if (USERNAME.equals(username) && PASSWORD.equals(password)) {
                frame.dispose();  // Close the login window
                showMainMenu();   // Open the main menu
            } else {
                JOptionPane.showMessageDialog(frame, "Invalid username or password!", 
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        });
    }

    // Main menu screen method
    public static void showMainMenu() {
        JFrame frame = new JFrame("Loan Processing System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 600);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBackground(new Color(200, 180, 230)); // Deep purple background

        JLabel titleLabel = new JLabel("Loan Processing System", JLabel.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setForeground(Color.WHITE); // White text for the title
        titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(Box.createRigidArea(new Dimension(0, 20))); // Add spacing
        panel.add(titleLabel);

        // Add buttons with a purple theme
        JButton addLoanButton = createStyledButton("Add Loan");
        JButton viewClientsButton = createStyledButton("View Clients");
        JButton searchLoanButton = createStyledButton("Search Loan");
        JButton updateClientButton = createStyledButton("Update Client Info");
        JButton deleteClientButton = createStyledButton("Delete Client");
        JButton exitButton = createStyledButton("Exit");

        panel.add(addLoanButton);
        panel.add(Box.createRigidArea(new Dimension(0, 10))); // Spacing between buttons
        panel.add(viewClientsButton);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(searchLoanButton);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(updateClientButton);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(deleteClientButton);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(exitButton);
        panel.add(Box.createRigidArea(new Dimension(0, 20)));

        JLabel footer = new JLabel("© 2024 Loan Processing System by Lipana, Genelle", JLabel.CENTER);
        footer.setFont(new Font("Arial", Font.ITALIC, 12));
        footer.setForeground(Color.WHITE);
        footer.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(footer);

        frame.add(panel);
        frame.setVisible(true);

        // Add action listeners
        addLoanButton.addActionListener(e -> addLoan(frame));
        viewClientsButton.addActionListener(e -> viewClients(frame));
        searchLoanButton.addActionListener(e -> searchLoan(frame));
        updateClientButton.addActionListener(e -> updateClient(frame));
        deleteClientButton.addActionListener(e -> deleteClient(frame));
        exitButton.addActionListener(e -> System.exit(0));
    }

    // Method to create styled buttons
    public static JButton createStyledButton(String text) {
        JButton button = new JButton(text);
        button.setFont(new Font("Arial", Font.BOLD, 14));
        button.setBackground(new Color(148, 0, 211)); // Vibrant purple
        button.setForeground(Color.WHITE);
        button.setFocusPainted(false);
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        button.setMaximumSize(new Dimension(200, 40));
        return button;
    }



    public static void addLoan(JFrame parentFrame) {
        JTextField nameField = new JTextField();
        JTextField ageField = new JTextField();
        JTextField addressField = new JTextField();
        JTextField occupationField = new JTextField();
        JTextField incomeField = new JTextField();
        JTextField loanAmountField = new JTextField();
        JTextField loanTermField = new JTextField();
        JTextField interestRateField = new JTextField();
        JTextField paymentScheduleField = new JTextField();
        JTextField cardTypeField = new JTextField();
        JTextField cardNumberField = new JTextField();

        Object[] fields = {
            "Full Name:", nameField,
            "Age:", ageField,
            "Address:", addressField,
            "Occupation:", occupationField,
            "Monthly Income:", incomeField,
            "Loan Amount:", loanAmountField,
            "Loan Term (months):", loanTermField,
            "Interest Rate (e.g., 0.12 for 12%):", interestRateField,
            "Payment Schedule:", paymentScheduleField,
            "Card Type:", cardTypeField,
            "Card Number:", cardNumberField,
        };

        styleDialog(parentFrame, "Add Loan", fields);

        if (JOptionPane.OK_OPTION == JOptionPane.showConfirmDialog(parentFrame, fields, 
                "Add Loan", JOptionPane.OK_CANCEL_OPTION)) {
            // Extract fields and validate
            try {
                String fullName = nameField.getText();
                int age = Integer.parseInt(ageField.getText());
                String address = addressField.getText();
                String occupation = occupationField.getText();
                double monthlyIncome = Double.parseDouble(incomeField.getText());
                double loanAmount = Double.parseDouble(loanAmountField.getText());
                int loanTerm = Integer.parseInt(loanTermField.getText());
                double interestRate = Double.parseDouble(interestRateField.getText());
                String paymentSchedule = paymentScheduleField.getText();
                String cardType = cardTypeField.getText();
                String cardNumber = cardNumberField.getText();
                double monthlyPayment = (loanAmount * (1 + interestRate)) / loanTerm;

                clients.add(new ClientInfo(fullName, age, address, occupation, monthlyIncome,
                        loanAmount, loanTerm, interestRate, paymentSchedule, cardType,
                        cardNumber, monthlyPayment));

                JOptionPane.showMessageDialog(parentFrame, "Loan added successfully!");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(parentFrame, "Invalid input. Please try again.", 
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void viewClients(JFrame parentFrame) {
        if (clients.isEmpty()) {
            JOptionPane.showMessageDialog(parentFrame, "No clients to display.");
            return;
        }

        StringBuilder clientDetails = new StringBuilder();
        for (ClientInfo client : clients) {
            clientDetails.append("Name: ").append(client.fullName)
                         .append(", Age: ").append(client.age)
                         .append(", Loan Amount: $").append(client.loanAmount)
                         .append(", Monthly Payment: $").append(client.monthlyPayment)
                         .append("\n");
        }

        JOptionPane.showMessageDialog(parentFrame, clientDetails.toString(),
                "Client List", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void searchLoan(JFrame parentFrame) {
        String name = JOptionPane.showInputDialog(parentFrame, "Enter client name:");
        if (name == null || name.isEmpty()) return;

        for (ClientInfo client : clients) {
            if (client.fullName.equalsIgnoreCase(name)) {
                String details = "Name: " + client.fullName +
                        "\nAge: " + client.age +
                        "\nAddress: " + client.address +
                        "\nOccupation: " + client.occupation +
                        "\nMonthly Income: $" + client.monthlyIncome +
                        "\nLoan Amount: $" + client.loanAmount +
                        "\nLoan Term: " + client.loanTerm + " months" +
                        "\nInterest Rate: " + client.interestRate * 100 + "%" +
                        "\nMonthly Payment: $" + client.monthlyPayment +
                        "\nCard Type: " + client.cardType +
                        "\nCard Number: " + client.cardNumber;
                JOptionPane.showMessageDialog(parentFrame, details,
                        "Client Details", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
        }
        JOptionPane.showMessageDialog(parentFrame, "Client not found.");
    }

    public static void updateClient(JFrame parentFrame) {
        String name = JOptionPane.showInputDialog(parentFrame, "Enter client name to update:");
        if (name == null || name.isEmpty()) return;

        for (ClientInfo client : clients) {
            if (client.fullName.equalsIgnoreCase(name)) {
                JTextField addressField = new JTextField(client.address);
                JTextField occupationField = new JTextField(client.occupation);
                JTextField monthlyIncomeField = new JTextField(String.valueOf(client.monthlyIncome));
                JTextField loanAmountField = new JTextField(String.valueOf(client.loanAmount));
                JTextField cardNumberField = new JTextField(client.cardNumber);

                Object[] fields = {
                    "Address:", addressField,
                    "Occupation:", occupationField,
                    "Monthly Income:", monthlyIncomeField,
                    "Loan Amount:", loanAmountField,
                    "Card Number:", cardNumberField,
                };

                styleDialog(parentFrame, "Update Client Info", fields);

                if (JOptionPane.showConfirmDialog(parentFrame, fields, "Update Client Info", 
                        JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
                    client.address = addressField.getText();
                    client.occupation = occupationField.getText();
                    client.monthlyIncome = Double.parseDouble(monthlyIncomeField.getText());
                    client.loanAmount = Double.parseDouble(loanAmountField.getText());
                    client.cardNumber = cardNumberField.getText();

                    JOptionPane.showMessageDialog(parentFrame, "Client updated successfully!");
                }
                return;
            }
        }
        JOptionPane.showMessageDialog(parentFrame, "Client not found.");
    }

    public static void deleteClient(JFrame parentFrame) {
        String name = JOptionPane.showInputDialog(parentFrame, "Enter client name to delete:");
        if (name == null || name.isEmpty()) return;

        for (ClientInfo client : clients) {
            if (client.fullName.equalsIgnoreCase(name)) {
                int confirm = JOptionPane.showConfirmDialog(parentFrame, 
                        "Are you sure you want to delete " + client.fullName + "?", 
                        "Confirm Delete", JOptionPane.YES_NO_OPTION);

                if (confirm == JOptionPane.YES_OPTION) {
                    clients.remove(client);
                    JOptionPane.showMessageDialog(parentFrame, "Client deleted successfully.");
                }
                return;
            }
        }
        JOptionPane.showMessageDialog(parentFrame, "Client not found.");
    }

    private static void styleDialog(JFrame parentFrame, String title, Object[] fields) {
        UIManager.put("OptionPane.background", new Color(75, 0, 130)); // Dialog background
        UIManager.put("Panel.background", new Color(75, 0, 130)); // Panel background
        UIManager.put("OptionPane.messageForeground", Color.WHITE); // Text color
    }
}
