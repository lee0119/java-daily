import java.io.*;
import java.time.LocalDate;
import java.util.*;

//자바 모의고사 수포자
//레벌 1 -12
//레벨 1 -13\
//시간없어서 복습 위주.

//레벨  1 -14 소수찾기
//레벨 1-15 평균 구하기
//레벨 1-16
//레벨 1-17 체육복
//레벨 1-18 신고결과받기
//레벨 1 다른방법
//레벨 1-19 비밀지도
//복습복습
//레벨 1-20 2106년
//다시 풀기 2106
//자바의 정석 예제
//파이널 전이라 복습만
//백준 처음부터
//10868 최솟값
public class Solution2 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int []arr;
    static int []segTree;

    static double baseLog(double x, double base) {
        return Math.log(x) / Math.log(base);
    }

    static int make_seg(int node , int start, int end)
    {
        if(start == end)
            return segTree[node] = arr[start];
        segTree[node] =Math.min(make_seg(node * 2, start , (start + end) / 2) ,
                make_seg(node * 2 + 1, (start+end)/2 + 1 , end));
        return segTree[node];
    }

    static int findMin(int node, int start , int end , int left, int right)
    {
        if(end < left || right < start)
            return 2147483647;
        if(left<= start && end <= right)
            return segTree[node];
        int min = Math.min(findMin(node * 2, start, (start + end) / 2, left, right), findMin(node * 2 + 1, (start + end) / 2 + 1, end, left, right));
        return min;
    }
    public static void main(String[] args) throws IOException {

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int treeHeight = (int) Math.ceil(baseLog(n,2));
        int treeSize = (int) Math.pow(2,treeHeight+1);
        arr = new int[n+2];
        for(int i=0;i<n;i++)
        {
            arr[i] = Integer.parseInt(br.readLine());
        }

        segTree = new int[treeSize+2];
        make_seg(1,0,n-1);
        for(int i=0;i<m;i++)
        {
            st = new StringTokenizer(br.readLine());

            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            bw.write(Integer.toString(findMin(1, 0, n-1 , s-1,e-1))+"\n");
            bw.flush();
        }


    }

}