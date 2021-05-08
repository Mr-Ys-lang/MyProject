import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

import static org.junit.Assert.*;

public class test2Test {

	@Test
	public void selectPage() {
		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		for(String temp : list){
			System.out.println(temp);
			if("3".equals(temp)){
				list.remove(temp);
			}
		}

	}
	@Test
	public void selectPage2() {
		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		Iterator<String> it = list.iterator();
		while (it.hasNext()){
			String temp = it.next();
			System.out.println(temp);
			if("3".equals(temp)){
				it.remove();
			}
		}
		System.out.println(list);
	}
}