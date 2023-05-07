import customhashset.CustomHashSet;

public class Test {
    public static void main(String[] args) {
        CustomHashSet<Integer> hashSet = new CustomHashSet<>();
        hashSet.add(12);
        hashSet.add(124);
        System.out.println(hashSet.size());
        hashSet.remove(124);
        System.out.println(hashSet.size());
    }
}
