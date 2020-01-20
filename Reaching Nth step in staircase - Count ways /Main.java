#include<stdio.h>

int find_total_ways_recur_opt(int curr_step,long long int n,int results_cache[]){
if(curr_step>n){
return 0;
}
if(curr_step==n){
return 1;
}
if(results_cache[curr_step] != -1){
return results_cache[curr_step];
}
int total_ways = find_total_ways_recur_opt(curr_step +1,n, results_cache)+
	           	 find_total_ways_recur_opt(curr_step +2,n, results_cache);
results_cache[curr_step ] = total_ways;

}
int find_total_ways_recur_opt_wrap(long long int n){
int results_cache[n+1],i;
for(i=0;i<=n;i++){
results_cache[i]=-1;
}
return find_total_ways_recur_opt(0,n,results_cache);
}

int main(){
	long long int n;
scanf("%lld",&n);
printf("%lld \n",find_total_ways_recur_opt_wrap(n));
return 0;
}