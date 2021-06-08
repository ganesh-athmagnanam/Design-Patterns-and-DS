package designpatterns;

class SingletonDesign{
	private static SingletonDesign holder=null;
	public String someValue;
	private SingletonDesign() {
		someValue="from cons";
	}
	public static SingletonDesign getHolder() {
		if(holder==null) {
			holder=new SingletonDesign();
			return holder;
		}
		else
		return holder;
	}
}
public class Singleton {
	public static void main(String[] args) {
		SingletonDesign s1=SingletonDesign.getHolder();
		SingletonDesign s2=SingletonDesign.getHolder();
		s1.someValue=s1.someValue.toUpperCase();
		System.out.println(s1.someValue);
		//due to singleton nature the same value..
		System.out.println(s2.someValue);
	}
}
