public class pattern02_01 {
    public static void main(String[] args){
        int n =7;
        int nsp=1;
        int nos=n/2;
        int row=1;
        while (row<=n){
            int i =0;
            while(i<nos){
                System.out.print("*"+" ");
                i++;
            }
            int j=0;
            while (j<nsp){
                System.out.print("  ");
                j++;
            }
            int k=0;
            while (k<nos){
                System.out.print(" "+"*");
                k++;
            }
            System.out.println();
            if(row<(n+1)/2){
                nos--;
                nsp = nsp+2;
            }else {
                nos++;
                nsp = nsp-2;
            }
            row++;
        }
    }
}
