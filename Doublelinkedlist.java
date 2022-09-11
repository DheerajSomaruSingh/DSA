package com.Doublelinkedlist;

import java.util.concurrent.atomic.LongAccumulator;

public class Doublelinkedlist {
	Node head;
	//insertfirst
	public void insertFirst(int val) {
		Node newNode = new Node(val);
		newNode.next = head;
		newNode.prev = null;
		if(head != null) {
			head.prev = newNode;
		}
		head = newNode;
	}
	
	//display
	public void display() {
		Node newNode = head;
		Node last = null;
		while(newNode != null) {
			System.out.print(newNode.val + "->");
			last = newNode;
			newNode = newNode.next;
		}
		System.out.println("NULL");
		
		while(last != null) {
			System.out.print(last.val + "->");
			last = last.prev;
		}
		System.out.println("start");
	}
	//insertlast
	public void insertlast(int val) {
		Node newNode = new Node(val);
		Node last = head;
		if(head == null) {
			newNode.prev = null;
			head = newNode;
			newNode.next = null;
			return;
		}
		while(last.next != null) {
			last = last.next;
		
		}
		last.next = newNode;
		newNode.prev = last;
	}
	
	public Node find(int value) {
		Node newNode = head;
		while(newNode != null) {
			if(newNode.val == value) {
				return newNode;
			}
			newNode = newNode.next; 
		}
		return null;
	}
	
	public void insert(int after, int val) {
		Node p = find(after);
		
		if(p == null) {
			System.out.println("doesnot exist");
			return;
		}
		
		Node newNode = new Node(val);
		newNode.next = p.next;
		p.next = newNode;
		newNode.prev = p;
		newNode.next.prev = newNode;
		
	}
	
	class Node{
		int val;
		Node next;
		Node prev;
		
		public Node(int val) {
			this.val = val;
		}
		
		public Node(int val, Node next, Node prev) {
			this.val = val;
			this.next = next;
			this.prev = prev;
		}
	}
	public static void main(String[] args) {
		Doublelinkedlist list = new Doublelinkedlist();
		list.insertFirst(8);
		list.insertFirst(2);
		list.insertFirst(9);
		list.insertFirst(10);
		list.insertlast(99);
		list.insert(2, 99);
		list.display();
		
	}

}
