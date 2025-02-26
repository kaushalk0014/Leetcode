class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       	int m=nums1.length;
		int n=nums2.length;
		
		int i=0, j=0, k=0;
		//merge array
		
		int merged[]=new int[m+n];
		
		while(i < m && j < n) {
			if(nums1[i] < nums2[j]) {
				merged[k++]=nums1[i++];
			}else {
				merged[k++]=nums2[j++];
			}
		}
		
		//copy remaining array 1
		while(i<m) {
			merged[k++]=nums1[i++];
		}
		
		//copy remaining array 2
		while(j < n) {
			merged[k++] = nums2[j++];
		} 

        int mid= (m+n)/2;

        if((m+n)%2==0){
            return ((merged[mid-1] + merged[mid]) / 2.0);
        }else{
            return merged[mid];
        }

    }
}