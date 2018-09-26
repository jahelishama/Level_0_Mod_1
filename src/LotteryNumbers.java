import java.util.Random;

public class LotteryNumbers {
public static void main(String[] args) {
	Random r = new Random();
	int i = r.nextInt(100);
	System.out.println(i);
	
	Random a = new Random();
	i = a.nextInt(50);
	System.out.println(i);
	
	Random n =new Random();
	i = n.nextInt(150);
	System.out.println(i);
	
	Random d =new Random();
	i = d.nextInt(300);
	System.out.println(i);
	
	Random o =new Random();
	i = o.nextInt(4);
	System.out.println(i);
}
}
