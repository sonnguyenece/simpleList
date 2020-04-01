public class MyListTest {
    public static void main(String[] args) {
        MyList<Object> listInteger = new MyList<>();
        listInteger.add(1.6);
        listInteger.add(2.3);
        listInteger.add(3.6);
        listInteger.add(3);
        listInteger.add("a");
        System.out.println("size: " + listInteger.getSize());
        System.out.println("length: " + listInteger.getLength());

        System.out.println("element 4: " + listInteger.get(4));
        System.out.println("element 1: " + listInteger.get(1));
        System.out.println("element 2: " + listInteger.get(2));
        
        listInteger.get(-1);
        System.out.println("element -1: " + listInteger.get(-1));
    }
}
