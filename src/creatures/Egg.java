package creatures;

import static java.lang.Thread.sleep;

public class Egg {
        private int time;
        private Dinosaur dinosaur;

        public Egg(int time, Dinosaur dinosaur) {
            this.time = time;
            this.dinosaur = dinosaur;
        }

        public int getTime() {
            return time;
        }

        public Dinosaur hatch() {
            try {
                sleep(time * 100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return dinosaur;
        }
}

