package testes;

public class MergeSortMostraSaida {
    public static void main(String[] args) {
        int vetor[] = {5,3,1,9,7,5};
        System.out.println("Inicio");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i]+" ");
        }
        System.out.printf("\n \n");
        mergesort(vetor, 0, vetor.length-1);
        System.out.printf("\nFim\n");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i]+" ");
        }
        System.out.println("");
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
        while(i<=middle && j<=end){
            if (b[i] <= b[j]) {
                a[k++]  = b[i++];        
                
            }else{
                a[k++] = b[j++];
            }
        }
        while(i<=middle){
            a[k++] = b[i++];
        }
        for (int l = 0; l < a.length; l++) {
                System.out.print(a[l]+" ");
            }
            System.out.println("");
    }
}
