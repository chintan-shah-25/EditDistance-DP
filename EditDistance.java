 public static int distance(String x,String y)
    {
       int a=x.length();
       int b=y.length();
       int same;                                                  //to find out if characters are same i.e x[i]==y[j]
       int res[][]=new int[a+1][b+1];                             
       for(int i=0;i<=a;i++)                                      
           res[i][0]=i;
        for(int j=1;j<=b;j++)
           res[0][j]=j;
       for(int m=1;m<=a;m++)
           for(int n=1;n<=b;n++)
           {
              if(x.charAt(m-1)==y.charAt(n-1))
                  same=0;
              else
                  same=1;
              res[m][n]=Math.min(1+res[m-1][n], 1+res[m][n-1]);
              res[m][n]=Math.min(res[m][n], same+res[m-1][n-1]);
           }

           return res[a][b] ;

    }
    
// Complexity is O(ab)
