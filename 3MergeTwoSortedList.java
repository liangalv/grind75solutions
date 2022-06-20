/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
import java.util.*;
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        //travese each list simutaneously until one hits null 
        ListNode dummy = new ListNode(); 
        ListNode tail = dummy;
        while ((list1.next != null) || (list2.next != null)){
            if (list1.val < list2.val){
                tail.next = list1;
                list1 = list1.next; 

            }else{
                tail.next = list2;
                list2 = list2.next;

            }
            tail = tail.next;
        }
        if (list1.next == null){
            tail.next = list2;
        }
        else{
            tail.next = list1;
        }
        return dummy.next;
        //if one list hits null then we should add the rest of the list to the end 

        
    }
}