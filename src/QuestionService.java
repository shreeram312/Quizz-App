public class QuestionService {
    Question[] question = new Question[5];


    public QuestionService(){
        question[0]= new Question(1,"What is ur name","ram","Shreeram","Shree","ShreeR","Shreeram");
        question[1]= new Question(1,"What is ur name","ram","Shreeram","Shree","ShreeR","Shreeram");
        question[2]= new Question(1,"What is ur name","ram","Shreeram","Shree","ShreeR","Shreeram");
        question[3]= new Question(1,"What is ur name","ram","Shreeram","Shree","ShreeR","Shreeram");
        question[4]= new Question(1,"What is ur name","ram","Shreeram","Shree","ShreeR","Shreeram");


    }

    public void displayQuestions(){
        System.out.println("in display");
        System.out.println(question);

    }

}
