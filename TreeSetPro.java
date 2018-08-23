import java.util.*;
class Student implements Comparable{
	int rollNo;
	double marks;
	public Student(int rollNo,double marks){
		this.rollNo=rollNo;
		this.marks=marks;
	}
	
	public int compareTO(Object obj){
	  int m1=this.rollNo;
	  Student stud=(Student)obj;
	  int m2=stud.rollNo;
	 }
	
	public String toString(){
		return rollNo+" : "+marks;
	}
}
public class TreeSetPro {
   public static void main(String args[]){
	  TreeSet<Student> ts=new TreeSet<Student>();
	  ts.add(new Student(11,88.33));
	  ts.add(new Student(12,66.15));
	  ts.add(new Student(13,99.46));
	  sSystem.out.println("Set :"+ts);
  }
