public class VirtualThreads {

    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            Thread.startVirtualThread(() -> {
                try {
                    Thread.sleep(1000);
                    System.out.println("Thread Virtual executada: " + Thread.currentThread());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }

        Thread.sleep(3000);

        long endTime = System.currentTimeMillis();
        System.out.println("Tempo de execução com Threads normais: " + (endTime - startTime) + " ms");
    }

}
