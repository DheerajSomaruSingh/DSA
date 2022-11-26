package com.Circularlinkedlist;

public class Circularlinkedlist {
	
	private Node head;
	private Node tail;
	
	public Circularlinkedlist() {
		this.head = null;
		this.tail = null;
	}
	
	public void insert(int val) {
		Node newNode = new Node(val);
		if(head == null) {
			head = newNode;
			tail = newNode;
			return;
		}
		tail.next = newNode;
		newNode.next = head;
		tail = newNode;
	}
	
	public void display() {
		Node newNode = head;
		if(head != null) {
			do {
				System.out.print(newNode.val + "-->");
				newNode = newNode.next;
			}while(newNode != head);
		}
	}
	
	class Node{
		int val;
		Node next;
		
		public Node(int val) {
			this.val = val;
		}
	}
	public static void main(String[] args) {
		Circularlinkedlist list = new Circularlinkedlist();
		list.insert(0);
		list.insert(2);
		list.insert(4);
		list.insert(8);
		list.insert(16);
		list.display();
	}

}
