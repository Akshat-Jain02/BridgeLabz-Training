package com.generics.aidrivenresumescreening;

class Resume {
    String name;
    int experience;
    String[] skills;
    
    Resume(String name, int exp, String... skills) {
        this.name = name;
        this.experience = exp;
        this.skills = skills;
    }
    
    boolean hasSkill(String skill) {
        for (String s : skills) {
            if (s.equalsIgnoreCase(skill)) return true;
        }
        return false;
    }
}