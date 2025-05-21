package array;

import java.util.ArrayList;

public class Array4 {
    public static void main(String[] args) {
        int[] score = {1, 2, 3, 4, 5};
        int count = score.length;

        ArrayList<Integer> scoreList = new ArrayList<>();
        scoreList.add(10);
        scoreList.add(20);
        scoreList.add(30);
        scoreList.add(40);
        scoreList.add(50);
        scoreList.add(2, 222); // 2번째 index에 222 추가
        scoreList.remove(2); // 2번째 index 삭제
        System.out.println(scoreList);
        System.out.println(scoreList.size());
        System.out.println(scoreList.get(2));
    }
}
