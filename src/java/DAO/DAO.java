/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import entity.AllClass;
import entity.Student;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hoangvan
 */
public class DAO extends DBContext{
    ResultSet rs = null;
    
    public List<AllClass> getAllClass() {
        List<AllClass> list = new ArrayList<>();
        String query = "select * from Classes";
        try {
            PreparedStatement st = connection.prepareStatement(query);
            rs = st.executeQuery();

            while (rs.next()) {
                list.add(new AllClass(rs.getString(1),
                        rs.getString(2),
                rs.getString(3)));
            }
        } catch (Exception e) {
        }
        return list;
    }
    
    public List<Student> getAllStudent() {
        List<Student> list = new ArrayList<>();
        String query = "select * from Students";
        try {
            PreparedStatement st = connection.prepareStatement(query);
            rs = st.executeQuery();

            while (rs.next()) {
                list.add(new Student(rs.getString(1),
                        rs.getString(2),
                rs.getString(3),
                rs.getString(4),
                rs.getString(5)));
            }
        } catch (Exception e) {
        }
        return list;
    }
    public Student getStudentById(String id) {
        String query = "select * from Students where StudentID = '"+id+"'";
        try {
            PreparedStatement st = connection.prepareStatement(query);
            rs = st.executeQuery();

            while (rs.next()) {
                return(new Student(rs.getString(1),
                        rs.getString(2),
                rs.getString(3),
                rs.getString(4),
                rs.getString(5)));
            }
        } catch (Exception e) {
        }
        return null;
    }
    
    public void updateStudent(String name, String dob, int gender, int classID, String code){
        String query = "UPDATE Students\n" +
"SET StudentName = ?, BirthDate = ?, Gender = ?, ClassID = ?\n" +
"WHERE StudentID = ?";
        try {
            PreparedStatement st = connection.prepareStatement(query);
            st.setString(1, name);
            st.setString(2, dob);
            st.setInt(3, gender);
            st.setInt(4, classID);
            st.setString(5, code);
           int rowsAffected = st.executeUpdate();
        if (rowsAffected > 0) {
            System.out.println("Student record updated successfully.");
        } else {
            System.out.println("No student record updated.");
        }
    }catch (Exception e) {
        }
    }
    public static void main(String[] args) {
        DAO dao = new DAO();
       
        dao.updateStudent("yup", "2002-12-12", 0, 1, "SE05150");
         List<Student> list = dao.getAllStudent();
        for(Student o:list) {
            System.out.println(o.toString());
        }
    }
}
