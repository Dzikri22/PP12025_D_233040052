package pertemuan3;

public class node { 
	int data;
	node next;
	
	//inisialisasi Node
	public node (int data) {
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public node getNext() {
		return next;
	}

	public void setNext(node next) {
		this.next = next;
	}
}
