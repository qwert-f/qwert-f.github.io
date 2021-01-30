import java.sql.*;

class sqlTest {
    public static void main(String[] args) {
        Connection conn = null;
        Statement state = null;
        ResultSet rs = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/books?useUnicode=true&characterEncoding=UTF-8&serverTimezone=UTC",
                    "root", "sql1");
            state = conn.createStatement();
            rs = state.executeQuery("select * from books");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + "----" + rs.getString("name") + "----" +
                        rs.getString("author_id") );
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (state != null) state.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
