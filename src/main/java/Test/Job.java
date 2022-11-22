package Test;


class Job extends Woman{ //Woman클래스(부모클래스)를 상속받음 :
    String job;
    public void info() {//부모(Woman)클래스에 있는 info()메서드를 재정의
//        super.info();
        System.out.println("여자의 직업은 "+job+"입니다.");
        super.info();
//        System.out.println("여자의 이름은 "+name+", 나이는 "+age+"살입니다.");
//        System.out.println();
    }
}

