package M2024_06;

import java.util.ArrayList;
import java.util.List;

public class EventManager {
    private List<Event> events;

    public EventManager() {
        this.events = new ArrayList<>();
    }

    public void createEvent(String title, String date) {
        Event event = new Event(title, date);
        events.add(event);
        System.out.println(title + " 이벤트가 생성되었습니다.");
    }

    public void updateEvent(int eventId, String title, String date) {
        for (Event event : events) {
            if (event.getId() == eventId) {
                event.setTitle(title);
                event.setDate(date);
                System.out.println(eventId + "번 이벤트가 업데이트되었습니다.");
                return;
            }
        }
        System.out.println("해당 이벤트를 찾을 수 없습니다.");
    }

    public void deleteEvent(int eventId) {
        events.removeIf(event -> event.getId() == eventId);
        System.out.println(eventId + "번 이벤트가 삭제되었습니다.");
    }

    public void addParticipant(int eventId, String participantName) {
        for (Event event : events) {
            if (event.getId() == eventId) {
                event.addParticipant(participantName);
                System.out.println(participantName + "님이 " + eventId + "번 이벤트에 참가하셨습니다.");
                return;
            }
        }
        System.out.println("해당 이벤트를 찾을 수 없습니다.");
    }
}

class Event {
    private static int nextId = 0;
    private int id;
    private String title;
    private String date;
    private List<String> participants;

    public Event(String title, String date) {
        this.id = ++nextId;
        this.title = title;
        this.date = date;
        this.participants = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void addParticipant(String participantName) {
        participants.add(participantName);
    }

    // 이벤트 정보를 문자열로 반환하는 메소드
    @Override
    public String toString() {
        return "이벤트 ID: " + id + " | 제목: " + title + " | 날짜: " + date + " | 참가자: " + participants;
    }
}
