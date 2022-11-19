package programmers;

public class Odd {

    //소수구하기

    public int solution(int[] nums) {
    int answer = 0;
    int sum =0;

        for(int i=0; i<nums.length; i++){
        for(int j=i+1; j<nums.length; j++){
            for(int k=j+1; k<nums.length; k++){
                //배열 중 3개 더하기
                sum = nums[i]+nums[j]+nums[k];

                //소수일 때 1개씩 추가 //onlyPrime 아래 메서드 호출
                if(onlyPrime(sum)){
                    answer++;
                }
            }
        }
    }
        return answer;
}

    private boolean onlyPrime(int num){
        //1은 나눌 수 없기에 2부터 시작
        for(int i=2; i<num; i++){
            if(num % i == 0)
                return false;
        }
        return true;
    }
}

