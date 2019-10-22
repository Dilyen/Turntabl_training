#include <iostream>
#include <vector>

using namespace std;

struct Date {
	int day;
	int month;
	int year;
};

int main(){
	 //======Vector of Three Date Objects========================== 
	cout << endl;
	Date vdate1, vdate2, vdate3;

	vector <Date> vdate = {vdate1, vdate2, vdate3};

	vdate[0].day = 18;
	vdate[0].month = 10;
	vdate[0].year = 1999;
      
	vdate[1].day = 10;
	vdate[1].month = 8;
	vdate[1].year = 1990; 

	vdate[2].day = 12; 
	vdate[2].month = 1;
	vdate[2].year = 2000; 


	for(int i = 0; i < 3; i++){
		cout << vdate[i].day << "-"<< vdate[i].month << "-" << vdate[i].year << endl;
	 }


}
