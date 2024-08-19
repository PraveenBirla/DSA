import java.util.Scanner ;

public class Bubble{
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in) ;
      System.out.println("Enter the length of array = n") ;
      int n = sc.nextInt() ;
      int a[] = new int[n]  ;  
      System.out.println("enter the values in array "); 
      for(int i = 0 ; i < n ; i++){
          a[i] = sc.nextInt() ;
      } 
     int[] result = sort(a,n);
        for(int i  :  result){
        System.out.print (i + " ");
             }
  } 

  public static void swap( int[] a , int i , int j){
       a[i] = a[i]^a[j] ;
       a[j] = a[i]^a[j] ;
       a[i] = a[i]^a[j] ;
  }

 public static  int[] sort(int[] a , int n ){
        for(int i = 0 ; i < n-1 ; i++){
          for(int j = 0 ; j < n-i-1 ; j++){
          if(a[j]>a[j+1]){
            swap(a,j,j+1) ;
          }
          }
        }
         return a ;
 }
}