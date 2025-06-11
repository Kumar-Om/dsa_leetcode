class Solution {
    public int[] closestPrimes(int left, int right) {
        ArrayList<Integer> primes = seive((int)(Math.sqrt(right)));
        ArrayList<Integer> res = seg(primes,left,right);
        if(res.size()<2) return new int[]{-1,-1};
        int m = Integer.MAX_VALUE;
        int[] result = new int[2];
        for(int i=1;i<res.size();i++){
            int d = res.get(i)-res.get(i-1);
            if(m>d){
                m = d;
                result[0] = res.get(i-1);
                result[1] = res.get(i);
            }
        }
        return result;

    }
    public static ArrayList<Integer> seive(int n){
    boolean[] arr = new boolean[n+1];
    for(int i=2;i*i<=n;i++){
      for(int j = i*i;j<=n;j+=i){
        arr[j] = true;
      }
    }
    ArrayList<Integer> res = new ArrayList<>();
    for(int i=2;i<=n;i++){
      if(arr[i]==false){
        res.add(i);
      }
    }
    return res;
  }
  public static ArrayList<Integer> seg(ArrayList<Integer> primes, int l, int r){
    int n = r-l+1;
    boolean[] arr = new boolean[n];
    ArrayList<Integer> res = new ArrayList<>();
    
    for(int p: primes){
      int FM = Math.max(p*p, (int)Math.ceil((double)l/p)*p);
      for(int j=FM;j<=r;j+=p){
        arr[j-l] = true;
      }
    }
    for(int i=0;i<n;i++){
      if(arr[i]==false && (i+l>1)) res.add(i+l);
    }
    return res;
  }
}