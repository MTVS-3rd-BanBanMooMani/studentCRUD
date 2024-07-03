package com.ohgiraffers.model.dto;

import java.sql.Date;

public class StudentDTO {

    private String studentNo;
    private String departmentNo;
    private String studentName;
    private String studentSSN;
    private String studentAddress;
    private java.sql.Date entranceDate;
    private String absenceYn;
    private String coachProfessorNo;

    public StudentDTO() {};

    public StudentDTO(String studentNo, String departmentNo, String studentName, String studentSSN, String studentAddress, Date entranceDate, String absenceYn, String coachProfessorNo) {
        this.studentNo = studentNo;
        this.departmentNo = departmentNo;
        this.studentName = studentName;
        this.studentSSN = studentSSN;
        this.studentAddress = studentAddress;
        this.entranceDate = entranceDate;
        this.absenceYn = absenceYn;
        this.coachProfessorNo = coachProfessorNo;
    }

    public String getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }

    public String getDepartmentNo() {
        return departmentNo;
    }

    public void setDepartmentNo(String departmentNo) {
        this.departmentNo = departmentNo;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentSSN() {
        return studentSSN;
    }

    public void setStudentSSN(String studentSSN) {
        this.studentSSN = studentSSN;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public Date getEntranceDate() {
        return entranceDate;
    }

    public void setEntranceDate(Date entranceDate) {
        this.entranceDate = entranceDate;
    }

    public String getAbsenceYn() {
        return absenceYn;
    }

    public void setAbsenceYn(String absenceYn) {
        this.absenceYn = absenceYn;
    }

    public String getCoachProfessorNo() {
        return coachProfessorNo;
    }

    public void setCoachProfessorNo(String coachProfessorNo) {
        this.coachProfessorNo = coachProfessorNo;
    }

    @Override
    public String toString() {
        return "StudentDTO{" +
                "studentNo='" + studentNo + '\'' +
                ", departmentNo='" + departmentNo + '\'' +
                ", studentName='" + studentName + '\'' +
                ", studentSSN='" + studentSSN + '\'' +
                ", studentAddress='" + studentAddress + '\'' +
                ", entranceDate=" + entranceDate +
                ", absenceYn='" + absenceYn + '\'' +
                ", coachProfessorNo='" + coachProfessorNo + '\'' +
                '}';
    }
}
