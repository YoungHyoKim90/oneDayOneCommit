package M2023_12;

import java.util.ArrayList;
import java.util.List;

public class SynchronizedExample {
    private List<String> dataList = new ArrayList<>();

    public synchronized void addToDataList(String data) {
        dataList.add(data);
    }

    public synchronized void removeFromDataList(String data) {
        dataList.remove(data);
    }

    public synchronized void processDataList() {
        // dataList에 대한 작업 수행
        // ...
    }
}

