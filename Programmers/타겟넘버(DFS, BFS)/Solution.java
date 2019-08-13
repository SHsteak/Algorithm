/*
 * About
 * Author: SHsteak@GitHub <cho911115@naver.com>
 * Date : 2019-08-13
 * URL : https://programmers.co.kr/learn/courses/30/lessons/43165
 */
public class Solution {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 1, 1, 1, 1};
		System.out.println(new Solution().solution(arr, 3));
	}
	
	public int solution(int[] numbers, int target) {
		return DFS(numbers, target, 0, 0);
	}
	
	private int DFS(int[] numbers, int target, int idx, int result) {
		if (idx == numbers.length) {
			return result == target ? 1 : 0;
		} else {
			return DFS(numbers, target, idx + 1, result + numbers[idx]) + DFS(numbers, target, idx + 1, result - numbers[idx]);
		}
	}
}
