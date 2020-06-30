#include <iostream>
 
using namespace std;
 
int main() {
	int n;
	cin >> n;
	int A[n], B[n], C[n];
	for(int i=0;i<n;i++){
	  cin >> A[i];
	}
	for(int i=0;i<n;i++){
	  cin >> B[i];
	}
    for(int i=0;i<n;i++){
	  C[i] = A[i]+B[i];
	  cout << C[i] << " ";
	}
}
