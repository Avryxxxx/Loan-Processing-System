# Loan-Processing-System
OOP Final PROJECT

![Capture](https://github.com/user-attachments/assets/c39596a0-3fd7-4028-9c47-281cbad77808)

# I. Project Overview

Loan Processing System is a Java Desktop Application meant for easy processing of loans. To provide overview, users can enter new loan records, check client details, search for specific loans, change client data, and remove clients. Swing is the java technology used to develop the user interface of the system which provides with well designed purple colored theme. Loan computations are personalized in the application with the help of OOP concept for increased flexibility and scalability.

# II. Application of OOP Principles

The project incorporates the following OOP principles:

Encapsulation:

-The ClientInfo class encapsulates client details such as name, address, loan information, and associated methods to manage these attributes.

-Private fields and public getters and setters ensure controlled access to the client data.

Abstraction:

-The Loan abstract class defines the common attributes (loanAmount, loanTerm, interestRate) and an abstract method calculateMonthlyPayment() for subclasses.

-Specific loan types like PersonalLoan extend the abstract class and implement the calculation logic.

Inheritance:

-The PersonalLoan class inherits from the Loan class, leveraging shared functionality while allowing customization for specific loan calculations.

Polymorphism:

-The Loan reference can hold different subclass objects (PersonalLoan), facilitating flexibility in extending loan types without modifying the core logic.


# III. Sustainable Development Goal (SDG) Integration

This project can be aligned with the United Nations Sustainable Development Goal (SDG) 1: No Poverty because it facilitates and tracks financial exchanges in relation to loans which may in turn help people make better financial choices. Nevertheless, the system had the potential of increasing people’s financial inclusion and opening the doors to credit management that could promote the enhancement of their economic status.

Integration:

This idea is incorporated into the application’s design, allowing clients to create financial awareness through easily visible monthly payments and other loan details.

# IV. Instructions for Running the Program

Here are the step-by-step instructions for running the Loan Processing System program:

1. Ensure Java is Installed:
   - Make sure you have the Java Development Kit (JDK) installed on your machine. You can download the latest version from the official Oracle website or use OpenJDK.

   To check if Java is installed, open your terminal or command prompt and type:
   ```bash
   java -version
   ```
   If Java is installed, it will show the version. If not, follow the installation instructions on the official website.

2. Set Up an IDE or Text Editor:
   - Use an Integrated Development Environment (IDE) such as IntelliJ IDEA, Eclipse, or NetBeans, or a simple text editor like VS Code or Sublime Text for writing and running the code.

3. Create a New Project or File:
   - Open your IDE or text editor and create a new Java project or file. 
   - If using a text editor, save the file with the name `LoanProcessingSystem.java`.

4. Copy and Paste the Code:
   - Copy the entire code provided and paste it into the `LoanProcessingSystem.java` file in your project.

5. Compile the Java Program:
   - If using an IDE, simply click the "Run" button. The IDE will automatically compile and run the program.
   - If using the terminal, navigate to the directory where your `LoanProcessingSystem.java` file is saved. Then, run the following command:
   ```bash
   javac LoanProcessingSystem.java
   ```
   This will compile the Java code and create a `LoanProcessingSystem.class` file.

6. Run the Program:
   - After compiling, run the program by using the following command in the terminal:
   ```bash
   java LoanProcessingSystem
   ```
   This will launch the application.

7. Login Screen:
   - The first window that appears is the login screen. Enter the username (`Lipana`) and password (`Finalproject`).
   - If correct, the main menu will appear. If incorrect, an error message will be shown.

8. Main Menu:
   - After successfully logging in, the main menu window will open with several options such as:
     - Add Loan
     - View Clients
     - Search Loan
     - Update Client Info
     - Delete Client
     - Exit
   - You can select these options by clicking the corresponding buttons in the GUI.

9. Perform Operations:
   - Add Loan: Allows you to enter client details and add a loan.
   - View Clients: Displays the list of all clients and their loan details.
   - Search Loan: Lets you search for a specific client by name.
   - Update Client Info: Enables you to update the details of an existing client.
   - Delete Client: Allows you to delete a client from the system.
   - Exit: Closes the application.

10. Interacting with the Program:
    - Follow the prompts and dialogs that appear as you interact with the program to input or update data.
    - The program uses `JOptionPane` for displaying messages and prompts.

11. Exit the Program:
    - To close the program, click the "Exit" button in the main menu.




  

