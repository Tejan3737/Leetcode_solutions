class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int[] i:image){
            int st = 0 ;
            int en = i.length-1;
            while(st<=en){
                int temp = i[st];
                i[st]=i[en];
                i[en]=temp;
                if(st==en){
                    i[st] = (i[st]==0) ? 1 : 0;
                }
                else{
                    i[st] = (i[st]==0) ? 1 : 0;
                    i[en] = (i[en]==0) ? 1 : 0;
                }
                st++;
                en--;
            }
        }
        return image;
    }
}