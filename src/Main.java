public class Main {
    public static void main(String[] args) {
        mylinkedlist list = new mylinkedlist();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.display();
        list.remove(2);
        list.display();
        list.remove(4);
        list.display();

    }
}
