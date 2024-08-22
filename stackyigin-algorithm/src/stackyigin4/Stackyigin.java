package stackyigin4;

public class Stackyigin {
	Node top;
	int size;
	int count;
	public Stackyigin(int size) {
		top=null;
		count=0;
		this.size = size;
	}
	void push(int data ) {
		Node eleman=new Node(data);
		if (dolumu()) {
			System.out.println("stack dolu");
		}else if (bosmu()) {
			top=eleman;
		}else {
			eleman.next=top;
			top=eleman;
		}
		count++;
	}
	void pop() {
		if (bosmu()) {
			System.out.println("stack bos");
		}else {
			top=top.next;
		}
		count--;
	}
	boolean dolumu() {
		return size==count;
	}boolean bosmu(){
		return count==0;
	}
	void yazdır() {
		if (bosmu()) {
			System.out.println(" stackte yazdırılcak eleman yok ");
		}else {
			Node temp=top;
			while (temp!=null) {
				System.out.println(temp.data  + " ");
				temp=temp.next;
			}
		}
	}
	int  kacelemanvar() {
		if (bosmu()) {
			return 0;
		}else {
			Node temp=top;
			int kaceleman = 0;
			while (temp!=null) {
				temp=temp.next;
				kaceleman++;
			}
			System.out.println("kac eleman var " + kaceleman);
			return kaceleman;
		}
	}

}
