class Fact{
  public static void main(String...args){
	Fact f=new Fact();
	for(int i=1;i<=10;i++){
	int res=f.fact(i);
	System.out.println(i+"!="+res);
	}
  }
  int fact(int n){
    if(n==1)
	return 1;
	int x=n*fact(n-1);
	return x;
  }
}
