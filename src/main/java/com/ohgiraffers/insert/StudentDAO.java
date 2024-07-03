package com.ohgiraffers.insert;

import com.ohgiraffers.model.dto.StudentDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentDAO {
    public int insertStudent(Connection con, StudentDTO stud) {
        PreparedStatement ps = null;
        int result = 0;

        String query = "insert into student(student_no, department_no, student_name, student_ssn, student_address, entrance_date, absence_yn, coach_professor_no) values(?,?,?,?,?,?,?,?)";

        try {
            ps = con.prepareStatement(query);
            ps.setString(1, stud.getStudentNo());
            ps.setString(2, stud.getDepartmentNo());
            ps.setString(3, stud.getStudentName());
            ps.setString(4, stud.getStudentSSN());
            ps.setString(5, stud.getStudentAddress());
            ps.setDate(6, stud.getEntranceDate());
            ps.setString(7, stud.getAbsenceYn());
            ps.setString(8, stud.getCoachProfessorNo());

            result = ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return result;
    }
}
