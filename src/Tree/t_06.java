
public class t_06 {

	public static int countSubarrays(int n, int[] arr) {
	int prefixSum=0;
    int ans=0; //  length of subarray

    memo.put(prefixSum, 1); //adding prefixSum=0 for key -1

    for(int i=0;i<n;i++){
        prefixSum += arr[i];

        if(memo.containsKey(prefixSum))
            ans = Math.max(ans, memo.get(prefixSum)+1);
        else
            memo.put(prefixSum, 1);

    }
    return ans;

    }
}
