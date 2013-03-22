package persistencia;

import classes.Cliente;
import java.util.ArrayList;

public class ClienteDAO {
    
   private static ArrayList<Cliente> lista = new ArrayList<Cliente>();
    
    
    public static void addCliente(Cliente cliente)
    {
    lista.add(cliente);
    }
    
    public static boolean removerCliente(String cpf) {
        
        int posicao = localizar(cpf);
        if (posicao != -1)
        {
            lista.remove(posicao);
            return true;
        }
        else
            return false;
    }
                    
    public static void atualizarCliente(Cliente cliente) 
    {
        int posicao = localizar(cliente.getCPF());
        lista.remove(posicao);
        lista.add(cliente);
     
    }
    
    public static Cliente getCliente(String cpf) 
    {
        int posicao = localizar(cpf);
        if (posicao != -1)
            return lista.get(posicao);
        else
            return null;
  }
    
    public static int localizar(String cpf) 
    {
        int pos = -1;
        for(int i = 0; i<lista.size(); i++)
        {
            if(lista.get(i).getCPF().equals(cpf))
                pos = i;
        }
        return pos;
    }

}
