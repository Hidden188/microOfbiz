package com.June15;

public class StudentController {
	Student[] sts;
	public Student[] getSts() {
		return sts;
	}

	public void setSts(Student[] sts) {
		this.sts = sts;
	}
	
	public void scoreDownSort(Student student[]){
		int lindx = 0;
		for(int i=0;i<student.length;i++){
			lindx = i;
			for(int j=1+i;j<student.length;j++){
				if(student[j].getScore()>student[lindx].getScore()){
					lindx = j;
				}
			}
			int t = student[i].getScore();
			student[i].setScore(student[lindx].getScore());
			student[lindx].setScore(t);
		}
		for(Student i:student){
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] s = new Student[15];
		for(int i=0; i<15;i++){
			Student s1 = new Student();
			s1.setName("st1_name_"+i);
			s1.setNum(i+1);
			s1.setScore(80+i);
			s[i]=s1;
		}
		StudentController scontroller=new StudentController();
		scontroller.setSts(s);
		scontroller.scoreDownSort(scontroller.getSts());
	}
}
