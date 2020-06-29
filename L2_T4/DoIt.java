package L2_T4;

public class DoIt {


    public static void main(String[] args) {

        System.out.print("source array: ");
        MetodsDiscription koliaArray = new MetodsDiscription();
        koliaArray.creatArray();
        System.out.print(koliaArray.get(4));
        System.out.print(koliaArray.get(5));
        System.out.print(koliaArray.get(6));
        System.out.print(koliaArray.get(2));
        System.out.println("\n");
        koliaArray.add(90);
        koliaArray.add(105);
        koliaArray.add(111);
        koliaArray.add(123);
        koliaArray.add(156);
        koliaArray.add(15);
        koliaArray.add(89);
        System.out.print(koliaArray.get(12));
    }
}
