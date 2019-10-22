#include <iostream>

using namespace std;

int main(){
	//======= << operator ========================
	int num = 2;
	num <<= 1;
	cout << num << endl;

	//==========Pre increment twice===============
	int x = 0;
	++++x;
	cout << x << endl;

	//========== *= Operator =====================
	int y = 2;
	y *= 6;
	cout << y << endl;

	//assignment is right-associative
	int z = y = x = 3;
	cout << z << y << x <<endl;

	//======== Static Cast ======================
	float a = 5.3f;
	int i = static_cast<int>(a);
	cout << "Static cast: " << i << endl;

	//=====Using Functional Cast================
	int n = int (a);
	cout << "Functional Cast: " << n;
}
