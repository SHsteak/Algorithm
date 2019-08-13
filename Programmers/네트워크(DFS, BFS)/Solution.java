/*
 * About
 * Author: SHsteak@GitHub <cho911115@naver.com>
 * Date : 2019-08-02
 * URL : https://programmers.co.kr/learn/courses/30/lessons/43162
 */

public class Solution {
	boolean[] visited;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] test_case_1 = {{1, 1, 0}, {1, 1, 1}, {0, 1, 1}};
		int[][] test_case_2 = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
		System.out.println(new Solution().solution(3, test_case_1));
		System.out.println(new Solution().solution(3, test_case_2));
	}
	
	public int solution(int n, int[][] computers) {
		int answer = 0;
		visited = new boolean[n];
		for (int i = 0; i < computers.length; i++) {
			if (!visited[i]) {
				search(computers, i, n);
				answer++;
			}
		}
		return answer;
	}
	
	private void search(int[][] computers, int idx, int n) {
		visited[idx] = true;
		for (int i = 0; i < n; i++) {
			if (i != idx && !visited[i] && computers[idx][i] == 1) {
				search(computers, i, n);
			}
		}
	}
}
