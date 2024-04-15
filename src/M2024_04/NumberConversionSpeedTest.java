package M2024_04;

/**
 * @author PigYoung90
 *
 */
public class NumberConversionSpeedTest {

	public static void main(String[] args) {
		final int MAX_NUM = 100_000_000;

		long startTime, endTime;
		double duration;
		System.out.println("연산을 시작합니다.");
		// 10진수 -> 2진수 변환 속도 테스트
		startTime = System.nanoTime();
		for (int i = 1; i <= MAX_NUM; i++) {
			Integer.toBinaryString(i);
		}
		endTime = System.nanoTime();
		duration = (endTime - startTime) / 100_000_000.0; // ns to ms
		System.out.println("10진수 -> 2진수 변환 시간: " + duration + "ms");

		// 10진수 -> 16진수 변환 속도 테스트
		startTime = System.nanoTime();
		for (int i = 1; i <= MAX_NUM; i++) {
			Integer.toHexString(i);
		}
		endTime = System.nanoTime();
		duration = (endTime - startTime) / 100_000_000.0; // ns to ms
		System.out.println("10진수 -> 16진수 변환 시간: " + duration + "ms");
	}
}

/*1_000_000_000.0
 * 10진수 -> 2진수 변환 시간: 12.890821ms
 * 10진수 -> 16진수 변환 시간: 5.9342585ms
 *	
 * 결과를 보면, 10진수 -> 2진수 변환이 10진수 -> 16진수 변환보다 약 2배 더 오래 걸렸습니다.
 * 
 * 이러한 결과는 일반적으로 예상하기 어렵습니다. 일반적으로 2진수와 16진수 변환은 비슷한 연산량을 가집니다. 그러나 여기서 나타난 결과는
 * Java의 내장 메서드나 실행 환경의 최적화, 또는 다른 내부 요인으로 인한 것일 수 있습니다.
 * 
 * 결과를 통해 얻을 수 있는 몇 가지 해석은 다음과 같습니다:
 * 
 * 메서드 최적화: Integer.toHexString() 메서드가 내부적으로 더 효율적으로 동작하는 것일 수 있습니다. Java의 내장
 * 메서드는 최적화가 잘 되어 있어 효율적으로 동작할 가능성이 높습니다.
 * 
 * 메모리 액세스: 실제로는 각 변환의 시간이 크게 차이나지 않을 수 있지만, 메모리 액세스 패턴에 따라 미세한 차이가 발생할 수 있습니다.
 * 
 * JIT 컴파일 최적화: JIT(Just-In-Time) 컴파일러는 실행 중에 코드를 최적화할 수 있습니다. 런타임에 따라 다르게 최적화되어
 * 실행되는 경우가 있을 수 있습니다.
 * 
 * 컴파일러 최적화: 사용하는 Java 컴파일러가 특정 메서드나 연산에 대해 최적화를 수행했을 수 있습니다.
 * 
 * 이러한 결과는 특정 환경과 상황에서만 나타나는 것일 수 있으므로, 다른 환경에서도 테스트하여 결과를 확인하는 것이 좋습니다. 또한, 성능
 * 최적화를 위한 여러 방법과 기법들이 있으니, 실제 애플리케이션에서는 그런 측면도 고려할 필요가 있습니다.
 */