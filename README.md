# ChromeTest Project

This project demonstrates how to check if Google Chrome is installed on a Windows machine using Java, and it includes unit tests to verify the functionality.

## Features
- **`isChromeInstalled` Method**: Checks if Google Chrome is installed at the default installation path (`C:\Program Files\Google\Chrome\Application\chrome.exe`).
- **Unit Tests**: JUnit 5 is used for writing and running unit tests to verify the functionality of the `isChromeInstalled` method.

## Prerequisites
- **Java 11+**: Ensure that Java 11 or a later version is installed on your system.
- **Maven**: Apache Maven is used for building the project and managing dependencies.
- **Google Chrome**: The code assumes that Google Chrome is installed on the system. You can modify the path in the test to check for a custom installation path.

## Setup

1. **Clone the repository**:
   ```bash
   git clone https://github.com/yourusername/chrometest.git
   cd chrometest

2. **Install dependencies:**

Make sure you have Maven installed on your system.
Run the following command to download dependencies and build the project:
  mvn clean install

3. **Run Tests:**

You can run the unit tests using the following command:
  mvn test

  **How It Works**
The core functionality is implemented in the App.isChromeInstalled method. This method checks if the Chrome application exists at the specified path:

public class App {
    public static boolean isChromeInstalled(String chromePath) {
        File chromeFile = new File(chromePath);
        return chromeFile.exists();
    }
}
A unit test is provided to verify that Chrome is installed at the default location:

public class AppTest {
    @Test
    public void testIsChromeInstalled() {
        // Assuming Chrome is installed at the default location
        String chromePath = "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe";
        assertTrue(App.isChromeInstalled(chromePath), "Chrome should be installed");
    }
}






