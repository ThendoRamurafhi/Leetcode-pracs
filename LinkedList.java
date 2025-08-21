public class LinkedList {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Dummy head to make building the result list easier
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            current.next = new ListNode(sum % 10);
            current = current.next;
            carry = sum / 10;
        }
        return dummy.next;
    }

    // Utility function to print linked list
    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val);
            if (node.next != null) System.out.print(" -> ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // First number: 342 (stored as 2 -> 4 -> 3)
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));

        // Second number: 465 (stored as 5 -> 6 -> 4)
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        LinkedList solution = new LinkedList();
        ListNode result = solution.addTwoNumbers(l1, l2);

        // Print result: should be 807 (7 -> 0 -> 8)
        System.out.print("Result: ");
        printList(result);
    }
}