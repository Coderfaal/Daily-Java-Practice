public class MergeSortedArrays {
}

/*

 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        //int n= list1.length;
        //int m= list2.length;
        Arrays.sort(list1);
        Arrays.sort(list2);

        List <Integer> mergedList = new ArrayList<>();
        int i=0;
        int j=0;

        while(i<list1.length && j<list2.length){
            if(list1[i]<= list[j]){
                mergedList.add(list1[i]);
                i++;
            }else{
                mergedList.add(list2[j]);
                j++;
            }
            while(i<list1.length){
                mergedList.add(list1[i]);
                i++;
            }
            while(j<list2.length){
                mergedList.add(list2[j]);
                j++;
            }

        }return mergedList;
    }
    public static void main (String[]args){
        List <Integer> result = mergeSortedArrays(list1,list2);
    }
}


 */
