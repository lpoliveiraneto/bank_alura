package br.com.bytebank.banco.teste.io;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TesteSerializacao {

    public static void main(String[] args) throws IOException {
        Cliente cliente = new Cliente();
        cliente.setNome("Leonides Neto");
        cliente.setProfissao("Dev");
        cliente.setCpf("123456789");

        ContaCorrente cc = new ContaCorrente(222,333);
        cc.setTitular(cliente);
        cc.deposita(200);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cc.bin"));
        oos.writeObject(cc);
        oos.close();
    }
}
