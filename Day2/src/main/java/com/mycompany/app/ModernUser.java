package com.mycompany.app;

//Inheritance demonstration

class ModernUser extends User{

    int expYears;

    @Override
    float getStrenth() {        
        return super.getStrenth() *expYears;        
    }
    
}