#include<iostream.h>
#include<conio.h>
void main()
{
	int n,fact;
	int rec(int); clrscr();
	cout<<"Enter the number:->";
	cin>>n;
	fact=rec(n);
	cout<<endl<<"Factorial Result are:: "<<fact<<endl;
	getch();
}
rec(int x)
{
	int f;
	if(x==1)
		return(x);
	else
	{
		f=x*rec(x-1);
		return(f);
	}
}
