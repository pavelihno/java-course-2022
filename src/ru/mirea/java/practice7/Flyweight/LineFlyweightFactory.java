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
        //check if we've already created a line with this color
        for(LineFlyweight line: pool){
            if(line.getColor().equals(c)){
                return line;
            }
        }
        //if not, create one and save it to the pool
        LineFlyweight line = new Line(c);
        pool.add(line);
        return line;
    }
}
