public class VirtualPet {

        private String name;
        private int hunger;
        private int happiness; 

        public VirtualPet(String name) {
            this.name = name;
            this.hunger = 5;
            this.happiness = 5;
        }

        public void feed(){
            if (hunger == 0 || hunger == 1){
                hunger = 0;
            }
            else {
                hunger -= 2;
            }  
        }

        public void play(){
            if (happiness == 9 || happiness == 10){
                happiness = 10;
            }
            else {
                happiness += 2;
            }
            
            if (hunger == 9 || hunger == 10){
                hunger = 10;
            }
            else {
                hunger += 1; 
            }
            
        }

        public void passTime(){
            if (hunger == 9 || hunger == 10){
                hunger = 10;
            }
            else {
                hunger += 1; 
            }
            if (happiness == 0 || happiness == 1){
                happiness = 0;
            }
            else {
                happiness -= 1;
            }  
        }
        public String toString(){
            return "Your pets name is: " + name + ". Its hunger is: " + hunger + ". Its happiness is: " + happiness + ".";
        }
}    