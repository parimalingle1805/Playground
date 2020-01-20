 #include <bits/stdc++.h> 
using namespace std; 

struct Node { 
	int data; 
	struct Node* next; 
}; 

void printNthFromLast(struct Node* head, int n) 
{ 
	int len = 0, i; 
	struct Node* temp = head; 

	while (temp != NULL) { 
		temp = temp->next; 
		len++; 
	} 

	if (len < n) {
	        cout<<"\n"<<"There is no nth node in the list";
		return;
	}
		else{

	temp = head; 

	for (i = len; i > len - n + 1; i--) {
		temp = temp->next; 
	}

	cout <<"\n"<< temp->data<<" is the nth node element in the list"; 
          

	return; 
		}
} 

void push(struct Node** head_ref, int new_data) 
{ 
	struct Node* new_node = new Node(); 

	new_node->data = new_data; 

	new_node->next = (*head_ref); 

	(*head_ref) = new_node; 
} 

int main() 
{ int a=0,b=0;
	struct Node* head = NULL; 
	do{
		cin>>a;
		if(a>=0){
		push(&head, a);
		}
		}while(a>=0);
		cout<<"Enter the nth node:";
		cin>>b;
		
	printNthFromLast(head, b); 
	return 0; 
} 
