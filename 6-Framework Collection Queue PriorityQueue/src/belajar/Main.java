package belajar;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {
    // natural : dia akan memprioritaskan mana yg pertama yang harus di tampilkan
        PriorityQueue<String> data = new PriorityQueue<>();
        data.add("Sam");
        data.add("Dev");
        data.offer("Hello");
        data.offer("World");
        data.offer("aldi");
        data.offer("bebek");

        // will show data which the priority
        System.out.println(data.peek());
        // hapus data
        System.out.println(data.poll());
        // show data with method
        System.out.println(data);
    // show with Iterator
        Iterator show = data.iterator();
        while(show.hasNext()){
            System.out.println(show.next());
        }
    // Show with ForEach
    data.forEach((shower) -> {
        System.out.println(shower);
    });


    }
}
