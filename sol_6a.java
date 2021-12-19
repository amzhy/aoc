import java.util.Scanner;

public class sol_6a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s[] =  sc.nextLine().split(",");

        long arr[] = new long[9];
        for(int i=0;i< s.length;i++) {
            arr[Integer.parseInt(s[i])]++;
        }
        long add=0; 

        for(int j=0;j < 80;j++) {   
            for(int i= 0; i<8;i++) {
                if(i==0) add=arr[0]; 
                arr[i]=arr[i+1];
           
            }
            arr[6]+=add; 
            arr[8]=add; add=0;
        }        

        long l=0;
        for(int i=0; i<9;i++) l+=arr[i];

        System.out.println(" ansd " + l);
    }
}
