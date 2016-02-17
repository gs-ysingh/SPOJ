#include <iostream>
#include <string>
#include <stack>  
using namespace std;

int main() {
	int col, rowCount, j, k;
	string str;
	while(cin >> col && col != 0) {
		cin >> str;		
		rowCount = str.length() / col;

		char** ary = new char*[rowCount];
		for(int i = 0; i < rowCount; ++i) {
			ary[i] = new char[col];
		}

		int i = 0;
		int flag = 0;
		for(j = 0; j < rowCount; ++j) {
			if(flag == 0) {
				for(k = 0; k < col; ++k) {
					ary[j][k] = str[i];
					i++;
				}
			}
			else {
				for(k = col - 1; k >= 0; --k) {
					ary[j][k] = str[i];
					i++;
				}
			}
			flag = 1 - flag;
		}			

		for(j = 0; j < col; ++j) {
			for(i = 0; i < rowCount; ++i) {
				cout << ary[i][j];	
			}
		}
		cout << endl;
	}
	return 0;
}