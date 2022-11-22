package Test;


public class OverTest {

    public static void main(String[] args) {

        //Job 객체 생성
        Job job = new Job();

        //변수 설정
        job.name = "유리";
        job.age = 30;
        job.job = "프로그래머";

        //호출
        job.info();

    }

}
