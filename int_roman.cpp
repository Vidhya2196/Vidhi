#include <iostream>
using namespace std;
int main()
{
	//Type in an integer between 1 and 4000
	int numToConvert;
	cout << "Enter an integer between 1 and 4000";
	cin >> numToConvert;
	int th,h,t,o;
	char thousands[] = {"", "M", "MM", "MMM", "MMMM"};
	char hundreds[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
	char tens[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
	char ones[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
	if (numToConvert<=4000){
		int romanNumber;
		th = numToConvert / 1000;
		numToConvert = numToConvert % 1000;
		h = numToConvert % 100;
		t = numToConvert / 10;
		o = numToConvert % 10;
		romanNumber = romanNumber + thousands[th] + hundreds[h] + tens[t] + ones[o];
		cout << "The roman number for this integer is " << romanNumber;
	}
	else
	{
		cout << "Invalid number, please enter a new number between 1 and 4000";
		return 0;
	}
}
