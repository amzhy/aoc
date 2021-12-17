import java.util.ArrayList;
import java.util.Scanner;

class sol_3b {
    public static void main(String[] args) {    
    Scanner sc = new Scanner(System.in);
    ArrayList<String> l = new ArrayList<>();
    
    for(int i=0;i<1000;i++) 
        l.add(sc.next());
        
    ArrayList<String> m= new ArrayList<>(l);
    ArrayList<String> ind = new ArrayList<>(); 
    ArrayList<String> ind1 = new ArrayList<>(); 
        
    int m0=0; int m1=0; int i=0; int l0=0; int l1=0;
    char ms; char ls;
        
    while(i<12) {
        for(String s: l){
            if (s.charAt(i)=='0') m0++;
            else m1++;
        }
        for(String s: m)
            if(s.charAt(i)=='0') l0++;
            else  l1++;
        if(m0>m1) ms='0'; 
        else ms='1'; 
        
        if(l0>l1) ls='1'; 
        else ls='0'; 
        
        for(String s:m) {
           if(s.charAt(i)!=ls) ind1.add(s);
        }
        for(String s:l) {
            if(s.charAt(i)!=ms) ind.add(s);
        } 
        for(String s: ind) l.remove(s); 
        for(String s: ind1) m.remove(s);
        ind.clear(); ind1.clear();
        i++;
        System.out.println("msb=" + l + " lsb= " + m);
    }
    }
}
