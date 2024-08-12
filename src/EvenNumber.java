public class EvenNumber {
    public static void main(String[] args){

        int age = 15;

        if(age <16){
            System.out.println("Not Eligible");
        }
        else if(age >=16 && age <=19){
            System.out.println("Learner Licence");
        }
        else if(age >19){
            System.out.println("Full Licence");
        }
    }
}
