class Voice{
    Animal[] arr = new Animal[5];

         
      void prepareVoice(){
         arr[0] = new Cow();
         arr[1]=new Dog();
         arr[2]= new Pig();
         arr[3] = new Goat();
         arr[4] = new Lion();
     } 
     public void hear(){
         for(int i=0;i<5;i++){
             arr[i].makeVoice();
         }
         
     }
}