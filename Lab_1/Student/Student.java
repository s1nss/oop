package Lab_1.Student;

import java.util.Date;

public class Student {
    // using encapsulation principle. declare private, and make public setters and getters.
    private String firstName; String lastName; String email; String faculty; Date enrolmentDate; Date dateOfBirth; Boolean graduated;

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getEmail() {
        return email;
    }
    public String getFaculty() {
        return faculty;
    }
    public Date getEnrolmentDate() {
        return enrolmentDate;
    }
    public Date getDateOfBirth() {
        return dateOfBirth;
    }
    public Boolean getGraduated() {
        return graduated;
    }
    public void setFirstName(String newFirstName) {
        this.firstName = newFirstName;
    }
    public void setLastName(String newLastName) {
        this.lastName = newLastName;
    }
    public void setEmail(String newEmail) {
        this.email = newEmail;
    }
    public void setFaculty(String newFaculty) {
        this.faculty = newFaculty;
    }
    public void setEnrolmentDate(Date newEnrolmentDate) {
        this.enrolmentDate = newEnrolmentDate;
    }
    public void setDateOfBirth(Date newDateOfBirth) {
        this.dateOfBirth = newDateOfBirth;
    }
    public void setGraduated(Boolean newGraduated) {
        this.graduated = newGraduated;
    }
}