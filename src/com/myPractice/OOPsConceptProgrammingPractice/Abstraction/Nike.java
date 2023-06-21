package com.myPractice.OOPsConceptProgrammingPractice.Abstraction;

abstract class Nike {
    abstract int shell();
}
class TShirt extends Nike{

    @Override
    int shell() {
        return 0;
    }
}
