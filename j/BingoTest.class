package org.q2;

import static org.junit.Assert.assertTrue;

import java.util.Vector;

import org.junit.Test;

public class BingoTest {

	// 2차원 배열 arr의 빙고 갯수를 세어서 반환. 아래의 메서드를 완성하고 테스트하시오.

	int bingoCheck(int[][] arr) {
		int cnt = 0;

		// 빙고계임을 한다는건 이중배열의 모든 배열들의 길이가 같다는 전제가
		// 있어야하지않을까?
		// 그러면 확인한번 넣어주자
		for (int i = 0; i + 1 < arr.length; i++) {
			if (arr[i].length != arr[i + 1].length) {
				System.out.println("비정방배열 : 빙고체크불가");
				return -1;
			}
		}
		//그리고 전체 배열갯수랑 이중배열안에 길이도같아야함
		if(arr.length!=arr[0].length){
			System.out.println("배열의 길이와 이중배열 내 배열의 길이가 다름 : 빙고체크불가");
			return -1;
		}
		// for문을 돌려서 하면
		for (int i = 0; i < arr.length; i++) {
			// 와일문으로 돌려서, 같으면 꼐속 가고 아니면 브레이크해서 나가버리자. 끝까지 간다면 카운트 ++
					//생각하니까 굳이 와일문 안써도 상관없었겟는뎀
			int j = 0;
			while (j+1 < arr[i].length) {
				
				if (arr[i][j] == arr[i][j + 1] && arr[i][j] != 0) {
					j++;
					if (j +1 == arr[i].length - 1) {
						cnt++;
					}
				} else {
					j++;
					break;
				}
			}

		}
		// 여기까지는 수평빙고만 계산함

		// 여기부터 수직빙고 계산하기.
		
		for (int i = 0; i < arr[0].length; i++) {
			int j = 0;
			while (j + 1  < arr.length ) {
				if (arr[j][i] == arr[j + 1][i] && arr[j][i] != 0) {
					j++;
					if (j +1 == arr.length - 1) {
						cnt++;
					}
				} else {
					j++;
					break;
				}
			}
		}
		// 이제부터 대각선 빙고 계산하기
		// 대각선 빙고 경우의 수는 딱 2가지인데,
		// [i][j]가 같을때 / i+j가 length-1 일때
		//먼저 1번경우
		for (int i = 0; i+1 < arr.length; i++) {

			if (arr[i][i] == arr[i + 1][i + 1]  && arr[i][i]!=0) {
				if(i+1==arr.length-1){
					cnt++;
				}
			}else {
				
				break;
			}

		}

		//2번경우
		
		for (int i = 0; i+1 < arr.length; i++) {
			int j = arr.length - 1 - i;
			if (arr[i][j] == arr[i+1][j-1] && arr[i][j] != 0){
				if(i+2 ==arr.length){
					cnt++;
				}
				
			}
		}
		

		return cnt;
	}

 @Test
 public void test4() {
  int[][] arr = {
    {1,1,1,1,1},
    {1,1,0,0,0},
    {1,0,1,0,0},
    {1,0,0,1,0},
    {1,0,0,0,1},
  };

  assertTrue(bingoCheck(arr)==3);
 }
 
 
 @Test
 public void test3() {
  int[][] arr = {
    {1,1,1,1,1},
    {1,0,0,0,0},
    {1,0,0,0,0},
    {1,0,0,0,0},
    {1,0,0,0,0},
  };

  assertTrue(bingoCheck(arr)==2);
 }
 
 @Test
 public void test5() {
  int[][] arr = {
    {1,0,0,0,1},
    {1,0,0,0,1},
    {1,0,0,0,1},
    {1,0,0,0,1},
    {1,0,0,0,1},
  };

  assertTrue(bingoCheck(arr)==2);
 } 
 @Test
 public void test2() {
  int[][] arr = {
    {1,1,1,1,1},
    {0,0,0,0,0},
    {0,0,0,0,0},
    {0,0,0,0,0},
    {0,0,0,0,0},
  };

  assertTrue(bingoCheck(arr)==1);
 }
 @Test
 public void test7() {
	 int[][] arr = {
			 {0,0,0,0,0},
			 {0,0,0,0,0},
			 {0,0,0,0,0},
			 {0,0,0,0,0},
			 {0,0,0,0,0},
	 };
	 
	 assertTrue(bingoCheck(arr)==0);
 }
 @Test
 public void test8() {
	 int[][] arr = {
			 {0,0,0,0,1},
			 {0,0,0,1,0},
			 {0,0,1,0,0},
			 {0,1,0,0,0},
			 {1,0,0,0,0},
	 };
	 
	 assertTrue(bingoCheck(arr)==1);
 }
 @Test
 public void test9() {
	 int[][] arr = {
			 {1,1,1,1,1,1},
			 {0,0,0,0,0},
			 {0,0,0,0,0},
			 {0,0,0,0,0},
			 {0,0,0,0,0},
	 };
	 
	 assertTrue(bingoCheck(arr)==-1);
 }

 @Test
 public void test6() {
	 int[][] arr = {
			 {1,1,1,1,1},
			 {1,1,1,1,1},
			 {1,1,1,1,1},
			 {1,1,1,1,1},
			 {1,1,1,1,1},
			 {1,1,1,1,1},
	 };
	 
	 assertTrue(bingoCheck(arr)==-1);
 }
 
 @Test
 public void test() {
  int[][] arr = {
    {1,1,1,1,1},
    {1,1,1,1,1},
    {1,1,1,1,1},
    {1,1,1,1,1},
    {1,1,1,1,1},
  };

  assertTrue(bingoCheck(arr)==12);
 }
 

}

