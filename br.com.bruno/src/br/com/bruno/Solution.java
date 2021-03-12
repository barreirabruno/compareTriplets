package br.com.bruno;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<Integer> compareTripelets(List<Integer> a, List<Integer> b) {
		Integer alicecPoints = 0;
		Integer bobPoints = 0;
		List<Integer> totalPoints = new ArrayList<Integer>();
		for(Integer index = 0; index < a.size(); index++) {
			if(a.get(index) > b.get(index)) {
				alicecPoints++;
			} else if (a.get(index) < b.get(index)) {
				bobPoints++;
			}
		}
		totalPoints.add(alicecPoints);
		totalPoints.add(bobPoints);
		return totalPoints;
	}
}
