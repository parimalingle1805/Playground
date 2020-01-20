#include <iostream>
#include<string>
#include <cstdlib>

using namespace std;

#define MAX 20



class AdjacencyMatrix

{

    private:

        int n;

        int **adj;

        bool *visited;

    public:

        AdjacencyMatrix(int n)

        {

            this->n = n;

            visited = new bool [n];

            adj = new int* [n];

            for (int i = 0; i < n; i++)

            {

                adj[i] = new int [n];

                for(int j = 0; j < n; j++)

                {

                    adj[i][j] = 0;
                }
            }
        }
        void add_edge(int origin, int destin, int weight)
        {
            if( origin > n || destin > n || origin < 0 || destin < 0)
            {   
                cout<<"Invalid edge!\n";
            }
            else
            {
                adj[origin - 1][destin - 1] = weight;
            }
        }

        void display()
        {
           int i,j;
            for(i = 0;i < n;i++)
            {
               for(j = 0; j < n; j++)
                    cout<<adj[i][j]<<" ";
                cout<<endl;
            }
        }
   void display_no()
        {
           int i,j;
            for(i = 0;i < n;i++)
            {
               for(j = 0; j < n; j++){
                if(i>=j){
                 cout<<adj[j][i]<<" ";
                }else{cout<<adj[i][j]<<" ";}
               }
              		cout<<endl;
               
            }
        }
};


int main()

{

    int nodes, max_edges, origin, destin,weight;
    string dir;
  string y("yes");

    cout<<"Please enter the number of nodes in the graph\n";

    cin>>nodes;
    
    cout<<"Please enter the number of edges in the graph\n";
    cin>>max_edges;
    AdjacencyMatrix am(nodes);

    //max_edges = nodes * (nodes - 1);
    cout<<"Is the graph directed\n";
    cin>>dir;
  cout<<"Adjacency Matrix Representation:\n";
for(int i=0;i<nodes;i++){
  for(int j=0;j<nodes;j++){
  	cout<<"0 ";
  }
  cout<<"\n";
}
    for (int i = 0; i < max_edges; i++)

    {

        cout<<"Enter the start node, end node and weight of edge no "<<i+1<<"\n";

        cin>>origin>>destin>>weight;

        if((origin == -1) && (destin == -1))

            break;

        am.add_edge(origin, destin,weight);

    }
	cout<<"Adjacency Matrix Representation:\n";
  if(dir.compare(y)==0){  
  am.display();
  }else{
  am.display_no();
  }
  //cout<<dir;

    return 0;

}