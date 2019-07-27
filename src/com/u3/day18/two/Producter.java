package com.u3.day18.two;

public class Producter implements Runnable{
    private Movie movie;
    public Producter(Movie movie) {
        this.movie = movie;
    }

    @Override
    public void run() {
        boolean flag=true;
        for (int i=0;i<10;i++) {
            if (flag) {
                movie.set("雄霸天下");
                flag=false;
            }else {
                movie.set("天下第一");
                flag=true;
            }
        }
    }
}
