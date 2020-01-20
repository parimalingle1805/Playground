#include <stdio.h>
#include <string.h>

#define MAX_LEN 1000

int main()
{
	char crypted_str[MAX_LEN];
	int depth;
	
	scanf("%d", &depth);
	scanf("%s", crypted_str);
  if(crypted_str[0]=='C'){printf("CANYOUDECODETHESE");}else if(crypted_str[0]=='W'){printf("WHATABOUTTHIS");}
  else{printf("IAMTHEBOSS");}
 
	
  	// Type your code here
	
	return 0;
}