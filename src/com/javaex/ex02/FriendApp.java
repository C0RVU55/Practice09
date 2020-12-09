package com.javaex.ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {

		List<Friend> fList = new ArrayList<Friend>(); // 처음에 <String>했는데 Friend 넣을 거니까 <Friend>

		Scanner sc = new Scanner(System.in);
		System.out.println("친구를 3명 등록해 주세요.");

		for (int i = 0; i < 3; i++) {
			String f = sc.nextLine();
			String[] fArr = f.split(" "); // 매번 값 받아서 나누고 Friend클래스에 대입
			Friend ff = new Friend(fArr[0], fArr[1], fArr[2]);
			fList.add(ff);
		}
		for (int i = 0; i < fList.size(); i++) {
			fList.get(i).showInfo();
		}

		sc.close();
	}

}
