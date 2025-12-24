
**JDBC** (Java Database Connectivity) is a standard Java API that allows Java applications to interact with relational databases. 
### 1. JDBC Architecture

- JDBC API: Provides the application-to-JDBC Manager connection.

- JDBC Driver API: Supports the JDBC Manager-to-Driver connection.

### 2. JDBC Driver Types
| Type   | Name                | Description                                   | Pros / Cons                                      |
|--------|---------------------|-----------------------------------------------|------------------------------------------------|
| Type 1 | JDBC-ODBC Bridge    | Uses ODBC driver to connect.                  | Old, slow; requires ODBC installation.         |
| Type 2 | Native-API          | Converts calls to native C/C++ API.           | Faster than Type 1; requires native libraries. |
| Type 3 | Network Protocol    | Uses middleware to reach the DB.              | Database independent; no client installation.  |
| Type 4 | Thin Driver         | Pure Java; communicates via sockets.          | Best performance; highly portable.             |


### 3. Core Steps to Connect (The 7 Steps)
To interact with a database, you follow this standard workflow:

1. **Import Packages:** import java.sql.*;

2. **Load/Register Driver:** 
   ```java 
             Class.forName("com.mysql.cj.jdbc.Driver"); 
    ```
    (Note: JDBC 4.0+ loads this automatically if the JAR is in the classpath).

3. **Establish Connection:**
   ```java
    Connection con = DriverManager.getConnection(url, user, pass);
    ```
4. **Create Statement:**
  ```java
   Statement stmt = con.createStatement();
  ```

5. **Execute Query:** 
   ```java
   ResultSet rs = stmt.executeQuery("SELECT * FROM users");
    ```
6. **Process Results:** 
   ```java 
   Use rs.next() and rs.getString(), rs.getInt(), etc.
   ```

7. **Close Resources:** 
   ```java
   con.close(), stmt.close(), rs.close().
   ```

### 4 Key Interfaces and Classes
**DriverManager:** Manages the list of DB drivers.

**Connection:** Represents the physical session with the database.

**Statement:** Used for executing static SQL queries.

**PreparedStatement:** (Sub-interface) Pre-compiled SQL. Prevents SQL Injection and improves performance for repeated queries.

**CallableStatement:** Used to execute stored procedures.

**ResultSet:** A table of data representing a database result set (acting like a cursor).

| Feature      | Statement                     | PreparedStatement                          |
|-------------|-------------------------------|---------------------------------------------|
| Parsing     | Compiled every time.            | Compiled once, reused many times.            |
| Performance | Slower for repetitive tasks.    | Faster due to pre-compilation.               |
| Security    | Vulnerable to SQL Injection.    | Safe (uses parameterized queries).           |
| Usage       | Static SQL queries.             | Dynamic SQL with `?` placeholders.           |
