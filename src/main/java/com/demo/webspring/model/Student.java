package com.demo.webspring.model;

import java.util.Date;

public class Student {
    private String name;
    private String email;
    private String password;
    private Date birthdate;
    private String age;
    private String sex;
    private boolean graduate;
    private String profession;
    private String note;

    @Override
    public String toString() {
        return "Student [age=" + age + ", birthdate=" + birthdate + ", email=" + email + ", graduate=" + graduate
                + ", name=" + name + ", note=" + note + ", password=" + password + ", profession=" + profession
                + ", sex=" + sex + "]";
    }

    public Student() {
    }

    public Student(String name, String email, String password, Date birthdate, String age, String sex, Boolean graduate,
            String profession, String note) {
        super();
        this.name = name;
        this.email = email;
        this.password = password;
        this.birthdate = birthdate;
        this.age = age;
        this.sex = sex;
        this.graduate = graduate;
        this.profession = profession;
        this.note = note;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Boolean getGraduate() {
        return graduate;
    }

    public void setGraduate(Boolean graduate) {
        this.graduate = graduate;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

}
