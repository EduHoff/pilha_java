package entities;

public class Stack<T> {
    private Node<T> top;
    private int size;

    public void push(T value){
        Node<T> new_node = new Node<>(value);
        
        if(top == null){
            top = new_node;
            size++;
            return;
        }

        new_node.setNext(top);
        top = new_node;
        size++;
    }

    public void pop(){
        if(top == null){return;}

        top = top.getNext();
        size--;
    }

    public void printList() {
		if (top == null) {
	        System.out.println("{}");
	        return;
	    }
		
		Node<T> aux = top;
		while(aux != null) {
			System.out.print(aux.getValue());
			if(aux.getNext() != null) System.out.print(" -> ");
			aux = aux.getNext();
		}
		System.out.println();
	}

	public int length() {
		return size;
	}
}
