#include<iostream>
using namespace std;

int main()
{
int n,i,count=1;
cin>>n;
int A[n];
for (i=0;i<n;i++){
cin>>A[i];
}
for (i=1;i<n;i++){
    count +=2;
if(A[i]!=count){
cout<<count;
break;
}
else{
}
}  return 0;
}