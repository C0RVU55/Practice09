package com.javaex.ex04;

import java.util.ArrayList;
import java.util.List;

public class ShapeApp2 {

	public static void main(String[] args) {
		// 문제풀이용

		Shape Rectangle = new Rectangle(5, 6);
		Shape RecTriangle = new RectTriangle(6, 2);

		List<Shape> sList = new ArrayList<Shape>();

		sList.add(RecTriangle);
		sList.add(Rectangle);

		for (int i = 0; i < sList.size(); i++) {
			System.out.println("area: " + sList.get(i).getArea());
			System.out.println("perimeter: " + sList.get(i).getPerimeter());

			if (sList.get(i) instanceof Resizeable) { // instanceof 해당 데이터타입인지 아닌지 검사
				((Resizeable)sList.get(i)).resize(0.5); // resize 쓸 수 있게 형변환하고 괄호주의
				
				System.out.println("new area: " + sList.get(i).getArea());
				System.out.println("new perimeter: " + sList.get(i).getPerimeter());
			}

		}

	}

}
