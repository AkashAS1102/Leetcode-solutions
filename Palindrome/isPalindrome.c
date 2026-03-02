bool isPalindrome(long long int x) {
    if(x<0)
    {
        return false ;
    }
    long long int n;
    long long int r;
    n=x;
    long long int rev=0;
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