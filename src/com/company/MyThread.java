package com.company;

public class MyThread extends Thread {

    /**
     * If this thread was constructed using a separate
     * {@code Runnable} run object, then that
     * {@code Runnable} object's {@code run} method is called;
     * otherwise, this method does nothing and returns.
     * <p>
     * Subclasses of {@code Thread} should override this method.
     *
     * @see #start()
     * @see #stop()
     */
    @Override
    public void run() {
    random();

    }
    private void random(){
        for(int i=0; i<=10; i++)// Меняется диапозн от 0 до 10
        {
            int a = (int) (Math.random()*10);//Псевод рандомно выбирается число 10 раз
    int b= (a*a);//Получаем квадрат числа =b

            System.out.print("Квадрат числа "+a+" будет равен "+b+"\n");//Выводим текст + квадрат числа со спуском на новую строку
}
}
}