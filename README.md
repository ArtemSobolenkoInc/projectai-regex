# Regular Expression Composer

## Application Description

The Regular Expression Composer is a Java-based application developed to efficiently handle text pattern matching. The primary function is to validate an input string against certain criteria using regular expressions. This capability enables diverse text processing tasks, including searching, validating, extracting, or replacing text.

## Regular Expression Implementation Description

The Regular Expression (Regex) implemented in this application is primarily focused on password validation. The predefined criteria include a maximum length of 8 characters for the password, at least one uppercase and one lowercase letter, one digit, one special character from a predefined list (@, $, !, %, *, ?, &), and no whitespace characters. The regex implementation is optimized for both execution speed and simplicity, effectively catering to an array of inputs and edge cases.

The `validatePassword` function accepts a password string as input and returns a Boolean result, which denotes whether the password meets the criteria.

The application utilizes Java's `Pattern` and `Matcher` classes from `java.util.regex` package to compile the pattern and match it against the input password string. The `Pattern.compile()` method compiles the provided regular expression into a pattern, and the `matcher()` method creates a matcher that will match the given input against this pattern. Finally, the `matches()` method returns a Boolean indicating whether or not the input string matches the pattern.

## Running the Application Locally

To run the Regular Expression Composer application on your local machine using Gradle, follow these steps:

1. **Prerequisites**: Ensure that you have Java and Gradle installed on your local machine. This application is developed with Java and uses Gradle for building and running.

2. **Clone the Repository**: Clone the application repository from the provided GitHub link to your local machine.

3. **Build the Application**: Navigate to the application directory in your terminal and run the following command to build the application using Gradle: `./gradlew build`

4. **Run the Application: Once the build is successful, run the application. On Linux and MacOS, use the command: ./gradlew run --args='<input_string>', where <input_string> is the string you want to validate. For example, ./gradlew run --args='Password1@'. On Windows, use the command: gradlew.bat run --args='<input_string>'. For example, gradlew.bat run --args='Password1@'.

5. **Use the Application**: The application will evaluate the provided string against the regular expression and display whether it matches (true) or not (false).

Please note, the regular expression implemented in this application is specifically designed to meet the criteria mentioned above. If you need to adjust the regular expression or modify the application, please do so in accordance with the license agreement. If you encounter any issues or have suggestions for improvements, feel free to open an issue on the GitHub repository page.

