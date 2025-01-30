class Voice{
      void prepareVoice(){
         Animal[] arr = new Animal[5];

         arr[0] = new Cow();
         arr[1]=new Dog();
         arr[2]= new Pig();
         arr[3] = new Goat();
         arr[4] = new Lion();
         hear(arr);
     } 
     public void hear(Animal [] arr){
         for(int i=0;i<5;i++){
             arr[i].makeVoice();
         }
         
     }
}