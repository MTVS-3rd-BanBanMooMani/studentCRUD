package com.ohgiraffers.update;

import com.ohgiraffers.model.dto.StudentDTO;

import java.sql.Connection;

import static com.ohgiraffers.common.Teamplate.*;

public class StudentUpdateService {
    public boolean updateStudent(StudentDTO student) {
        Connection con = getConnection();

        StudentDAO studentDAO = new StudentDAO();
        int result = studentDAO.updateStudent(con, student);

        if (result > 0) {
            commit(con);
        } else {
            rollback(con);
        }
        close(con);
        return result > 0;
    }
}
