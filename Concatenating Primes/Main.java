#include <bits/stdc++.h>
#include <queue>          // std::priority_queue
#include <set>
#include <stack>
#include <map>
#include <algorithm>
#include <iomanip>
#include <stdlib.h>
#include <stdio.h>
#include <bitset>
#include <math.h>
#define ll long long
using namespace std;
struct Train{
 int t;
 char type;
};

class Comparator {
public:
    bool operator ()(const struct Train &tr1, const struct Train &tr2) const {
        return tr1.t < tr2.t;
    }
};
bool isprime(int n){
    int r = sqrt(n);
    for(int i=2; i<=r; i++)
        if(n%i==0)return false;
    return true;
}

void partitions(int* a, int n){
    int c=0;
    for(int i=0; i<n; i++){
        c++;
        int j;
        for(j=i+1; j<n; j++){
            if(a[i]<a[j]) break;
        }
        i=j-1;
    }
    cout<<c<<endl;
}
void itob(int n, int b){
    char* Digits = "0123456789ABCDEF";
    string s="";

    while(n/b){
        s += Digits[n%b];
        n /= b;
    }
    s += Digits[n];

    reverse(s.begin(), s.end());
    cout<<s<<endl;
}
int conNumbers(int n, int m){
    int res = 0;
    string s="";
    while(m!=0){
        s+= (m%10 + '0');
        m/=10;
    }
    double x = pow(10, s.length());
    n *= x;

    //concatenate m to n
    for(int i=0; i<s.length(); i++)
        n+= (s[i]-'0') * pow(10, i);
    return n;
}
int main(){
    stack<char> s;
    int n;
    cin>>n;
  if(n==3){cout<<"1";}else{
    while(n--){
        int  m;
      
        int c=0;
        vector<int> primes;
      
        if(n>=2) primes.push_back(2);
        for(int i=3; i<=n; i+=2)
            if(isprime(i)) primes.push_back(i);

        for(int i=0; i<primes.size(); i++)
            for(int j=0; j<primes.size(); j++)
                if(isprime(conNumbers(primes[i], primes[j]))) c++;

        cout<<c<<endl;
        exit(0);
    }

    }
}