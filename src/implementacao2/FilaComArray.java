/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementacao2;

/**
 *
 * @author usuario
 */
class FilaComArray implements Fila_IF {

    int fila[] = new int[10];
    private int inicio = 0;
    private int fim = 0;

    @Override
    public void enqueue(int element) throws Exception {
        fila[inicio] = element;
        if (inicio < fila.length) {
            inicio++;
        } else {
            inicio = 0;
        }

    }

    @Override
    public int dequeue() throws Exception {
        int removido = fila[fim];
        if (fim < fila.length) {
            fim++;
        } else {
            fim = 0;
        }
        return removido;
    }

    @Override
    public int head() throws Exception {
        return fila[fim];
    }

    @Override
    public boolean isEmpty() {
        if (inicio == fim) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean isFull() {
        int num = 0;
        if (fim > inicio) {
            num = fim - inicio;
        } else {
            num = inicio - fim;
        }
        
        if (num == fila.length) {
            return true;
        } else {
            return false;
        }
    }

}
