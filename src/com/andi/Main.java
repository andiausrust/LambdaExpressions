package com.andi;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        Drawable drawable = (int width, int height) -> (width*height);
        System.out.println(drawable.draw(12, 12));

        /*Drawable drawable = new Drawable() {
            @Override
            public void draw() {
                System.out.println("drawing");
            }
        };
        drawable.draw();*/
    }


    Test test = () -> System.out.println("test");

    /*Test test = new Test() {
        @Override
        public void message() {
            System.out.println("test");
        }
    };*/
}

interface Drawable {
    int draw(int width, int height);
}

interface Test {
    void message();
}

