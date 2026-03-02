class Solution {
    public boolean isPalindrome( int x) {
      if(x<0)
    {
        return false ;
    }
     int n;
     int r;
    n=x;
     int rev=0;
    while(n>0)
    {
        r=n%10;
        rev=rev*10+r;
        n=n/10;
    }
    if(rev==x)
    {
        return true ;
    }
    else
    {
        return false ;
    }  
    }
}
