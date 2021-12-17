import java.util.Scanner;

class sol_9a {
    public static void main(String[] args) {    
        Scanner sc = new Scanner(System.in);
        String s = ""; 
        s = sc.nextLine();
        int ct=1; int arr[][] = new int[100][s.length()];

        for(int i=0; i<s.length();i++) {
            arr[0][i] = Character.getNumericValue(s.charAt(i));
        }

        while(ct < 100) {
            s = sc.nextLine();
            for(int k=0; k < s.length();k++) {
                arr[ct][k] = Character.getNumericValue(s.charAt(k));
            }
            ct++; 
        }
        int low=0;
        for(int j=0; j < 100; j++) {
            int left=0, right=0, up, down; 
            for(int i=0; i< s.length();i++) {
                int vl = arr[j][i];
                left= i != 0 ? arr[j][i-1] : Integer.MAX_VALUE;
                right= i!= s.length()-1 ? arr[j][i+1] : Integer.MAX_VALUE;
                if(arr[j][i] < right && arr[j][i]<left) {
                    up = j != 0 ? arr[j-1][i] : Integer.MAX_VALUE;
                    down = j != 99 ? arr[j+1][i] : Integer.MAX_VALUE;
                    if(vl < up && vl < down){
                        low += arr[j][i]+1;
                    }
                }
            }
        }

        System.out.println(" ans "+ low);
    }
}
