import java.util.HashSet;
import java.util.Scanner;

class sol_5a {
    public static void main(String[] args) {    
    Scanner sc = new Scanner(System.in);
    int[][] val = new int[10000][10000];
    int ct=0;
    int[] arr = new int[4];
    HashSet<String> set =new HashSet<>();
    while(ct < 500) {
        String[] s = sc.nextLine().split(",| -> ");
        for(int i=0; i<4; i++) {
            arr[i] =Integer.parseInt(s[i]);
        }
        int x= Math.min(arr[0], arr[2]); int xd=Math.abs(arr[2]-arr[0]);
        int y= Math.max(arr[1], arr[3]); int yd=Math.abs(arr[3]-arr[1]);

        if (xd==0 || yd ==0) {
            if(xd==0){
                for(int i=Math.min(arr[1], arr[3]);i<=y;i++) {
                    val[i][x]++;
                    if(val[i][x] ==2) { set.add("" + i + "" + x); }
                }
            }else {
                for(int i=x; i <= x+xd; i++) {
                    val[y][i]++;
                    if(val[y][i]==2) { set.add("" + y + "" + i); }
                }
            }
        } 
        ct++;
    }
    System.out.println(set.size());
}
}
