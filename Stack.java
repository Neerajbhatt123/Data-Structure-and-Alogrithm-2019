class Main {
	int top;
	int arr[] = new int[5];

	Main() {
		top = -1;
	}

	boolean isEmpty() {
		return (top == -1);
	}

	int peek() {
		if (isEmpty() == true) {
			System.out.print("Stack underflow");
			return -1;
		} else {
			int value = arr[top];
			return value;
		}
	}

	boolean push(int dataValue) {
		if (top == 4) {
			System.out.println("Stack Overflow");
			return false;
		} else {
			arr[++top] = dataValue;
			System.out.println(dataValue + "  pushed Stack ");
			return true;
		}
	}

	int pop() {
		if (isEmpty() == true) {
			System.out.println("UNDERFLOW ::");
			return -1;
		} else {
			int value = arr[top--];
			return value;
		}
	}

	void display() {
		if (isEmpty() == true) {
			System.out.println("UNDERFLOW");
		} else {
			for (int i = top; i >= 0; i--) {
				System.out.println("Stack :: " + arr[i]);
			}
		}
	}

	public static void main(String[] args) { 
     Main ms = new Main();
		 ms.push(78);
		 ms.push(74);
		 ms.push(56);
		 ms.push(545);
		 ms.push(1);
		 ms.pop();
		 ms.pop();
		 ms.isEmpty();
		 System.out.println(ms.peek()+" :: peek ");
		 ms.display();
  }
}