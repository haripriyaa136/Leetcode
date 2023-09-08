class Solution {
    public int numberOfBeams(String[] bank) {
        int countOfoneRow;
        int k=0,laserBeam=0;
        int arr[]=new int[2];
        for(int i=0;i<bank.length;i++){
          countOfoneRow = calCountOne(bank[i]);
          if(countOfoneRow!=0){
              arr[k]=countOfoneRow;
              k++;
              if(k==2){
              laserBeam+=(arr[0]*arr[1]);
              k=1;
              arr[0]=arr[1];
              arr[1]=0;
          }
        }
          

        }
        return laserBeam;
    }
    public int calCountOne(String str){
        int sum=0;
        for(char c:str.toCharArray()){
            sum+= c-'0';
        }
        return sum;
    }
}
