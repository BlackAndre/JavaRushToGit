
public class MultiTable {
    public static void main(String[] args) {
        
       
        
        int x = 1;
        int y = 1;
        int countWidth = 0;
        int countHeight = 0;
        
        
        while (countHeight < 10) {
            while (countWidth < 10) {
                System.out.print(y + " ");
                y += x;
                countWidth +=1;
            } System.out.println();
            x += 1;
            y = x;
            countWidth = 0;
            countHeight +=1;
            
        }
}
}