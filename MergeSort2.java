package testes;

public class MergeSort2 {
    public static void main(String[] args) {
        int vetor[] = {5,3,4,3,2,1};
        mergesort(vetor, 0, vetor.length-1);
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i]+" ");
        }
    }
    
    public static void mergesort(int[] a, int start, int end ){
        if (start<end) {
            int middle =    (start+end)/2;
            mergesort (a, start, middle);
            mergesort(a, middle+1, end);
            merge(a, start, middle, end);
        }
    }
    
    
    public static void merge (int[] a,int start,int middle,int end){
        int b[] = new int [a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        int i = start;
        int j = middle+1;
        int k = start;
        System.out.println("while(i<=middle && j<=end)");
        while(i<=middle && j<=end){
            System.out.println(i+" <= "+middle+" && "+j+" <="+end);
            System.out.println("b[i] <= b[j]");
            System.out.println(b[i]+" <= "+b[j]);
            if (b[i] <= b[j]) {
                System.out.println("entrou IF: a[k++] = b[i++]");
                System.out.println(a[k]+" = "+ b[i]);
                a[k++]  = b[i++];        
                
            }else{
                System.out.println("entrou Else");
                System.out.println(a[k]+" = "+b[j]);
                a[k++] = b[j++];
            }
        }
        System.out.println("#################");
        System.out.println("while: i<=middle");
        while(i<=middle){
            System.out.println("entrou while: "+i+" <= "+middle);
            System.out.println(a[k]+" = "+b[i]);
            a[k++] = b[i++];
        }
    }
}
