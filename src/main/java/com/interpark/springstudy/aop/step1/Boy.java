package com.interpark.springstudy.aop.step1;

public class Boy {
	public void housework() {
		System.out.println("����� ���� ���� ���� ����.");

		try {
			System.out.println("��ǻ�ͷ� ������ �Ѵ�.");
		} catch (Exception ex) {
			if (ex.getMessage().equals("���� �ҳ�")) {
				System.out.println("119 �� �Ű��Ѵ�.");
			}
		} finally {
			System.out.println("�ҵ��ϰ� �ܴ�.");
		}

		System.out.println("�ڹ��踦 ��װ� ���� ������.");
	}

}
