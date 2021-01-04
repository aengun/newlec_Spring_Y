package spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.ui.ExamConsole;

public class Program {

	public static void main(String[] args) {
		/*
		 * 스프링에게 지시하는 방법으로 코드를 변경 Exam exam = new NewlecExam(); // ExamConsole console =
		 * new InlineExamConsole(exam); // ExamConsole console = new
		 * GridExamConsole(exam);
		 * 
		 * //위 : 생성자를 통한 방법, 밑 : setter를 활용한 방법 ExamConsole console = new
		 * GridExamConsole(); console.setExam(exam);
		 */

		ApplicationContext context = new ClassPathXmlApplicationContext("spring/di/setting.xml");
//		ExamConsole console = (ExamConsole) context.getBean("console");
		ExamConsole console = context.getBean(ExamConsole.class); //형변환 안 해도 됨
		console.print();
 
	}

}
