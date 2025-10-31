package org.example;

public class Wall {
    double width;
    double height;

    public Wall (double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getWidth(){
        return this.width;
    }

    public double getHeight(){
        return this.height;
    }
    public double setWidth(double width2){
        if(width2<0) {
            return this.width = 0;
        }else{
           return this.width = width2;
        }
    }

    public double setHeight(double height2) {
        if (height2 < 0) {
            return this.height = 0;
        } else {
            return this.height = height2;
        }
    }
        public double getArea(){
           return width*height;
        }


}
