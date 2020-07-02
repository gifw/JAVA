package Lection_3_tasks.Task_1;

final class Point {
   private int x;
    private int y;
    public Point(int e, int p) {
        x = e;
        y = p;
    }
    public Point() {
        x = 0;
        y = 0;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void translate(int x1, int y1) {
        x += x1;
        y += y1;
    }
    public void scale(float multi) {
         x *= multi;
         y *=multi;
    }
}
