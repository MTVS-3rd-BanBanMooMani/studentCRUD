package com.ohgiraffers.update;

import com.ohgiraffers.model.dto.StudentDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static com.ohgiraffers.common.Teamplate.close;

public class StudentDAO {

    public int updateStudent(Connection con, StudentDTO student) {
        PreparedStatement pstmt = null;
        int result = 0;

        String query = "UPDATE tb_student SET DEPARTMENT_NO = ?, STUDENT_NAME = ?, STUDENT_SSN = ?, STUDENT_ADDRESS = ?, ENTRANCE_DATE = ?, ABSENCE_YN = ?, COACH_PROFESSOR_NO = ? WHERE STUDENT_NO = ?";

        try {
            pstmt = con.prepareStatement(query);
            pstmt.setString(1, student.getDepartmentNo());
            pstmt.setString(2, student.getStudentName());
            pstmt.setString(3, student.getStudentSSN());
            pstmt.setString(4, student.getStudentAddress());
            pstmt.setDate(5, student.getEntranceDate());
            pstmt.setString(6, student.getAbsenceYn());
            pstmt.setString(7, student.getCoachProfessorNo());
            pstmt.setString(8, student.getStudentNo());
            result = pstmt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            close(pstmt);
        }
        return result;
    }
}
