package com.sll;

import java.util.*;

class sll {
	Node head;
	class Node{
		String data;
		Node next;
		
		Node(String data){
			this.data = data;
			this.next = null;
			
		}
	}
	//add first
	public void addfirst(String data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		
		newNode.next = head;
		head = newNode;
	}
	//add last
	public void addlast(String data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		
		Node currNode = head;
		while(currNode.next != null) {
			//to go to the next node
			currNode = currNode.next;
		}
		
		currNode.next = newNode;
		
	}
	//print
	public void printlist() {
		if(head == null) {
			System.out.println("linkedlist is empty");
			return;
		}
		Node currNode = head;
		while(currNode != null) {
			System.out.print(currNode.data + "-->");
			currNode = currNode.next;
		}
		
		System.out.println("NULL");
		
	}
	//delete first
	public void deletefirst() {
		if(head == null) {
			System.out.println("linkedlist is empty");
			return;
		}
		
		head = head.next;
		return;
	}
	//delete last
	public void deletelast() {
		if(head == null) {
			System.out.println("linkedlist is empty");
			return;
		}
		
		if(head.next == null) {
			System.out.println("linkedlist has only one element");
			head = null;
		}
		Node secondlastNode = head;
		Node lastNode = head.next;
		while(lastNode.next != null) {
			lastNode = lastNode.next;
			secondlastNode = secondlastNode.next;
		}
		// if you get your secondlastNode next null the lastnode will get deleted automatically 
		secondlastNode.next = null;
		
	}
	//reverse the list
	public void reverseIterate() {
		if(head == null || head.next == null) {
			return;	
		}
		Node prevNode = head;
		Node currNode = head.next;
		while(currNode != null) {
			Node nextNode = currNode.next;
			currNode.next = prevNode;
			
			//update
			prevNode = currNode;
			currNode = nextNode;
		}
		head.next = null;
		head = prevNode;
	}
	
	public static void main(String[] args) {
		sll list = new sll();
		list.addfirst("a");
		list.addfirst("is");
		list.printlist();
		list.addlast("list");
		list.addfirst("This");
		list.printlist();
		
		//reverse the list
		list.reverseIterate();
		list.printlist();
	}
	
//	// diff pgm
//	// already made functions of linkedlist 
//	public static void main(String[] args) {
//		LinkedList<String> list = new LinkedList<String>();
//		list.add("a");
//		list.addFirst("is");
//		System.out.println(list);
//		list.addFirst("this");
//		System.out.println(list);
//		list.size();
//		System.out.println(list.size());
//		
//		for(int i=0;i<list.size();i++) {
//			System.out.print(list.get(i) + "--->");
//		}
//		System.out.println("null");
//	}
	
	// rerverse a list with no extra memory
}
