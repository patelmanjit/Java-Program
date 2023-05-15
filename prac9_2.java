import java.util.*;
public class prac9_2 {
    public static <Int> void main(String[] args) {
  //ARRAY
        System.out.println("ARRAY:");
        int [] arr = {8,7,9,6,5,2,1,0,4};
        System.out.println("The Original array is "+Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.print("The Sorted array is "+Arrays.toString(arr));

        //ARRAYLIST
        System.out.println("\nARRAYLIST:");
        ArrayList<Integer> nums = new ArrayList<>(5);
        nums.add(9);
        nums.add(0);
        nums.add(6);
        nums.add(3);
        nums.add(1);
        System.out.print("Before Sorting: ");
        for (int i:nums ) {
            System.out.print(" "+i);
        }
        Collections.sort(nums);
        System.out.println();
        System.out.print("After Sorting: ");
        for (int i:nums ) {
            System.out.print(" "+i);
        }
//        //STRING
        System.out.println("\nSTRING:");
        String[] names = {"Jenil","Vatsal","Parth","Sarthik","Vrushabh","Sarang"};
        System.out.print("Before Sorting: "+Arrays.toString(names));
        Arrays.sort(names);
        System.out.println();
        System.out.print("After Sorting: "+Arrays.toString(names));

        //LIST
        System.out.println("\nLIST:");
        Integer[] numbers = new Integer[] { 15, 11, 9, 55, 47, 18, 1123, 520, 366, 420 };
        List<Integer> numbersList = Arrays.asList(numbers);
        Collections.sort(numbersList);
        System.out.println(numbersList);
//
        //HASHSET
        System.out.println("\nHASHSET:");
        HashSet<Integer> numbersSet = new LinkedHashSet<>(
                Arrays.asList(15, 11, 9, 55, 47, 18, 1123, 520, 366, 420) );

        List<Integer> numbersList1 = new ArrayList<Integer>(numbersSet) ;
        Collections.sort(numbersList1);
        numbersSet = new LinkedHashSet<>(numbersList1);
        System.out.println(numbersSet);

        //MAP
        System.out.println("\nMAP:");
        HashMap<Integer, String> map = new HashMap<>();
        map.put(50, "JENIL");
        map.put(20, "SARTHIK");
        map.put(60, "PARTH");
        map.put(70, "VATSAL");
        map.put(120, "BANSI");
        map.put(10, "SMIT");
        TreeMap<Integer, String> treeMap = new TreeMap<>(map);
        System.out.println("Data is sorted by Key  "+treeMap);
    }
}
