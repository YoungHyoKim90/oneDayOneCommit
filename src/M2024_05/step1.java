package M2024_05;

public class step1 {

}
/*
 * 자바란?
 */

/*
 * 보안 내용 정리하기
 */

/*
 * 파이썬 USB 보안 프로그램 import win32file import win32event import win32con import os
 * def monitor_usb(): hDir = win32file.CreateFile( "C:\\",
 * win32con.FILE_LIST_DIRECTORY, win32con.FILE_SHARE_READ |
 * win32con.FILE_SHARE_WRITE | win32con.FILE_SHARE_DELETE, None,
 * win32con.OPEN_EXISTING, win32con.FILE_FLAG_BACKUP_SEMANTICS, None )
 * while True: results = win32file.ReadDirectoryChangesW( hDir, 1024, True,
 * win32con.FILE_NOTIFY_CHANGE_FILE_NAME | win32con.FILE_NOTIFY_CHANGE_DIR_NAME
 * | win32con.FILE_NOTIFY_CHANGE_ATTRIBUTES | win32con.FILE_NOTIFY_CHANGE_SIZE |
 * win32con.FILE_NOTIFY_CHANGE_LAST_WRITE |
 * win32con.FILE_NOTIFY_CHANGE_SECURITY, None, None )
 * for action, file in results: if action == 3: # USB 디바이스가 추가되었을 때 usb_path =
 * f"E:\\{file}" # E: 드라이브로 가정 if os.path.exists(os.path.join(usb_path,
 * "recognition_program.exe")):
 * print(f"Authorized USB device connected: {file}") else:
 * print(f"Unauthorized USB device connected: {file}") # USB 디바이스를 제거하는 코드 추가 가능
 * if __name__ == "__main__": monitor_usb()
 * 입력-처리-저장-전송-출력
 * 이 다섯가지 뼈대가 되는 과정을 어떻게 구성하느냐
 * 가 코딩할 때 실제로 하는 일이다.
 * 입력
 * 키보드, 마우스, 센서, 시스템에서 발생하는 이벤트, 네트워크를 통한 요청 등
 * 출력
 * 모니터, 액정화면, 종이, 물체, 소리 등으로 출력이 가능
 * 처리
 * 연산, 판단, 반복 등 컴퓨터가 잘하는 일
 * 저장
 * 프로그램에 입력, 처리된 데이터를 파일이나 데이터베이스에 담는 과정
 * 전송
 * 물리적으로 떨어진 시스템끼리 정해진 회선을 통해 데이터를 주고받는 과정
 * 명령구문 사람이 기술하는 명령의 단위
 * [예시]
 * int a = 0;
 * int result;
 * result = a+3;
 * 중괄호 명령구문들을 묶어 실행 단위를 만드는 기호
 * [예시]
 * 
 * public int sum(int a, int b) {
 * 
 * return a+b;
 * 
 * }
 */