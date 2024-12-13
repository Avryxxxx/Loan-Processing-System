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

1. *Install Java*: Ensure you have the Java Development Kit (JDK) installed on your machine. If not, download and install it from here.

2. *Create a Java File*: Copy the provided code into a new .java file (e.g., LoanProcessingSystem.java).

3. *Compile the Program*: Open a terminal or command prompt and navigate to the directory where your .java file is saved. Run the following command to compile the program:

*javac LoanProcessingSystem.java*



  

