package spring.di.ui;

import spring.di.entity.Exam;

public class GridExamConsole implements ExamConsole {

	private Exam exam;
	
	public GridExamConsole() {
		// TODO Auto-generated constructor stub
	}

	public GridExamConsole(Exam exam) {
		this.exam = exam;
	}

	@Override
	public void print() {
		System.out.println("|| total is " + exam.total() + ", avg is " + exam.avg()+" ||");
	}

	@Override
	public void setExam(Exam exam) {
		this.exam = exam;
	}

}
