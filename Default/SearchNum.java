
public class SearchNum {
public static void main(String[] args) {
	int [] a= {1,3,4,5,6};
	int t=5;
	for(int i=0;i<a.length;i++) {
		if(a[i]==t) {
			System.out.println("found index :"+i);
		}
	}
}
}
