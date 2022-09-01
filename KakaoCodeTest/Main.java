public class Main {

    public static void main (String[] args){

//        String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
//        int[] choices = {5, 3, 2, 7, 5};

        String[] survey = {"TR", "RT", "TR"};
        int[] choices = {7, 1, 3};

        String answer = "";

        answer = Solution.solution(survey, choices);

        System.out.println(answer);

    }
}
