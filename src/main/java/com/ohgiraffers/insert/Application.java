package com.ohgiraffers.insert;

import com.ohgiraffers.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("학생 코드를 입력하세요 : ");
        String studentCode = sc.nextLine();
        System.out.print("학과 코드를 입력하세요 : ");
        String departmentCode = sc.nextLine();
        System.out.print("학생 이름을 입력하세요 : ");
        String studentName = sc.nextLine();
        System.out.print("학생 주민등록번호를 입력하세요 : ");
        String studentSsn = sc.nextLine();
        System.out.print("학생 주소를 입력하세요 : ");
        String studentAddress = sc.nextLine();
        System.out.print("학생 입학일을 입력하세요(0000-00-00) : ");
        String entrance_date = sc.nextLine();
        System.out.print("휴학 여부를 입력하세요(Y/N) : ");
        String absenceYN = sc.nextLine();
        System.out.print("지도 교수 코드를 입력하세요 : ");
        String coachProfessorCode = sc.nextLine();


//        MenuDTO menu = new MenuDTO();
//        menu.setMenuName(menuName);
//        menu.setMenuPrice(menuPrice);
//        menu.setCategoryCode(categoryCode);
//        menu.setOrderableStatus(orderableStatus);
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setStudentNo(studentCode);
        studentDTO.setDepartmentNo(departmentCode);
        studentDTO.setStudentName(studentName);
        studentDTO.setStudentSSN(studentSsn);
        studentDTO.setStudentAddress(studentAddress);
        studentDTO.setEntranceDate(java.sql.Date.valueOf(entrance_date));
        studentDTO.setAbsenceYn(absenceYN);
        studentDTO.setCoachProfessorNo(coachProfessorCode);


        StudentService studentService = new StudentService();
        if (studentService.registStudent(studentDTO)) {
            System.out.println("메뉴 등록에 성공하셨습니다!");
        }
        else {
            System.out.println("메뉴 등록에 실패하셨습니다.");
        }
    }
}
