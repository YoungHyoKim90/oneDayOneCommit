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

/*
 * 코드를 개선하는 방법은 여러 가지가 있습니다. 여기 몇 가지 제안을 드립니다:
 * 
 * 예외 처리 강화: 현재 코드는 유효하지 않은 입력이나 예상치 못한 상황에 대한 처리가 충분하지 않습니다. try-catch 블록을 사용하여
 * 예외를 처리하고, 사용자에게 더 명확한 피드백을 제공할 수 있습니다. 데이터 유효성 검사: 메소드의 매개변수로 전달되는 데이터의 유효성을
 * 검사하는 로직을 추가하여, 애플리케이션의 안정성을 높일 수 있습니다. 코드 재사용성 향상: 중복되는 코드를 메소드로 분리하여 재사용성을
 * 높이고, 유지보수를 용이하게 할 수 있습니다. 디자인 패턴 적용: 객체 생성과 관련된 디자인 패턴(예: 팩토리 패턴, 빌더 패턴)을
 * 적용하여, 객체의 생성과 관리를 더 유연하게 할 수 있습니다. 단위 테스트 작성: JUnit과 같은 테스팅 프레임워크를 사용하여 단위
 * 테스트를 작성함으로써, 코드의 신뢰성을 검증하고, 리팩토링 시 안정성을 보장할 수 있습니다. 문서화 및 주석 개선: 메소드와 클래스에 대한
 * 문서화를 강화하고, 주석을 통해 코드의 의도를 더 명확하게 전달할 수 있습니다. 성능 최적화: ArrayList 대신 LinkedList를
 * 사용하거나, 필요에 따라 적절한 자료구조를 선택하여 성능을 최적화할 수 있습니다. 코드 스타일 일관성: 코드 스타일 가이드(예:
 * Google Java Style Guide)를 따라 일관된 코드 스타일을 유지하는 것이 좋습니다. 이러한 개선 사항들은 코드의 가독성,
 * 유지보수성, 확장성을 향상시키는 데 도움이 될 것입니다. 더 구체적인 개선 방안이나 다른 질문이 있으시면 언제든지 말씀해 주세요!
 */
