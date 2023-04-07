public class Complex_pattern{
    public static void main ( String[] args ){
        int n = 11;

        for ( int i = 0; i < n; i++){ // use "<" instead of ">" in the condition
            for (int j = 0; j < n; j++){ // use "<" instead of ">" in the condition
                // if (i == j)
                // if(i==j || i+j == n-1 ||i == 0 || j == 0 || i == n-1 || j == n-1)
                // if(i==j || i+j == n-1 ||i == 0 || j == 0 || i == n-1 || j == n-1||i+j==(n+2)/2||i-j==(n-2)/2){
                   // if(i==j || i+j == n-1 ||i == 0 || j == 0 || i == n-1 || j == n-1||i+j==(n+2)/2||i-j==(n-2)/2||j-i==(n-2)/2){
                    if (
    i == 0 && j <= (n-1)/2 || 
    j == 0 && i <= (n-1)/2 || 
    i+j <= (n-1)/2 ||

    i == 0 && j >= (n-1)/2 || 
    j == n-1 && i <= (n-1)/2 || 
    j-i>= (n-1)/2 || 

    j == 0 && i >= (n-1)/2 || 
    i == n-1 && j <= (n-1)/2 || 
    i-j >= (n-1)/2 || 
    
    j == n-1 && i >= (n-1)/2 || 
    i == n-1 && j >= (n-1)/2 || 
    i+j >= n-1 + (n-1)/2)


                  
                  {
                  
                    System.out.print("*"); // use "print" instead of "println"
                } else{
                    System.out.print(" "); // use "print" instead of "println"
                }
            }
            System.out.println(); // add a newline after each row
        }
    }
}
