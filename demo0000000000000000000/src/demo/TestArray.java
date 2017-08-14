package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class TestArray {

	public static void main(String[] args) {
		List<Integer> list =new ArrayList<>();
		CopyOnWriteArrayList<Integer> cowl=new CopyOnWriteArrayList<>();
		cowl.add(1);
		cowl.add(2);
		cowl.add(3);
		System.out.println(cowl);
	}
}
