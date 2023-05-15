import java.util.*;

public class prac9 {
    public static void main(String[] args) 
    {
        System.out.println("ARRAYLIST:");
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("VOLVO");
        cars.add("MAYBACH");
        cars.add("MERCEDES");
        cars.add("AUDI");
        cars.add("ROLLS ROYCE");
        cars.remove("VOLVO");
        System.out.println("Print the first element in the cars[]: "+cars.get(0));
        Collections.sort(cars);
        for (String i:cars) {
            System.out.println(i);
        }
        //LINKED LIST
        System.out.println("\nLINKEDLIST:");
        LinkedList<Integer> a = new LinkedList<Integer>();
        a.addFirst(8);
        a.addLast(4);
        a.addFirst(3);
        a.addFirst(9);
        a.addLast(7);
        a.removeFirst();
        a.removeLast();
        System.out.println("FIRST:"+a.getFirst());
        System.out.println("LAST:"+a.getLast());
        System.out.println("ALL:");
        for(int i: a) {
            System.out.println(i);
        }

        //LINKED HASH MAP

        System.out.println("\nLINKED HASH MAP:");
        LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
        map.put(100,"Jenil");
        map.put(101,"Parth");
        map.put(102,"Sarthik");
        map.put(104,"Vrushabh");
        System.out.println("Before removing key-104 :  "+map);
        map.remove(104);
        System.out.println("After removing key-104 :  "+map);
        System.out.println("Keys: "+map.keySet());
        System.out.println("Values: "+map.values());
        System.out.println("Key-Value pairs: "+map.entrySet());

        //TREEMAP

        System.out.println("\nTREE MAP:");
        TreeMap<Integer,String> map1=new TreeMap<Integer,String>();
        map1.put(100,"Amit");
        map1.put(102,"Ravi");
        map1.put(101,"Vijay");
        map1.put(103,"Rahul");
        //Maintains descending order
        System.out.println("descendingMap: "+map1.descendingMap());
        //Returns key-value pairs whose keys are less than or equal to the specified key.
        System.out.println("headMap: "+map1.headMap(102,true));
        //Returns key-value pairs whose keys are greater than or equal to the specified key.
        System.out.println("tailMap: "+map1.tailMap(102,true));
        //Returns key-value pairs exists in between the specified key.
        System.out.println("subMap: "+map1.subMap(100, false, 102, true));

        //HASH SET
        System.out.println("\nHASH SET:");
        HashSet<String> set=new HashSet<String>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Ravi");
        set.add("Ajay");
        Iterator<String> itr=set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
     }
}
