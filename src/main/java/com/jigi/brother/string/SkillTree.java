package com.jigi.brother.string;

public class SkillTree {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;

        for(String userSkill : skill_trees) {
            String checkSkill = userSkill.replaceAll("[^" + skill + "]", "");
            if (skill.startsWith(checkSkill)) answer++;
        }

        return answer;
    }
}
