package M2024_05;

public class step1 {

}
/* 자바란? 
*/

/* 보안 내용 정리하기
*/

/*파이썬  USB 보안 프로그램
import win32file
import win32event
import win32con
import os

def monitor_usb():
    hDir = win32file.CreateFile(
        "C:\\",
        win32con.FILE_LIST_DIRECTORY,
        win32con.FILE_SHARE_READ | win32con.FILE_SHARE_WRITE | win32con.FILE_SHARE_DELETE,
        None,
        win32con.OPEN_EXISTING,
        win32con.FILE_FLAG_BACKUP_SEMANTICS,
        None
    )

    while True:
        results = win32file.ReadDirectoryChangesW(
            hDir,
            1024,
            True,
            win32con.FILE_NOTIFY_CHANGE_FILE_NAME |
            win32con.FILE_NOTIFY_CHANGE_DIR_NAME |
            win32con.FILE_NOTIFY_CHANGE_ATTRIBUTES |
            win32con.FILE_NOTIFY_CHANGE_SIZE |
            win32con.FILE_NOTIFY_CHANGE_LAST_WRITE |
            win32con.FILE_NOTIFY_CHANGE_SECURITY,
            None,
            None
        )

        for action, file in results:
            if action == 3:  # USB 디바이스가 추가되었을 때
                usb_path = f"E:\\{file}"  # E: 드라이브로 가정
                if os.path.exists(os.path.join(usb_path, "recognition_program.exe")):
                    print(f"Authorized USB device connected: {file}")
                else:
                    print(f"Unauthorized USB device connected: {file}")
                    # USB 디바이스를 제거하는 코드 추가 가능

if __name__ == "__main__":
    monitor_usb()

*/