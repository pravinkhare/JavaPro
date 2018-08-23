class UnaryOP{
	public static void main(String[]args){
	int temp=23;
	int atemp=-23;
	int btemp=-(-23);
	int a=5,b=11;
	System.out.println(++temp);//24
	System.out.println(++atemp);//-22
	System.out.println(btemp);//23
	System.out.println(a++);//5
	System.out.println(--a);//5
	System.out.println(a+=a);
	System.out.println(a);
	System.out.println(a-=b);
}

}