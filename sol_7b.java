import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

class sol_7b {
    public static void main(String[] args) {    
    Scanner sc = new Scanner(System.in);
    String[] s = sc.nextLine().split(",");

    int[] val = new int[s.length];
    int sum=0;
    HashSet<Integer> set = new HashSet<>();
    for(int i=0; i < s.length; i++) {
        val[i] = Integer.parseInt(s[i]);
        sum+=val[i]; set.add(val[i]);
    }
    System.out.println("sum len " + val.length + " set size " + set.size());
    Arrays.sort(val);
        
    int min= Integer.MAX_VALUE;
    for(Integer i: set) {
        int smaller=0; 
        for(int j=0; j<val.length;j++) {
            int n = Math.abs(val[j]-i);
            int add = n *(n+1)/2; smaller +=  add;
        }
        min = Math.min(min,smaller);
        System.out.println("min " + min + " val[i] = " + i +  " smaller " + smaller);
    }
    System.out.println("and " + min);
}
}
