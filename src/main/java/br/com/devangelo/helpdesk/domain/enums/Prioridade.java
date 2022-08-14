package br.com.devangelo.helpdesk.domain.enums;

public enum Prioridade {
    BAIXA(0, "BAIXA"),
    MEDIA(1, "MEDIA"),
    ALTA(2, "ALTA");

    private Integer codigo;
    private String descrição;

    Prioridade(Integer codigo, String descrição) {
        this.codigo = codigo;
        this.descrição = descrição;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getDescrição() {
        return descrição;
    }

    public static Prioridade toEnum(Integer cod){
        if (cod == null) return null;

        //Para cada Prioridade x será validado se ele existe, caso exista, retornará o mesmo
        for (Prioridade x : Prioridade.values()) {
            if (cod.equals(x.getCodigo())) return x;
        }

        //Caso Prioridade não exista e não seja null, lançamos uma exception
        throw new IllegalArgumentException("Prioridade Inválida");
    }
    
}
