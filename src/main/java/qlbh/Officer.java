/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlbh;

/**
 *
 * @author ngkie
 */
public class Officer {
    private String id;
    private int age;
    private String fullname;
    private String email;
    private String phone;


    public void setId(String id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getFullname() {
        return fullname;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public Officer(String id, int age, String fullname, String email, String phone) {
        this.id = id;
        this.age = age;
        this.fullname = fullname;
        this.email = email;
        this.phone = phone;
    }
}
    