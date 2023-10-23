package lessons.lesson17.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    static Queue<Integer> myQueue = new LinkedList<>();

    public static void main(String[] args) {

        addMethod(myQueue);
        //showQueue(myQueue);
        //pollExample(myQueue);
        //removeExample(myQueue);
       // removeByObjExample(myQueue, 22);
        //offerExample(myQueue, 777);
        //peekExample(myQueue);
        elementExample(myQueue);
    }

    // удаляет верхний эл-т и в случае пустого листа НЕ выбрасывает эксепшн
    static void pollExample(Queue<Integer> queue){
        System.out.println("Before deleting with poll method");
        showQueue(queue);
        queue.poll();
        System.out.println('\n' + "After deleting with poll method");
        showQueue(queue);
    }

    // удаляет верхний эл-т и в случае пустого листа  выбрасывает эксепшн
    static void removeExample(Queue<Integer> queue){
        System.out.println("Before deleting with poll method");
        showQueue(queue);
        queue.remove();
        System.out.println('\n' + "After deleting with poll method");
        showQueue(queue);
    }

    // удаляет эл-т по значению и в случае пустого листа  выбрасывает эксепшн
    static void removeByObjExample(Queue<Integer> queue, int obj){
        System.out.println("Before deleting with poll method");
        showQueue(queue);
        queue.remove(obj);
        System.out.println('\n' + "After deleting with poll method");
        showQueue(queue);
    }

    // добавляет элемент в конец очереди и в случае пустого листа  выбрасывает эксепшн
    static void offerExample(Queue<Integer> queue, int obj){
        System.out.println("Before using offer method method");
        showQueue(queue);
        queue.offer(obj);
        System.out.println('\n' + "After using offer method");
        showQueue(queue);
    }

    //вернет верхний эл-т и в случае пустого листа НЕ выбрасывает exception и вернет Null
    static void peekExample(Queue<Integer> queue){
        System.out.println(queue.peek());
        showQueue(queue);
    }

    //вернет верхний эл-т и в случае пустого листа НЕ выбрасывает exception и выбросит Exception
    static void elementExample(Queue<Integer> queue){
        System.out.println(queue.element());
        showQueue(queue);
    }
    static void addMethod(Queue<Integer> queue) {
        queue.add(3);
        queue.add(4);
        queue.add(22);
        queue.add(11);
        queue.add(2222);
        queue.add(543);
    }

    static void showQueue(Queue<Integer> queue) {
        for (Integer i : queue) {
            System.out.print(i + " ");
        }
    }

}
