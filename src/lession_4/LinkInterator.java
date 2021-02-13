package lession_4;

import java.util.LinkedList;

public class LinkInterator {

    private Link current;
    private Link previous;
    private LinkedList list;
    private Link first;

    public LinkInterator(LinkedList list){
        this.list = list;
        this.reset();
    }


    public void reset(){
        current = (Link) list.getFirst();
        previous = null;
    }

    public boolean atEnd(){
        return (current.next == null);
    }

    public void nextLink(){
        previous = current;
        current = current.next;
    }

    public void setFirst(Link first) {
        this.first = first;
    }

    public Link getCurrent(){
        return current;
    }

    public String insertAfter(String name, int age){
        Link newLink = new Link(name, age);
        if (list.isEmpty()){
            list.setFirst(newLink);
            current = newLink;
        } else {
            newLink.next = current.next;
            current.next = newLink;
            nextLink();
        }

        public String insertBefore(String name, int age){
            newLink = new Link(name, age);
            if(previous == null){
                newLink.next = (Link) list.getFirst();
                list.setFirst(newLink);
                reset();
            }
            else{
                newLink.next = previous.next;
                previous.next = newLink;
                current = newLink;
            }
        }

        public String deleteCurrent(String name, int age){
            name = current.name;
            if (previous == null){
                list.setFirst(current.next);
                reset();
            } else {
                previous.next = current.next;
                if (atEnd()){
                    reset();
                } else {
                    current = current.next;
                }
            }

            return name;
        }

    }

    public void insertBefore(String name, int age) {

    }
}