// { Driver Code Starts
import java.util.*;

class MaxLenZeroSumSub
{

    // Returns length of the maximum length subarray with 0 sum

    // Drive method
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            GfG g = new GfG();
            System.out.println(g.maxLen(arr, n));
            T--;
        }
    }
}// } Driver Code Ends


class t_05
{
    int maxLen(int arr[], int n)
    {
    HashMap<Integer, Integer> memo = new HashMap<>();
    int prefixSum=0;
    int ans=0; //  length of subarray
    
    memo.put(prefixSum, -1); //adding prefixSum=0 for key -1
    
    for(int i=0;i<n;i++){
        prefixSum += arr[i];
        
        if(memo.containsKey(prefixSum))
            ans = Math.max(ans, i-memo.get(prefixSum));
        else
            memo.put(prefixSum, i);
         
    }
    return ans;
   
    }
}
