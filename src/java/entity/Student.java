/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Hoangvan
 */
public class Student {
    private String StudentID, StudentName, BirthDate, Gender, ClassID;

    public Student() {
    }

    public Student(String StudentID, String StudentName, String BirthDate, String Gender, String ClassID) {
        this.StudentID = StudentID;
        this.StudentName = StudentName;
        this.BirthDate = BirthDate;
        this.Gender = Gender;
        this.ClassID = ClassID;
    }

    public String getStudentID() {
        return StudentID;
    }

    public void setStudentID(String StudentID) {
        this.StudentID = StudentID;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String StudentName) {
        this.StudentName = StudentName;
    }

    public String getBirthDate() {
        return BirthDate;
    }

    public void setBirthDate(String BirthDate) {
        this.BirthDate = BirthDate;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getClassID() {
        return ClassID;
    }

    public void setClassID(String ClassID) {
        this.ClassID = ClassID;
    }

    @Override
    public String toString() {
        return "Student{" + "StudentID=" + StudentID + ", StudentName=" + StudentName + ", BirthDate=" + BirthDate + ", Gender=" + Gender + ", ClassID=" + ClassID + '}';
    }
   
    
}
