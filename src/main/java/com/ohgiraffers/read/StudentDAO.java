package com.ohgiraffers.read;

import com.ohgiraffers.model.dto.StudentDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {

    public List<StudentDTO> getAllStudents(Connection con) {
        List<StudentDTO> studentList = new ArrayList<>();
        PreparedStatement pstmt = null;
        ResultSet rset = null;

        String query = "SELECT * FROM TB_STUDENT";

        try {
            pstmt = con.prepareStatement(query);
            rset = pstmt.executeQuery();

            while (rset.next()) {
                StudentDTO row = new StudentDTO();
                row.setStudentNo(rset.getString("STUDENT_NO"));
                row.setDepartmentNo(rset.getString("DEPARTMENT_NO"));
                row.setStudentName(rset.getString("STUDENT_NAME"));
                row.setStudentSSN(rset.getString("STUDENT_SSN"));
                row.setStudentAddress(rset.getString("STUDENT_ADDRESS"));
                row.setEntranceDate(rset.getDate("ENTRANCE_DATE"));
                row.setAbsenceYn(rset.getString("ABSENCE_YN"));
                row.setCoachProfessorNo(rset.getString("COACH_PROFESSOR_NO"));
                studentList.add(row);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return studentList;
    }

    public List<StudentDTO> findStudentByName(Connection con, String searchKey) {
        List<StudentDTO> studentList = new ArrayList<>();
        PreparedStatement pstmt = null;
        ResultSet rset = null;

        String query = "SELECT * FROM TB_STUDENT WHERE STUDENT_NAME LIKE ?";

        try {
            pstmt = con.prepareStatement(query);
            pstmt.setString(1, "%" + searchKey + "%");
            rset = pstmt.executeQuery();

            while (rset.next()) {
                StudentDTO row = new StudentDTO();
                row.setStudentNo(rset.getString("STUDENT_NO"));
                row.setDepartmentNo(rset.getString("DEPARTMENT_NO"));
                row.setStudentName(rset.getString("STUDENT_NAME"));
                row.setStudentSSN(rset.getString("STUDENT_SSN"));
                row.setStudentAddress(rset.getString("STUDENT_ADDRESS"));
                row.setEntranceDate(rset.getDate("ENTRANCE_DATE"));
                row.setAbsenceYn(rset.getString("ABSENCE_YN"));
                row.setCoachProfessorNo(rset.getString("COACH_PROFESSOR_NO"));
                studentList.add(row);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return studentList;
    }
}
