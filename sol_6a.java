import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class sol_6a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> q = new ArrayList<>();
        String s[] =  sc.nextLine().split(",");
        
        System.out.println(s.length);
        
        for(int i=0;i<300;i++) {
            q.add(Integer.parseInt(s[i]));
        }
      
        int add=0; ArrayList<Integer> m = new ArrayList<>();

        for(int j=0;j<80;j++) {
            m.clear(); 
            for(int i=0;i<q.size();i++) {
                if(q.get(i)==0) {
                    m.add(6); add++; 
                } else {
                    m.add(q.get(i)-1); 
                   
                }
            }
            for(int r=0; r<add; r++){
                m.add(8);
            }
            q.clear(); q.addAll(m);add=0;    
        }
        System.out.println("size " + q.size());
    }   
}
