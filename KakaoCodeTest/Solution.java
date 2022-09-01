class Solution {
    public static String solution(String[] survey, int[] choices) {
        String answer = "";
        int[] type_point = new int[8];
        char sel_char = 0;
        int point = 0;
        for(int i = 0; i<choices.length; i++){

            if (choices[i] < 1 || choices[i] > 7) {
                System.out.println("잘못된 입력");
                break;
            }
            else if (choices[i] == 4)
                continue;
            else if (choices[i] < 4) {
                sel_char = survey[i].charAt(0);
                if(choices[i] == 1)
                    point = 3;
                else if(choices[i] == 2)
                    point = 2;
                else
                    point = 1;
            }else{
                sel_char = survey[i].charAt(1);
                point = choices[i] - 4;
            }

            switch(sel_char){
                case 'R': {
                    type_point[0] += point;
                    break;
                }
                case 'T': {
                    type_point[1] += point;
                    break;
                }
                case 'C': {
                    type_point[2] += point;
                    break;
                }
                case 'F': {
                    type_point[3] += point;
                    break;
                }
                case 'J': {
                    type_point[4] += point;
                    break;
                }
                case 'M': {
                    type_point[5] += point;
                    break;
                }
                case 'A': {
                    type_point[6] += point;
                    break;
                }
                case 'N': {
                    type_point[7] += point;
                    break;
                }
            }
        }

        if(type_point[0] - type_point[1] >= 0)
            answer += "R";
        else
            answer += "T";
        if(type_point[2] - type_point[3] >= 0)
            answer += "C";
        else
            answer += "F";
        if(type_point[4] - type_point[5] >= 0)
            answer += "J";
        else
            answer += "M";
        if(type_point[6] - type_point[7] >= 0)
            answer += "A";
        else
            answer += "N";

        return answer;
    }

}
