import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class sol_1b {
    public static void main(String[] args) {    
    Scanner sc = new Scanner(System.in);
    Queue<Integer> ls  = new LinkedList<>();
    int a = 0;
    for(int i=0; i<3;i++) {
        int j = sc.nextInt();
        a+=j;
        ls.add(j);
    } 
    
    int ct=0;
    for(int i = 3; i < 2000; i++) {
        int b=a;
        int k =  ls.poll();
        int j=sc.nextInt();
        ls.add(j);
        b-=k; b+=j; 
        if(b>a) 
            ct++;
        a= b;
    }
    System.out.println(ct);
}
}