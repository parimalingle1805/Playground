#include <bits/stdc++.h> 
using namespace std; 

class Node 
{ 
	public: 
	int data; 
	Node* next; 
}; 
void removeDuplicates(struct Node *head) 
{ 
    struct Node *ptr1, *ptr2, *dup; 
    ptr1 = head; 
  
    /* Pick elements one by one */
    while (ptr1 != NULL && ptr1->next != NULL) 
    { 
        ptr2 = ptr1; 
  
        /* Compare the picked element with rest 
           of the elements */
        while (ptr2->next != NULL) 
        { 
            /* If duplicate then delete it */
            if (ptr1->data == ptr2->next->data) 
            { 
                /* sequence of steps is important here */
                dup = ptr2->next; 
                ptr2->next = ptr2->next->next; 
                delete(dup); 
            } 
            else /* This is tricky */
                ptr2 = ptr2->next; 
        } 
        ptr1 = ptr1->next; 
    } 
} 

void addnode(Node** head, int new_data)  
{  
    Node* new_node = new Node(); 
    Node *last = *head;
    new_node->data = new_data;  

    new_node->next = NULL;  
    if (*head == NULL)  
    {  
        *head = new_node;  
        return;  
    }  

    while (last->next != NULL)  
        last = last->next;  

    last->next = new_node;  
    return;  
}


void printList(Node *node) 
{ 
	while (node!=NULL) 
	{ 
		cout<<"\n"<<node->data; 
		node = node->next; 
	} 
} 

int main() 
{  int a=0;
	struct Node* head = NULL; 
//	cin>>b;
//	if(b<0){cout<<"No data has been inserted"; return 0;} else{a=b;}
	while(a>=0){
	    
		cin>>a;
		
		if(a>=0){
		addnode(&head, a);
		} 
	//	cin>>a;
		}
	cout<<"Linked list before removal of duplicates"; 
	printList(head); 
    removeDuplicates(head); 

	cout<<"\nLinked list after removal of duplicates ";	 
	printList(head);			 
	
	return 0; 
} 

