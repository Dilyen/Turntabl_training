#include <iostream>

int getnum(){
   int a;
   std::cout << "Please Enter a Number: ";
   std::cin >> a ;
   return a; 
}

int main(){
   int num1 = getnum();
   int num2 = getnum();

   for(int i = 0; i <= 2; i++){
    std::cout << "sum "<< i+1  << ": " << num1 + num2 << std::endl;
   }
}

