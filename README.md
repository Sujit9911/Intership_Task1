File Handling Utility
Company

Codtech IT Solutions

Intern Details

Name: Prathmesh Vijay Thakare

Intern ID: CTIS2283

Domain: Java Programming

Duration: 4 Weeks

Mentor: Neela Santosh Kumar

Project Description

This project is a Java-based console application developed to demonstrate basic file handling operations using a layered MVC (Model–View–Controller) architecture. The primary objective of this project is to help beginners understand how file operations can be structured in a professional manner while maintaining clean code practices and proper separation of concerns.

The application is suitable for academic use, internships, and entry-level Java project submissions. It provides a simple yet effective way to learn Java file handling concepts using standard libraries and a structured architectural approach. 


Features

Create a file if it does not exist

Write data to a file

Read data from a file

Update (append) data to an existing file

Menu-driven console interface

Proper exception handling

Project Architecture

The project follows a three-layer architecture to ensure modularity and maintainability.

Controller Layer

The Controller layer handles all user interactions. It accepts user input from the console, processes menu selections, and forwards requests to the Service layer. This separation ensures that user input handling is kept independent of business logic.

Service Layer

The Service layer acts as an intermediary between the Controller and DAO layers. It contains the business logic of the application and ensures smooth communication between user requests and data operations. This design makes the application scalable and easier to maintain.

DAO (Data Access Object) Layer

The DAO layer is responsible for performing all file-related operations. It handles file creation, writing, reading, and updating using Java’s File, FileWriter, and Scanner classes. Exception handling using try-catch blocks ensures that runtime errors are handled gracefully.

File Handling Operations

The application dynamically creates a text file named sample.txt if it does not already exist. Users can enter custom text from the console, which can be written or appended to the file based on the selected operation. File contents are displayed directly on the console when read, allowing users to verify their data easily.

Technologies Used

Java

Java IO Package

Java Util Package

Object-Oriented Programming Concepts

Conclusion

This project demonstrates important Java concepts such as file handling, exception handling, packages, object-oriented design, and layered architecture. It is designed to be beginner-friendly while still following real-world coding standards. Overall, this project serves as a strong foundation for understanding structured Java application development and file handling mechanisms.




Output>>>>>[sample.txt](https://github.com/user-attachments/files/24994708/sample.txt)
