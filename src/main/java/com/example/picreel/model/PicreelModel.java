package com.example.picreel.model;

import javax.persistence.*;

@Entity
@Table(name = "picture")
public class PicreelModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String image;

    public PicreelModel() {
    }

    public PicreelModel(String image) {
        this.image = image;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "PicreelModel{" +
                "id=" + id +
                ", image='" + image + '\'' +
                '}';
    }
}
