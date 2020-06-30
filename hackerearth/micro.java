import java.util.Scanner;
 
class TestClass {
    
    /*static int min(int[] arr){
        int minimum = arr[0];
        for(int i=1;i<arr.length;i++){
            if (arr[i]<minimum){
                int temp = minimum;
                minimum = arr[i];
                arr[i] = temp;
            }
        }
        return minimum;
    }*/
    
    static int min(int a, int b){
        return a<b? a:b;
    }
    
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=1;i<=T;i++){
            int N = sc.nextInt();
            int K = sc.nextInt();
            int m = K;
            /*int[] A = new int[N];
            //Insertion
            for(int j=0;j<N;j++){
                A[j] = sc.nextInt();
            }
            //Find the time
            if(min(A)<=K)
                System.out.println(K-min(A));
            else
                System.out.println(0);*/
            for(int j=0;j<N;j++){
                int temp = sc.nextInt();
                m = min(temp, m);
            }
            System.out.println(K-m);
        }
 
    }
}
