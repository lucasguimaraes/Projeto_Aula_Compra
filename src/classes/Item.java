package classes;
public class Item {
    private float valor_item;
    private float quantidade;
    private Produto produto;
    
    public Item() {
        
    }
            
    public void setProduto(Produto produto){
        
    }
    
    public void calcularValorItem() {
        valor_item =  produto.getValor_unitario() * quantidade;
        
    }
    
    public void getItem() {
        String str = "";
        
        str += "Código do Produto: " +produto.getCodigo() +"\n";
        str += "Nome do Produto: " +produto.getNome() +"\n";
        str += "Valor do Produto: " +produto.getValor_unitario() +"\n";
        str += "Quantidade: " +quantidade +"\n";
        
        
    }

    public float getValor_item() {
        return valor_item;
    }

    public void setValor_item(float valor_item) {
        this.valor_item = valor_item;
    }

    public float getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(float quantidade) {
        this.quantidade = quantidade;
    }
    
    
    
}
