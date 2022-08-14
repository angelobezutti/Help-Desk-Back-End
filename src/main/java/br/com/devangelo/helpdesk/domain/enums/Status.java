package br.com.devangelo.helpdesk.domain.enums;

public enum Status {
    ABERTO(0, "ABERTO"),
    ANDAMENTO(1, "ANDAMENTO"),
    ENCERRADO(2, "ENCERRADO");

    private Integer codigo;
    private String descrição;

    Status(Integer codigo, String descrição) {
        this.codigo = codigo;
        this.descrição = descrição;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getDescrição() {
        return descrição;
    }

    public static Status toEnum(Integer cod){
        if (cod == null) return null;

        //Para cada Status x será validado se ele existe, caso exista, retornará o mesmo
        for (Status x : Status.values()) {
            if (cod.equals(x.getCodigo())) return x;
        }

        //Caso Status não exista e não seja null, lançamos uma exception
        throw new IllegalArgumentException("Status Inválido");
    }
    
}
