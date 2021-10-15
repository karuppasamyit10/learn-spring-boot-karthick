package com.example.demo.application;


import java.util.*;

class Detail{
public String ename;
public int salary;
public int eno;
public Detail(int eno,int salary,String ename)
{
this.eno=eno;
this.salary=salary;
this.ename=ename;
}public int getEmpno(){
	return eno;
	}

	

public String toString(){
	return ename+" "+ eno+" "+salary;
}

}
public class Demo
{
public static void main(String args[]){
Scanner s =new Scanner(System.in);
Scanner s1 =new Scanner(System.in);
List<Detail> c=new ArrayList<Detail>();
int ch;
do{
System.out.println("1.Insert :");
System.out.println("2.Display :");
System.out.println("3.Search:");
System.out.println("4.Update :");
System.out.println("5.Delete :");
System.out.println("Enter your choice:");
ch=s.nextInt();
switch(ch){
case 1:

System.out.println("Enter empno:");
int eno=s.nextInt();
System.out.println("Enter salary:");
int salary=s.nextInt();
System.out.println("Enter name:");
String ename=s1.nextLine();
c.add(new Detail(eno,salary,ename));
break;
	
case 2:
	System.out.println("--------------------------");
	Iterator<Detail> i=c.iterator();
	while(i.hasNext()){
		Detail e=i.next();
		System.out.println(e);
	}
	System.out.println("--------------------------");
break;
case 3:
	System.out.println("--------------------------");
	boolean b=true;
	int empno;
	System.out.println("enter empno");
	empno=s.nextInt();
	i=c.iterator();
	while(i.hasNext()){
		Detail e=i.next();
		if(e.getEmpno() == empno)
		{
			System.out.println(e);
			b=true;	
		}	
	}
	if(!b){
		System.out.println("Record not found");
	}
	
	break;
case 4:
	System.out.println("--------------------------");
	 b=false;
	
	System.out.println("enter empno to delete:");
	empno=s.nextInt();
	i=c.iterator();
	while(i.hasNext()){
		Detail e=i.next();
		if(e.getEmpno() == empno)
		{
			i.remove();
			b=true;	
		}	
	}
	if(!b){
		System.out.println("Record not found");
	}
	else{
		System.out.println("Record deleted SuccessFully");
	}
	
	break;
case 5:
	System.out.println("--------------------------");
	 b=false;
	
	System.out.println("enter empno to Update:");
	empno=s.nextInt();

ListIterator<Detail> li=c.listIterator();
	while(li.hasNext()){
		Detail e=li.next();
		if(e.getEmpno() == empno)
		{
			System.out.println("Enter the new name");
			ename=s1.nextLine();

			System.out.println("Enter the new salary");
			salary=s.nextInt();
	
			 li.set(new Detail(empno,salary,ename));
			b=true;	
		}	
	}
	if(!b){
		System.out.println("Record not found");
	}
	else{
		System.out.println("Record Updated SuccessFully");
	}
	
	break;
}
}while(ch!=0);
s.close();
s1.close();
}
}

