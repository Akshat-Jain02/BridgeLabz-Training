package com.generics.aidrivenresumescreening;

class JobApplication<T extends JobRole> {
    Resume resume;
    T jobRole;
    
    JobApplication(Resume r, T role) {
        this.resume = r;
        this.jobRole = role;
    }
    
    boolean isMatch() {
        return jobRole.isSuitable(resume);
    }
    
    String getInfo() {
        return resume.name + " → " + jobRole.title + 
               (isMatch() ? "  [MATCH]" : "  [NO]");
    }
}