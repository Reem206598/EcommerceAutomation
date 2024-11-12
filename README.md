# Ecommerce Automation Testing Project

This project is an automation testing framework for an e-commerce website. It covers functionalities like navigating through the homepage, searching for products, viewing product details, and adding items to the shopping cart. The project is built using Java with Selenium WebDriver and TestNG for test management.

## Table of Contents

- [Technologies Used](#technologies-used)
- [Project Structure](#project-structure)
- [Installation and Setup](#installation-and-setup)
- [Running the Tests](#running-the-tests)
- [Test Scenarios](#test-scenarios)
- [Future Enhancements](#future-enhancements)
- [Contributing](#contributing)

## Technologies Used

- **Java** - Programming language
- **Selenium WebDriver** - Web browser automation tool
- **TestNG** - Test framework for managing test cases
- **WebDriverManager** - Manages browser drivers automatically
- **Maven** - Dependency management and build automation tool

## Project Structure

```plaintext
EcommerceAutomation/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/reem/ecommerceautomation/
│   │           ├── pages/         # Page Object Model (POM) classes
│   │           └── utils/         # Utility classes, such as WebDriver setup
│   ├── test/
│       └── java/
│           └── com/reem/ecommerceautomation/tests/ # Test classes
├── pom.xml                        # Maven configuration file
└── README.md                      # Project README file
