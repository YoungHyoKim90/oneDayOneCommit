package M2023_12;

public class BinarySearch {
    public static void main(String[] args) {
        // 정렬된 배열
        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        int target = 7; // 찾고자 하는 값

        int result = binarySearch(sortedArray, target);

        if (result == -1) {
            System.out.println("찾는 값이 배열에 없습니다.");
        } else {
            System.out.println("찾는 값 " + target + "의 인덱스는 " + result + "입니다.");
        }
    }

    // 이진 탐색 알고리즘
    private static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // 중간값이 찾는 값과 같은지 확인
            if (arr[mid] == target) {
                return mid; // 찾는 값의 인덱스 반환
            }

            // 찾는 값이 중간값보다 작은 경우, 오른쪽 범위 축소
            if (arr[mid] > target) {
                right = mid - 1;
            }
            // 찾는 값이 중간값보다 큰 경우, 왼쪽 범위 축소
            else {
                left = mid + 1;
            }
        }

        return -1; // 찾는 값이 배열에 없는 경우
    }
}

