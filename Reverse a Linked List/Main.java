#include<stdio.h>
// #include <bits/stdc++.h> 
//using namespace std; 

struct Node { 
	int data; 
	struct Node* next; 
}; 

static void reverse(struct Node** head_ref) 
{ 
    struct Node* prev = NULL; 
    struct Node* current = *head_ref; 
    struct Node* next = NULL; 
    while (current != NULL) { 
       
        next = current->next; 
  	    current->next = prev; 
        prev = current; 
        current = next; 
    } 
    *head_ref = prev; 
} 
  

void push(struct Node** head_ref, int new_data) 
{ 
    struct Node* new_node = (struct Node*)malloc(sizeof(struct Node)); 
    new_node->data = new_data; 
    new_node->next = (*head_ref); 
    (*head_ref) = new_node; 
} 
/*void Max(struct Node* temp)  
{  int c = temp->data;
      
    while (temp != NULL)  
    {  
        if (c < temp->data) {
        c=temp->data;
        }
        
            //return true;  
        temp = temp->next; 
    }  
    cout<<c;
    
} */

void printList(struct Node* head) 
{ 
    struct Node* temp = head; 
    while (temp != NULL) { 
        printf("%d ", temp->data); 
        temp = temp->next; 
    } 
} 

int main() 
{ int a=0,b=0;;
	struct Node* head = NULL; 
//	cin>>b;
 scanf("%d",&b);
	if(b<0){printf("No value has been inserted"); return 0;} else{a=b;}
	while(a>=0){
	    
		//scanf("%d",&a);
		
		if(a>=0){
		push(&head, a);
		} 
	scanf("%d",&a);
		}
// printList(head);
	reverse(&head);
 printf("Original Order:\n");
	printList(head);	
 reverse(&head);
 printf("\nReverse Order:\n");
 printList(head);
	//	Max(head);
	getchar();
} 
