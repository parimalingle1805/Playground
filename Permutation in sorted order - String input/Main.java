#include <stdio.h>
#include <string.h>

void sort(char arr[],int n);
void permutationWrapper(char a[],int n);
void permute(char a[],int n,int selected[],int used[],int index);

#define MAX_SIZE 20

void sort(char arr[], int n)
{
    int i,j;
    for(i=1;i<n;i++)
    {
        int tmp = arr[i];
        for(j=i-1;j>=0;j--)
        {
            if(arr[j+1]<arr[j]){
                arr[j+1]=arr[j];
            }
            else{
                break;
            }
        }
        arr[j+1]=tmp;
    }
}

void permutationWrapper(char a[],int n)
{
    sort(a,n);
    int selected[MAX_SIZE]={}, used[MAX_SIZE]={};
    permute(a,n,selected,used,0);
    }
void permute(char a[],int n, int selected[],int used[],int index)
{
    int i;
    if(index==n){
        for(i=0;i<n;i++){
            printf("%c",selected[i]);
        }
        printf("\n");
        return;
    }
    
    for(i=0;i<n;i++){
        if(used[i]==1){
            continue;
        }
        used[i]=1;
        selected[index]=a[i];
        permute(a,n,selected,used,index+1);
        used[i]=0;
    }
}

int main()
{
char arr[MAX_SIZE];
scanf("%s",&arr);
int n=strlen(arr);
permutationWrapper(arr,n);
return 0;
}