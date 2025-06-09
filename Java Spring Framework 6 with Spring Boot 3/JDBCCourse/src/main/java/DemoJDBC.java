// Without PrepareStatement

import java.sql.*;

public class DemoJDBC {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // Load JDBC Driver
        Class.forName("org.postgresql.Driver");

        // Establish a connection
        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5433/demo", "postgres", "123");

        // Create Statement and execute queries
        Statement stmt = con.createStatement();

        // Create Operation
        stmt.execute("INSERT INTO STUDENT VALUES(3, 'Adib', 80)");
        System.out.println("Record Created");

        // Update Operation
        stmt.execute("UPDATE student set sname='Max' WHERE sid=3");
        System.out.println("Record Updated");

        // Delete Operation
        stmt.execute("DELETE FROM student WHERE sid=3");
        System.out.println("Record Deleted");

        // Read Operation
        ResultSet rs = stmt.executeQuery("SELECT * FROM student");
        System.out.println("sid - sname - marks");
        while (rs.next()){
            System.out.println(rs.getInt("sid") + " - " + rs.getString("sname") + " - " + rs.getInt("marks"));
        }

        // Close connection
        con.close();
    }
}


// With PrepareStatement

import java.sql.*;

public class DemoJDBC {
    public static void main(String[] args) throws Exception {
        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5433/demo", "postgres", "123");

        // Insert Operation
        String insertSql = "INSERT INTO student (sid, sname, marks) VALUES (?, ?, ?)";
        PreparedStatement pstmt = con.prepareStatement(insertSql);
        pstmt.setInt(1, 4);
        pstmt.setString(2, "Alex");
        pstmt.setInt(3, 85);
        pstmt.executeUpdate();

        // Read Operation
        String selectSql = "SELECT * FROM student WHERE sid = ?";
        pstmt = con.prepareStatement(selectSql);
        pstmt.setInt(1, 4);
        ResultSet rs = pstmt.executeQuery();
        while (rs.next()) {
            System.out.println(rs.getInt("sid") + " - " + rs.getString("sname") + " - " + rs.getInt("marks"));
        }

        con.close();
    }
}