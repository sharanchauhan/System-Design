package L001;

import java.io.*;

class Main {

    static class Point {
        int x;
        int y;
    }

    static class Rectangle {
        Point tl;
        Point br;
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        Rectangle r = new Rectangle(); // instance, ref
        r.tl = new Point(); // inst, ref
        r.tl.x = 2;
        r.tl.y = 6;

        r.br = new Point(); // inst, ref
        r.br.x = 6;
        r.br.y = 1;

    }
}