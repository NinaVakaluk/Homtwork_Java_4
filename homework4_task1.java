/*Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список. 
Постараться не обращаться к листу по индексам.*/
import java.util.LinkedList;
import java.util.Collections;
public class homework4_task1 {
    public static void main(String[] args)
    {
        LinkedList<String> linkedelement = new LinkedList<String>();
        linkedelement.add("1");
        linkedelement.add("2");
        linkedelement.add("3");
        System.out.print(linkedelement);
        Collections.reverse(linkedelement);
        System.out.print("\n" + linkedelement);
    }
 
    
}
  
    