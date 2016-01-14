
public class Polynomial {
	/**
	 * @author Justin Espejo Polynomial Linked List Class 
	 */

	/** First node in linked list - dummy node */
	private Node first;

	/** Last node in linked list */
	private Node last;

	/** Number of data items in the list. */
	private int length;

	Polynomial() {
		first = new Node(0, 0);
		last = first;
		length = 0;
	}

	public void append(Node n) {

		last.next = n;
		last = n;
		length++;
	} // method append(String)

	public int getLength() {
		return length;
	}

	public Node getIndex(int index) {
		if (index < 0 || index >= length)
			return null; // if linked list is empty
		Node temp = first;
		for (int i = 0; i <= index; i++) { // goes through the linked list
			temp = temp.next;
		}
		return temp; // returns the node specified by the index
	}

	public String toString() {
		String toReturn = "";
		for(int i = 0; i< length; i++) {
			if(i == ( length - 1)) toReturn += this.getIndex(i);
			else toReturn += this.getIndex(i) + " ";
		}
		return toReturn;
	}
/**
 * The sum takes polynomial  a and adds it to the polynomial b.
 * @param b is the polynomial that is to be added to a. 
 * @return the sum of polynomial a and b
 */
	public Polynomial sum(Polynomial b){
		Polynomial sum = new Polynomial();
		int max = length;
		if(b.length > max) max = b.length;
		//finds which polynomial is longer
		for(int i = 0; i < max; i++){
			int x = 0;
			int y = 0;
			if(getIndex(i) != null) x = getIndex(i).coeff;
			if(b.getIndex(i) != null) y = b.getIndex(i).coeff;
			int z = x + y;
			Node u = new Node(z,i);
			sum.append(u);
		}
		return sum;
	}
	
	public Polynomial sub(Polynomial b){
		Polynomial sub = new Polynomial();
		int max = length;
		if(b.length > max) max = b.length;
		//finds which polynomial is longer
		for(int i = 0; i < max; i++){
			int x = 0;
			int y = 0;
			if(getIndex(i) != null) x = getIndex(i).coeff;
			if(b.getIndex(i) != null) y = b.getIndex(i).coeff;
			int z = x - y;
			Node u = new Node(z,i);
			sub.append(u);
		}
		return sub;
	}
	
	/**
	 * This product method takes the polynomial a then multiplies it to b. 
	 * It multiplies each variable to each other and stores them on the 
	 * calculated "n" power node on the linked list.
	 * @param b
	 * @return
	 */
	public Polynomial product(Polynomial b){
		Polynomial product = new Polynomial();
		//add both lengths for highest coeff
		int max = length + b.length - 1;
		//make the product Polynomial blank
		for(int i = 0; i < max; i++){
			Node j= new Node(0, i);
			product.append(j);
		}
		//go through a and multiply to b
		for(int i = 0; i < length; i++){
			for (int j = 0; j < b.length; j++) {
				int coeff = getIndex(i).coeff * b.getIndex(j).coeff;
				int n = getIndex(i).n + b.getIndex(j).n; 
				Node temp = product.getIndex(n);
				temp.coeff = temp.coeff + coeff;
				//add the coeff to the existing coefficient in the node. 
			}
		}
		return product;
	}
	
	public int evaluateFor(int c) {
		int sum = 0;
		for (int i=0; i < length; i++){
			sum += getIndex(i).coeff * java.lang.Math.pow(c, i);
		}
		return sum;
	}
}
