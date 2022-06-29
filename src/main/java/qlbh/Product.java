/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlbh;

import java.util.Date;

/**
 *
 * @author ngkie
 */
public class Product {
    private String id;
    private Date dayInsert;
    private Date dayUp;
    private String name;
    private int quality;
    private String kind;
    private Date HSD;

    public Product(String id, Date dayInsert, Date dayUp, String name, int quality, String kind, Date HSD) {
        this.id = id;
        this.dayInsert = dayInsert;
        this.dayUp = dayUp;
        this.name = name;
        this.quality = quality;
        this.kind = kind;
        this.HSD = HSD;
    }

    public String getId() {
        return id;
    }

    public Date getDayInsert() {
        return dayInsert;
    }

    public Date getDayUp() {
        return dayUp;
    }

    public String getName() {
        return name;
    }

    public int getQuality() {
        return quality;
    }

    public String getKind() {
        return kind;
    }

    public Date getHSD() {
        return HSD;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDayInsert(Date dayInsert) {
        this.dayInsert = dayInsert;
    }

    public void setDayUp(Date dayUp) {
        this.dayUp = dayUp;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public void setHSD(Date HSD) {
        this.HSD = HSD;
    }
    
}
