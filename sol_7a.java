import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

class sol_7a {
    public static void main(String[] args) {    
    Scanner sc = new Scanner(System.in);
    String[] s = sc.nextLine().split(",");

    int[] val = new int[s.length];
    int sum=0;
    HashSet<Integer> set = new HashSet<>();
    for(int i=0; i < s.length; i++) {
        val[i] = Integer.parseInt(s[i]);
        sum += val[i]; set.add(val[i]);
    }
    Arrays.sort(val);
    HashMap<Integer, Integer> map = new HashMap<>(); int pref=0;
    HashMap<Integer, Integer> map1 = new HashMap<>(); 

    for(int i=0; i<val.length;i++) {
        if(map.get(val[i])==null) { map.put(val[i], i); map1.put(val[i], pref);}
        pref+=val[i];
    }
    int min= Integer.MAX_VALUE;
    for(Integer i: set) {
        int smaller=0; int k=map.get(i); int cur=0;
        smaller += (i*k) - map1.get(i);
        smaller += (sum-map1.get(i)) - (i*(val.length-k));
        min = Math.min(min,smaller);
    }
    System.out.println(min);
}
}
