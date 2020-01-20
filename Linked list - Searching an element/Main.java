 #include <bits/stdc++.h> 
using namespace std; 

struct Node { 
	int data; 
	struct Node* next; 
}; 



void push(struct Node** head_ref, int new_data) 
{ 
	struct Node* new_node = new Node(); 

	new_node->data = new_data; 

	new_node->next = (*head_ref); 

	(*head_ref) = new_node; 
} 
int search(Node* head, int x)  
{  
    Node* curr = head;  
    while (curr != NULL)  
    {  
        if (curr->data == x) {
        cout<<x<<" is present in the list";
    return 1;
        }
        
            //return true;  
        curr = curr->next; 
    }  
    cout<<x<<" is not present in the list"; //return false;  
    return 0;
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
		cout<<"Enter the value to be searched:"<<"\n";
		cin>>b;
		
		search(head, b);//? cout<<b<<" is present in the list" : cout<<b<<" is not present in the list"; 
	
 
	return 0; 
} 
