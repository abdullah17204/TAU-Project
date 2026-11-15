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
TAU-Project/
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
```

## Automated Test Coverage

| Module | Endpoint | Scenarios Covered |
| :--- | :--- | :--- |
| **Form Authentication** | `/login` | Valid login redirect, invalid username, invalid password, empty credentials, and logout flow via `@DataProvider` |
| **Password Recovery** | `/forgot_password` | Valid email submission confirmation and empty/malformed email validation |
| **Dynamic Loading** | `/dynamic_loading` | Explicit wait synchronization for hidden DOM elements (Example 1) and asynchronously rendered elements (Example 2) |
| **JavaScript Alerts** | `/javascript_alerts` | Accepting JS Alerts, accepting and dismissing JS Confirm dialogs, and submitting input text to JS Prompts |

## Key Engineering Practices

1. **Separation of Concerns:** All `By` locators and page-level interactions are encapsulated inside dedicated Page classes, keeping TestNG test classes strictly focused on test flow and assertions.
2. **Reliable Synchronization:** Uses `WebDriverWait` and `ExpectedConditions` for asynchronous UI state changes instead of hard-coded `Thread.sleep()` pauses.
3. **Data-Driven Execution:** Uses TestNG `@DataProvider` annotations to decouple positive, negative, and boundary test inputs from test methods.
4. **Cross-Browser Configuration:** Parameterized browser execution managed centrally through `testng.xml`.

## Prerequisites

1. Java Development Kit (JDK 17 or higher) installed and configured in `PATH`.
2. Apache Maven installed and configured in `PATH`.
3. Google Chrome and/or Microsoft Edge installed locally.

## How to Run the Tests

1. Clone the repository:
   ```bash
   git clone [https://github.com/abdullah17204/TAU-Project.git](https://github.com/abdullah17204/TAU-Project.git)
   cd TAU-Project
   ```

2. Execute the full cross-browser test suite via Maven:
   ```bash
   mvn clean test
   ```

3. Alternatively, open the project in **IntelliJ IDEA**, let Maven resolve the dependencies in `pom.xml`, right-click `testng.xml`, and select **Run**.
