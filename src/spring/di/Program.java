package spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.ui.ExamConsole;

public class Program {

	public static void main(String[] args) {
		/*
		 * ���������� �����ϴ� ������� �ڵ带 ���� Exam exam = new NewlecExam(); // ExamConsole console =
		 * new InlineExamConsole(exam); // ExamConsole console = new
		 * GridExamConsole(exam);
		 * 
		 * //�� : �����ڸ� ���� ���, �� : setter�� Ȱ���� ��� ExamConsole console = new
		 * GridExamConsole(); console.setExam(exam);
		 */

		ApplicationContext context = new ClassPathXmlApplicationContext("spring/di/setting.xml");
//		ExamConsole console = (ExamConsole) context.getBean("console");
		ExamConsole console = context.getBean(ExamConsole.class); //����ȯ �� �ص� ��
		console.print();
 
	}

}
