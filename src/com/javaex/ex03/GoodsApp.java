package com.javaex.ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodsApp {

	public static void main(String[] args) {

		int sum = 0;

		Scanner sc = new Scanner(System.in);

		List<Goods> gList = new ArrayList<Goods>();

		System.out.println("상품을 입력해 주세요(종료 q)");

		while (true) {
			String g = sc.nextLine();

			if (g.equals("q")) {
				System.out.println("[입력완료]\n===================");
				break;
			} else {
				String[] gArr = g.split(",");
				Goods goods = new Goods(gArr[0], Integer.parseInt(gArr[1]), Integer.parseInt(gArr[2]));
				gList.add(goods);
			}
		}

		for (int i = 0; i < gList.size(); i++) {
			gList.get(i).stock();
		}
		for (int i = 0; i < gList.size(); i++) {
			sum=sum+gList.get(i).getCount();
		}
		System.out.println("모든 상품의 개수는 "+sum+"개입니다.");

		sc.close();

	}

}
