public class d0NtUseTh1s {

  public static void main(String[] aRgUmeNtz){ 
    int[] numbiez = {9, 3, 6, 1, 8, 2}; 
    badSort(numbiez);
    for(int x=0;x<numbiez.length;x++)
      System.out.print(numbiez[x]+" "); 
  }

  public static void badSort(int[] o_o){
    for(int i = 0; i < o_o.length; i++){
      for(int j = 1; j < o_o.length; j++){ 
        if(o_o[j] < o_o[j-1]){
          int tmp = o_o[j]; o_o[j]=o_o[i];
          o_o[i]= tmp;
        }
      }
    }
  }
}
