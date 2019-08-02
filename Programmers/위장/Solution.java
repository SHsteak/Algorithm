/*
 * About
 * Author: SHsteak@GitHub <cho911115@naver.com>
 * Date : 2019-08-02
 * URL : https://programmers.co.kr/learn/courses/30/lessons/42578
 */

import java.util.HashMap;
public class Solution {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] test_case = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
		System.out.println(new Solution().solution(test_case));
	}
	
	public int solution(String[][] clothes) {
		int answer = 1;
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		for (int i = 0; i < clothes.length; i++) {
			String c = clothes[i][1];
			if (hm.putIfAbsent(c, 1) != null) hm.put(c, hm.get(c) + 1);
		}
		for (int v : hm.values()) {
			answer *= v + 1;
		}
		return answer - 1;
	}
}
