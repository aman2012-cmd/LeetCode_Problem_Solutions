
class Solution {

    public int fib(int n) {
        // if(n==0){
        //     return 0;
        // }
        // else if(n==1){
        //     return 1;
        // }
        // else{
        //     return fib(n-1)+fib(n-2);
        // }   
        if (n == 0 || n == 1) {
            return n;
        }
        int a = fib(n - 1);
        int b = fib(n - 2);
        return a + b;
    }
}
