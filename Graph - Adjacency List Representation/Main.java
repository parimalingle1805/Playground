#include<iostream>
#include<list>
#include<iterator>
using namespace std;
void displayAdjList(list<int> adj_list[], int v) {
  for(int i = 0; i<v; i++) {
     cout << i << "--->";
     list<int> :: iterator it;
     for(it = adj_list[i].begin(); it != adj_list[i].end(); ++it) {
        cout << *it << " ";
     }
     cout << endl;
   }
}
void add_edge(list<int> adj_list[], int u, int v) {   //add v into the list u, and u into list v
   adj_list[u].push_back(v);
   adj_list[v].push_back(u);
}
main(int argc, char* argv[]) {
   int v,e,start,end;
  cout<<"Enter the number of vertices:\n";
  cin>>v;
  cout<<"Enter the number of edges:\n";
  cin>>e;
   list<int> adj_list[v];
  
  for(int i=0;i<e;i++){
  	cout<<"Enter the Start node and End node of edge "<<i+1<<"\n";
    cin>>start>>end;
    add_edge(adj_list, start, end);
  }
  
   
	cout<<"Adjacency List:\n";
   displayAdjList(adj_list, v);
}