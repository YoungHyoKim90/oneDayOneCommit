//package M2024_02;
//
//import javax.servlet.http.HttpSession;
//import javax.servlet.http.HttpSessionEvent;
//import javax.servlet.http.HttpSessionListener;
//
//public class SessionListener implements HttpSessionListener {
//
//    @Override
//    public void sessionCreated(HttpSessionEvent event) {
//        HttpSession session = event.getSession();
//        System.out.println("세션이 생성되었습니다. ID: " + session.getId());
//    }
//
//    @Override
//    public void sessionDestroyed(HttpSessionEvent event) {
//        HttpSession session = event.getSession();
//        System.out.println("세션이 파괴되었습니다. ID: " + session.getId());
//        // 세션이 파괴되었을 때 추가 작업을 수행할 수 있습니다.
//        // 예: 로그아웃 처리, 세션 정보 정리 등
//    }
//}
//
