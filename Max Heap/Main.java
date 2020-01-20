#include <iostream>

using namespace std;

void min_heap(int *a,int i,int n){
    int j,temp;
    temp = a[i];
    j=2*i;
    while(j<=n){
        if(j<n && a[j+1]>a[j])
            j=j+1;
        if(temp>a[j])
            break;
        else if(temp<=a[j]){
            a[j/2]=a[j];
            j=2*j;                            
        }
    }
    a[j/2]=temp;
    return;
}

void build_minheap(int *a,int n){
    int k;
    for(int k=n/2;k>=1;k--){
        min_heap(a,k,n);
    }
}

int main()
{   
    int n;
    cout<<"enter no of elements of array \n";
    cin>>n;
    int a[20];
    for(int i=1;i<=n;i++){
        cout<<"enter element"<<(i)<<endl;
        cin>>a[i];
    }
    build_minheap(a,n);
    cout<<"Max Heap \n";
    for(int i=1;i<=n;i++){
        cout<<a[i]<<endl;
    }
    return 0;
}