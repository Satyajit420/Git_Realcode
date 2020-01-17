import java.util.ArrayList;
import java.util.List;

public class ARY {

	public static void main(String[] args) {
		List l= new ArrayList();
		l.add("A");
		l.add("B");
		l.add("C");
		
		System.out.println(l);
		Object [] d=l.toArray();
		String [] s= new String[l.size()];
		
		String [] z=(String[]) l.toArray(s);
		
		
		
		
		
		
		for(Object f:d)
		{
			System.out.println(f);
		}
		

	}

}
