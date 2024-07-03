package com.ohgiraffers.insert;

import com.ohgiraffers.model.dto.StudentDTO;

import java.sql.Connection;

import static com.ohgiraffers.common.Teamplate.*;

public class StudentService {
    public boolean registStudent(StudentDTO student) {
        Connection conn = getConnection();

        StudentDAO studentDAO = new StudentDAO();
        int result = studentDAO.insertStudent(conn, student);
        if (result == 1) {
            commit(conn);
        } else {
            rollback(conn);
        }

        close(conn);

        return result > 0;
    }
}
