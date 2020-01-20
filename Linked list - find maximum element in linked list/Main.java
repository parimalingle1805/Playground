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
void Max(struct Node* temp)  
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
    
} 

int main() 
{ int a=0,b=0;;
	struct Node* head = NULL; 
	cin>>b;
	if(b<0){cout<<"0"; return 0;} else{a=b;}
	while(a>=0){
	    
		//cin>>a;
		
		if(a>=0){
		push(&head, a);
		} 
		cin>>a;
		}
	
		
		Max(head);
	return 0; 
} 
