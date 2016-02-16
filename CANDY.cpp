#include <iostream>
#include <vector>
using namespace std;

int main() {
	int input, j, sum;
	while(cin >> input && input != -1) {
		vector<int> v(input, 0);
		sum = 0;
		for (int i = 0; i < input; ++i)
		{
			cin >> j;
			v[i] = j;
			sum += v[i]; 
		}

		int result, diff = 0;
		if(sum % input == 0) {
			result = sum / input;
			for (vector<int>::iterator it = v.begin(); it != v.end(); ++it) {
    			if(*it > result) {
    				diff = diff + (*it - result);
    			}
			}

			cout << diff << "\n";
		}
		else {
			cout << -1 << "\n";
		}
	}
	return 0;
}