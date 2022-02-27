package CoreJava;

import java.util.PriorityQueue;

public class priorityQueueExample {
    public static class PriorityQueueExample {

        public static void main(String[] args) {
// TODO Auto-generated method stub
            PriorityQueue pq = new PriorityQueue();
            pq.add(10);
            pq.add(30);
            pq.add(5);
            pq.add(45);
            System.out.println(pq);
            pq.add(2);
            pq.add(30);
            System.out.println(pq);
            pq.remove();
            System.out.println(pq);
            pq.remove();
            System.out.println(pq);
            pq.remove();
            System.out.println(pq);
            PriorityQueue<Studt> studs = new PriorityQueue();
            studs.add(new Studt(1001,"arun","cse"));
            studs.add(new Studt(1002,"atual","eee"));
            studs.add(new Studt(1003,"ram","mech"));
            studs.add(new Studt(1004,"sham","biotech"));
            for(Studt s : studs)
                System.out.println(s);
            studs.remove();
            System.out.println("After removal ");
            for(Studt s : studs)
                System.out.println(s);

        }

    }
}
