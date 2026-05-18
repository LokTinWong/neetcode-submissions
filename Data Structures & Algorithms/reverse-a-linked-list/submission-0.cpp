/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */

class Solution {
public:
    ListNode* reverseList(ListNode* head) {
        ListNode *curr = head;
        ListNode *prev = NULL;
        ListNode *next = NULL;
        
        while (curr != NULL) {
            next = curr->next;
            curr->next = prev;
            prev = curr;
            curr = next;
        }

        // This if statement is probably unnecessary.
        // Up to this point, we haven't reassigned the head pointer.
        // If head == NULL, so will prev, because the while loop above never ran.
        // head = prev = NULL, meaning nothing changed because the list is empty.
        if (head != NULL) {
            head = prev;
        }

        return head;
    }
};
