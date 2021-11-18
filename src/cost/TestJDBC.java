package cost;

import org.junit.Test;

import java.sql.*;

public class TestJDBC {
    private  static  final  String DB_URL ="jdbc:sqlite:/Users/sht/Desktop/sqlite";
    private  static  final  String DB_NAME = "org.sqlite.JDBC";
    @Test
    public void createTable() throws SQLException, ClassNotFoundException {
        Connection conn = null;
        PreparedStatement statement = null;
        try {
            //创建JDBC驱动
            Class.forName(DB_NAME);
            conn = DriverManager.getConnection(DB_URL);
            //链接数据库
            statement = (PreparedStatement) conn.createStatement();
            // 创建sql查询语句 查询整个表
            String sql = "select * from student;";

            //关闭驱动
            statement.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
