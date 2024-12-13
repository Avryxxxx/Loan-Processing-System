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

The project aligns with SDG 8: There is SDG Number Ten that focuses on Reducing Inequalities and the Thirteenth SDG that aims at promoting Decent Work and Economic Growth where especial emphasis should be made to improve the financial inclusion. In this regard, such techniques as loan processing and financial information enhancement, foster people’s enlightenment hence would play a pivotal role in enhancing economic rehabilitation.

Integration:

This idea is incorporated into the application’s design, allowing clients to create financial awareness through easily visible monthly payments and other loan details.

# IV. Instructions for Running the Program

1. Prerequisites:

Ensure you have Java Development Kit (JDK) 8 or later installed on your system.

2. Compilation:

Compile the Java files using the javac command:

javac LoanProcessingSystem.java

  

