import java.util.Scanner;

public class QuestionService {

    Question[] questions = new Question[5];
    String userAnswer[] = new String[5] ;

    public QuestionService(){
        questions[0] =  new Question(1,"What is the result of 2+2","3","4","22","100","4");
        questions[1] =  new Question(2,"What is the result of 2+1","3","4","22","100","3");
        questions[2] =  new Question(3,"What is the result of 2+20","3","4","22","100","22");
        questions[3] =  new Question(4,"What is the result of 2+98","3","4","22","100","100");
        questions[4] =  new Question(5,"What is the result of 4-1","3","4","22","100","3");
    }
    public void playQuiz(){
        int counter = 0;
        for (Question q : questions) {
            System.out.println("Question number: " + q.getId());
            System.out.println(q.getQuestion());
            System.out.println("A- " + q.getOption1());
            System.out.println("B- " + q.getOption2());
            System.out.println("C- " + q.getOption3());
            System.out.println("D- " + q.getOption4());
            System.out.println("Insert your answer below, WRITE THE MATH RESULT NOT THE OPTION");
            Scanner sc = new Scanner(System.in);
            userAnswer[counter] = sc.nextLine();
            counter++;
        }
        for (String answ : userAnswer){
            System.out.println(answ);
        }
    }
}
