package com.ohgiraffers.delete;

import com.ohgiraffers.model.dto.StudentDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static com.ohgiraffers.common.Teamplate.close;

public class StudentDAO {

    public int deleteStudent (Connection con, StudentDTO student) {
        PreparedStatement pstmt = null;
        int result = 0;

        String query = "DELETE FROM TB_STUDENT WHERE STUDENT_SSN = ?";
        // String query = "DELETE FROM TB_STUDENT WHERE STUDENT_NO = ?";

        try {
            pstmt = con.prepareStatement(query);
            pstmt.setString(1, student.getStudentSSN());
            // pstmt.setString(1, student.getStudentNo());

            result = pstmt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            close(pstmt);
        }

        return result;
    }

}
