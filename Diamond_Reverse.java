public class Diamond_Reverse{
    public static void main(String args[]){
        int n=4,i,j,k;
        for(i=n;i>=0;i--){
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}