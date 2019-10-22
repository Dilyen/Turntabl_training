#include <iostream>


int main(){
   int x, y, result;
   std::cout << "Enter two nubers: " ;
   std::cin >> x >> y ;
   
   result = x * y ;
   std::cout << x << "*" << y  << "="<< result << std::endl;
   if(result > 100){
      std::cout<< "HIGH" << std::endl;
   }else{
      std::cout<< "LOW" << std::endl;
   }

}
