package Array_Leetcode_Questions;
public class Maximum_SubArray_Leetcode {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	public static int firstBadVersion(int n) {
		int lo=1;
		int hi=n;
		int ans=0;
		while(lo<=hi) {
			int mid=lo+(hi-lo)/2;
			if(isBadaVersion(mid)==true) {
				ans=mid;
				hi=mid-1;
			}else {
				lo=mid+1;				
			}
		}
		return ans;
	}

}
