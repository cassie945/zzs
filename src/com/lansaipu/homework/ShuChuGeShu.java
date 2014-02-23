package com.lansaipu.homework;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ShuChuGeShu {
	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		// 使用Scanner接受从键盘的输入
		System.out.println("请输入一段字符：");
		String str = t.nextLine();
		// 从键盘接受输入的数据
		Map<Character, Integer> tree = new TreeMap<Character, Integer>();
		// 利用TreeMap来保存某个字符出现的次数
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (!tree.containsKey(ch))
			// 如果第一次出现，则初始为1
			{
				tree.put(ch, 1);
			} else {
				int auto = tree.get(ch) + 1;
				// 如果在容器中已存在，则在原来的基础上+1
				tree.put(ch, auto);
			}
		}
		// 使用Iterator,方便遍历输出
		Iterator<Character> iter = tree.keySet().iterator();
		while (iter.hasNext()) {
			// 获得字符对象信息
			char temp = iter.next();
			// 输出每个字符出现的次数
			System.out.println("字母'" + temp + "' 出现" + tree.get(temp) + "次。");
		}
	}

}
