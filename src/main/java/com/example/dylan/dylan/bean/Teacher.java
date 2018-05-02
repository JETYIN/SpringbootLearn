package com.example.dylan.dylan.bean;

/**
 * Created by Administrator on 2018/4/12.
 */
public class Teacher {

    private String tea_name;
    private String tea_age;
    private String tea_add;
    private String tea_date;


    public String getUsername() {
        return tea_name;
    }

    public void setUsername(String username) {
        this.tea_name = username;
    }

    public String getPassword() {
        return tea_age;
    }

    public void setPassword(String password) {
        this.tea_age = password;
    }

    public void setTea_add(String tea_add){
        this.tea_add=tea_add;

    }
    public String getTea_add(){
        return tea_add;
    }

    public void setTea_date(String tea_date){
        this.tea_add=tea_add;

    }
    public String getTea_date(){
        return tea_date;
    }
    @Override
    public String toString() {
        return "User{" + "username='" + tea_name + '\'' + ", password='" + tea_age + '\'' + '}';
    }
}
