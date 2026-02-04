public class StopFlag {
    private static volatile boolean running = true;
    public static void main(String[] args) {

        Thread worker = new Thread(() -> {
            while (running) {
                System.out.println("Поток работает...");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            System.out.println("Поток корректно завершился");
        });
        Thread stopper = new Thread(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            running = false;
            System.out.println("Флаг остановки установлен");
        });

        worker.start();
        stopper.start();
    }
    }


