package siskom;

import java.util.ArrayList;

public class Genericstack {
	public static void Main(String[] args)
    {
      ArrayList<T> item=new ArrayList<>();
        item.push(1);
        item.push("B");
        item.push("C");
        item.push("D");
        item.push("E");
       System.out.println("item");
     
       while(!item.isEmpty()) {
       System.out.println(item.pop());
    }
    }
}
