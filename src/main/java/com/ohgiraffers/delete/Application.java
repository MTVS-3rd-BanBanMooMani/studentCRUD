package com.ohgiraffers.delete;

import com.ohgiraffers.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("삭제할 학생의 주민번호를 입력하세요: ");
        String studentSSN = sc.nextLine();
        // String studentNo = sc.nextLine();


        StudentDTO student = new StudentDTO();
        student.setStudentNo(studentSSN);
        // student.setStudentNo(studentNo);

        StudentRegistService studentRegistService = new StudentRegistService();

        if(studentRegistService.registStudent(student)) {
            System.out.println("학생이 삭제되었습니다.");
        } else {
            System.out.println("삭제에 실패하였습니다. 다시 확인해주세요.");
        }


    }
}
