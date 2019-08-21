/*
 * About
 * Author: SHsteak@GitHub <cho911115@naver.com>
 * Date : 2019-08-21
 * URL : https://programmers.co.kr/learn/courses/30/lessons/42587
 */
import java.util.ArrayList;
import java.util.Arrays;
public class Solution {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] priorities = {2, 1, 3, 3};
		int[] priorities2 = {1, 1, 9, 1, 1, 1};
		System.out.println(new Solution().solution(priorities, 2));
		System.out.println(new Solution().solution(priorities2, 0));
	}
	
	public int solution(int[] priorities, int location) {
		int answer = 0;
		int size = priorities.length;
		int[] priorities_sort = priorities.clone();
		Arrays.sort(priorities_sort);
		ArrayList<Integer> arr = new ArrayList<>();
		for (int i = size - 1; i >= 0; i--) {
			int val = priorities_sort[i];
			if (!arr.contains(val)) arr.add(val);
		}
		int idx = 0;
		int rank = 1;
		boolean flag = false;
		for (Integer a : arr) {
			int last_idx = 0;
			for (int i = idx; i < size; i++) {
				if (priorities[i] == a) {
					if (i == location) {
						answer = rank;
						flag = true;
						break;
					}
					last_idx = i;
					rank++;
				}
			}
			for (int i = 0; i < idx; i++) {
				if (priorities[i] == a) {
					if (i == location) {
						answer = rank;
						flag = true;
						break;
					}
					last_idx = i;
					rank++;
				}
			}
			if (flag) break;
			else idx = last_idx;
		}
		return answer;
	}
}
