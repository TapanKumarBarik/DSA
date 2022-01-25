Problem Description

Design and implement a Linked List data structure. A node in a linked list should have the following attributes - an integer value and a pointer to the next node. It should support the following operations:

insert_node(position, value) - To insert the input value at the given position in the linked list.
delete_node(position) - Delete the value at the given position from the linked list.
print_ll() - Print the entire linked list, such that each element is followed by a single space.
Note:

If an input position does not satisfy the constraint, no action is required.
Each print query has to be executed in new line.


Problem Constraints
1 <= position <= n where, n is the size of the linked-list.



Input Format
First line contains an integer denoting number of cases, let's say t.
Next t line denotes the cases.


Output Format
When there is a case of print_ll(),  Print the entire linked list, such that each element is followed by a single space.
NOTE: You don't need to return anything.


Example Input
5
i 1 23
i 2 24
p
d 1
p


Example Output
23 24
24


Example Explanation
After first two cases linked list contains two elements 23 and 24.
At third case print: 23 24.
At fourth case delete value at first position, only one element left 24.
At fifth case print: 24.




  
  
  
  
  static class node {
    int data;
    node next;
    public node() {
        this.data = 0;
        this.next = null;
    }
}
static node root = null;
static int size_of_ll = 0;
public static void insert_node(int position, int value) {
    // @params position, integer
    // @params value, integer
    if (position >= 1 && position <= size_of_ll + 1) {
        node temp = new node();
        temp.data = value;
        if (position == 1) {
            temp.next = root;
            root = temp;
        } else {
            int count = 1;
            node prev = root;
            while (count < position - 1) {
                prev = prev.next;
                count++;
            }
            temp.next = prev.next;
            prev.next = temp;

        }
        size_of_ll++;
    }
}

public static void delete_node(int position) {
    // @params position, integer
    if (position >= 1 && position <= size_of_ll) {
        node temp = null;
        if (position == 1) {
            temp = root;
            root = root.next;
        } else {
            int count = 1;
            node prev = root;
            while (count < position - 1) {
                prev = prev.next;
                count++;
            }
            temp = prev.next;
            prev.next = prev.next.next;
        }
        size_of_ll--;
    }
}

public static void print_ll() {
    // Output each element followed by a space
    node temp = root;
    int flag = 0;
    while (temp != null) {
        if (flag == 0) {
            System.out.print(temp.data);
            flag = 1;
        } else
            System.out.print(" " + temp.data);
        temp = temp.next;
    }
}
