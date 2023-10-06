public class Helicopter {
        float speed = 0;
        float altitude = 0;
        boolean isFlying = false;
        boolean isMoving = false;
        public void stop() {
            isMoving = false;
        }
        public void accelerate(float amount) {
            this.speed += amount;
            this.isMoving = speed != 0;
        }
        public void printSpeed() {
            System.out.println("Speed: " + speed);
        }
        public void printIsMoving() {
            if(isMoving) {
                System.out.println("The Helicopter is moving");
            } else {
                System.out.println("The Helicopter is not moving");
            }

        }
        public void ascent(float amount) {
            altitude += amount;
            isFlying = altitude != 0;
        }
    public void printAltitude() {
        System.out.println("Altitude: " + speed);
    }
        public void printIsFlying() {
            if (isFlying) {
                System.out.println("The Helicopter is flying");
            } else {
                System.out.println("The Helicopter is not flying");
            }
        }
        public static void main(String[] args) {
            Helicopter info = new Helicopter();
            info.accelerate(10);
            info.printSpeed();
            info.printIsMoving();
            info.ascent(10);
            info.printIsFlying();
            info.printAltitude();
        }
    }

