package com.csc205.project1;

public class Point {
    double x, y;

    // Initializing point at 0,0
    public Point() {
        x = 0;
        y = 0;
    }

    // Takes inputted x and Y, and makes point
    public Point(double pointX, double pointY) {
        x = pointX;
        y = pointY;
    }

    public double distance(Point b) {


        return Math.sqrt((Math.pow(x, 2.0)) + (Math.pow(y, 2.0)));
    }

    // Getter for x
    public double getX() {
        return x;
    }

    // Setter for x
    public void setX(double x) {
        this.x = x;
    }

    // Getter for y
    public double getY() {
        return y;
    }

    // Setter for y
    public void setY(double y) {
        this.y = y;
    }
    public void setPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void shiftX(double shiftX) {
        x += shiftX;
    }

    public void shiftY(double shiftY) {
        y += shiftY;
    }

    public void rotate(double angle) {
        this.x = (getX() * Math.cos(angle)) - (getY() * Math.sin(angle));
        this.y = (getX() * Math.sin(angle)) - (getY() * Math.cos(angle));
    }
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
