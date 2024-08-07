package com.ohgiraffers.common;

import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class Teamplate {

        public static Connection getConnection() {

            Connection con = null;
            Properties prop = new Properties();

            try {
                prop.load(new FileReader("src/main/java/com/ohgiraffers/config/connection-info.properties"));

                String driver = prop.getProperty("driver");
                String url = prop.getProperty("url");

                Class.forName(driver);

                con = DriverManager.getConnection(url, prop);

                con.setAutoCommit(false);

            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }

            return con;
        }

        public static void close (Connection con) {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        public static void close (PreparedStatement pstmt) {
            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        public static void close (ResultSet rset) {
            if (rset != null) {
                try {
                    rset.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        public static void commit(Connection con) {
            try {
                con.commit();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

        public static void rollback(Connection con) {
            try {
                con.rollback();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
}
