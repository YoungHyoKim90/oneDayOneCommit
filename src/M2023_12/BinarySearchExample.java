package M2023_12;

public class BinarySearchExample {
    public static void main(String[] args) {
        int[] array = {2, 5, 7, 12, 16, 23, 35, 46, 51, 63}; // 정렬된 배열

        int target = 23; // 찾고자 하는 값

        int result = binarySearch(array, target);

        if (result == -1) {
            System.out.println("해당 값이 배열에 존재하지 않습니다.");
        } else {
            System.out.println("찾고자 하는 값의 인덱스: " + result);
        }
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; // 찾고자 하는 값이 없는 경우
    }
}

