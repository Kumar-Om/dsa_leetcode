class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int freq1[]=new int[101];
        int freq2[]=new int[101];
        for(int i:nums1)freq1[i]++;
        for(int i:nums2)freq2[i]++;

        int c1=0,c2=0;
        for(int i:nums1){
            if(freq2[i]>0)c1++;
        }
        for(int i:nums2){
            if(freq1[i]>0)c2++;
        }

        return new int[]{c1,c2};
    }
}