
package exception1;

public class LAB3 {
    public static void main(String[] args) {
        int[]list = new int[10];
        try{
            System.out.println("Statement1");
            
            System.out.println(list[10]);
            System.out.println("Statement3");
        }
        catch (ArithmeticException e){
        }
        finally {
            System.out.println("Statement 4"); 
        }
        System.out.println("Statement 5");
    }
    
}
