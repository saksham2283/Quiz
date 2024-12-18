Prerequisites:

Install JDK 17+. Verify with java -version.
Use an IDE (IntelliJ, VS Code, Eclipse).
Run the Project:

Open terminal in the project root folder.
Run using Maven Wrapper:
Windows:
cmd
Copy code
mvnw.cmd spring-boot:run
Mac/Linux:
bash
Copy code
./mvnw spring-boot:run
Test the APIs:

Get Question:
GET http://localhost:8080/api/quiz/question
Submit Answer:
POST http://localhost:8080/api/quiz/submit?questionId=1&userAnswer=D
Stop the App:
Press Ctrl + C in the terminal.
