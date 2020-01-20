  /* Help of this program we are learning how to insert newly created node at  ascending order 
   (according linked list node data).
Note:
Time complexity: 
           1) Insertion: O(n).
           2) Deletion: O(n)    
*/

/*include header file*/
#include<stdio.h>
#include<stdlib.h>

/*--------
Note: When we are using turbo c,c++ IDE then include this header file.

#include<conio.h>

And getch() function can be used hold output screen.
---------*/


/*structure of linked list*/
struct Node{
  
  int data;// linked list data 
  struct Node*next;// pointer field
  
}*root;/*global linked list point*/

/* Function declaration section here */
void insert_ascending_order(int);
void show_data(struct Node*);
void remove_node();

/* Help of this function assign newly created node at ascending 
  (depends on node data) order position.*/
void insert_ascending_order(int value){
  
  /*Create dynamic memory block using malloc function. */
  struct Node*temp ,*new_node=(struct Node*)malloc(sizeof(struct Node));
  
  /*Check new_node is null or not */
  if(new_node)
  {   
      /*assign user data value to new created node*/
    new_node->data=value;
  
    /*base condition if linked list pointer is NULL*/
    if(root==NULL)
    {
      /* initialize first node in root pointer*/
      root=new_node;
      new_node->next=NULL;
    }
    else
    { /*base condition root data value more then new inserted*/
      if(root->data>=value){
        /*add new created not at start of linked list*/
        new_node->next=root;
        /*root is pointed to this new created node*/
        root=new_node;
      }
      else{
        temp=root;

        /* find appropriate position to add new created node */
        while(temp->next!=NULL&&temp->next->data<value)
        {
          /*move on next pointer*/
          temp=temp->next;
          
        }
        if(temp->next==NULL){
          /*insert new element(node) in last position*/
          new_node->next=NULL;
          temp->next=new_node;
        }
        else{
          /*insert node in middle of linked list*/
          new_node->next=temp->next;
          temp->next=new_node;
        }
        
      }
    
    }
  }
  else
  {
    /*malloc function not create dynamic memory this case showing this message*/
    printf("\n Memory overflow try again..!");
  }
}


/* Help of this function showing all element of single linked list */
void show_data(struct Node*temp){
  if(temp==NULL){
    /*linked list are empty*/
    printf("Empty linked List\n");
  }
  else
  {
    /*When linked list are not empty*/
  //  printf(""\n);
    while(temp)
    {
      /*print linked list data*/
      printf("%d  \n",temp->data);

      /*move next memory block*/
      temp=temp->next;
    }
    
  }
}
/*Help of this function removing all linked list element.*/
void remove_node(){
  if(root){
    
    struct Node*temp=root;
    
    while(temp){
      
      /*Moving root pointer to on next memory block.*/
      root=root->next;
        
      /*before removing that linked node assign
       next pointer value are null.*/
      temp->next=NULL;
      
      /*Free linked list node element*/
      free(temp);
      
      temp=root;
    }
  }
  else{
    /* When linked list is empty */
    printf("\n linked list is empty \n");
  }
  
}
struct Node* *removeDuplicate(struct Node* root){
	struct Node *temp = root;            
	while(temp != NULL && temp->next != NULL){
		if(temp->data == temp->next->data){      
			temp -> next = temp ->next ->next;    
		}
		else{
			temp = temp->next;               
		}
	}
	return root;                
}

int main(){
int a=0,b=0;;
	struct Node* head = NULL; 
//	cin>>b;
 //scanf("%d",&b);
//	if(b<0){printf("No value has been inserted"); return 0;} else{a=b;}
	while(a>=0){
	    
		scanf("%d",&a);
		
		if(a>=0){
		insert_ascending_order(a);
		} 
	//scanf("%d",&a);
		}
  
  removeDuplicate(root);
    
   /*show_data functions showing result after inserted all newly created node*/
  
  show_data(root);
    
  /*removing linked list node*/
  remove_node();
  
  /*end execution*/
}

    