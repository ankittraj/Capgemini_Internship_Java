# Banking System

## Project Description

This is a simple Java-based Banking System application.

The project is designed to perform basic banking operations such as managing customers, accounts, transactions, and beneficiaries.

## Technologies Used

- Java
- JDBC
- MySQL
- Maven

## Project Structure

- `app` – Contains the main application class.
- `model` – Contains model classes such as Account, Customer, Transaction, and Beneficiary.
- `services` – Contains the business logic and database connection code.

## Features

- Customer management
- Account management
- Transaction management
- Beneficiary management
- MySQL database connectivity

## How to Run

1. Make sure Java is installed.
2. Make sure MySQL is running.
3. Configure the database connection details in the project.
4. Add the required MySQL database dependency in `pom.xml`.
5. Run the `BankingSystemApp.java` file.

## Main Classes

- `BankingSystemApp.java` – Main class of the application.
- `Account.java` – Represents bank account information.
- `Customer.java` – Represents customer information.
- `Transaction.java` – Represents transaction details.
- `Beneficiary.java` – Represents beneficiary information.
- `BankingService.java` – Contains banking service operations.
- `BankingServiceImpl.java` – Implements the banking business logic.
- `MySQLConnection.java` – Handles MySQL database connectivity.