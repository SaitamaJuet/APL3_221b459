class Voice{
            Animal[] animal=new Animal[5];
        void prepareVoice(){
        Animal[] animal=new Animal[5];
        animal[0]=new Cow();
        animal[1]=new Goat();
        animal[2]=new Lion();
        animal[3]=new Pig();
        animal[4]=new Dog();
    }
    public void hear(){
        for (int i =0;i<5;i++)
        animal[i].makeVoice();
    }
}