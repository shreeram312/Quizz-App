import java.sql.SQLOutput;
import java.util.Scanner;

public class QuestionService {
    Question[] question = new Question[5];
    String sel[] = new String[5];


    public QuestionService(){
        question[0]= new Question(1,"What is ur name","ram","Shreeram","Shree","ShreeR","Shreeram");
        question[1]= new Question(2,"What is ur Surname","Reddy","Mutukundu","ChagamReddy","none","Mutukundu");
        question[2]= new Question(3,"what is ur age","20","21","22","23","20");
        question[3]= new Question(4,"What is ur name","ram","Shreeram","Shree","ShreeR","Shreeram");
        question[4]= new Question(5,"What is ur name","ram","Shreeram","Shree","ShreeR","Shreeram");


    }

    public void playQuizz(){
        Scanner sc = new Scanner(System.in);
        System.out.println("in display");
        System.out.println(question);

        int i =0;
        for(Question q : question){
            System.out.println(q.getId() + " "+ q.getQuestion());
            System.out.println("a) "+q.getOp1());
            System.out.println("b) "+q.getOp2());
            System.out.println("c) "+q.getOp3());
            System.out.println("d) "+q.getOp4());
            sel[i] = sc.nextLine();
            i++;

        }

    }

    public void printScore(){
        int score =0;

        for(int i =0;i<question.length;i++){
            if(sel[i]==question[i].getAns()){
                score++;
                System.out.println(score);
            }
            else {
                System.out.println("Wrong ans");
            }

        }

    }



}
