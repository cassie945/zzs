package com.lansaipu.homework;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ShuChuGeShu {
	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		// ʹ��Scanner���ܴӼ��̵�����
		System.out.println("������һ���ַ���");
		String str = t.nextLine();
		// �Ӽ��̽������������
		Map<Character, Integer> tree = new TreeMap<Character, Integer>();
		// ����TreeMap������ĳ���ַ����ֵĴ���
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (!tree.containsKey(ch))
			// �����һ�γ��֣����ʼΪ1
			{
				tree.put(ch, 1);
			} else {
				int auto = tree.get(ch) + 1;
				// ������������Ѵ��ڣ�����ԭ���Ļ�����+1
				tree.put(ch, auto);
			}
		}
		// ʹ��Iterator,����������
		Iterator<Character> iter = tree.keySet().iterator();
		while (iter.hasNext()) {
			// ����ַ�������Ϣ
			char temp = iter.next();
			// ���ÿ���ַ����ֵĴ���
			System.out.println("��ĸ'" + temp + "' ����" + tree.get(temp) + "�Ρ�");
		}
	}

}
