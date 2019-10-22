#include <iostream>
#include <string>
#include <vector>

using namespace std;

struct Date {
   int year;
   int month;
   int day;
};

int main(){
	//======Birth Date===================================
	Date d{};
	d.year = 1996;
	d.month = 9;
	d.day = 11;
	cout << "Birth date: "<< d.year << " -" << d.month << "-" << d.day << endl <<endl;

	
	//======Printing Later Date from two dates=======================
  	Date d1{};
   	d1.year = 2019;
   	d1.month = 10;
   	d1.day = 18;
   	string mydate1 = to_string(d1.year) + "-" + to_string(d1.month) + "-" + to_string(d1.day);

   	Date d2{};
   	d2.year = 2018;
   	d2.month = 10;
   	d2.day  = 18;
   	string mydate2 = to_string(d2.year) + "-" + to_string(d2.month) + "-" + to_string(d2.day);

	cout << "Comparing " << mydate1 << " and " << mydate2 << endl;
	cout << "==========Later in time===================" << endl;

	if(d1.year > d2.year){
		cout << "Later Date: " << mydate1 << endl;
	}else if(d2.year > d1.year){
		cout << "Later Date: " << mydate2 << endl;
	}else{
		if(d1.month > d2.month){
			cout << "Later Date: " << mydate1 << endl;
		}else if(d2.month > d1.month){
			cout << "Later Date: " << mydate2 << endl;
		}else{
			if(d1.day > d2.day){
				cout << "Later Date: " << mydate1 << endl;
			}else{
				cout << "Later date " << mydate2 << endl;
	
			}
		}
	}


	//========= Vector of Three Date Objects===================================
	cout << endl;

	Date vdate1, vdate2, vdate3;
	vdate1.year = 1996;
	vdate2.year = 2014;
       	vdate3.year = 2020;
	
	vector <Date> vdate{vdate1, vdate2, vdate3};
	cout << "Year of Second Vector Element: " << vdate[1].year << endl << endl;	

	//========= representng 28th Feb 1984 ====================================
	vdate[1].year = 1984;
       	vdate[1].month  = 2;
	vdate[1].day = 28;


	//======== Date pointer Example ===========================================
	Date date, *dateptr;
	date.year = 2000;
	date.month = 12;
	date.day = 31;

	dateptr = {&date};
	
	dateptr -> year = 1997;
	cout << dateptr -> year << endl;

}


