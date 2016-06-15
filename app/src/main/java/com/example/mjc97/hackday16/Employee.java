package com.example.mjc97.hackday16;

import android.graphics.drawable.Drawable;

/**
 * Created by mjc97 on 6/15/2016.
 */
public class Employee {

    public  int pic;
    public  String name;
    public  String team;
    public  String department;
    public  int points;

    public  Employee (int pic, String name, String team, String department, int points) {
        this.pic = pic;
        this.name = name;
        this.team = team;
        this.department = department;
        this.points = points;
    }

    public void addPoints() {
        points++;
    }

    public void resetPoimts() {
        points = 0;
    }

    public int getPic(){
        return pic;
    }

    public String getName(){
        return name;
    }

    public String getDepartment(){
        return department;
    }

    public String getTeam(){
        return team;
    }

    public int getPoints(){
        return points;
    }

    public String toString() {
        return getName();
    }

}
