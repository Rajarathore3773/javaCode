
public class VarAarguements {
	static int sum(int x,int ...arg) {
		
		int result=x;
		for(int arr:arg) {
			result +=arr;
		}
		return result;
	}
	public static void main(String[] args) {
System.out.println(sum(1,2,4,6,87));
System.out.println(sum(1,2,3,4,5));
	}
}
