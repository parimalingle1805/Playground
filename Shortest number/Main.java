#include<iostream>
using namespace std;
int main()
{
    string s;
    cin>>s;
    int n;
    cin>>n;
    int start=0;
    string ans="";
    while(n!=0)
    {
       int len=s.length();
       if(len <= n)
        {
            s="";
            break;
        }
       int minIndex = 0; 
for (int i = 1; i<=n ; i++) 
		    if (s[i] < s[minIndex]) 
			    minIndex = i;
	   ans.push_back(s[minIndex]);
	   s = s.substr(minIndex+1, len-minIndex);
	   n=n-minIndex;
    }
    cout<<ans+s;
}