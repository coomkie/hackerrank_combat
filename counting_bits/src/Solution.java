class Solution {
    public int[] countBits(int n) {
        int count = 0;

        int[] arr = new int[n+1];

        for(int i=0; i<=n; i++){
            if( i == 0){
                arr[i] = 0;
            }
            count = 0;
            String str = Integer.toBinaryString(i);
            for(int j=0;j<str.length();j++){
                if(str.charAt(j) == '1'){
                    count++;
                }
            }

            if(count > 0){
                arr[i] = count;
            }
        }
        return arr;
    }
}