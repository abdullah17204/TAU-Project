# Web UI Test Automation Framework

A modular Selenium WebDriver test automation framework built in Java using TestNG, Maven, and the Page Object Model (POM) design pattern. The suite validates core user workflows and browser interactions against [the-internet](https://the-internet.herokuapp.com).

## Tech Stack

| Component | Technology |
| :--- | :--- |
| **Language** | Java (JDK 25) |
| **Browser Automation** | Selenium WebDriver |
| **Test Runner & Assertions** | TestNG |
| **Build & Dependency Management** | Maven |
| **Design Pattern** | Page Object Model (POM) |
| **Version Control** | Git & GitHub |

## Project Structure

```text
your-repo-name/
├── src/
│   ├── main/java/
│   │   └── pages/              # Page classes containing element locators and user actions
│   └── test/
│       ├── java/
│       │   ├── base/           # WebDriver initialization, browser setup, and teardown
│       │   └── tests/          # TestNG test classes and @DataProvider datasets
│       └── resources/          # Test data files and configuration properties
├── pom.xml                     # Maven dependencies and Surefire plugin configuration
├── testng.xml                  # Cross-browser suite and parallel/sequential execution setup
└── README.md
