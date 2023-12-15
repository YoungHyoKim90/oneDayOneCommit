//package M2023_12;
//
//import java.util.HashMap;
//import java.util.Map;
//
//public class DecisionTree {
//    static class Node {
//        String attribute;
//        Map<String, Node> branches;
//        String result;
//
//        Node(String attribute) {
//            this.attribute = attribute;
//            branches = new HashMap<>();
//        }
//    }
//
//    public static void main(String[] args) {
//        // 임의의 데이터셋 생성 (간단한 경우 예시)
//        Map<String, String> dataPoint1 = Map.of("Outlook", "Sunny", "Temperature", "Hot", "Play", "No");
//        Map<String, String> dataPoint2 = Map.of("Outlook", "Overcast", "Temperature", "Mild", "Play", "Yes");
//        // ... (더 많은 데이터 포인트 추가)
//
//        // 의사 결정 트리 생성
//        Node decisionTree = buildDecisionTree(dataPoint1);
//
//        // 새로운 데이터에 대한 예측
//        Map<String, String> newDataPoint = Map.of("Outlook", "Rainy", "Temperature", "Mild");
//        String prediction = predict(decisionTree, newDataPoint);
//        System.out.println("새로운 데이터의 예측 결과: " + prediction);
//    }
//
//    static Node buildDecisionTree(Map<String, String> dataPoint) {
//        // 간단한 예시로, 의사 결정 트리를 하드코딩하여 생성
//        Node root = new Node("Outlook");
//        root.branches.put("Sunny", new Node("Temperature"));
//        root.branches.put("Overcast", new Node("Play"));
//        // ... (더 많은 가지 추가)
//
//        return root;
//    }
//
//    static String predict(Node tree, Map<String, String> dataPoint) {
//        while (tree.result == null) {
//            String attrValue = dataPoint.get(tree.attribute);
//            tree = tree.branches.get(attrValue);
//        }
//        return tree.result;
//    }
//}
//
