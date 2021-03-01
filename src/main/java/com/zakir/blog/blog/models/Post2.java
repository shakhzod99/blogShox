package com.zakir.blog.blog.models;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Post2 {
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String title, anons, full_text;
    private int views;
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public String getAnons(){
        return anons;
    }
    public void setAnons(String anons){
        this.anons=anons;
    }
    public String getFull_text(){
        return full_text;
    }
    public void setFull_text(String full_text){
        this.full_text=full_text;
    }
    public int getViews(){
        return views;
    }
    public void setViews(int views){
        this.views=views;
    }
    public Post2(){
    }
    public Post2(String title, String anons,String full_text){
        this.title = title;
        this.anons = anons;
        this.full_text = full_text;
    }
}