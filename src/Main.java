import java.util.HashSet;
import java.util.Set;
class SetOperation {
    public static void main(String [] args){
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();
        set1.add("ujjwal");
        set1.add("vivek");
        set1.add("yash");
        set2.addAll(set1);
        set1.remove("vivek");
        boolean containsItem = set1.contains("ujjwal");
        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);
        System.out.println("Contains 'item1' in Set 1: " + containsItem);
        
        
    }
}
