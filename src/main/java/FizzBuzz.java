public class FizzBuzz {
    public static void main(String[] args) {
        int n = 1000, i = 1;
        int iteraciones = 0;
        fizzbuzz2(n, i, iteraciones);

    }

    public static void fizzbuzz1(int n, int i, int iteraciones) {
        while (i <= n) {
            StringBuilder msg = new StringBuilder();
            if (i % 3 == 0) {
                msg.append("Fizz");
            }
            if (i % 5 == 0) {
                msg.append("Buzz");
            }
            if (msg.length() == 0) {
                msg.append(i);
            }
            System.out.println(msg);
            msg.setLength(0);
            if (n - i != 0) {
                if (i + 1 % 3 == 0) {
                    msg.append("Fizz");
                }
                if (i + 1 % 5 == 0) {
                    msg.append("Buzz");
                }
                if (msg.length() == 0) {
                    msg.append(i + 1);
                }
            }
            i += 2;
            iteraciones++;
            System.out.println("=========" + iteraciones + "========");
            System.out.println(msg);
        }
    }
    /*numero especial = que pueda ser fizz, buzz o fizzbuzz
              caso = es un fizz

              caso 1: atrás ni adelante de él hay un numero especial
              caso 2: tiene atrás un numero buzz
              caso 3: tiene adelante un buzz
              caso 4: atrás ni adelante de él hay un numero especial
              caso 5: es un fizz y un buzz

              1 y 4 son iguales pero cada caso apunta al siguiente circularmente
              entonces en orden son distintos*/
    public static void fizzbuzz2(int n, int i, int iteraciones) {
        System.out.println("1");
        i++;
        int caso = 1;
        while (i <= n) {
            if (i % 3 == 0) {
                    System.out.println("Fizz");
                    if (n >= i + 1) {
                        i++;// i=4
                        System.out.println(i);
                    }
                    if (n >= i+1) {
                        i++;
                        System.out.println("buzz");
                    }
                    if (n >= i+1) {//si n >= 6
                        i++;
                        System.out.println("Fizz");//6
                        if (n >= i + 1) {//si n >= 7
                            i++;
                            System.out.println(i);//7
                        }
                        if (n >= i+2) {//si n >=9
                            i++;
                            System.out.println(i);//8
                            System.out.println("Fizz");//9
                            i++;
                            if (n >= i+1) {
                                System.out.println("Buzz");//10
                                i++;
                            }
                            if (n >= i+2) {//si n >=12
                                i++;
                                System.out.println(i);//11
                                System.out.println("Fizz");//12
                                i++;
                                if (n >= i + 1) {
                                    i++;
                                    System.out.println(i);//13
                                }
                                if (n >= i + 2) {//i >= 15
                                    i++;
                                    System.out.println(i);
                                    System.out.println("FizzBuzz");
                                    i++;//15
                                    if (n >= i + 1) {
                                        i++;
                                        System.out.println(i);//16
                                    }
                                    if (n >= i + 2) {
                                        i++;
                                        System.out.println(i);//17
                                    }
                                }
                            }
                        }
                    }
            } else {
                System.out.println(i);
            }
            iteraciones++;
            i++;
            System.out.println("======== " + iteraciones + "=========");
        }
    }

    public static void fizzbuzz3(int n, int i, int iteraciones) {
        int saltador;
        if (n >= 3) {
            saltador = 2;
        }
        while (n > 0) {
            // if (saltador-1)
        }
        iteraciones++;
        i++;
        System.out.println("======== " + iteraciones + "=========");
    }
}

