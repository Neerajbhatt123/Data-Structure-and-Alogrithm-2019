import java.util.LinkedList;

import javax.sound.sampled.SourceDataLine;

class LinkedListForGit{
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.add("one");
        list.add("two");
        list.addLast("Three");
        list.addFirst("Four");
        list.add(2,"five");
        list.add("six");
        list.add("seven");
        list.addLast("eight");

        System.out.println("Linked list ::"+list);

        list.remove("one");
        list.remove("two");
        list.removeFirst();
        list.removeLast();

        System.out.println("Linked list ::"+list);

        boolean status = list.contains("five");

        if (status) {
            System.out.println("Linked list contains 'five'::");
        }
        else{
            System.out.println("Not conatins Linked list ::");
        }

        int size = list.size();
        System.out.println("Size of Linked list ::"+size);

        Object elements = list.get(2);
        System.out.println("return get Linked list ::"+elements);

        list.set(1, "ten");
        System.out.println("Linked list after change ::"+list);









    }
}