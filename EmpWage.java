public class Empwage{
public static void main (String[] args){
System.out.println(" Welcome To Emloyee Wage");
int IS_FULL_TIME = 1;
double empCheck = Math.floor(Math.random()*10)%2;
	// checking the presence of Employee
if ( empCheck == IS_FULL_TIME )
	System.out.println( " Employee is Present ");
else
	System.out.println(" Employee is Absent ");
}
}
