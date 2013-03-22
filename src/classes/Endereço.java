package classes;
public class Endereço {
    private String logradouro;
    private String complemento;
    private String cidade;
    private String estado;
    private String cep;

    public Endereço(String logradouro, String complemento, String cidade, String estado, String cep) {
        this.logradouro = logradouro;
        this.complemento = complemento;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }

    public Endereço() {
        
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
    
    public String getInfEndereco(){
        String str = "";
        
        str += "Logradouro: " + logradouro + "\n";
        str += "Complemento: " + complemento + "\n";
        str += "Cidade: " + cidade + "\n";
        str += "Estado: " + estado + "\n";
        str += "CEP: " + cep + "\n";
        
        return str;
    }
    
    
    
}

    
    
         
    

