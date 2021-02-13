package lession_3;

public class Main extends Deque {

    public Main(int i) {
        super(i);
    }

    public static void main(String[] args) throws FullDeque {
//
//        Reverser reverser = new Reverser();
//        reverser.reverse(reverser.setString());

        deque();
    }

    private static void deque () throws FullDeque {


        Main deque = new Main(10);
        for (int i = 0; i < 10; i++) {
            deque.insertLeft(i);
        }
        System.out.println(deque);
        System.out.println(deque.removeLeft());
        System.out.println("***");
        System.out.print(deque.removeRight());
        System.out.println(deque.removeLeft());
        System.out.println(deque.removeRight());
        deque.insertLeft(999);
        System.out.println(deque.getTail());
        deque.insertLeft(45);
        System.out.println(deque.getTail());
        deque.insertLeft(99);
        System.out.println(deque.getTail());
        deque.insertRight(9);
        System.out.println(deque.getTail());
        System.out.println(deque);

        for (int i = 0; i < 10; i++) {
            deque.removeRight();
        }

        for (int i = 0; i < 10; i++) {
            deque.insertLeft(i + 10);
        }
        System.out.println(deque);

        System.out.println(deque.getCapacity() + " " + deque.getSizes());
        System.out.println(deque.isFull());
        System.out.println(deque.getHead() + " " + deque.getTail());
        deque.removeRight();
        System.out.println(deque.getHead() + " " + deque.getTail());
        deque.insertLeft(111);
        System.out.println(deque.getHead() + " " + deque.getTail());
        System.out.println(deque);


    }



}

