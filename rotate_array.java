package cp;

public class Example {
	public static void leftRotate(int arr[], int k) 
    { 
        for (int i = 0; i < k; i++) 
            leftRotatebyOne(arr); 
    } 
  
    public static void leftRotatebyOne(int arr[]) 
    { 
        int i, temp; 
        temp = arr[0]; 
        for (i = 0; i < arr.length - 1; i++) 
            arr[i] = arr[i + 1]; 
        arr[i] = temp; 
    }
    
    public static void rightRotate(int arr[], int k) 
    { 
        for (int i = 0; i < k; i++) 
            rightRotatebyOne(arr); 
    } 
    
    public static void rightRotatebyOne(int arr[]) 
    { 
        int i, temp; 
        temp = arr[arr.length-1]; 
        for (i = arr.length-1; i > 0; i--) 
            arr[i] = arr[i - 1]; 
        arr[0] = temp; 
    }
	
    public static void right_rotate(int[] nums, int k) {
	 k = k % nums.length;
	 int element_rotated = 0;
	 for (int start = 0; element_rotated < nums.length; start++) {
	        int current = start;
	        int prev = nums[start]; //Masukkan nilai pada indeks awal
	        do {
	          int next = (current + k) % nums.length;
	          //Pindahin data di indeks tujuan
	          int temp = nums[next]; 
	          /*Pindahin dari indeks awal (yang sudah masuk ke prev) 
	          ke indeks tujuan*/
	          nums[next] = prev;	
	          /*Ubah nilai prev menjadi temp karena data di temp akan dimasukkan pada perhitungan
	          selanjutnya*/
	          prev = temp;
	          //Ke indeks selanjutnya
	          current = next;
	          //Elemen yang sudah diproses bertambah
	          element_rotated++;
	        } while (start != current);
	      }
	}
	 
	public static void left_rotate(int[] nums, int k) {
	      k = k % nums.length;
	      int element_rotated = 0;
	      for (int start = 0; element_rotated < nums.length; start++) {
	        int current = start;
	        int prev = nums[start]; //Masukkan nilai pada indeks awal
	        do {
	          int next = (current - k);
	          if(next<0) {
	        	  next=nums.length+next;
	          }
	          //Pindahin data di indeks tujuan
	          int temp = nums[next]; 
	          /*Pindahin dari indeks awal (yang sudah masuk ke prev) 
	          ke indeks tujuan*/
	          nums[next] = prev;	
	          /*Ubah nilai prev menjadi temp karena data di temp akan dimasukkan pada perhitungan
	          selanjutnya*/
	          prev = temp;
	          //Ke indeks selanjutnya
	          current = next;
	          //Elemen yang sudah diproses bertambah
	          element_rotated++;
	        } while (start != current);
	      }
	    }
	 
	 public static void right_rotate_with_adding(int[] a, int d) {
	        int[] newArray = new int[a.length];

	        for (int i=0;i<a.length;i++){
	            newArray[(i+d)%a.length] = a[i];
	        }
	 }
	 
	 public static void left_rotate_with_adding(int[] a, int d) {
		 	int k = (int) Math.ceil((float)d/a.length);
	        int[] newArray = new int[a.length];

	        for (int i=0;i<a.length;i++){
	            if(i>=d) newArray[i-d] = a[i];
	            else newArray[i-d+k*a.length] = a[i];
	        }
	 }
	 
	    public static void main(String[] args){
	        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
	        rightRotate(a, 2);
	        for(int i=0;i<a.length;i++)
	            System.out.print(a[i]+" ");
	    }
	  }
