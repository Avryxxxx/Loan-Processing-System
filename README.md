# Loan-Processing-System
OOP Final PROJECT

I. Project Overview

Loan Processing System is a Java Desktop Application meant for easy processing of loans. To provide overview, users can enter new loan records, check client details, search for specific loans, change client data, and remove clients. Swing is the java technology used to develop the user interface of the system which provides with well designed purple colored theme. Loan computations are personalized in the application with the help of OOP concept for increased flexibility and scalability.

II. Application of OOP Principles

The project incorporates the following OOP principles:

Encapsulation:

The ClientInfo class encapsulates client details such as name, address, loan information, and associated methods to manage these attributes.
Private fields and public getters and setters ensure controlled access to the client data.

Abstraction:

The Loan abstract class defines the common attributes (loanAmount, loanTerm, interestRate) and an abstract method calculateMonthlyPayment() for subclasses.
Specific loan types like PersonalLoan extend the abstract class and implement the calculation logic.

Inheritance:

The PersonalLoan class inherits from the Loan class, leveraging shared functionality while allowing customization for specific loan calculations.

Polymorphism:

The Loan reference can hold different subclass objects (PersonalLoan), facilitating flexibility in extending loan types without modifying the core logic.


III. Sustainable Development Goal (SDG) Integration

