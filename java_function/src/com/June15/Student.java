package com.June15;


/**
 * 4. 写一个程序输入15个学生的姓名，学号，分数， 并且按照学生的成绩降序输出 学号， 姓名， 分数。
 * @author 卢炜斌，闫龙飞
 *
 */
public class Student {
	private String name;
	private int num;
	private int score;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	public void inputInfo(Student student[]){
		/*
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<15;i++){
			//student[i] = new Student();
			System.out.println("输入第"+(i+1)+"个学生姓名，学号，成绩(用空格分开)：");
			student[i].setName(scan.nextLine());
			student[i].setNum(scan.nextInt());
			student[i].setScore(scan.nextInt());
		}
		*/
	}
	
	
	public String toString(){
		
		return "姓名："+name+" 学号："+num+" 成绩："+score;
	}
	public static void main(String[] args) {
		Student s1 = new Student();
		Student[] s = new Student[15];
		
		for(int i=0; i<15;i++){
			s[i].setName("st1_name_"+i);
			s[i].setNum(i+1);
			s[i].setScore(80+i);
			//s[i]=s1;
		}
		s1.inputInfo(s);
		//s1.scoreDownSort(s);
	}

}
