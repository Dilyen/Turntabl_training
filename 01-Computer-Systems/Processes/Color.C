#include <iostream>
#include <stdlib.h>

using namespace std;

int main(){
	setenv("COLOR", "BLUE", 3);
	cout << getenv("COLOR") << endl;
}
