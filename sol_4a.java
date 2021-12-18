import java.util.HashSet;
import java.util.Scanner;

public class sol_4a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s[] =  sc.nextLine().split(",");
        sc.nextLine();
        int arr[] = new int[100];
        
        for(int i=0;i<100;i++) {
            arr[i] = Integer.parseInt(s[i]); 
        }

        int ct=0; int bds[][][] = new int[100][5][5];
        int sum[] = new int[100];
        while(ct < 100){
            int ss=0;
            for(int i=0; i<5; i++) {
                for(int j=0;j<5;j++) {
                    int k = sc.nextInt();
                    ss+=k; bds[ct][i][j] = k;
                }
            }
            sum[ct] = ss;
            ct++;
        }
        int fd=-1;
        //0-4 are rows 5=9 will be cols to mark no verticl n horiz
        int marked[][] = new int[100][10]; 
        int curr=0;
        HashSet<Integer> st = new HashSet<>();
        for(int k=0; fd < 0&&k< arr.length; k++) {
            for(int b=0; b< 100;b++) {
                for(int i=0; i<5; i++) {
                    for(int j=0;j<5;j++) {
                        
                        if(bds[b][i][j] == arr[k] && !st.contains(b)) {
                            marked[b][i]++; marked[b][j+5]++; 
                            sum[b]-=arr[k];
                            if(marked[b][i]==5 || marked[b][j+5]==5) {
                                st.add(b); fd=b; curr=arr[k]; break;
                            }
                        }
                    }
                }
            }
        }
        System.out.println( " h " + (curr*sum[fd]));        
    }
}
