package company;

public interface Worker {
    default void work() {
        System.out.println("The worker is working.");
    }
}
