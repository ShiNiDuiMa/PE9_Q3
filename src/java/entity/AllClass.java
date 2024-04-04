/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Hoangvan
 */
public class AllClass {
    private String ClassID, ClassName, StarDate;

    public AllClass() {
    }

    @Override
    public String toString() {
        return "AllClass{" + "ClassID=" + ClassID + ", ClassName=" + ClassName + ", StarDate=" + StarDate + '}';
    }

    public AllClass(String ClassID, String ClassName, String StarDate) {
        this.ClassID = ClassID;
        this.ClassName = ClassName;
        this.StarDate = StarDate;
    }

    public String getClassID() {
        return ClassID;
    }

    public void setClassID(String ClassID) {
        this.ClassID = ClassID;
    }

    public String getClassName() {
        return ClassName;
    }

    public void setClassName(String ClassName) {
        this.ClassName = ClassName;
    }

    public String getStarDate() {
        return StarDate;
    }

    public void setStarDate(String StarDate) {
        this.StarDate = StarDate;
    }
    
}
