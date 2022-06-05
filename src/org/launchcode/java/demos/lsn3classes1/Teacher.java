package org.launchcode.java.demos.lsn3classes1;

public class Teacher {
    private String firstName;
    private String lastName;
    private String subject;
    private double yearsTeaching;

    public Teacher(String firstName, String lastName, String subject, double yearsTeaching){
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
        this.yearsTeaching = yearsTeaching;
    }

    public String getFirstName(){
        return firstName;
    }
    protected void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }
    protected void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getSubject(){
        return subject;
    }
    protected void setSubject(String subject){
        this.subject = subject;
    }

    public double getYearsTeaching() {
        return yearsTeaching;
    }
    protected void setYearsTeaching(double yearsTeaching) {
        this.yearsTeaching = yearsTeaching;
    }
}
