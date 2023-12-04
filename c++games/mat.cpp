#include <bits/stdc++.h>
using namespace std;

class Solution
{   
    public:
    
   vector<int> snakePattern(vector<vector<int> > matrix)
    {   
        
        int n = matrix.size();
        int m = matrix[0].size();
         vector<int> temp;
        bool track = false;
        for(int i = 0; i<n; i++){
   
            for(int j = 0; j<m; j++){
                if(track){
                    int val = (n - 1) - j;
                    temp.push_back(matrix[i][val]);
                    
                }
                else temp.push_back(matrix[i][j]);
                
            }
            track = !track;
       
        }
        return temp;
    }
};

// int main(){
//     int t;
//     cin >> t;

//     while(t--)
//     {
//         int n;
//         cin >> n;
//         vector<vector<int>> matrix(n);
//         for(int i=0 ; i<n ; i++)
//         {
//             matrix[i].assign(n,0);
//             for(int j = 0; j<n; j++)
//             {
//                 cin >> matrix[i][j] ;           
//             }
//         }
//         Solution ob;
//         vector<int> result = ob.snakePattern(matrix);
//         for(int i =0 ; i<result.size(); ++i){
//             cout<< result[i]<< " ";
//         }
//         cout<<endl;
//     }
//     return 0;
// }