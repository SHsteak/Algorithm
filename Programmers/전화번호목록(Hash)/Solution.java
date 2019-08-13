/*
 * About
 * Author: SHsteak@GitHub <cho911115@naver.com>
 * Date : 2019-08-13
 * URL : https://programmers.co.kr/learn/courses/30/lessons/42577
 */
import java.util.HashMap;
public class Solution {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] t = {"119", "97674223", "1195524421"};
		String[] t2 = {"123", "456", "789"};
		String[] t3 = {"12", "123", "1235", "567", "88"};
		System.out.println(solution(t));
		System.out.println(solution(t2));
		System.out.println(solution(t3));
	}
	
	public static boolean solution(String[] phone_book) {
		boolean answer = true;
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		for (String p : phone_book) {
			hm.put(p, p.length());
		}
		for (String key : hm.keySet()) {
			for (String key2 : hm.keySet()) {
				if (hm.get(key) <= hm.get(key2) && !key.equals(key2)) {
					if (key.equals(key2.substring(0, hm.get(key)))) {
						answer = false;
						break;
					}
				}
			}
			if (!answer) break;
		}
		return answer;
	}
}
