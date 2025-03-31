package cofrinho;

import java.util.ArrayList;

class Cofrinho {
    private ArrayList<Moeda> listaMoedas = new ArrayList<>();
    
    public void adicionar(Moeda m) {
        listaMoedas.add(m);
        System.out.println("Moeda adicionada com sucesso!");
    }
    
    public void remover(int index) {
        if (index >= 0 && index < listaMoedas.size()) {
            listaMoedas.remove(index);
            System.out.println("Moeda removida com sucesso!");
        } else {
            System.out.println("Índice inválido. Tente novamente.");
        }
    }
    
    public void listagemMoedas() {
        if (listaMoedas.isEmpty()) {
            System.out.println("O cofrinho está vazio.");
        } else {
            System.out.println("Moedas no cofrinho:");
            for (int i = 0; i < listaMoedas.size(); i++) {
                System.out.print((i + 1) + " - ");
                listaMoedas.get(i).info();
            }
        }
    }
    
    public double totalConvertido() {
        double total = 0;
        for (Moeda m : listaMoedas) {
            total += m.converter();
        }
        return total;
    }
}
