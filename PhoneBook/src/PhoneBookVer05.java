/*
 * 전화번호 관리 프로그램 구현 프로젝트
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
		System.out.print("이름 :");
		String name = MenuViewer.keyboard.nextLine();
		System.out.print("전화번호 : ");
		String phone = MenuViewer.keyboard.nextLine();
		
		return new PhoneInfo(name, phone);
	}
	
	@SuppressWarnings("unused")
	private PhoneInfo readUnivFriendInfo() {
		System.out.print("이름 :");
		String name = MenuViewer.keyboard.nextLine();
		System.out.print("전화번호 : ");
		String phone = MenuViewer.keyboard.nextLine();
		System.out.print("전공 : ");
		String major = MenuViewer.keyboard.nextLine();
		System.out.print("학년 : ");
		int year = MenuViewer.keyboard.nextInt();
		MenuViewer.keyboard.nextLine();
		
		return new PhoneUnivInfo(name, phone, major, year);
	}
	
	@SuppressWarnings("unused")
	private PhoneInfo readCompanyFriendInfo() {
		System.out.print("이름 :");
		String name = MenuViewer.keyboard.nextLine();
		System.out.print("전화번호 : ");
		String phone = MenuViewer.keyboard.nextLine();
		System.out.print("회사 : ");
		String company = MenuViewer.keyboard.nextLine();
		
		return new PhoneCompanyInfo(name, phone, company);
	}
	
	public void inputData() {
		System.out.println("데이터 입력을 시작합니다..");
		System.out.println("1. 일반, 2. 대학, 3. 회사");
		System.out.print("선택 >> ");
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
		System.out.println("데이터 입력이 완료되었습니다. \n");
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
		System.out.println("데이터 검색을 시작합니다.");
		
		System.out.print("이름 : ");
		String name = MenuViewer.keyboard.nextLine();
		
		int dataIdx = search(name);
		if (dataIdx < 0) {
			System.out.println("해당 데이터가 존재하지 않습니다.\n");
		} else {
			infoStorage[dataIdx].showPhoneInfo();
			System.out.println("데이터 검색이 완료되었습니다.\n");
		}
	}
	
	public void deleteData() {
		System.out.println("데이터 삭제를 시작합니다..");
		
		System.out.print("이름 : ");
		String name = MenuViewer.keyboard.nextLine();
		
		int dataIdx = search(name);
		if (dataIdx < 0) {
			System.out.println("해당 데이터가 존재하지 않습니다.\n");
		} else {
			for (int idx = dataIdx; idx < curCnt - 1; idx++)
				infoStorage[idx] = infoStorage[idx + 1];
			
			curCnt--;
			System.out.println("데이터 삭제가 완료되었습니다.\n");
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
				System.out.println("프로그램을 종료합니다.");
				return;
			}
		}
	}
}
