package lession_4;

import java.util.function.UnaryOperator;

public class LinkedList extends java.util.LinkedList {
    private Link first;


    public LinkedList(){
        first = null;

    }

    public Link getFirst() {
        return first;
    }

//    public void setFirst(Link first) {
//        this.first = first;
//    }

    public LinkInterator getIterator(){
        return new LinkInterator(this);
    }

    public boolean isEmpty(){
        return (first == null);
    }

    @Override
    public void replaceAll(UnaryOperator operator) {

    }

    public void display(){
        Link current = first;
        while(current != null){
            current.display();
            current = current.next;
        }
    }

}
