#include <iostream>
#include <string>
#include <stack>  
using namespace std;

int main() {
	int t;
	string str, i, j, op, final;
	cin >> t; 
	stack<string> alpStack;
	stack<string> opStack;

	while(t--) {
		cin >> str;

		for(string::iterator it = str.begin(); it < str.end(); ++it) {
			if(*it == '(') {
			}
			else if(*it == ')') {
				i =  alpStack.top();
				alpStack.pop();

				j = alpStack.top();
				alpStack.pop();
				
				op = opStack.top();
				opStack.pop();
				
				final = j + i + op;
				alpStack.push(final);
			}
			else if(*it == '^' || *it == '+' || *it == '-' || *it == '*' || *it == '/') {
				opStack.push(string(1, *it));
			}
			else if(*it >= 'a' && *it <= 'z') {
				alpStack.push(string(1, *it));
			}
		}

		cout << alpStack.top() << endl;
		alpStack.pop();
	}
	return 0;
}