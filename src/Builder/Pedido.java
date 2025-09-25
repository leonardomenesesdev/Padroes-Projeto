package Builder;

class Pedido {
    private String cliente;
    private String endereco;
    private String formaPagamento;

    private Pedido(Builder builder) {
        this.cliente = builder.cliente;
        this.endereco = builder.endereco;
        this.formaPagamento = builder.formaPagamento;
    }

    public static class Builder {
        private String cliente;
        private String endereco;
        private String formaPagamento;

        public Builder setCliente(String cliente) {
            this.cliente = cliente;
            return this;
        }

        public Builder setEndereco(String endereco) {
            this.endereco = endereco;
            return this;
        }

        public Builder setFormaPagamento(String formaPagamento) {
            this.formaPagamento = formaPagamento;
            return this;
        }

        public Pedido build() {
            return new Pedido(this);
        }
    }

    public String getCliente() {
        return cliente;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }
}

