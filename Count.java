public class ObjectCounter{
	private static int count=0;

	public ObjectCounter(){
		count++;
	}
	public static int getCount(){
		return Count;
	}
	public static void main(){
		ObjectCounter a=new ObjectCounter();
		ObjectCounter b=new ObjectCounter();
		ObjectCounter c=new ObjectCounter();
		System.out.println("No of objects created were:"+c.getCount());
	}
}