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
public class Staff extends Officer {
    private String brach;

    public void setBrach(String brach) {
        this.brach = brach;
    }

    public String getBrach() {
        return brach;
    }

    public Staff(String brach, String id, int age, String fullname, String email, String phone) {
        super(id, age, fullname, email, phone);
        this.brach = brach;
    }
}
