public class Threads {

    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            Thread thread = new Thread(() -> {
                try {
                    Thread.sleep(1000);
                    System.out.println("Thread normal executada: " + Thread.currentThread());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });

            thread.start();
        }

        Thread.sleep(2000);

        long endTime = System.currentTimeMillis();
        System.out.println("Tempo de execução com Threads normais: " + (endTime - startTime) + " ms");
    }

}
