package com.ohgiraffers.read;

import com.ohgiraffers.model.dto.StudentDTO;

import java.util.List;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentReadService studentReadService = new StudentReadService();
        List<StudentDTO> studentList;

        System.out.println("********원하시는 메뉴를 선택하세요********");
        System.out.println("1. 전체 학생 조회 || 2. 이름으로 학생 조회");
        int choice = sc.nextInt();
        sc.nextLine();

        if (choice == 1) {
            studentList = studentReadService.getAllStudents();
        } else if (choice == 2) {
            System.out.print("검색어를 입력하세요. : ");
            String searchKey = sc.nextLine();
            studentList = studentReadService.findStudentByName(searchKey);
        } else {
            System.out.println("잘못된 메뉴입니다.");
            return;
        }

        if (studentList.isEmpty()) {
            System.out.println("검색 결과가 없습니다.");
        } else {
            studentList.forEach(System.out::println);
        }
    }
}
