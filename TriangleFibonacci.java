class TriangleFibonacci{
    static int a = 0, b = 1;
    public static void main(String[] args) {
        int n = 5;
        int num = 1;
        for(int i=1; i<=n ;i++){
            for(int j=0;j<=n-i;j++){
                System.out.print(" ");
            }
            
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num = fib(num);
            }
            
            System.out.println();
        }
    }
    
    private static int fib(int n){
        int c = a + b;
        int temp = c;
        a = b;
        b = temp;
        
        return c;
    }
}