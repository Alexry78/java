package philosopher;
import java.util.concurrent.Semaphore;

class Philosopher extends Thread {
    private final int id;
    private final Semaphore leftFork;
    private final Semaphore rightFork;

    public Philosopher(int id, Semaphore leftFork, Semaphore rightFork) {
        this.id = id;
        this.leftFork = leftFork;
        this.rightFork = rightFork;
    }

    @Override
    public void run() {
        try {
            while (true) {
                think();
                eat();
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    private void think() throws InterruptedException {
        System.out.println("Philosopher " + id + " is thinking.");
        Thread.sleep((long) (Math.random() * 1000));
    }
    
    private void eat() throws InterruptedException {
        leftFork.acquire();
        rightFork.acquire();
        
        System.out.println("Philosopher " + id + " is eating.");
        Thread.sleep((long) (Math.random() * 1000));
        
        rightFork.release();
        leftFork.release();
    }
}

public class DiningPhilosophers {
    public static void main(String[] args) {
        int numberOfPhilosophers = 5;
        Semaphore[] forks = new Semaphore[numberOfPhilosophers];

        // Создаем семафоры для вилок
        for (int i = 0; i < numberOfPhilosophers; i++) {
            forks[i] = new Semaphore(1);
        }

        // Создаем философов
        Philosopher[] philosophers = new Philosopher[numberOfPhilosophers];
        for (int i = 0; i < numberOfPhilosophers; i++) {
            // Правую вилку получаем следующим философом
            philosophers[i] = new Philosopher(i, forks[i], forks[(i + 1) % numberOfPhilosophers]);
        }

        // Запускаем философов
        for (Philosopher philosopher : philosophers) {
            philosopher.start();
        }
    }
}