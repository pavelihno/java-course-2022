package ru.mirea.java.practice7.Flyweight;

public class Line implements LineFlyweight{
    private String color;
    public Line(String c){
        color = c;
    }
    public String getColor(){
        return color;
    }
    public void draw(int level){
        System.out.println(color + " линия на уровне " + level);
    }
}
