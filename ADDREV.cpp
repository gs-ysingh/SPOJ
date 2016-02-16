#include <iostream>
#include <cmath>
#include <string>
using namespace std;

int reverse(int n, int l) {
	if(l == 1) {
		return n;		
	}
	else {
		return (n % 10) * pow(10, l - 1) + reverse(n / 10, l - 1); 
	}
}

int reverseFast(int x) {
	int y = 0;
	while (x > 0) {
		y *= 10;
	    y += ( x %10 );
	    x /= 10; 
	}
	return y;
}

int getDigit(int n) {
	if(n < 10) {
		return 1;
	} 
	else {
		return 1 + getDigit(n / 10);
	}
}

int main() {
	int t, m, n, i;
	cin >> t; 
	
	//My Method:
	// while(t--) {
	// 	cin >> m >> n;
	// 	i = reverse(m, getDigit(m)) + reverse(n, getDigit(n));
	// 	cout << reverse(i, getDigit(i)) << "\n";
	// }

	//2nd method without getting digit:
	while(t--) {
		cin >> m >> n;
		i = reverseFast(m) + reverseFast(n);
		cout << reverseFast(i) << "\n";
	}
	return 0;
}