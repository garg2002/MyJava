import java.util.*;
public class SearchElement {

    public static int SearchArray(int[] arr, int n, int x)
    {
        for(int i=0;i<n;i++)
        {
            if(arr[i] == x)
            {
               return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:- ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the Elements of an Array:- ");

        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the Search Number:- ");
        int x= sc.nextInt();
        sc.close();


        int res = SearchArray(arr, n, x);
           System.out.println("Searched element at index:- "+res);




        
    }
}
