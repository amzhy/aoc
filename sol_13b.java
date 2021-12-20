import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

class sol_13b {
    public static void main(String[] args) {    
        Scanner sc = new Scanner(System.in);
        int ct = 0; 

        int arr[][] = new int[2000][2000];    
        int max_x=-1, max_y=-1;
        while(ct < 907) {
            String s[] = sc.nextLine().split(",");
            int i = Integer.parseInt(s[0]); 
            int j = Integer.parseInt(s[1]); 
            max_x = Math.max(i, max_x);
            max_y = Math.max(j, max_y);
            arr[j][i] = 1;
            ct++;
        }

        sc.nextLine(); 
        Queue<Integer> xx = new LinkedList<>(); 
        Queue<Integer> yy = new LinkedList<>();
        int order[] = new int[12];

        for(int i=0; i<12;i++)  {
            String s[] = sc.nextLine().split(" ")[2].split("=");
            if(s[0].contains("x")){ 
                xx.add(Integer.parseInt(s[1].trim()));
                order[i]=0;
            } else {
                yy.add(Integer.parseInt(s[1].trim()));
                order[i]=1;
            }
        }
        int ox=max_x, oy=max_y; int n=0;
        while(n < 12) {
            if(order[n]==0){
            int xl =  xx.poll();

            for(int j=0;j <= oy; j++) {
                for(int i=xl+1; i<= ox; i++) {
                    if(arr[j][i]==1){
                        int d = xl-(i-xl); 
                        arr[j][d] = 1; 
                    } 
                }            
            }
            ox = xl-1; 
            } else {
                int yl= yy.poll();
                for(int j = yl+1; j <= oy; j++) {
                    for(int i=0; i<= ox;i++) {
                        if(arr[j][i]==1){
                            int d = yl-(j-yl);
                            arr[d][i] = 1;
                        } 
                    }            
                }
                oy=yl-1;
            }
            System.out.println( " x " + ox);
            System.out.println( " y " + oy);
            n++;
        }
        
        for(int j=0;j<= oy;j++) {
            for(int i=0; i<=ox;i++) {
                if(arr[j][i]==1) System.out.print("#"); 
                else System.out.print("."); 
            }
            System.out.println();
        }
    }
}
