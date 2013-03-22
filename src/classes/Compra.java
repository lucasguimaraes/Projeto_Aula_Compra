package classes;

import java.util.ArrayList;
import java.util.Date;

public class Compra {
    private String numero;
    private Cliente cliente;
    private ArrayList<Item> itens;
    private float valorTotal;
    private Date data;
    
    public Compra(Cliente cliente) {
        this.cliente = cliente;
        itens = new ArrayList<>();
        data = new Date();
        valorTotal = 0;
    }
    
    public void addItem(Item item)
    {
        itens.add(item);
    }
    
    public void calcularTotal() {
        float soma = 0;
        for(int i=0; i<itens.size(); i++)
        {
            soma += itens.get(i).getValor_item();
        }
        valorTotal = soma;
        
    }
    
}
