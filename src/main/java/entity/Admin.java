/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author ngkie
 */
public class Admin extends Officer {
    private String task;

    public Admin(String task, String id, int age, String fullname, String email, String phone) {
        super(id, age, fullname, email, phone);
        this.task = task;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    @Override
    public String toString() {
        return "Admin{" + "task=" + task + '}';
    }
    
}
