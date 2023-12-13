package M2023_12;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class SessionManager {
    private static Map<String, String> sessionStore = new HashMap<>();

    public static String login(String username, String password) {
        // 사용자가 제공한 사용자 이름과 비밀번호를 확인하여 인증
        if (isValidUser(username, password)) {
            String sessionId = generateSessionId();
            sessionStore.put(sessionId, username);
            return sessionId; // 세션 ID 반환
        }
        return null; // 인증 실패 시 null 반환
    }

    public static boolean isValidSession(String sessionId) {
        return sessionStore.containsKey(sessionId);
    }

    public static String getUsernameBySessionId(String sessionId) {
        return sessionStore.getOrDefault(sessionId, null);
    }

    public static void logout(String sessionId) {
        sessionStore.remove(sessionId);
    }

    private static boolean isValidUser(String username, String password) {
        // 실제 사용자의 인증을 여기서 수행
        // 예시로 고정된 사용자 데이터베이스를 사용하여 인증
        return username.equals("user") && password.equals("password");
    }

    private static String generateSessionId() {
        return UUID.randomUUID().toString(); // 랜덤한 세션 ID 생성
    }

    public static void main(String[] args) {
        // 로그인 예시
        String sessionId = login("user", "password");
        if (sessionId != null) {
            System.out.println("로그인 성공! 세션 ID: " + sessionId);

            // 세션 유효성 검사
            if (isValidSession(sessionId)) {
                String username = getUsernameBySessionId(sessionId);
                System.out.println("현재 로그인된 사용자: " + username);
            }

            // 로그아웃 예시
            logout(sessionId);
            System.out.println("로그아웃 완료!");
        } else {
            System.out.println("로그인 실패!");
        }
    }
}

