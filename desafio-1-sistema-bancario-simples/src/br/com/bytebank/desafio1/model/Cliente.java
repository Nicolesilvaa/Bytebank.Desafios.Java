
class Cliente{

    //Atributos
    private  String nomeCompleto;
    private  String cpf;
    private  String email;
    private  String tipoCliente;


    //Construtor
    public Cliente(String nomeCompleto, String cpf, String email, String tipoCliente) {
        this.nomeCompleto = nomeCompleto;
        this.cpf = cpf;
        this.email = email;
        this.tipoCliente = tipoCliente;
    }

    //Construtor vazio por boa prática
    public Cliente(){}

    //Metodos
    public String getNomeCompelto(){
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }


    @Override
    public String toString() {
        String dadosCompletos = "-------------- Dados completos do cliente ------------------\n";
        dadosCompletos += "Nome: " + nomeCompleto + "\n";
        dadosCompletos += "CPF: " + cpf + "\n";
        dadosCompletos += "Email: " + email + "\n";
        dadosCompletos += "Tipo de cliente: " + tipoCliente + "\n";
        dadosCompletos  += "-----------------------------------------------------------------\n";
        
        return dadosCompletos;
    }
    
    //teste
    public static void main(String[] args){
        Cliente cliente1 = new Cliente("Nicole Silva", "04582652", "nicolelinda@gmail.com", "Pessoa física");
        System.out.println(cliente1);
    }
}