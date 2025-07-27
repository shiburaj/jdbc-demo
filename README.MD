# JDBC Demo App
Checkout this code to see how you can use JDBC to query DB.

## SQL Code
```
CREATE TABLE `todos` (
  `id` int NOT NULL,
  `title` varchar(200) DEFAULT NULL,
  `completed` tinyint(1) DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO `todos` (`id`, `title`, `completed`) VALUES
(1, 'Wake Up', 1),
(2, 'Start Coding', 0),
(3, 'Eat Food', 0);
```

## 📋 JDBC Drivers Table

| Database         | Driver Class Name                                  | Download Link |
|------------------|-----------------------------------------------------|----------------|
| **MySQL**         | `com.mysql.cj.jdbc.Driver`                         | [MySQL Connector/J](https://dev.mysql.com/downloads/connector/j/) |
| **Oracle**        | `oracle.jdbc.OracleDriver`                         | [Oracle JDBC Driver](https://www.oracle.com/database/technologies/appdev/jdbc-downloads.html) |
| **PostgreSQL**    | `org.postgresql.Driver`                            | [PostgreSQL JDBC Driver](https://jdbc.postgresql.org/download/) |
| **SQL Server**    | `com.microsoft.sqlserver.jdbc.SQLServerDriver`     | [Microsoft JDBC Driver](https://learn.microsoft.com/en-us/sql/connect/jdbc/download-microsoft-jdbc-driver-for-sql-server) |
| **SQLite**        | `org.sqlite.JDBC`                                   | [SQLite JDBC](https://github.com/xerial/sqlite-jdbc) |
| **IBM DB2**       | `com.ibm.db2.jcc.DB2Driver`                         | [IBM DB2 JDBC Driver](https://www.ibm.com/support/pages/db2-jdbc-driver-versions-and-downloads) |
| **Apache Derby**  | `org.apache.derby.jdbc.EmbeddedDriver` (or `ClientDriver`) | [Apache Derby](https://db.apache.org/derby/derby_downloads.html) |
| **H2 Database**   | `org.h2.Driver`                                     | [H2 JDBC Driver](https://www.h2database.com/html/download.html) |
| **MariaDB**       | `org.mariadb.jdbc.Driver`                           | [MariaDB Connector/J](https://mariadb.com/kb/en/mariadb-connector-j/) |
| **Sybase (SAP)**  | `com.sybase.jdbc4.jdbc.SybDriver`                  | [SAP jConnect Info](https://help.sap.com/docs/SYBASE_JCONNECT) |

## How to Compile and Run
```
javac -cp ".;sqlite-jdbc-3.50.3.0.jar" Sqlite.java
java -cp ".;sqlite-jdbc-3.50.3.0.jar" Sqlite
```