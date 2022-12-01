import java.time.LocalDate;

public class TestaPedido {
  public static void main(String[] args) {
    Categoria informatica = new Categoria(1, "INFORMÁTICA");
    Categoria livros = new Categoria(3, "LIVROS");

    Produto notebook = new Produto(1, "Notebook Samsung", 3523.00, 10, informatica);
    Produto livro = new Produto(2, "Clean Architecture", 102.90, 5, livros);

    Cliente cliente = new Cliente(1, "joão", "silva", "999.888.777-66", 999887766, "rua do balão", 69, "casa", "Centro",
        "esteites unids", "WE");

    Pedido pedido1 = new Pedido(1, LocalDate.now(), cliente, notebook, 4);

    Pedido pedido2 = new Pedido(2, LocalDate.now(), cliente, livro, 3);

    Pedido[] listaDePedidos = { pedido1, pedido2 };

    for (Pedido pedido : listaDePedidos) {
      String dadosDoProduto = String.format(
          "id: %d, data: %s, cliente: %s, nome do produto: %s, quantidade vendida: %s, endereço: %s",
          pedido.getId(), pedido.getData(), pedido.getCliente().nomeCompleto(), pedido.getProduto().getNome(),
          pedido.getQuantidadeVendida(), pedido.getCliente().enderecoCompleto());

      System.out.println(dadosDoProduto);
    }
  }
}
