package implementacao2;

/**
 *
 * @author usuario
 */
class PilhaComArray implements Pilha_IF {

    public PilhaComArray() {
    }

    private int pilha[] = new int[20];
    private int proxTop = 0;
    private int top = 0;

    @Override
    public void push(int element) throws Exception {
        if(proxTop != 0){
            top++;
        }
        pilha[proxTop] = element;
        proxTop++;
    }

    @Override
    public int pop() throws Exception {
        int removido = pilha[top];
        top--;
        proxTop--;
        return removido;
    }

    @Override
    public int top() throws Exception {
        return pilha[top];
    }

    @Override
    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean isFull() {
        if (top >= pilha.length) {
            return true;
        } else {
            return false;
        }
    }

}
