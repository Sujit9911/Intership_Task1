*/File Handling Utility/*
Company-Codtech It Solutions
Name-Prathmesh Vijay Thakare
Intern Id-CTIS2283
Domain-Java Programming
Duration-4weeks
Mentor-Neela Santosh Kumar
Description:This project is a Java-based console application developed to demonstrate basic file handling operations using a layered MVC (Model–View–Controller) architecture. The primary goal of this project is to help beginners understand how file operations can be structured in a professional way while maintaining clean code practices and proper separation of concerns. The application is suitable for academic use, internships, and entry-level Java project submissions.

The system allows users to perform essential file operations such as creating a file, writing data to a file, reading file contents, and updating (appending) data. These operations are performed through a menu-driven console interface, making the program easy to use and understand. All file-related tasks are implemented using standard Java libraries such as java.io and java.util, ensuring compatibility with basic Java environments.

The project follows a three-layer architecture:

Controller Layer – Handles user interaction and input.

Service Layer – Contains business logic and acts as an intermediary.

DAO (Data Access Object) Layer – Performs actual file read/write operations.

The Controller layer is responsible for accepting user choices from the console and forwarding them to the appropriate service methods. This layer ensures that user input handling is separated from business logic, which improves code readability and maintainability.

The Service layer acts as a bridge between the controller and DAO layers. It processes requests, applies basic logic if required, and forwards tasks to the DAO. This design makes the application modular and scalable, allowing future enhancements such as validation, logging, or file encryption without modifying the controller.

The DAO layer handles all file-related operations, including file creation, writing, reading, and updating. Java’s File, FileWriter, and Scanner classes are used to perform these tasks efficiently. Proper exception handling using try-catch blocks ensures that runtime errors are handled gracefully and meaningful messages are displayed to the user.

The application generates a text file (sample.txt) dynamically if it does not already exist. Users can enter custom text from the console, which is written or appended to the file as per their selected operation. File contents are displayed directly on the console when read, allowing users to verify their input instantly.

This project demonstrates important Java concepts such as file handling, exception handling, packages, object-oriented design, and layered architecture. It is designed to be beginner-friendly while still reflecting real-world coding standards. Overall, this project serves as a strong foundation for understanding Java file operations and structured application development.
