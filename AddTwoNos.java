/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int l1_len = 0;
        int l2_len = 0;
        
        ListNode l11 = l1;
        ListNode l22 = l2;
        ListNode resultList = new ListNode(0);
        ListNode head = resultList;
        int carry = 0;
        
        while(l11.next != null){
            l11 = l11.next;
            l1_len ++;
        }
            
        while(l22.next != null){
            l22 = l22.next;
            l2_len ++;
        }
        
        if(l1_len <= l2_len){
            while(l1 != null){
                int sum = l1.val + l2.val + carry;
                carry = sum / 10;
                int val = sum % 10;
                ListNode node = new ListNode(val); 
                head.next = node;
                head = head.next;
                l1 = l1.next;
                l2 = l2.next;
            }
            if(l1_len != l2_len){
                while(l2 != null){
                    int sum = l2.val + carry;
                    carry = sum / 10;
                    int val = sum % 10;
                    ListNode node = new ListNode(val);
                    head.next = node;
                    head = head.next;
                    l2 = l2.next;
                }
            }
        }else{
            
            while(l2 != null){
                int sum = l1.val + l2.val + carry;
                carry = sum / 10;
                int val = sum % 10;
                ListNode node = new ListNode(val); 
                head.next = node;
                head = head.next;
                l1 = l1.next;
                l2 = l2.next;
            }
            
            while(l1 != null){
                    int sum = l1.val + carry;
                    carry = sum / 10;
                    int val = sum % 10;
                    ListNode node = new ListNode(val);
                    head.next = node;
                    head = head.next;
                    l1 = l1.next;
            }
        }
        if(carry != 0){
            head.next = new ListNode(carry);
            head = head.next;
        }
        return resultList.next;
    }
}