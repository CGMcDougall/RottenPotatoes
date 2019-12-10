import java.util.Scanner;

public class TwoD_Adverage
{
 
    public static void main(String args[]){
        Scanner Sc = new Scanner(System.in);
        int c = Sc.nextInt();
        
int[][] Movies = {{4,6,2,5},{7,9,4,8} ,{6,9,3,7}};
System.out.print(Worst(Movies));

    }
 
  public static double AvgCol (int[][] a, int c){
     int Avg = 0;
     for(int i = 0; i < a.length; i++){
         Avg += a[i][c];
        }
        return (Avg/a.length);
    }
    
  public static double AvgRate (int[][]a, int r){
     int Avg = 0;
      for(int i = 0; i < a[r].length; i++){
         Avg += a[r][i];
        }
      
      return (Avg/a[r].length);
    }
    
    public static double AvgTot (int[][] a){
    double Avg = 0;
    int TotL = (a.length*a[0].length);
    int r = 0;
    
    for(int c = 0; c <= a[0].length; c++){
        
         if(c == a[0].length && r == a.length-1)break;
        if(c == a[0].length){
        c = 0; 
        r++;
        }
   
       Avg += a[r][c];
    } 
    return (Avg/TotL);

}
 public static double HardRate (int[][] a){
    double AvgOld = 100;
    double AvgNew = 0;
    int Hardest = 0;
    int TotL = (a.length*a[0].length);
    int r = 0;
    
    for(int c = 0; c <= a[0].length; c++){
        
         if(c == a[0].length && r == a.length-1)break;
        if(c == a[0].length){
            AvgNew = AvgNew/a[0].length;
             
        if(AvgNew < AvgOld){
         AvgOld = AvgNew;
         Hardest = r;
        }
        AvgNew = 0;
            c = 0;
        r++;
    }
       AvgNew += a[r][c];
     
    } 
    return Hardest;
}
 public static double Worst (int[][] a){
 double AvgCol = 0;
 double Avg = 11;
 int Worst = 0;
 int c = 0;
     for(int r = 0; r <= a.length; r++){
          if(c == a[0].length-1 && r == a.length)break;
          if(r == a.length){
             AvgCol = AvgCol/a.length;
              // System.out.println(AvgCol);
             if(AvgCol < Avg){
                 Avg = AvgCol;
                Worst = c;
                }
              c++;
             r= 0;
             AvgCol =0;
            }
            
         AvgCol += a[r][c];
         
        }
        return Worst;
}
}





