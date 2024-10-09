public class QuestionService {

    Question[] questions = new Question[5];

    public QuestionService(){
        questions[0] =  new Question(1,"What is the result of 2+2","3","4","22","100","4");
        questions[1] =  new Question(1,"What is the result of 2+1","3","4","22","100","3");
        questions[2] =  new Question(1,"What is the result of 2+20","3","4","22","100","22");
        questions[3] =  new Question(1,"What is the result of 2+98","3","4","22","100","100");
        questions[4] =  new Question(1,"What is the result of 4-1","3","4","22","100","3");
    }
    public void displayQuestions(){
        for (Question q : questions) {
            System.out.println("Question: " + q.getQuestion());
            System.out.println("Answer is: " + q.getAnswer());
        }
    }
}
