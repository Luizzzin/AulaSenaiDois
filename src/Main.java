
public class Main {
    public static void main(String[] args) {

        Empresa empresa = new Empresa();

        System.out.println("nome da empresa: "+empresa.empresaFuncionario);
        System.out.println("trabalha no endereço: "+empresa.enderecoEmpresa);
        System.out.println("meu nome is: "+empresa.nomeFuncionario);
        System.out.println("meu cargo é: "+empresa.cargoFuncionario);
        System.out.println("Salario de: "+empresa.salarioFuncionario);

            //testanto nova branch
        EmpresaSetor empresaSetor = new EmpresaSetor();
        System.out.println(empresaSetor.nomeSetorJuridico);
    }
}