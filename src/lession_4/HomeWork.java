package lession_4;


public class HomeWork {

    public static void main(String[] args) {
        LinkedList<Integer> list = new SimpleLinkedListImpl<>();
        list.insertFirst(7);
        list.insertFirst(6);
        list.insertFirst(5);
        list.insertFirst(4);

        displayAll(list);

        System.out.println("*");

        ListIterator<Integer> iterator = (ListIterator<Integer>) list.iterator();
        iterator.reset();
        iterator.insertAfter(22);
        iterator.next();
        iterator.remove();
        iterator.insertBefore(1);

        displayAll(list);
        System.out.println("*");

        iterator = (ListIterator<Integer>) list.iterator();
        while (iterator.hasNext()) {
            iterator.remove();
            displayAll(list);
            System.out.println("*");
        }
    }

    private static void displayAll(LinkedList<Integer> list) {
        for (Integer value : list) {
            System.out.println(value);
        }
    }

}