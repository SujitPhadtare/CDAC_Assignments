package genCirQueue;

public class GenCirQ<T> {
	private T arr[];
	private int front, rear, count;

	@SuppressWarnings("unchecked")
	public GenCirQ() {
		super();
		arr = (T[]) new Object[10];
		this.count = 0;
		this.front = -1;
		this.rear = -1;
	}
	
	@SuppressWarnings("unchecked")
	public GenCirQ(int size) {
		super();
		arr = (T[]) new Object[size];
		this.count = 0;
		this.front = -1;
		this.rear = -1;
	}
	
	
	//Circular enqueue
	public boolean enqueue(T data) {
		if(!isFull()) {
			rear=(rear+1)%arr.length;
			arr[rear] = data;
			if(front==-1)
				front=0;
			count++;
			return true;
		}else {
			return false;
		}
	}
	
	//Circular dequeue
	public T dequeue() {
		if(!isEmpty()) {
			T temp = arr[front];
			front = (front+1)%arr.length;
			count--;
			return temp;
		}else {
			return null;
		}
	}
	
	
	//IsFull
	public boolean isFull() {
		return count==arr.length;
	}
	
	//IsEmpty
	public boolean isEmpty() {
		return count==0;
	}
	
}
