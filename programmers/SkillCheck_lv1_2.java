package programmers;

public class SkillCheck_lv1_2 {
    public String solution(String phone_number) {
        int index = phone_number.length()-4;

        return phone_number.substring(0, index).replaceAll("[0-9]", "*")
                + phone_number.substring(index, index+4);
    }
}
