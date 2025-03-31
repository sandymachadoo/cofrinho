package cofrinho;

class Euro extends Moeda {
    public Euro(double valor) {
        super(valor);
    }
    
    @Override
    public void info() {
        System.out.println("Euro: " + valor);
    }
    
    @Override
    public double converter() {
        return valor * 5.5; // exemplo de uma taxa de câmbio
    }
}