/*Реализуйте очередь с помощью LinkedList со следующими методами: enqueue() - помещает элемент в конец очереди, 
dequeue() - возвращает первый элемент из очереди и удаляет его, first() - возвращает первый элемент из очереди, 
не удаляя.*/
import java.util.LinkedList;
public class homework4_task2 
{
    public static void main(String[] args)
    {
        LinkedList<Integer> linkedelement = new LinkedList<Integer>();
        linkedelement.add(5);
        linkedelement.add(8);
        linkedelement.add(7);
        linkedelement.add(4);
        System.out.print(linkedelement);
        enqueue(linkedelement, 2); 
        System.out.print(linkedelement);
        System.out.println(dequeue(linkedelement)); 
        System.out.println(linkedelement);
        System.out.println(first(linkedelement)); 
        System.out.println(linkedelement); 
    }    
    
    
    
    public static void enqueue(LinkedList<Integer> list, int number) 
    {
        list.add(number);
    }

    public static int dequeue(LinkedList<Integer> list) 
    { 
        int number = list.get(0);
        list.remove(0);
        return number;
    }
    public static int first(LinkedList<Integer> list) 
    { 
        int number = list.get(0);
        return number;
    }
}
