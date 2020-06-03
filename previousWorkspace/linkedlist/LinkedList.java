package linkedlist;

import java.util.Scanner;


class LinkedListNode<T> {
	public T data;
	public LinkedListNode<T> next;

	public LinkedListNode(T data) {
		this.setData(data);
		this.next = null;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}

public class LinkedList {
	private static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		print(Solution.removeDuplicates(input()));
	}

	public static void print(LinkedListNode<Integer> head) {
		LinkedListNode<Integer> temp = head;
		while (temp != null) {
			System.out.print(temp.getData() + " ");
			temp = temp.next;
		}
	}

	public static LinkedListNode<Integer> input() {
		int data = s.nextInt();

		LinkedListNode<Integer> head = null;
		LinkedListNode<Integer> tail = null;
		while (data != -1) {
			LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(data);
			if (head == null) {
				head = newNode;
				tail = newNode;
			} else {
				tail.next = newNode;
				tail = newNode;
			}
			data = s.nextInt();
		}
		return head;
	}
}		

 class Solution {
    
	public static LinkedListNode<Integer> removeDuplicates(LinkedListNode<Integer> head) {

          //  LinkedListNode<Integer> temp=head; 
            LinkedListNode<Integer> t1=head;
            LinkedListNode<Integer> t2=head.next;
            while(t2!=null)
            {
                 if(t1.next==null)
                 {
                     return head;
                 }
                 if(t1.data!=t2.data)
                 {
                	 t1.next=t2;
                	 t1=t2;
                	 t2=t2.next;
                 }
                 else
                 {
                	 t2=t2.next;
                 }
            }
            t1.next=t2;
        return head;
        }
    }

