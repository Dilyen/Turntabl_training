#include <iostream>
#include <string>
#include <vector>

using namespace std;

struct Date {
   int year;
   int month;
   int day;
};

void formatDate(int day, int month, int year){
	string my_month, my_day;

	switch(month){		            
		case 1:	            
			my_month = "January";					              
			break;						            
		case 2:						               
			my_month = "February";							                
			break;									      
		case 3:									         
			my_month = "March";										          
			break;											        
		case 4:											           
			my_month = "April";												            
			break;													          
		case 5:													             
			my_month = "May";														              
			break;															            
		case 6:														               
			my_month = "June";														                
			break;																	      
		case 7:																         
			my_month = "July";											          
			break;															        
		case 8:																           
			my_month = "August";														            
			break;														          
		case 9:												             
			my_month = "September";														              
			break;													             
		case 10:									               
			my_month = "October";									                
			break;																	       
		case 11:																         
			my_month = "November";					          
			break;															
		default:															           
			my_month = "December";
			break;
	};
	
	switch (day) {
		case 1: 
			my_day = "st";					     
			break;						       
		case 2:						          
			my_day = "nd";							           
			break;								         
		case 3:								            
			my_day = "rd";									             
			break;										           
		default:										              
			my_day = "th";											               
			break;												           
	};
    	cout << "==========Date in a nice format========" << endl;	
	cout << day << my_day <<" " << my_month  << " " << year << endl;
	        
}

void printLaterDate(){
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
}


void currentDate(){
	//=======Conditional Flow==================================================
        cout << "==========Conditional flow===============" << endl;

        //====Comparing User date and current Date=============================

        int u_day, u_month, u_year;

        cout << "Please Enter numbers for Date in format ===day month year===: ";
        cin >> u_day >> u_month >> u_year;

        //User date
        Date u_date;
        u_date.day = u_day;
        u_date.month = u_month;
        u_date.year = u_year;

        //Current Date
        Date c_date;
        c_date.day = 19;
        c_date.month = 10;
        c_date.year = 2019;
        cout << "Current date: " << c_date.day << "-" << c_date.month << "-" << c_date.year << endl;
        cout << "Your date: " << u_date.day << "-" << u_date.month << "-" << u_date.year << endl;

        if(u_date.year > c_date.year){
                cout << "Your date is after current Date" << endl;
        }else if(c_date.year > u_date.year){
                cout << "Your Date is before current" << endl;
        }else{
                if(u_date.month > c_date.month){
                        cout<< "Your date is after current date" << endl;
                }else if(c_date.month > u_date.month){
                        cout << "Your date is before current date" << endl;
                }else{
                        if(u_date.day > c_date.day){
                                cout << "Your date is after current date" << endl;
                        }else{
				cout << "Your date is before current date" << endl << endl;
                        }
                }
        }

        //====Checking if Leap Year=============================================
        string leap_year = ((u_date.year % 4) == 0) ? "Date is a leap Year" : "Date is not a leap Year";
        cout << leap_year << endl << endl;

        //==========Print formatted Date================
        formatDate(1, 10, 2019);
}



