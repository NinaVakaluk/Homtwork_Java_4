//Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


public class homework4_task3 {
    public static void main(String[] args)
    {
        
        List<Integer> linkedelement = new LinkedList<Integer>();
        linkedelement.add(1);
        linkedelement.add(2);
        linkedelement.add(3);
        linkedelement.add(5);
 
        int sum = getSum(linkedelement);
        System.out.println(sum);
    }       
        
      
    public static int getSum(List<Integer> numbers) 
    {
        int sum = 0;
        for (int i: numbers) 
        {
            sum += i;
        }
        return sum;
    }
         
            
                
        
    
}

