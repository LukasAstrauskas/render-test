package dev.luuk.Web_Test;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KadaneService {
    public int[] findMaxSum(List<Integer> array) {
        int maxSum = Integer.MIN_VALUE;
        int maxEnding = 0;
        int start = 0, s = 0, end = 0;
        for (int i = 0; i < array.size(); i++) {
            maxEnding = maxEnding + array.get(i);
            if (maxSum < maxEnding) {
                maxSum = maxEnding;
                start = s;
                end = i;
            }
            if (maxEnding < 0) {
                maxEnding = 0;
                s = i + 1;
            }
        }
        System.out.println(start + " " + end + ", S: " + s);
        int[] answer = new int[3];
        answer[0] = start;
        answer[1] = end;
        answer[2] = maxSum;
        return answer;
    }
}
