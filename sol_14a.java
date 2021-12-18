import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

class sol_14a {
    public static void main(String[] args) {    
        Scanner sc = new Scanner(System.in);
        String key = sc.nextLine();
        sc.nextLine(); int ct=0; 
        HashMap<String, Integer> map = new HashMap<>();
        
        HashMap<String, String> list = new HashMap<>();

        while(ct < 100) {
            String s[] = sc.nextLine().split(" -> ");
            list.put(s[0], s[1]);
            ct++;
        }
        
        for(int j=0; j<10;j++) {
            for(int i=0; i<key.length()-1; i+=2) {
                String ss = key.substring(i, i+2);
                String ad = list.get(ss);
                key = key.substring(0,i+1) + ad + key.substring(i+1); 
            }
        }
    
        for(int i=0; i<key.length();i++) {
            String ss =String.valueOf(key.charAt(i));
            int n = map.getOrDefault(ss, 0);
            map.put(ss, n+1);
        }
        int mm = Collections.min(map.values());
        int m = Collections.max(map.values());
        System.out.println(" ans " + (m-mm));
    }
}
