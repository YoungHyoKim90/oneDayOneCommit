package M2024_03;

import java.util.Scanner;

//그래프 클래스 정의
class Graph {
 
 // 인접리스트 노드 클래스
 private class AdjlistNode {
     int vertex;
     AdjlistNode next;
     
     // 생성자
     public AdjlistNode(int v) {
         vertex = v;
         next = null;
     }
 }
 
 // 인접리스트 클래스
 private class AdjList {
     int num_members;
     AdjlistNode head;
     AdjlistNode tail;
     
     // 생성자
     public AdjList() {
         num_members = 0;
         head = tail = null;
     }
 }
 
 private int num_vertices;
 private AdjList[] adjListArr;
 
 // 생성자
 public Graph(int n) {
     num_vertices = n;
     adjListArr = new AdjList[n];
     for (int i = 0; i < n; i++) {
         adjListArr[i] = new AdjList();
     }
 }
 
 // 간선 추가 메서드
 private void addEdge(int src, int dest) {
     AdjlistNode newNode = new AdjlistNode(dest);
     if (adjListArr[src].tail != null) {
         adjListArr[src].tail.next = newNode;
         adjListArr[src].tail = newNode;
     } else {
         adjListArr[src].head = adjListArr[src].tail = newNode;
     }
     adjListArr[src].num_members++;
     
     newNode = new AdjlistNode(src);
     if (adjListArr[dest].tail != null) {
         adjListArr[dest].tail.next = newNode;
         adjListArr[dest].tail = newNode;
     } else {
         adjListArr[dest].head = adjListArr[dest].tail = newNode;
     }
     adjListArr[dest].num_members++;
 }
 
 // 이웃 정점 표시 메서드
 private void display(int i) {
     AdjlistNode adjList = adjListArr[i].head;
     while (adjList != null) {
         System.out.printf("%d ", adjList.vertex);
         adjList = adjList.next;
     }
     System.out.printf("\n");
 }
 
 // 공개된 간선 추가 메서드
 public void addPublicEdge(int src, int dest) {
     addEdge(src, dest);
 }
 
 // 공개된 이웃 정점 표시 메서드
 public void displayPublic(int i) {
     display(i);
 }
}

//메인 클래스
class GraphSolution {
 public static void main(String args[]) throws Exception {
     Scanner sc = new Scanner(System.in);
     int T = sc.nextInt();
     for (int test_case = 1; test_case <= T; test_case++) {
         int V = sc.nextInt();
         int E = sc.nextInt();
         int Q = sc.nextInt();
         Graph graph = new Graph(V);
         for (int i = 0; i < E; i++) {
             int sv = sc.nextInt();
             int ev = sc.nextInt();
             graph.addPublicEdge(sv, ev);
         }
         System.out.printf("#%d\n", test_case);
         for (int i = 0; i < Q; i++) {
             int sv = sc.nextInt();
             graph.displayPublic(sv);
         }
     }
     sc.close();
 }
}
