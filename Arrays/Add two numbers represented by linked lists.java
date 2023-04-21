class Solution{
    //Function to add two numbers represented by linked list.
    static Node reverseList(Node node) {
		Node prev = null;
		Node curr = node;
		while (curr != null) {
			Node fwd = curr.next;
			curr.next = prev;
			prev = curr;
			curr = fwd;
		}
		return prev;
	}

	 static Node addLists(Node first, Node second) {
		Node ansHead = null;
		Node ansTail = null;
		int carry = 0;
		while(first != null || second != null || carry != 0) {
			int val1 = 0, val2 = 0;
			if(first != null) val1 = first.data;
			if(second != null) val2 = second.data;
			int sum = val1  + val2 + carry;
			int dig = sum % 10;
			Node temp = new Node(dig);
		    if (ansHead == null) {
			    ansHead = temp;
			    ansTail = temp;
		    } else {
		        ansTail.next = temp;
		        ansTail = temp;
		    }
			carry = sum/10;
			if(first != null) first = first.next;
			if(second != null) second = second.next;
		}
		return ansHead;
	}
	
	static Node addTwoLists(Node first, Node second) {
		// code here
		// return head of sum list
		first = reverseList(first);
		second = reverseList(second);
		Node ans = addLists(first, second);
		return reverseList(ans);
	}
}