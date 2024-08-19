# Banking Application with Spring Boot

This repository contains a simple banking application implemented using Spring Boot, Spring Data JPA (Hibernate), and MySQL. The application demonstrates basic banking functionalities such as creating a bank account, fetching account details, and performing deposits and withdrawals via REST APIs.

## Features

- **Create a Bank Account:** Add a new bank account with the account holder’s name and initial balance.
- **Fetch Account Details:** Retrieve details of an existing bank account by its unique ID.
- **Deposit Money:** Deposit a specified amount into an account.
- **Withdraw Money:** Withdraw a specified amount from an account, with checks for sufficient funds.

## Technologies Used

- **Spring Boot:** Framework for building REST APIs.
- **Spring Data JPA (Hibernate):** Object-Relational Mapping (ORM) for database interactions.
- **MySQL:** Relational database for storing account data.
- **Lombok:** Reduces boilerplate code with annotations.

## Setup Instructions

1. **Clone the Repository:**
    ```bash
    git clone https://github.com/rapuriteja/banking-application.git
    ```

2. **Configure MySQL Database:** Update the `src/main/resources/application.properties` file with your MySQL database credentials:
    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/banking_app
    spring.datasource.username=root
    spring.datasource.password=Mysql@123
    spring.jpa.hibernate.ddl-auto=update
    ```

3. **Running the Application:**
    - Navigate to the main application class annotated with `@SpringBootApplication`.
    - Run it as a Java application.

## Testing the Endpoints

- **Create a New Account**
    - **HTTP Method:** POST
    - **URL:** `http://localhost:8080/api/accounts`
    - **Request Body (JSON):**
      ```json
      {
          "accountHolderName": "Ramesh",
          "balance": 1000.00
      }
      ```

- **Fetch Account Details**
    - **HTTP Method:** GET
    - **URL:** `http://localhost:8080/api/accounts/{id}`

- **Deposit Money**
    - **HTTP Method:** POST
    - **URL:** `http://localhost:8080/api/accounts/{id}/deposit`
    - **Request Body (JSON):**
      ```json
      {
          "amount": 200.00
      }
      ```

- **Withdraw Money**
    - **HTTP Method:** POST
    - **URL:** `http://localhost:8080/api/accounts/{id}/withdraw`
    - **Request Body (JSON):**
      ```json
      {
          "amount": 150.00
      }
      ```

## Future Improvements

- Add error handling and input validation.
- Implement user authentication and authorization.
- Integrate security measures to protect sensitive data.

## Contributing

Feel free to contribute to this project by adding more features or improving the existing code. To contribute:
1. Fork the repository.
2. Submit a pull request with your changes.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Contact

If you have any questions or requests, feel free to reach out!

---

Feel free to adjust or expand upon this README as needed. If you have any other requests or questions, just let me know! 😊

