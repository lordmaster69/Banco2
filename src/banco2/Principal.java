/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco2;

/**
 *
 * @author jv200
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente d = new Cliente();
        Funcionario f = new Funcionario();
        Cliente e = new Cliente();
        Funcionario g = new Funcionario();
//rodolfo não é o claudião

        g.setNome("Guilherme Oliveira");
        f.setNome("João Victor");
        e.setNome("Alexandre");
        d.setNome("Guilherme José");
        d.setCpf("365.256.424/13");
        e.setCpf("235.351.463/90");
        f.setCpf("386.737.677/35");
        g.setCpf("934.579.073/93");

        Banco b = new Banco();
        b.setNome("Santander");
        System.out.println("Banco: "+b.getNome());
        System.out.println("Cliente: "+d.getNome());
        System.out.println("CPF do Cliente: "+d.getCpf());
        System.out.println("Funcionário: "+f.getNome());
        System.out.println("CPF do Funcionário: "+f.getCpf());
  
        Banco c = new Banco();
        c.setNome("Bradesco");
        System.out.println("-------------------");
        System.out.println("Banco: "+c.getNome());
        System.out.println("Cliente: "+e.getNome());
        System.out.println("CPF do Cliente: "+e.getCpf());
        System.out.println("Funcionário: "+g.getNome());
        System.out.println("CPF do Funcionário: "+g.getCpf());
        
       g.setIdade(300);
       g.setSetor("Administrativo");
       g.setCodFuncionario(253325);
        System.out.println("---------------------");
        System.out.println("Nome: "+g.getNome());
        System.out.println("Banco: "+c.getNome());
        System.out.println("CPF: "+g.getCpf());
        System.out.println("Idade: "+g.getIdade());
        System.out.println("Setor: "+g.getSetor());
   
        
       f.setIdade(1250);
       f.setSetor("Financeiro");
       f.setCodFuncionario(8274234);
        System.out.println("--------------------");
        System.out.println("Nome: "+f.getNome());
        System.out.println("Banco: "+b.getNome());
        System.out.println("CPF: "+f.getCpf());
        System.out.println("Idade: "+f.getIdade());
        System.out.println("Setor: "+f.getSetor());
        
        d.setCodCliente(934638);
        d.setIdade(21);
        d.setCredito(1230.35);
        System.out.println("---------------------");
        System.out.println("Nome do Cliente: "+d.getNome());
        System.out.println("Idade: "+d.getIdade());
        System.out.println("CPF: "+d.getCpf());
        System.out.println("Cod de Cliente: "+d.getCodCliente());
        System.out.println("Banco: "+b.getNome());
        System.out.println("Crédito: "+d.getCredito());
        
        e.setCodCliente(124234);
        e.setIdade(32);
        e.setCredito(4325.35);
        System.out.println("---------------------");
        System.out.println("Nome do Cliente: "+e.getNome());
        System.out.println("Idade: "+e.getIdade());
        System.out.println("CPF: "+e.getCpf());
        System.out.println("Cod de Cliente: "+e.getCodCliente());
        System.out.println("Banco: "+c.getNome());
        System.out.println("Crédito: "+e.getCredito());
       
    }
    
}
