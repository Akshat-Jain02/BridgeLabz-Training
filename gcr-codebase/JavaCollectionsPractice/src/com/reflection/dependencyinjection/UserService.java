package com.reflection.dependencyinjection;

public class UserService {

    @Inject
    private UserRepository userRepository;

    public void process() {
        userRepository.save();
    }
}
