package org.example.Bank;

public class Student extends Person{
    private String department;
    private String matno;
    private int level;

    public Student(Long id, String firstname, String lastname, String department, String matno, int level) {
        super(id, firstname, lastname);

        this.department = department;
        this.matno = matno;
        this.level = level;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getMatno() {
        return matno;
    }

    public void setMatno(String matno) {
        this.matno = matno;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return myOutput() +
                "department='" + department + '\'' +
                ", matno='" + matno + '\'' +
                ", level=" + level +
                '}';
    }
}
