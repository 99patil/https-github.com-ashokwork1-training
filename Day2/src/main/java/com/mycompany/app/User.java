package com.mycompany.app;

class User{

    //age
    private float age;
    int weight = 15;

    //default constructor
    public User(){
        this.age=5.0f;
    }

    public User(float x){
        this.age = x;
    }

    //Methods 

    // age setter
    void setAge(float y){
        this.age = y;
    }

    float getAge(String client){
        if(client.equals("client5"))
        return this.age;
        else
        return 0.0f;
    }

    // Gets the strength of the user
    float getStrenth(){
        return age * weight ;
    }

    
}