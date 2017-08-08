/*
 * ��ȭ��ȣ ���� ���α׷� ���� ������Ʈ
 * Version 0.5
 */


interface INIT_MENU { int INPUT = 1, SEARCH = 2, DELETE = 3, EXIT = 4; }
interface INPUT_SELECT { int NORMAL = 1, UNIV = 2, COMPANY = 3; }

/*class PhoneBookManager {
	final int MAX_CNT = 100;
	PhoneInfo[] infoStorage = new PhoneInfo[MAX_CNT];
	int curCnt = 0;
	
	static PhoneBookManager inst = null;
	public static PhoneBookManager createManagerInst() {
		if(inst == null)
			inst = new PhoneBookManager();
		
		return inst;
	}
	
	private PhoneBookManager() {}
	
	@SuppressWarnings("unused")
	private PhoneInfo readFriendInfo() {
		System.out.print("�̸� :");
		String name = MenuViewer.keyboard.nextLine();
		System.out.print("��ȭ��ȣ : ");
		String phone = MenuViewer.keyboard.nextLine();
		
		return new PhoneInfo(name, phone);
	}
	
	@SuppressWarnings("unused")
	private PhoneInfo readUnivFriendInfo() {
		System.out.print("�̸� :");
		String name = MenuViewer.keyboard.nextLine();
		System.out.print("��ȭ��ȣ : ");
		String phone = MenuViewer.keyboard.nextLine();
		System.out.print("���� : ");
		String major = MenuViewer.keyboard.nextLine();
		System.out.print("�г� : ");
		int year = MenuViewer.keyboard.nextInt();
		MenuViewer.keyboard.nextLine();
		
		return new PhoneUnivInfo(name, phone, major, year);
	}
	
	@SuppressWarnings("unused")
	private PhoneInfo readCompanyFriendInfo() {
		System.out.print("�̸� :");
		String name = MenuViewer.keyboard.nextLine();
		System.out.print("��ȭ��ȣ : ");
		String phone = MenuViewer.keyboard.nextLine();
		System.out.print("ȸ�� : ");
		String company = MenuViewer.keyboard.nextLine();
		
		return new PhoneCompanyInfo(name, phone, company);
	}
	
	public void inputData() {
		System.out.println("������ �Է��� �����մϴ�..");
		System.out.println("1. �Ϲ�, 2. ����, 3. ȸ��");
		System.out.print("���� >> ");
		int choice = MenuViewer.keyboard.nextInt();
		MenuViewer.keyboard.nextLine();
		PhoneInfo info = null;
		
		switch(choice) {
		case INPUT_SELECT.NORMAL :
			info = readFriendInfo();
			break;
		case INPUT_SELECT.UNIV:
			info = readUnivFriendInfo();
			break;
		case INPUT_SELECT.COMPANY:
			info = readCompanyFriendInfo();
			break;
		}
		infoStorage[curCnt++] = info;
		System.out.println("������ �Է��� �Ϸ�Ǿ����ϴ�. \n");
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

public class PhoneBookVer05 {
	public static void main(String[] args) {
		PhoneBookManager manager = PhoneBookManager.createManagerInst();
		int choice;
		
		while(true) {
			MenuViewer.showMenu();
			choice = MenuViewer.keyboard.nextInt();
			MenuViewer.keyboard.nextLine();
			
			switch(choice) {
			case INIT_MENU.INPUT :
				//manager.inputData();
				break;
			case INIT_MENU.SEARCH :
				manager.searchData();
				break;
			case INIT_MENU.DELETE :
				manager.deleteData();
				break;
			case INIT_MENU.EXIT :
				System.out.println("���α׷��� �����մϴ�.");
				return;
			}
		}
	}
}
