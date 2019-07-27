package com.u3.day18.two;

public class Consumer implements Runnable {
    private Movie movie;

    public Consumer(Movie movie) {
        this.movie = movie;
    }
    @Override
    public void run() {

        for (int i=0;i<10;i++) {
            movie.get();
        }
    }
}
