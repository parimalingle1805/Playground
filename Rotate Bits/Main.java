#include<iostream>
using namespace std;
int main()
{
int n,d;
 cin>>n;
 cin>>d;
cout<<((n<<d)|(n>>(16-d)))<<"\n";

cout<<((n>>d)|(n<<(16-d)));
}