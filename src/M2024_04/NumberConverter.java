package M2024_04;

import java.util.Scanner;

public class NumberConverter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// 사용자로부터 10진수 숫자 입력받기
		System.out.print("10진수 숫자를 입력하세요: ");
		int decimalNumber = scanner.nextInt();

		// 10진수를 2진수로 변환하여 출력
		String binaryNumber = Integer.toBinaryString(decimalNumber);
		System.out.println("2진수: " + binaryNumber);

		// 10진수를 16진수로 변환하여 출력
		String hexNumber = Integer.toHexString(decimalNumber);
		System.out.println("16진수: " + hexNumber);

		scanner.close();
	}
}

/*
 * Java에서의 연산 속도에 대한 질문은 몇 가지 상황에 따라 다를 수 있습니다. 10진수, 2진수, 16진수 간의 변환 속도 자체는 대체로
 * 빠르게 이루어집니다. 하지만 각 진수 표현 방식에 따라 연산의 복잡성과 메모리 사용량이 달라질 수 있습니다.
 * 
 * 2진수: 이진수로의 변환은 컴퓨터 내부에서 주로 사용되므로 연산이 빠르다고 할 수 있습니다. 또한, 2의 제곱수를 사용하여 연산하기 때문에
 * 하드웨어에서 최적화가 잘 이루어집니다.
 * 
 * 10진수: 10진수는 사람이 일상에서 사용하는 수 체계이므로 변환 과정이 간단하고 직관적입니다. 하지만 컴퓨터에서는 10진수 연산을
 * 수행하기 위해 별도의 알고리즘과 더 많은 연산이 필요할 수 있습니다.
 * 
 * 16진수: 16진수는 2진수와 직접적인 연관이 있어 변환 과정이 비교적 빠를 수 있습니다. 또한 2진수를 그룹으로 묶어 표현하기 때문에
 * 2진수와 유사한 성질을 가집니다.
 * 
 * 실제로 이런 연산의 차이는 대부분의 애플리케이션에서는 무시할 수 있을 정도로 작습니다. 하지만 극도의 최적화가 필요한 경우나 대량의
 * 데이터를 다루는 경우에는 성능 차이가 나타날 수 있습니다.
 * 
 * 결론적으로, 연산 속도에 있어서는 직접적인 차이가 크게 나타나지 않습니다. 하지만 연산의 복잡성과 메모리 사용량에서 약간의 차이가 있을 수
 * 있으므로, 어떤 진수를 사용할지는 사용하는 애플리케이션의 요구 사항과 편의성에 따라 결정하는 것이 좋습니다.
 */
