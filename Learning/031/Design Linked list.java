Problem Description
Given a matrix A of size Nx3 representing operations. Your task is to design the linked list based on these operations.

There are four types of operations:

0 x -1: Add a node of value x before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.

1 x -1: Append a node of value x to the last element of the linked list.

2 x index: Add a node of value x before the indexth node in the linked list. If the index equals the length of the linked list, the node will be appended to the end of the linked list. If the index is greater than the length, the node will not be inserted.

3 index -1: Delete the indexth node in the linked list, if the index is valid.

A[i][0] represents the type of operation.

A[i][1], A[i][2] represents the corresponding elements with respect to type of operation.

Note: Indexing is 0 based.


Problem Constraints
1 <= Number of operations <= 1000
1 <= All node values <= 109


Input Format
The only argument given is matrix A.


Output Format
Return the pointer to the starting of the linked list.


Example Input
Input 1:
A = [[0, 1, -1],
     [1, 2, -1],
     [2, 3, 1]]
Input 2:

A = [[0, 1, -1],
     [1, 2, -1],
     [2, 3, 1],
     [0, 4, -1],
     [3, 1, -1],
     [3, 2, -1]]


Example Output
Output 1:
1 -> 3 -> 2 -> NULL
Output 2:

4 -> 3 -> NULL


Example Explanation
Explanation 1:
After first operation the list is 1 -> NULL
After second operation the list is 1 -> 2 -> NULL
After third operation the list is 1 -> 3 -> 2 -> NULL
Explanation 2:

After first operation the list is 1 -> NULL
After second operation the list is 1 -> 2 -> NULL
After third operation the list is 1 -> 3 -> 2 -> NULL
After fourth operation the list is 4 -> 1 -> 3 -> 2 -> NULL
After fifth operation the list is 4 -> 3 -> 2 -> NULL
After sixth operation the list is 4 -> 3 -> NULL












/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */


ListNode* add_to_end(ListNode * head, int data) {
    ListNode * node = new ListNode(data);
    ListNode * curr = head, * prev = 0;
    while (curr) {
        prev = curr;
        curr = curr->next;
    }
    if (prev)
        prev->next = node;
    else
        head = node;
    return head;
} 


ListNode* delete_at_position(ListNode* head, int n) {
    if (n < 1 || !head) return head;
    ListNode * node = head, * prev = NULL;
    while (--n) {
        prev = node;
        if (!node)
            return head;
        node = node->next;
    }
    if (!prev)
        head = node->next;
    else
        prev->next = node->next;
    delete node;
    return head;
}

ListNode* insert_at_position(ListNode *head, int data, int pos) {
    ListNode *curr = head, *prev = 0;
    int i = pos;
    while (--i && curr) {
        prev = curr;
        curr = curr->next;
    }
    if (i != 0)
        return head;
    ListNode *node = new ListNode(data);
    if (!prev) {
        node->next = head;
        return node;
    }
    node->next = prev->next;
    prev->next = node;
    return head;
}

 
ListNode* Solution::solve(vector<vector<int> > &A) {
    ListNode * head = 0;
    for (auto &v:A) {
        switch(v[0]) {
            case 0: head = insert_at_position(head, v[1], 1); break;
            case 1: head = add_to_end(head, v[1]); break;
            case 2: head = insert_at_position(head, v[1], v[2]+1); break;
            case 3: head = delete_at_position(head, v[1]+1); break;
            default: break;
        }
    }
    return head;
}
