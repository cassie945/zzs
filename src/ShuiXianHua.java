public class ShuiXianHua {
	public static void main(String[] args) {
		int[] score = { 55, 7, 89, 3, 70, 44 };//�����Դ���Ϊint[] score=new int[5]
		int max = score[0];
		int min = score[0];
		for (int a = 1; a < score.length; a++) {
			if (score[a] > max) {
				max = score[a];
			}
			if (score[a] < min) {
				min = score[a];
			}
		}
		System.out.println("���ֵ" + max);
		System.out.println("��Сֵ" + min);
	}
}
