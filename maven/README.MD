# Java CLI App with SQLite using Maven

This is a simple command-line Java application that stores user input into an SQLite database using JDBC.

## 🚀 How to Run

### 1. Clone or download the repo

```bash
cd cliapp
code .
```

### 2. Compile the project

```bash
mvn compile
```

### 3. Run the application

```bash
mvn exec:java
```

### 4. Sample Output

```
Enter a name to insert into database:
Alice

All users:
1: Alice
```

## 🛠 Dependencies
- Java 8+
- Maven
- [SQLite JDBC Driver](https://github.com/xerial/sqlite-jdbc)

## 📂 Database File
- Creates `sample.db` in the project directory.

---