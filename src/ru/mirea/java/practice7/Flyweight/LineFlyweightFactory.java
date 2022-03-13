package ru.mirea.java.practice7.Flyweight;

import java.util.ArrayList;
import java.util.List;

public class LineFlyweightFactory{
    private List<LineFlyweight> pool;

    public LineFlyweightFactory(){
        pool = new ArrayList<>();
    }

    public void getPoolColors() {
        for (LineFlyweight i : pool){
            System.out.println(i.getColor());
        }
    }

    public LineFlyweight getLine(String c){
        for(LineFlyweight line: pool){
            if(line.getColor().equals(c)){
                return line;
            }
        }
        LineFlyweight line = new Line(c);
        pool.add(line);
        return line;
    }
}
