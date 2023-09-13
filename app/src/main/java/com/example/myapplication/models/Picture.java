package com.example.myapplication.models;

import androidx.room.Entity;
import androidx.room.Junction;
import androidx.room.PrimaryKey;
import androidx.room.Relation;

import java.util.List;

@Entity(tableName = "pictures")
public class Picture {
    @PrimaryKey(autoGenerate = true)
    private Long pictureId;
    private byte[] img;
    private String imgLink;

    public Picture() {
    }

    public Picture(byte[] img, String imgLink, List<Term> terms) {
        this.img = img;
        this.imgLink = imgLink;
    }

    public Long getPictureId() {
        return pictureId;
    }

    public void setPictureId(Long pictureId) {
        this.pictureId = pictureId;
    }

    public byte[] getImg() {
        return img;
    }

    public void setImg(byte[] img) {
        this.img = img;
    }

    public String getImgLink() {
        return imgLink;
    }

    public void setImgLink(String imgLink) {
        this.imgLink = imgLink;
    }
}
