package br.com.devangelo.helpdesk.domain.enums;

public enum Perfil {
    ADMIN(0, "ROLE_ADMIN"),
    CLIENTE(1, "ROLE_CLIENTE"),
    TECNICO(2, "ROLE_TECNICO");

    private Integer codigo;
    private String descrição;

    Perfil(Integer codigo, String descrição) {
        this.codigo = codigo;
        this.descrição = descrição;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getDescrição() {
        return descrição;
    }

    public static Perfil toEnum(Integer cod){
        if (cod == null) return null;

        //Para cada perfil x será validado se ele existe, caso exista, retornará o mesmo
        for (Perfil x : Perfil.values()) {
            if (cod.equals(x.getCodigo())) return x;
        }

        //Caso perfil não exista e não seja null, lançamos uma exception
        throw new IllegalArgumentException("Perfil Inválido");
    }
    
}
