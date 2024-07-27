public class Solution{
  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    Float pencil,pen,eraser;
    System.out.println("Enter cost of the pencil:");
    pencil=sc.nextFloat();
    System.out.println("Enter cost of the pen:");
    pen=sc.nextFloat();
    System.out.println("Enter cost of the eraser:");
    eraser=sc.nextFloat();
    Float bill= (pencil+pen+eraser);
    System.out.println("Total cost is:"+bill)
  }
}
