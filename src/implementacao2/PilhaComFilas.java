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
class PilhaComFilas implements Pilha_IF{

    public PilhaComFilas() {
    }
    
    FilaComArray fila = new FilaComArray();
    FilaComArray fila2 = new FilaComArray();
    

    @Override
    public void push(int element) throws Exception {
        fila.enqueue(element);
    }

    @Override
    public int pop() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int top() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isFull() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
