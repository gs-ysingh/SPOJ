#include <iostream>

using namespace std;

int main() {
	int input;		
	while((cin >> input) > 0 && input != 42) {
		cout << input << "\n";
	}
	return 0;
}