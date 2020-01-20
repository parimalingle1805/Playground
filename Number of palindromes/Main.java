 #include<bits/stdc++.h>
 using namespace std;
 int main(){
      int low=1,high;
     cin>>high;
     int count=0;
     for(int i=low;i<=high;i++)
	    	  if(i%2==0){
	    		  count+=(9*pow(10,(i/2-1)));
	    	  }else{
	    		  count+=(9*pow(10,(i/2)));
	    	  }
   	      cout<<count;
	      }
