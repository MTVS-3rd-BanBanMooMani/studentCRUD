package com.ohgiraffers.read;

import com.ohgiraffers.model.dto.StudentDTO;

import java.sql.Connection;
import java.util.List;

import static com.ohgiraffers.common.Teamplate.getConnection;

public class StudentReadService {
    public List<StudentDTO> getAllStudents(){

        Connection con = getConnection();
        List<StudentDTO> result;

        StudentDAO studentDAO = new StudentDAO();
        result = studentDAO.getAllStudents(con);

        return result;
    }

    public List<StudentDTO> findStudentByName(String name){

        Connection con = getConnection();
        List<StudentDTO> result;

        StudentDAO studentDAO = new StudentDAO();
        result = studentDAO.findStudentByName(con, name);

        return result;
    }

}
