public class Main {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();
        System.out.println("List is : " + (list.isEmpty() ? "Empty" : "Full"));
        System.out.println("Number of Array : " + list.size());
        System.out.println("Capacity of Array : " + list.getCapacity());
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println("Number of Array : " + list.size());
        System.out.println("Capacity of Array : " + list.getCapacity());
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);
        list.add(100);
        list.add(110);
        System.out.println("List is : " + (list.isEmpty() ? "Empty" : "Full"));
        System.out.println("Value of 2nd Index : " + list.get(2));
        list.remove(2);
        list.set(0, 100);
        System.out.println("Value of 2nd Index : " + list.get(2));
        System.out.println(list.toString());
        System.out.println("Indeks : " + list.indexOf(20));
        System.out.println("Indeks :" + list.indexOf(130));
        System.out.println("Indeks : " + list.lastIndexOf(20));
        Object[] arr = list.toArray();
        System.out.println("First Element of Object Array :" + arr[0]);
        MyList<Integer> subList = list.sublist(0, 3);
        System.out.println(subList.toString());
        System.out.println("Value of 20 in my list : " + list.contains(20));
        System.out.println("Value of 120 in my list : " + list.contains(120));
        list.clear();
        System.out.println(list.toString());

    }
}
