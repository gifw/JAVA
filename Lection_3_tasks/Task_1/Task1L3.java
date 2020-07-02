package Lection_3_tasks.Task_1;

public class Task1L3 {
    public static void main(String[] args) {
        Point point = new Point(4,5);
        Point good = new Point();
        point.translate(5,6);
        System.out.println(point.getX());
        System.out.println(point.getY());
//        Point р = new Point(3, 4).translate(1, 3).scale(0.5); why not?
        System.out.println(point.getY());
        System.out.println(point.getX());
        System.out.println(good.getY());

    }
}
