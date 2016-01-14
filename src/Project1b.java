/**
 * CS313 Project 1B polynomial class
 * @author justinespejo
 *
 */

public class Project1b {
	public static void main(String args[]) {
		int x[] = { 1, 3, 5, 6 };
		int y[] = { 2, 5, 7, 1, 4 };	
		Polynomial a = new Polynomial();
		for (int i = 0; i < x.length; i++) { //insert the line in the node
			Node toInsert = new Node(x[i], i);
			a.append(toInsert);
		}
		Polynomial b = new Polynomial();
		for (int i = 0; i < y.length; i++) { //insert the line in the node
			Node toInsert = new Node(y[i], i);
			b.append(toInsert);
		}
		
		
		System.out.print("A: ");
		System.out.println ("Evaluation for 1: " + a.evaluateFor(1));
		System.out.println ("Evaluation for 2: " + a.evaluateFor(2));
		System.out.println();
		
		System.out.print("B: ");
		System.out.println ("Evaluation for 1: " + b.evaluateFor(1));
		System.out.println ("Evaluation for 2: " + b.evaluateFor(2));
		System.out.println();
		
		Polynomial c = a.sum(b);
		System.out.println("Sum: a+b = " + a.sum(b));
		System.out.println ("Evaluation for 1: " + c.evaluateFor(1));
		System.out.println ("Evaluation for 2: " + c.evaluateFor(2));
		System.out.println();
		
		Polynomial d = a.sub(b);
		System.out.println("difference: a-b = " + a.sub(b));
		System.out.println ("Evaluation for 1: " + d.evaluateFor(1));
		System.out.println ("Evaluation for 2: " + d.evaluateFor(2));
		System.out.println();
		
		Polynomial e = a.product(b);
		System.out.println("product: a*b = " + a.product(b));
		System.out.println ("Evaluation for 1: " + e.evaluateFor(1));
		System.out.println ("Evaluation for 2: " + e.evaluateFor(2));
		System.out.println();
		
	}
}
		