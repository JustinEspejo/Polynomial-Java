/**
 * Justin Espejo
 * Node Class
 * This is the node where the coefficients and exponential power data is stored.
 *
 */
public class Node
{
   public int coeff;
   public int n; 
   public Node next;

   public Node(int coeff, int n)
   {
      this.coeff = coeff;
      this.n = n;
   }  // constructor
   
   public String toString (){
	  return Integer.toString(coeff);
   }
   
}  // class ShortNode


