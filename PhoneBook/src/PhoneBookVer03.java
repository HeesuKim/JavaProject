/*
 * ��ȭ��ȣ ���� ���α׷� ���� ������Ʈ
 * Version 0.3
 */

import java.util.Scanner;

class MenuViewer {
	public static Scanner keyboard = new Scanner(System.in);
	
	public static void showMenu() {
		System.out.println("�����ϼ���...");
		System.out.println("1. ������ �Է�");
		System.out.println("2. ������ �˻�");
		System.out.println("3. ������ ����");
		System.out.println("4. ���α׷� ����");
		System.out.print("���� : ");
	}
}

/*class PhoneBookManager {
	final int MAX_CNT = 100;
	PhoneInfo[] infoStorage = new PhoneInfo[MAX_CNT];
	int curCnt = 0;
	
	public void inputData() {
		System.out.println("������ �Է��� �����մϴ�..");
		System.out.print("�̸� : ");
		String name = MenuViewer.keyboard.nextLine();
		System.out.print("��ȭ��ȣ : ");
		String phone = MenuViewer.keyboard.nextLine();
		System.out.print("������� : ");
		String birth = MenuViewer.keyboard.nextLine();
		
		infoStorage[curCnt++] = new PhoneInfo(name, phone, birth);
		System.out.println("������ �Է��� �Ϸ�Ǿ����ϴ�.");
	}
	
	public int search(String name) {
		for (int idx = 0; idx < curCnt; idx++) {
			PhoneInfo curInfo = infoStorage[idx];
			if(name.compareTo(curInfo.name) == 0)
				return idx;
		}
		return -1;
	}
	
	public void searchData() {
		System.out.println("������ �˻��� �����մϴ�.");
		
		System.out.print("�̸� : ");
		String name = MenuViewer.keyboard.nextLine();
		
		int dataIdx = search(name);
		if (dataIdx < 0) {
			System.out.println("�ش� �����Ͱ� �������� �ʽ��ϴ�.\n");
		} else {
			infoStorage[dataIdx].showPhoneInfo();
			System.out.println("������ �˻��� �Ϸ�Ǿ����ϴ�.\n");
		}
	}
	
	public void deleteData() {
		System.out.println("������ ������ �����մϴ�..");
		
		System.out.print("�̸� : ");
		String name = MenuViewer.keyboard.nextLine();
		
		int dataIdx = search(name);
		if (dataIdx < 0) {
			System.out.println("�ش� �����Ͱ� �������� �ʽ��ϴ�.\n");
		} else {
			for (int idx = dataIdx; idx < curCnt - 1; idx++)
				infoStorage[idx] = infoStorage[idx + 1];
			
			curCnt--;
			System.out.println("������ ������ �Ϸ�Ǿ����ϴ�.\n");
		}
	}
}*/

public class PhoneBookVer03 {
	public static void main(String args[]) {
		PhoneBookManager manager = PhoneBookManager.createManagerInst();
		int choice;
		
		while(true) {
			MenuViewer.showMenu();
			choice = MenuViewer.keyboard.nextInt();
			MenuViewer.keyboard.nextLine();
			
			switch(choice) {
			case 1 :
				//manager.inputData();
				break;
			case 2 :
				manager.searchData();
				break;
			case 3 :
				manager.deleteData();
				break;
			case 4 :
				System.out.println("���α׷��� �����մϴ�.");
				return;
			}
		}
	}
}