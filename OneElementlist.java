package lesson.demo;


public class OneElementlist {

	public static void main(String[] args) {
		int list[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32};
		
	System.out.println(f(list.length));
		
	}
	static int count = 0;
	private static int f(int i) {
		i =i/2;
		if (i==0) {
			return count;
		}
		else
		{
			count++;
			f(i);
		}
		return count;
	}

}
