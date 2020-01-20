 #include <bits/stdc++.h> 
using namespace std; 

struct Node { 
	int data; 
	struct Node* next; 
}; 

struct LinkedList { 
    Node* head; 
    LinkedList() 
    { 
        head = NULL; 
    } 
};
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

Node* removeseclast(Node* head, int c) 
{ 
    // To store length of the linked list 
     int len = 0;
    Node* tmp = head; 
    while (tmp != NULL) { 
        len++; 
        tmp = tmp->next;  
    } 
      
    if (c > len)  
    { cout<<"Deletion of second last element is not possible";
    exit(0);
     
        return head;  
    } 

    else if (c == len) { 
        //cout<<"\n";
        		cout<<"After deleting:\n";
        		cout<<"2";
        		exit(0);
        return head->next;
    } 
    else 
    {
        int d = len - c;           
        Node* prev= NULL;        
        Node* curr = head;          
        for(int i = 0;i < d;i++){ 
            prev = curr;             
            curr = curr->next;       
        } 
        prev->next = curr->next; 
        return 0; 
    } 
      
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
void printList(Node* n) 
{ 
    while (n != NULL) { 
        cout << n->data << " "; 
        n = n->next; 
    } 
} 


int main() 
{ int a=0,b=0;;
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
		if(head){
		cout<<"Before deleting:\n";
		printList(head);
		cout<<"\n";
		removeseclast(head,2);
		cout<<"After deleting:\n";
		
		printList(head);
		}else{cout<<"Deletion of second last element is not possible";}
	
		
	//	Max(head);

	return 0; 
} 
